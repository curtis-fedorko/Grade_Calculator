package fedorko.curtis.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import fedorko.curtis.myapplication.databinding.FragmentCumulativeGPABinding;
import fedorko.curtis.myapplication.databinding.FragmentGPAQuestionBinding;

public class CumulativeGPA extends Fragment {
    FragmentCumulativeGPABinding binding;
    MainActivity activity;


    public CumulativeGPA(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.binding = FragmentCumulativeGPABinding.inflate(inflater);
        return this.binding.getRoot();

    }
    public View getRootView() {
        return this.binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.binding.goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable sems = binding.numClassesNumber.getText();
                try {
                    int semesters = Integer.parseInt(sems.toString());
                    if (semesters > 10) {
                        Snackbar.make(view, "Please enter an integer 1-10",
                                Snackbar.LENGTH_SHORT).show();
                    } else {
                        binding.goButton.setVisibility(View.INVISIBLE);
                        binding.resetClickableText.setVisibility(View.VISIBLE);
                        binding.numClassesNumber.setText("");
                        binding.numClassesNumber.setVisibility(View.INVISIBLE);
                        if (semesters == 1) {
                            binding.gpa1.setVisibility(View.VISIBLE);
                            binding.units1.setVisibility(View.VISIBLE);
                            binding.num1.setVisibility(View.VISIBLE);
                        }
                        if (semesters == 2) {
                            binding.gpa1.setVisibility(View.VISIBLE);
                            binding.gpa2.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units1.setVisibility(View.VISIBLE);
                        }
                        if (semesters == 3) {
                            binding.gpa1.setVisibility(View.VISIBLE);
                            binding.gpa2.setVisibility(View.VISIBLE);
                            binding.gpa3.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units1.setVisibility(View.VISIBLE);
                        }
                        if (semesters == 4) {
                            binding.gpa1.setVisibility(View.VISIBLE);
                            binding.gpa2.setVisibility(View.VISIBLE);
                            binding.gpa3.setVisibility(View.VISIBLE);
                            binding.gpa4.setVisibility(View.VISIBLE);
                            binding.units4.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units1.setVisibility(View.VISIBLE);
                        }
                        if (semesters == 5) {
                            binding.gpa1.setVisibility(View.VISIBLE);
                            binding.gpa2.setVisibility(View.VISIBLE);
                            binding.gpa3.setVisibility(View.VISIBLE);
                            binding.gpa4.setVisibility(View.VISIBLE);
                            binding.gpa5.setVisibility(View.VISIBLE);
                            binding.units5.setVisibility(View.VISIBLE);
                            binding.units4.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units1.setVisibility(View.VISIBLE);
                        }
                        if (semesters == 6) {
                            binding.gpa1.setVisibility(View.VISIBLE);
                            binding.gpa2.setVisibility(View.VISIBLE);
                            binding.gpa3.setVisibility(View.VISIBLE);
                            binding.gpa4.setVisibility(View.VISIBLE);
                            binding.gpa5.setVisibility(View.VISIBLE);
                            binding.gpa6.setVisibility(View.VISIBLE);
                            binding.units6.setVisibility(View.VISIBLE);
                            binding.units5.setVisibility(View.VISIBLE);
                            binding.units4.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units1.setVisibility(View.VISIBLE);
                            binding.num1.setVisibility(View.VISIBLE);
                        }
                        if (semesters == 7) {
                            binding.gpa1.setVisibility(View.VISIBLE);
                            binding.gpa2.setVisibility(View.VISIBLE);
                            binding.gpa3.setVisibility(View.VISIBLE);
                            binding.gpa4.setVisibility(View.VISIBLE);
                            binding.gpa5.setVisibility(View.VISIBLE);
                            binding.gpa6.setVisibility(View.VISIBLE);
                            binding.gpa7.setVisibility(View.VISIBLE);
                            binding.units7.setVisibility(View.VISIBLE);
                            binding.units6.setVisibility(View.VISIBLE);
                            binding.units5.setVisibility(View.VISIBLE);
                            binding.units4.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units1.setVisibility(View.VISIBLE);
                        }
                        if (semesters == 8) {
                            binding.gpa1.setVisibility(View.VISIBLE);
                            binding.gpa2.setVisibility(View.VISIBLE);
                            binding.gpa3.setVisibility(View.VISIBLE);
                            binding.gpa4.setVisibility(View.VISIBLE);
                            binding.gpa5.setVisibility(View.VISIBLE);
                            binding.gpa6.setVisibility(View.VISIBLE);
                            binding.gpa7.setVisibility(View.VISIBLE);
                            binding.gpa8.setVisibility(View.VISIBLE);
                            binding.units8.setVisibility(View.VISIBLE);
                            binding.units7.setVisibility(View.VISIBLE);
                            binding.units6.setVisibility(View.VISIBLE);
                            binding.units5.setVisibility(View.VISIBLE);
                            binding.units4.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units1.setVisibility(View.VISIBLE);
                        }
                        if (semesters == 9) {
                            binding.gpa1.setVisibility(View.VISIBLE);
                            binding.gpa2.setVisibility(View.VISIBLE);
                            binding.gpa3.setVisibility(View.VISIBLE);
                            binding.gpa4.setVisibility(View.VISIBLE);
                            binding.gpa5.setVisibility(View.VISIBLE);
                            binding.gpa6.setVisibility(View.VISIBLE);
                            binding.gpa7.setVisibility(View.VISIBLE);
                            binding.gpa8.setVisibility(View.VISIBLE);
                            binding.gpa9.setVisibility(View.VISIBLE);
                            binding.units9.setVisibility(View.VISIBLE);
                            binding.units8.setVisibility(View.VISIBLE);
                            binding.units7.setVisibility(View.VISIBLE);
                            binding.units6.setVisibility(View.VISIBLE);
                            binding.units5.setVisibility(View.VISIBLE);
                            binding.units4.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units1.setVisibility(View.VISIBLE);
                        }
                        if (semesters == 10) {
                            binding.gpa1.setVisibility(View.VISIBLE);
                            binding.gpa2.setVisibility(View.VISIBLE);
                            binding.gpa3.setVisibility(View.VISIBLE);
                            binding.gpa4.setVisibility(View.VISIBLE);
                            binding.gpa5.setVisibility(View.VISIBLE);
                            binding.gpa6.setVisibility(View.VISIBLE);
                            binding.gpa7.setVisibility(View.VISIBLE);
                            binding.gpa8.setVisibility(View.VISIBLE);
                            binding.gpa9.setVisibility(View.VISIBLE);
                            binding.gpa10.setVisibility(View.VISIBLE);
                            binding.units10.setVisibility(View.VISIBLE);
                            binding.units9.setVisibility(View.VISIBLE);
                            binding.units8.setVisibility(View.VISIBLE);
                            binding.units7.setVisibility(View.VISIBLE);
                            binding.units6.setVisibility(View.VISIBLE);
                            binding.units5.setVisibility(View.VISIBLE);
                            binding.units4.setVisibility(View.VISIBLE);
                            binding.units3.setVisibility(View.VISIBLE);
                            binding.units2.setVisibility(View.VISIBLE);
                            binding.units1.setVisibility(View.VISIBLE);
                        }
                    }
                }
                catch (NumberFormatException e) {
                    Snackbar.make(view, "Please enter an integer 1-10",
                            Snackbar.LENGTH_SHORT).show();
                }

             }
        });
        this.binding.gpa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.gpa1.setText("");
            }
        });
        this.binding.gpa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.gpa2.setText("");
            }
        });
        this.binding.gpa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.gpa3.setText("");
            }
        });
        this.binding.gpa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.gpa4.setText("");
            }
        });
        this.binding.gpa5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.gpa5.setText("");
            }
        });
        this.binding.gpa6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.gpa6.setText("");
            }
        });
        this.binding.gpa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.gpa7.setText("");
            }
        });
        this.binding.gpa8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.gpa8.setText("");
            }
        });
        this.binding.gpa9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.gpa9.setText("");
            }
        });
        this.binding.gpa10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.gpa10.setText("");
            }
        });
        this.binding.resetClickableText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.goButton.setVisibility(View.VISIBLE);
                binding.numClassesNumber.setVisibility(View.VISIBLE);
                String GPA_sem1 = "GPA 1";
                String GPA_sem2 = "GPA 2";
                String GPA_sem3 = "GPA 3";
                String GPA_sem4 = "GPA 4";
                String GPA_sem5 = "GPA 5";
                String GPA_sem6 = "GPA 6";
                String GPA_sem7 = "GPA 7";
                String GPA_sem8 = "GPA 8";
                String GPA_sem9 = "GPA 9";
                String GPA_sem10 = "GPA 10";
                binding.gpa1.setText(GPA_sem1);
                binding.gpa2.setText(GPA_sem2);
                binding.gpa3.setText(GPA_sem3);
                binding.gpa4.setText(GPA_sem4);
                binding.gpa5.setText(GPA_sem5);
                binding.gpa6.setText(GPA_sem6);
                binding.gpa7.setText(GPA_sem7);
                binding.gpa8.setText(GPA_sem8);
                binding.gpa9.setText(GPA_sem9);
                binding.gpa10.setText(GPA_sem10);
                binding.yourgpaTEXT.setText("");
                binding.numClassesNumber.setText("");
                    binding.gpa1.setVisibility(View.INVISIBLE);
                    binding.gpa2.setVisibility(View.INVISIBLE);
                    binding.gpa3.setVisibility(View.INVISIBLE);
                    binding.gpa4.setVisibility(View.INVISIBLE);
                    binding.gpa5.setVisibility(View.INVISIBLE);
                    binding.gpa6.setVisibility(View.INVISIBLE);
                    binding.gpa7.setVisibility(View.INVISIBLE);
                    binding.gpa8.setVisibility(View.INVISIBLE);
                    binding.gpa9.setVisibility(View.INVISIBLE);
                    binding.gpa10.setVisibility(View.INVISIBLE);
                binding.resetClickableText.setVisibility(View.INVISIBLE);
            }
        });
        this.binding.CalcSingleSemGPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Double> listy = new ArrayList<>();
                ArrayList<Double> units = new ArrayList<>();
                int curr = 0;
                try{
                  listy.add(Double.parseDouble(binding.gpa1.getText().toString()));
                    listy.add(Double.parseDouble(binding.gpa2.getText().toString()));
                    listy.add(Double.parseDouble(binding.gpa3.getText().toString()));
                    listy.add(Double.parseDouble(binding.gpa4.getText().toString()));
                    listy.add(Double.parseDouble(binding.gpa5.getText().toString()));
                    listy.add(Double.parseDouble(binding.gpa6.getText().toString()));
                    listy.add(Double.parseDouble(binding.gpa7.getText().toString()));
                    listy.add(Double.parseDouble(binding.gpa8.getText().toString()));
                    listy.add(Double.parseDouble(binding.gpa9.getText().toString()));
                    listy.add(Double.parseDouble(binding.gpa10.getText().toString()));
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
                catch (NumberFormatException e){
                    double gpa = activity.calcCumulativeGPA(listy, units);
                    String gpas = "";
                    if((gpa / 1) != gpa){
                        gpas = "Please Enter Valid Numbers";
                    }
                    else {
                        gpas = "Your GPA is " + Double.toString(gpa);
                    }
                    binding.yourgpaTEXT.setText(gpas);
                    binding.yourgpaTEXT.setVisibility(View.VISIBLE);
                    binding.GPAAffect.setVisibility(View.VISIBLE);
                    activity.SetOnFurther(gpa, listy);
                };

            }
        });
        this.binding.backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.onBacktoGPA();
            }
        });
        this.binding.GPAAffect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.onFurther();

    }
        });

}}