package com.mycompany.p0051;

public class Main {

    public static void main(String[] args) {
        //loop until user want to exit
        while (true) {
            //display menu
            int choice = P0051.mennu();
            switch (choice) {
                case 1:
                    //step2: use normal calculator function
                    P0051.normalCalculator();
                    break;
                case 2:
                    //step3: use BMI calculator function
                    P0051.BMICalculator();
                    break;
                case 3:
                    //step4: exit
                    return;
            }
        }

    }
}
