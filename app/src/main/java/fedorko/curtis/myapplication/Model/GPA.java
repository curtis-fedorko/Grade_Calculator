package fedorko.curtis.myapplication.Model;

import java.util.ArrayList;
import java.util.Hashtable;

public class GPA {
    Hashtable<String, Double> unweighted = new Hashtable<>();
    Hashtable<String, Double> wweightedcp1 = new Hashtable<>();
    Hashtable<String, Double> wweightedcp2 = new Hashtable<>();
    Hashtable<String, Double> wweightedH = new Hashtable<>();
    Hashtable<String, Double> wweightedAP = new Hashtable<>();
    Hashtable<String, Double> wweighted = new Hashtable<>();


    public GPA(){
        unweighted.put("A+", 4.0);
        unweighted.put("A", 4.0);
        unweighted.put("A-", 3.7);
        unweighted.put("B+", 3.3);
        unweighted.put("B", 3.0);
        unweighted.put("B-", 2.7);
        unweighted.put("C+", 2.3);
        unweighted.put("C", 2.0);
        unweighted.put("C-", 1.7);
        unweighted.put("D+", 1.3);
        unweighted.put("D", 1.0);
        unweighted.put("D-", .7);
        unweighted.put("F", 0.0);

        wweightedcp1.put("A+", 4.0);
        wweightedcp1.put("A", 3.9);
        wweightedcp1.put("A-", 3.7);
        wweightedcp1.put("B+", 3.3);
        wweightedcp1.put("B", 3.0);
        wweightedcp1.put("B-", 2.7);
        wweightedcp1.put("C+", 2.3);
        wweightedcp1.put("C", 2.0);
        wweightedcp1.put("C-", 1.7);
        wweightedcp1.put("D+", 1.3);
        wweightedcp1.put("D", 0.7);
        wweightedcp1.put("F", 0.0);

        wweightedcp2.put("A+", 4.5);
        wweightedcp2.put("A", 4.4);
        wweightedcp2.put("A-", 4.2);
        wweightedcp2.put("B+", 3.8);
        wweightedcp2.put("B", 3.5);
        wweightedcp2.put("B-", 3.2);
        wweightedcp2.put("C+", 2.8);
        wweightedcp2.put("C", 2.5);
        wweightedcp2.put("C-", 2.2);
        wweightedcp2.put("D+", 1.8);
        wweightedcp2.put("D", 1.5);
        wweightedcp2.put("D-", 1.2);
        wweightedcp2.put("F", 0.0);

        wweightedH.put("A+", 5.0);
        wweightedH.put("A", 4.9);
        wweightedH.put("A-", 4.7);
        wweightedH.put("B+", 4.3);
        wweightedH.put("B", 4.0);
        wweightedH.put("B-", 3.7);
        wweightedH.put("C+", 3.2);
        wweightedH.put("C", 2.8);
        wweightedH.put("C-", 2.5);
        wweightedH.put("D+", 2.2);
        wweightedH.put("D", 1.8);
        wweightedH.put("D-", 1.5);
        wweightedH.put("F", 0.0);

        wweightedAP.put("A+", 5.2);
        wweightedAP.put("A", 5.0);
        wweightedAP.put("A-", 4.9);
        wweightedAP.put("B+", 4.5);
        wweightedAP.put("B", 4.2);
        wweightedAP.put("B-", 3.9);
        wweightedAP.put("C+", 3.4);
        wweightedAP.put("C", 3.0);
        wweightedAP.put("C-", 2.7);
        wweightedAP.put("D+", 2.4);
        wweightedAP.put("D", 2.0);
        wweightedAP.put("D-", 1.7);
        wweightedAP.put("F", 0.0);
    }
    public double CalcGPASemester(String[] grades, String scales, ArrayList<Double> units){
        double sum = 0;
        double sumunits = 0;
        double[]  unit = new double[units.size()];
        for(int i = 0; i < units.size();i++ ){
            unit[i] = units.get(i);}

        if(scales.equals("4.0")) {
            for (int i = 0; i < grades.length; i++) {
                String temp = grades[i];
                double tempy = unweighted.get(temp);
                sum += (tempy * unit[i]);
                sumunits += (unit[i]);
            }
        }
        if(scales.equals("5.0")) {
            for (int i = 0; i < grades.length; i++) {
                String temp = grades[i];
                double tempy = unweighted.get(temp);
                sum += tempy;
            }
        }
        if(scales.equals("5.2")) {
            for (int i = 0; i < grades.length; i++) {
                String temp = grades[i];
                if(unit[i] == 1.0){
                    double tempy = wweightedcp1.get(temp);
                    sum += tempy;
                }
                else if(unit[i] == 2.0){
                    double tempy = wweightedcp2.get(temp);
                    sum += tempy;
                }
                else if(unit[i] == 3.0){
                    double tempy = wweightedH.get(temp);
                    sum += tempy;
                }
                else if(unit[i] == 4.0){
                    double tempy = wweightedAP.get(temp);
                    sum += tempy;
                }
            }
            return sum / grades.length;
        }
        return sum / sumunits;
    }

    public double CalcGPAallTime(double[] gpas, double[] units){
        double sum = 0;
        double sumunits = 0;
        for(int i = 0; i < gpas.length; i++){
            double tempy = gpas[i];
            sum += (tempy * units[i]);
            sumunits += units[i];
        }
        return sum / sumunits;
    }

}

