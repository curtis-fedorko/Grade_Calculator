package fedorko.curtis.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import fedorko.curtis.myapplication.Model.FGC;
import fedorko.curtis.myapplication.Model.GPA;
import fedorko.curtis.myapplication.Model.Phrase;
import fedorko.curtis.myapplication.databinding.ActivityMainBinding;
import fedorko.curtis.myapplication.ui.IMainView;
import fedorko.curtis.myapplication.ui.MainView;
import fedorko.curtis.myapplication.ui.final_grade_calc.FinalGradeCalcView;
import fedorko.curtis.myapplication.ui.home.HomeFragment;

public class MainActivity extends AppCompatActivity implements IMainView.Listener {

    private ActivityMainBinding binding;
    private IMainView mainview;
    public ArrayList<Double> units;
    public ArrayList<Double> listy;
    public double gpas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportFragmentManager().setFragmentFactory(new GradeCalcFragmentFactory(this));
        super.onCreate(savedInstanceState);
        this.mainview = new MainView(this);
        this.setContentView(this.mainview.getRootView());
        this.mainview.displayFragment(new HomeFragment(this));
    }

    public double onCalculate(double currgrade, double gradewant, double percleft) {
        FGC f = new FGC();
       return  f.whatINeed(currgrade, gradewant, percleft);
    }

    public String getExtra(double a) {
        Phrase p = new Phrase();
        return p.generatePhrase(a);
    }

    @Override
    public void getChoice(String choice) {
        Fragment f = new HomeFragment(this);
        if(choice.equals("Final Grade Calculator")){
             f = new FinalGradeCalcView(this);
            MainActivity.this.mainview.displayFragment(f);
        }
        else if(choice.equals("GPA Calculator")){
             f = new GPA_question(this);
            this.mainview.displayFragment(f);
        }
        else if(choice.equals("Assignment calculator")){
             f = new FinalGradeCalcView(this);
            MainActivity.this.mainview.displayFragment(f);
        }
    }
    @Override
    public void onHome() {
        Fragment f = new HomeFragment(this);
        this.mainview.displayFragment(f);
    }

    public void onBack() {
        Fragment f = new HomeFragment(this);
        this.mainview.displayFragment(f);
    }

    public void onProfile() {
        Fragment f = new ProfileFragment();
        this.mainview.displayFragment(f);
    }

    public void onSinglesem() {
        Fragment f = new SingleSemGPAFragment(this);
        this.mainview.displayFragment(f);
    }

    public double calcGpa(ArrayList<String> gpaarray, double[] scale, ArrayList<Double> units) {
        GPA a =new GPA();
        String scales = Double.toString(scale[0]);
        String[] total = new String[gpaarray.size()];
        for(int i = 0; i < gpaarray.size(); i++){
            total[i] = gpaarray.get(i);
        }
        return a.CalcGPASemester(total,scales, units);
    }

    public void onBacktoGPA() {
        Fragment f = new GPA_question(this);
        this.mainview.displayFragment(f);
    }

    public double calcCumulativeGPA(ArrayList<Double> listy, ArrayList<Double> units) {
        GPA gpa = new GPA();
        double[] gpas = new double[listy.size()];
        double[] unit = new double[units.size()];
        for(int i = 0; i < listy.size(); i++){
            gpas[i] = listy.get(i);
            unit[i] = units.get(i);
        }
        return gpa.CalcGPAallTime(gpas, unit);
    }

    public void onCumulativeGPA() {
        Fragment f = new CumulativeGPA(this);
        this.mainview.displayFragment(f);
    }

    public void SetOnFurther(double gpas, ArrayList<Double> units, ArrayList<Double> listy) {
        this.units = units;
        this.listy = listy;
        this.gpas = gpas;
    }

    public void onFurther() {
        Fragment f = new AffectedGPA(this);
        this.mainview.displayFragment(f);
    }

    public void onBacktoGPAtemp() {
        Fragment f = new CumulativeGPA(this);
        this.mainview.displayFragment(f);
    }
}