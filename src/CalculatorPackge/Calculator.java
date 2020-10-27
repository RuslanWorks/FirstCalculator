package CalculatorPackge;

public class Calculator {
    private double a;
    private double b;

    //Создание конструктора
    public Calculator(){
        //Присвоение полям значение
        this.a = 0;
        this.b = 0;
    }

    public Calculator (double a, double b){
        this.a = a;
        this.b = b;
    }
    //Методы для работы с полями
    public double Sum(){//Метод сложения
        return a+b;
    }
    public  double Subtraction(){//Метод вычитания
        return a-b;
    }
    public double Multiplication(){//Метод умножения
        return a*b;
    }
    public double Division(){//Метод деления
        return a/b;
    }
}
