import java.util.Scanner;

/*Створіть проект за допомогою IntelliJ IDEA. Створіть клас Calculator.
* У тілі класу створіть чотири методи для арифметичних дій: (add – додавання,
* sub – віднімання, mul – множення, div – поділ). Метод поділу повинен
* перевірити поділ на нуль, якщо перевірка не проходить, згенерувати виняток.
* Користувач вводить значення, над якими хоче зробити операцію та вибрати саму операцію.
* У разі виникнення помилок повинні викидатися винятки.*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше значення");
        double a = scanner.nextDouble();
        System.out.println("Введіть арифметичний знак");
        char x = scanner.next().charAt(0);
        System.out.println("Введіть друге значення");
        double b = scanner.nextDouble();
        Calculator calculator = new Calculator();
        calculator.start(x, a, b);
    }
}