import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Price {
    private String product;
    private String shop;
    private double price;

    Scanner scanner = new Scanner(System.in);

    public Price() {
        try {
            System.out.println("Введіть назву товару");
            product = scanner.nextLine();
            System.out.println("Введіть назву магазину");
            shop = scanner.next();
            System.out.println("Введіть вартість товару");
            price = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Невірний формат числа!");
        }

    }

    public String getProduct() {
        return product;
    }

    public String getShop() {
        return shop;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {

        return getProduct() + ", " + getShop() + ", " + getPrice();
    }

    public static Comparator<Price> nameShop = new Comparator<Price>() {
        @Override
        public int compare(Price o1, Price o2) {
            return o1.getShop().compareTo(o2.getShop());
        }
    };

}
