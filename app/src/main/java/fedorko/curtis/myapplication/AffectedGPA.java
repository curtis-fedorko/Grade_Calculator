package fedorko.curtis.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import fedorko.curtis.myapplication.databinding.FragmentAffectedGPABinding;

public class AffectedGPA extends Fragment {

    FragmentAffectedGPABinding binding;
    MainActivity activity;

    public AffectedGPA(MainActivity activity) {
        this.activity = activity;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.binding = FragmentAffectedGPABinding.inflate(inflater);
        return this.binding.getRoot();

    }
    public View getRootView() {
        return this.binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Spinner spinner1 = binding.optsSpinner1;
        Spinner spinner2 = binding.optsSpinner2;
        Spinner spinner3 = binding.optsSpinner3;
        Spinner spinner4 = binding.optsSpinner4;
        Spinner spinner5 = binding.optsSpinner5;
        Spinner spinner6 = binding.optsSpinner6;
        Spinner spinner7 = binding.optsSpinner7;
        Spinner spinner8 = binding.optsSpinner8;
        Spinner spinner9 = binding.optsSpinner9;
        Spinner spinner10 = binding.optsSpinner10;
        Spinner scalespinner = binding.GPAScaleSpinner;
        ArrayList<String> gpaarray = new ArrayList<>();
        double[] unitsarray = new double[10];
        double[] scale = {0.0};
        final boolean[] tracky = {false};
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(binding.getRoot().getContext(),
                R.array.scales_array, R.layout.my_spinner_text);
        // Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(R.layout.spinner_back);
        // Apply the adapter to the spinner
        scalespinner.setAdapter(adapter2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(binding.getRoot().getContext(),
                R.array.grades_array, R.layout.my_spinner_text);
        // Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(R.layout.spinner_back);
        // Apply the adapter to the spinner
        spinner1.setAdapter(adapter1);
        spinner2.setAdapter(adapter1);
        spinner3.setAdapter(adapter1);
        spinner4.setAdapter(adapter1);
        spinner5.setAdapter(adapter1);
        spinner6.setAdapter(adapter1);
        spinner7.setAdapter(adapter1);
        spinner8.setAdapter(adapter1);
        spinner9.setAdapter(adapter1);
        spinner10.setAdapter(adapter1);
        String s = Double.toString(this.activity.gpas);
        this.binding.editTextNumberDecimal.setText(s);

        this.binding.goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable classes = binding.numClassesNumber.getText();
                if (tracky[0] && (!classes.toString().equals(""))){
                    try {
                        int classnum = Integer.parseInt(classes.toString());
                        if (classnum > 10 || classnum < 1) {
                            Snackbar.make(view, "Please enter an integer 1-10",
                                    Snackbar.LENGTH_SHORT).show();
                        }
                        if (classnum == 1) {
                            binding.optsSpinner1.setVisibility(View.VISIBLE);

                            binding.units1.setVisibility(View.VISIBLE);
                        }
                        if (classnum == 2) {
                            binding.optsSpinner1.setVisibility(View.VISIBLE);
                            binding.optsSpinner2.setVisibility(View.VISIBLE);

                            binding.units1.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                        }
                        if (classnum == 3) {
                            binding.optsSpinner1.setVisibility(View.VISIBLE);
                            binding.optsSpinner2.setVisibility(View.VISIBLE);
                            binding.optsSpinner3.setVisibility(View.VISIBLE);

                            binding.units1.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                        }
                        if (classnum == 4) {
                            binding.optsSpinner1.setVisibility(View.VISIBLE);
                            binding.optsSpinner2.setVisibility(View.VISIBLE);
                            binding.optsSpinner3.setVisibility(View.VISIBLE);
                            binding.optsSpinner4.setVisibility(View.VISIBLE);

                            binding.units1.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                            binding.units4.setVisibility(View.VISIBLE);
                        }
                        if (classnum == 5) {
                            binding.optsSpinner1.setVisibility(View.VISIBLE);
                            binding.optsSpinner2.setVisibility(View.VISIBLE);
                            binding.optsSpinner3.setVisibility(View.VISIBLE);
                            binding.optsSpinner4.setVisibility(View.VISIBLE);
                            binding.optsSpinner5.setVisibility(View.VISIBLE);

                            binding.units1.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                            binding.units4.setVisibility(View.VISIBLE);
                            binding.units5.setVisibility(View.VISIBLE);
                        }
                        if (classnum == 6) {
                            binding.optsSpinner1.setVisibility(View.VISIBLE);
                            binding.optsSpinner2.setVisibility(View.VISIBLE);
                            binding.optsSpinner3.setVisibility(View.VISIBLE);
                            binding.optsSpinner4.setVisibility(View.VISIBLE);
                            binding.optsSpinner5.setVisibility(View.VISIBLE);
                            binding.optsSpinner6.setVisibility(View.VISIBLE);

                            binding.units1.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                            binding.units4.setVisibility(View.VISIBLE);
                            binding.units5.setVisibility(View.VISIBLE);
                            binding.units6.setVisibility(View.VISIBLE);
                        }
                        if (classnum == 7) {
                            binding.optsSpinner1.setVisibility(View.VISIBLE);
                            binding.optsSpinner2.setVisibility(View.VISIBLE);
                            binding.optsSpinner3.setVisibility(View.VISIBLE);
                            binding.optsSpinner4.setVisibility(View.VISIBLE);
                            binding.optsSpinner5.setVisibility(View.VISIBLE);
                            binding.optsSpinner6.setVisibility(View.VISIBLE);
                            binding.optsSpinner7.setVisibility(View.VISIBLE);

                            binding.units1.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                            binding.units4.setVisibility(View.VISIBLE);
                            binding.units5.setVisibility(View.VISIBLE);
                            binding.units6.setVisibility(View.VISIBLE);
                            binding.units7.setVisibility(View.VISIBLE);
                        }
                        if (classnum == 8) {
                            binding.optsSpinner1.setVisibility(View.VISIBLE);
                            binding.optsSpinner2.setVisibility(View.VISIBLE);
                            binding.optsSpinner3.setVisibility(View.VISIBLE);
                            binding.optsSpinner4.setVisibility(View.VISIBLE);
                            binding.optsSpinner5.setVisibility(View.VISIBLE);
                            binding.optsSpinner6.setVisibility(View.VISIBLE);
                            binding.optsSpinner7.setVisibility(View.VISIBLE);
                            binding.optsSpinner8.setVisibility(View.VISIBLE);

                            binding.units1.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                            binding.units4.setVisibility(View.VISIBLE);
                            binding.units5.setVisibility(View.VISIBLE);
                            binding.units6.setVisibility(View.VISIBLE);
                            binding.units7.setVisibility(View.VISIBLE);
                            binding.units8.setVisibility(View.VISIBLE);
                        }
                        if (classnum == 9) {
                            binding.optsSpinner1.setVisibility(View.VISIBLE);
                            binding.optsSpinner2.setVisibility(View.VISIBLE);
                            binding.optsSpinner3.setVisibility(View.VISIBLE);
                            binding.optsSpinner4.setVisibility(View.VISIBLE);
                            binding.optsSpinner6.setVisibility(View.VISIBLE);
                            binding.optsSpinner6.setVisibility(View.VISIBLE);
                            binding.optsSpinner7.setVisibility(View.VISIBLE);
                            binding.optsSpinner8.setVisibility(View.VISIBLE);
                            binding.optsSpinner9.setVisibility(View.VISIBLE);

                            binding.units1.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                            binding.units4.setVisibility(View.VISIBLE);
                            binding.units5.setVisibility(View.VISIBLE);
                            binding.units6.setVisibility(View.VISIBLE);
                            binding.units7.setVisibility(View.VISIBLE);
                            binding.units8.setVisibility(View.VISIBLE);
                            binding.units9.setVisibility(View.VISIBLE);
                        }
                        if (classnum == 10) {
                            binding.optsSpinner1.setVisibility(View.VISIBLE);
                            binding.optsSpinner2.setVisibility(View.VISIBLE);
                            binding.optsSpinner3.setVisibility(View.VISIBLE);
                            binding.optsSpinner4.setVisibility(View.VISIBLE);
                            binding.optsSpinner5.setVisibility(View.VISIBLE);
                            binding.optsSpinner6.setVisibility(View.VISIBLE);
                            binding.optsSpinner7.setVisibility(View.VISIBLE);
                            binding.optsSpinner8.setVisibility(View.VISIBLE);
                            binding.optsSpinner9.setVisibility(View.VISIBLE);
                            binding.optsSpinner10.setVisibility(View.VISIBLE);

                            binding.units1.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                            binding.units4.setVisibility(View.VISIBLE);
                            binding.units5.setVisibility(View.VISIBLE);
                            binding.units6.setVisibility(View.VISIBLE);
                            binding.units7.setVisibility(View.VISIBLE);
                            binding.units8.setVisibility(View.VISIBLE);
                            binding.units9.setVisibility(View.VISIBLE);
                            binding.units10.setVisibility(View.VISIBLE);
                        }
                    } catch (NumberFormatException e) {

                    }
                    binding.goButton.setVisibility(View.INVISIBLE);
                    binding.CalcSingleSemGPA.setVisibility(View.VISIBLE);
                    binding.numClassesNumber.setVisibility(View.INVISIBLE);
                    binding.GPAScaleSpinner.setVisibility(View.INVISIBLE);
                    String s = "";
                    binding.numClassesNumber.setText(s);
                    binding.GPAScaleSpinner.setAdapter(adapter2);
                }
                else{Snackbar.make(view, "Enter Valid Info",
                        Snackbar.LENGTH_SHORT).show();}
            }

        });
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String choice = ((CharSequence) adapterView.getItemAtPosition(i)).toString();
                if(!choice.equals("Select:")) {
                    gpaarray.add(choice);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                String choice = ((CharSequence) adapterView.getItemAtPosition(0)).toString();
                if(!choice.equals("Select:")) {
                    gpaarray.add(choice);
                }
            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String choice = ((CharSequence) adapterView.getItemAtPosition(i)).toString();
                if(!choice.equals("Select:")) {
                    gpaarray.add(choice);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String choice = ((CharSequence) adapterView.getItemAtPosition(i)).toString();
                if(!choice.equals("Select:")) {
                    gpaarray.add(choice);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String choice = ((CharSequence) adapterView.getItemAtPosition(i)).toString();
                if(!choice.equals("Select:")) {
                    gpaarray.add(choice);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String choice = ((CharSequence) adapterView.getItemAtPosition(i)).toString();
                if(!choice.equals("Select:")) {
                    gpaarray.add(choice);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String choice = ((CharSequence) adapterView.getItemAtPosition(i)).toString();
                if(!choice.equals("Select:")) {
                    gpaarray.add(choice);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String choice = ((CharSequence) adapterView.getItemAtPosition(i)).toString();
                if(!choice.equals("Select:")) {
                    gpaarray.add(choice);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String choice = ((CharSequence) adapterView.getItemAtPosition(i)).toString();
                if(!choice.equals("Select:")) {
                    gpaarray.add(choice);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String choice = ((CharSequence) adapterView.getItemAtPosition(i)).toString();
                if(!choice.equals("Select:")) {
                    gpaarray.add(choice);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String choice = ((CharSequence) adapterView.getItemAtPosition(i)).toString();
                if(!choice.equals("Select:")) {
                    gpaarray.add(choice);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        scalespinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String choice = ((CharSequence) adapterView.getItemAtPosition(i)).toString();
                if(!choice.equals("Select:")) {
                    scale[0] = Double.parseDouble(choice);
                    tracky[0] = true;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        this.binding.units1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable units = binding.units1.getText();
                try{
                    double unit = Double.parseDouble(units.toString());
                    unitsarray[0] = unit;
                }
                catch (NumberFormatException e){
                    Snackbar.make(view, "Please enter value decimals, " +
                                    "for 5.0/5.2 1 = College prep 1 courses" +
                                    "2 = College prep 2 courses " +
                                    "3 = Honors courses " +
                                    "4 = AP courses"
                            ,
                            Snackbar.LENGTH_SHORT).show();

                }
            }

        });
        this.binding.units2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable units = binding.units2.getText();
                try{
                    double unit = Double.parseDouble(units.toString());
                    unitsarray[1] = unit;
                }
                catch (NumberFormatException e){
                    Snackbar.make(view, "Please enter value decimals, " +
                                    "for 5.0/5.2 1 = College prep 1 courses" +
                                    "2 = College prep 2 courses " +
                                    "3 = Honors courses " +
                                    "4 = AP courses"
                            ,
                            Snackbar.LENGTH_SHORT).show();

                }
            }

        });
        this.binding.units3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable units = binding.units3.getText();
                try{
                    double unit = Double.parseDouble(units.toString());
                    unitsarray[2] = unit;
                }
                catch (NumberFormatException e){
                    Snackbar.make(view, "Please enter value decimals, " +
                                    "for 5.0/5.2 1 = College prep 1 courses" +
                                    "2 = College prep 2 courses " +
                                    "3 = Honors courses " +
                                    "4 = AP courses"
                            ,
                            Snackbar.LENGTH_SHORT).show();

                }
            }

        });
        this.binding.units4.setOnClickListener(new View.OnClickListener() {
            Editable units = binding.units4.getText();
            @Override
            public void onClick(View view) {

                try{
                    double unit = Double.parseDouble(units.toString());
                    unitsarray[3] = unit;
                }
                catch (NumberFormatException e){
                    Snackbar.make(view, "Please enter value decimals, " +
                                    "for 5.0/5.2 1 = College prep 1 courses" +
                                    "2 = College prep 2 courses " +
                                    "3 = Honors courses " +
                                    "4 = AP courses"
                            ,
                            Snackbar.LENGTH_SHORT).show();

                }
            }

        });
        this.binding.units5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable units = binding.units5.getText();
                try{
                    double unit = Double.parseDouble(units.toString());
                    unitsarray[4] = unit;
                }
                catch (NumberFormatException e){
                    Snackbar.make(view, "Please enter value decimals, " +
                                    "for 5.0/5.2 1 = College prep 1 courses" +
                                    "2 = College prep 2 courses " +
                                    "3 = Honors courses " +
                                    "4 = AP courses"
                            ,
                            Snackbar.LENGTH_SHORT).show();

                }
            }

        });
        this.binding.units6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable units = binding.units6.getText();
                try{
                    double unit = Double.parseDouble(units.toString());
                    unitsarray[5] = unit;
                }
                catch (NumberFormatException e){
                    Snackbar.make(view, "Please enter value decimals, " +
                                    "for 5.0/5.2 1 = College prep 1 courses" +
                                    "2 = College prep 2 courses " +
                                    "3 = Honors courses " +
                                    "4 = AP courses"
                            ,
                            Snackbar.LENGTH_SHORT).show();

                }
            }

        });
        this.binding.units7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable units = binding.units7.getText();
                try{
                    double unit = Double.parseDouble(units.toString());
                    unitsarray[6] = unit;
                }
                catch (NumberFormatException e){
                    Snackbar.make(view, "Please enter value decimals, " +
                                    "for 5.0/5.2 1 = College prep 1 courses" +
                                    "2 = College prep 2 courses " +
                                    "3 = Honors courses " +
                                    "4 = AP courses"
                            ,
                            Snackbar.LENGTH_SHORT).show();

                }
            }

        });
        this.binding.units8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable units = binding.units8.getText();
                try{
                    double unit = Double.parseDouble(units.toString());
                    unitsarray[7] = unit;
                }
                catch (NumberFormatException e){
                    Snackbar.make(view, "Please enter value decimals, " +
                                    "for 5.0/5.2 1 = College prep 1 courses" +
                                    "2 = College prep 2 courses " +
                                    "3 = Honors courses " +
                                    "4 = AP courses"
                            ,
                            Snackbar.LENGTH_SHORT).show();

                }
            }

        });
        this.binding.units9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable units = binding.units9.getText();
                try{
                    double unit = Double.parseDouble(units.toString());
                    unitsarray[8] = unit;
                }
                catch (NumberFormatException e){
                    Snackbar.make(view, "Please enter value decimals, " +
                                    "for 5.0/5.2 1 = College prep 1 courses" +
                                    "2 = College prep 2 courses " +
                                    "3 = Honors courses " +
                                    "4 = AP courses"
                            ,
                            Snackbar.LENGTH_SHORT).show();

                }
            }

        });
        this.binding.units10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable units = binding.units10.getText();
                try{
                    double unit = Double.parseDouble(units.toString());
                    unitsarray[9] = unit;
                }
                catch (NumberFormatException e){
                    Snackbar.make(view, "Please enter value decimals, " +
                                    "for 5.0/5.2 1 = College prep 1 courses" +
                                    "2 = College prep 2 courses " +
                                    "3 = Honors courses " +
                                    "4 = AP courses"
                            ,
                            Snackbar.LENGTH_SHORT).show();

                }
            }

        });

        this.binding.CalcSingleSemGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Double> units= new ArrayList<Double>();
                int size = gpaarray.size() - 1;
                try {
                    units.add(Double.parseDouble(binding.units1.getText().toString()));
                    units.add(Double.parseDouble(binding.units2.getText().toString()));
                    units.add(Double.parseDouble(binding.units3.getText().toString()));
                    units.add(Double.parseDouble(binding.units4.getText().toString()));
                    units.add(Double.parseDouble(binding.units5.getText().toString()));
                    units.add(Double.parseDouble(binding.units6.getText().toString()));
                    units.add(Double.parseDouble(binding.units7.getText().toString()));
                    units.add(Double.parseDouble(binding.units8.getText().toString()));
                    units.add(Double.parseDouble(binding.units9.getText().toString()));
                    units.add(Double.parseDouble(binding.units10.getText().toString()));
                }
                catch(NumberFormatException e) {
                    double gpa1 = activity.calcGpa(gpaarray, scale, units);
                    activity.listy.add(gpa1);
                    double unitsum = 0;
                    for(int i = 0; i < units.size(); i++){unitsum += units.get(i);}
                    activity.units.add(unitsum);
                    double gpa = activity.calcCumulativeGPA(activity.listy, activity.units);
                    String texty = "Your GPA is " + (float)gpa;
                    activity.listy.remove(gpa1);
                   // gpa = 0;
                    binding.yourgpaTEXT.setText(texty);
                    binding.yourgpaTEXT.setVisibility(View.VISIBLE);
                    binding.numClassesNumber.setText("");
                }

                gpaarray.clear();
                binding.optsSpinner1.setAdapter(adapter1);
                binding.optsSpinner2.setAdapter(adapter1);
                binding.optsSpinner3.setAdapter(adapter1);
                binding.optsSpinner4.setAdapter(adapter1);
                binding.optsSpinner5.setAdapter(adapter1);
                binding.optsSpinner6.setAdapter(adapter1);
                binding.optsSpinner7.setAdapter(adapter1);
                binding.optsSpinner8.setAdapter(adapter1);
                binding.optsSpinner9.setAdapter(adapter1);
                binding.optsSpinner10.setAdapter(adapter1);

            }
        });
        this.binding.backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.onBacktoGPAtemp();
            }
        });

    }
}