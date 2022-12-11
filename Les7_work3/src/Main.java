import java.util.Arrays;
import java.util.Scanner;

/*Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з іменем Price,
 * що містить такі поля:
 * назву товару;
 * назву магазину, в якому продається товар;
 * вартість товару у гривнях.
 * Написати програму, яка виконує такі дії:
 * введення з клавіатури даних до масиву, що складається з двох елементів типу Price
 * (записи мають бути впорядковані в алфавітному порядку за назвами магазинів);
 * виведення на екран інформації про товари, що продаються в магазині, назва якого
 * введена з клавіатури (якщо такого магазину немає, вивести виняток).*/

public class Main {
    public static void main(String[] args) {
        Price[] price = new Price[2];
        for (int i = 0; i < price.length; i++) {
            price[i] = new Price();
        }

        Arrays.sort(price, Price.nameShop);
        System.out.println(Arrays.toString(price));

        boolean res = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву магазину для пошуку товарів");
        String n = scanner.nextLine();
        for (int i = 0; i < price.length; i++) {
            String s = price[i].getShop();
            if (n.equals(s)) {
                System.out.println("Товари доступні у магазині " + n + ": ");
                System.out.println(price[i].getProduct());
                res = true;
            }
        }
        if (!res) try {
            throw new MyExeption();
        } catch (MyExeption e) {
            e.notShop();
        }
    }
}