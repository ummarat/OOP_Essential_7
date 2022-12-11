import java.util.Comparator;
import java.util.Scanner;

public class Worker {
    private String name;
    private String position;
    private int year;

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getYear() {
        return year;
    }

    Scanner scanner = new Scanner(System.in);

    Worker() {

        System.out.println("Введіть прізвище та інішіали працівника");
        name = scanner.nextLine();
        System.out.println("Введіть посаду");
        position = scanner.next();
        System.out.println("Введіть рік");
        year = scanner.nextInt();
        try {
            if (year < 1940 || year > 2022)
                throw new MyExeption();
        } catch (MyExeption e) {
            e.nameMethod1();
        }
        try {
            String s = String.valueOf(year);
            if (s.length() != 4)
                throw new MyExeption();
        } catch (MyExeption e) {
            e.nameMethod2();
        }
    }

    @Override
    public String toString() {

        return getName() + ", " + getPosition() + ", " + getYear();
    }

    public static Comparator<Worker> nameComp = new Comparator<>() {
        @Override
        public int compare(Worker o1, Worker o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}

