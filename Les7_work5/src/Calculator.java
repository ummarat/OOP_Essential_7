public class Calculator {

    double add(double a, double b) {
        return a + b;
    }

    double sub(double a, double b) {
        return a - b;
    }

    double mul(double a, double b) {
        return a * b;
    }

    double div(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("На нуль ділити заборонено!!");
        } else
            return a / b;
    }

    void start(char x, double a, double b) {
        switch (x) {
            case '+':
                System.out.println("a + b = " + add(a, b));
                break;
            case '-':
                System.out.println("a - b = " + sub(a, b));
                break;
            case '*':
                System.out.println("a * b = " + mul(a, b));
                break;
            case '/':
                try {
                    System.out.println("a / b = " + div(a, b));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Введений знак не відповідає загальноприйнятим.");
                break;
        }
    }
}
