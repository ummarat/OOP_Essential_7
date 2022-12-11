import java.util.Arrays;
import java.util.Scanner;

/*Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з ім'ям Worker, що містить такі поля:
* прізвище та ініціали працівника;\
* назва посади;
* рік надходження на роботу.
* Написати програму, яка виконує такі дії:
* введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
* якщо значення року введено не у відповідному форматі, видає виняток.
* виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.*/

public class Main extends Exception {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
        }

        Arrays.sort(workers, Worker.nameComp);
        System.out.println(Arrays.toString(workers));

        Scanner sr = new Scanner(System.in);
        System.out.println("Введіть значення стажу");
        int exp = sr.nextInt();
        System.out.println("Працівники зі стажем більше, ніж " + exp + " р.: ");
        for (int i = 0; i < workers.length; i++) {
            int y = workers[i].getYear();
            if(y > exp)
                System.out.println(workers[i].getName());
        }
    }
}