
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ENTER YOUR WEIGHT in 'KILOGRAM': ");
        double bmiWeight = input.nextDouble();

        System.out.println("ENTER YOUR HEIGHT 'CENTIMETER': ");
        double bmiHeight = input.nextDouble();

        double bmiResult =Math.floor(bmiWeight
                / Math.pow(bmiHeight,2) * 10_000);

        if (bmiResult > 25.0){
            System.out.println(bmiResult +" is OVER_WEIGHT \n YOU ARE OBESE.");
        }else if (bmiResult >= 18.5 && bmiResult <=24.9){
            System.out.println(bmiResult +" is NORMAL_WEIGHT \n YOU ARE HEALTHY!!! ");
        }else if (bmiResult < 18.5) {
            System.out.println(bmiResult + " is UNDER WEIGHT \n YOU NEED TO EAT MORE.");
        }else {
            System.out.println("INVALID");
        }
    }
}
