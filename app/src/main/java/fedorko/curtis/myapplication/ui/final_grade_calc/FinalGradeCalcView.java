package fedorko.curtis.myapplication.ui.final_grade_calc;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import fedorko.curtis.myapplication.MainActivity;
import fedorko.curtis.myapplication.databinding.FragmentFinalgradecalculatorBinding;
import fedorko.curtis.myapplication.databinding.FragmentFinalgradecalculatorBinding;

public class FinalGradeCalcView extends Fragment {
    private FragmentFinalgradecalculatorBinding binding;
    MainActivity activity;
    public FinalGradeCalcView(MainActivity activity){ this.activity = activity;
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentFinalgradecalculatorBinding.inflate(inflater);
        return this.binding.getRoot();
    }

    public View getRootView() {
        return this.binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable currgrade = binding.currgradetext.getText();
                double currentgrade = Double.parseDouble(currgrade.toString());
                Editable currgrade2 = binding.finalworthtext.getText();
                double finalpercent = Double.parseDouble(currgrade2.toString());
                Editable currgrade3 = binding.whattheywanttext.getText();
                double gradewanted = Double.parseDouble(currgrade3.toString());
                double a = activity.onCalculate(currentgrade, gradewanted, finalpercent);
               String needed = Double.toString(a);
               String cherry = activity.getExtra(a);
               String outy = "You need to get a " + needed + " on your final. " + cherry;
                binding.needed.setText(outy);
               binding.needed.setVisibility(View.VISIBLE);
                binding.currgradetext.setText("");
                binding.whattheywanttext.setText("");
                binding.finalworthtext.setText("");
            }
        });
        this.binding.backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.onBack();
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}