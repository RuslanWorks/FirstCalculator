package CalculatorPackge;

public class CalculatorMain {
    public static void main(String[] args) {
        //Создание класса для считывания (ссылка на экземпляр класса)
        ReadCalculator readCalculator = new ReadCalculator();
        double first;
        double second;
        // Присвоение того, что считываем с клавиатуры
        System.out.println("Введите первое число");
        first = readCalculator.readNextDouble();
        System.out.println("Введите второе число");
        second = readCalculator.readNextDouble();

        //Создание ссылки на объект класса Calculator и инициализация с помощью конструктора, передача параметров first and second
        Calculator calculator = new Calculator(first, second);

        System.out.println("Веберите действие, которое вы хотите совершить:");
        System.out.println("1) Сложить");
        System.out.println("2) Вычесть");
        System.out.println("3) Умножить");
        System.out.println("4) Разделить");
        System.out.println("Введите номер действия: ");
        int effect = (int) readCalculator.readNextDouble();
        //Условия для вывода ответа
        if (effect==1){
            System.out.println(calculator.Sum());
            return;
        }
        if (effect==2){
            System.out.println(calculator.Subtraction());
            return;
        }
        if (effect==3){
            System.out.println(calculator.Multiplication());
            return;
        }
        if (effect==4){
            System.out.println(calculator.Division());
            return;
        }
        if (effect>4 || effect<1){
            System.out.println("Такого действия не существует!");
        }
    }
}
