package fedorko.curtis.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fedorko.curtis.myapplication.databinding.FragmentFinalgradecalculatorBinding;
import fedorko.curtis.myapplication.databinding.FragmentGPAQuestionBinding;

public class GPA_question extends Fragment {
    FragmentGPAQuestionBinding binding;
    MainActivity activity;

    public GPA_question(MainActivity activity) {this.activity = activity;
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = FragmentGPAQuestionBinding.inflate(inflater);
        return this.binding.getRoot();
    }

    public View getRootView() {
        return this.binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.binding.singlesemgpabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.onSinglesem();
            }
        });
        this.binding.backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.onBack();
            }
        });
        this.binding.cumulativeGpaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.onCumulativeGPA();
            }
        });


}}