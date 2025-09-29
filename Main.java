//package Temp_Converter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //TEMPERATURE CONVERTER

        double temp;
        double newT;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F):  ");
        unit = scanner.next().toUpperCase();

        //ternary operator 
        // (condition) ? true : false;
        newT = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5 ) + 32;

        System.out.printf("%.1f°%s",  newT, unit);

        scanner.close();
    }
    
}
