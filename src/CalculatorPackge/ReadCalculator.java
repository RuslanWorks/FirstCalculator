package CalculatorPackge;

import java.util.Scanner;

public class ReadCalculator {
    //Метод считывания числа
    public double readNextDouble(){
        Scanner scanner = new Scanner(System.in);
        double scan = 0;
        if(scanner.hasNextDouble()){
            scan = scanner.nextDouble();
        }
        else{
            System.out.println("Вы ввели не число!");
        }
        return scan;
    }
}
