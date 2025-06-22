package Week_1.DataStructuresAndAlgorithms.Exercise7_FinancialForecasting.Code;

import java.util.Scanner;

public class predictFutureValue {
    double initial = 0.00;
    double rate = 0.00;
    int years;

    predictFutureValue(double initial, double rate, int years) {
        this.initial = initial;
        this.rate = rate;
        this.years = years;
    }

    public static double calculate(double initial, double rate, int years) {
        if(years == 0){
            return initial;
        }
        else{
            return calculate(initial, rate, years - 1) * (1 + rate);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.println("\n\nEnter the initial amount: ");
            double initial = sc.nextDouble();

            System.out.println("Enter the growth rate: ");
            double rate = sc.nextDouble();

            System.out.println("Enter the number of years: ");
            int years = sc.nextInt();

            double result = calculate(initial, rate, years);
            System.out.printf("\nYour amount in %d years will be: ₹ %.2f", years,result);
        }
        sc.close();
    }
}

