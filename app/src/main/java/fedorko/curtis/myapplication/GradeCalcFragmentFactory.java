package fedorko.curtis.myapplication;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;

import fedorko.curtis.myapplication.ui.final_grade_calc.FinalGradeCalcView;
import fedorko.curtis.myapplication.ui.home.HomeFragment;

public class GradeCalcFragmentFactory extends FragmentFactory {
    private MainActivity activity;

    public GradeCalcFragmentFactory(MainActivity activity) {
        super();
        this.activity = activity;
    }

    @Override
    public Fragment instantiate(@NonNull ClassLoader classLoader, @NonNull String className) {
        Class<? extends Fragment> fragmentClass = loadFragmentClass(classLoader, className);
        Fragment fragment = null;
        if(fragmentClass == FinalGradeCalcView.class){
            fragment = new FinalGradeCalcView(activity);
        }
        else if(fragmentClass == HomeFragment.class){
            fragment = new HomeFragment(activity);

        }
        else if(fragmentClass == GPA_question.class){
            fragment = new GPA_question(activity);

        }
        else if(fragmentClass == CumulativeGPA.class){
            fragment = new CumulativeGPA(activity);
        }
        else if(fragmentClass == AffectedGPA.class){
            fragment = new AffectedGPA(activity);
        }
        else {
            fragment = super.instantiate(classLoader, className);
        }
        return fragment;
    }
}