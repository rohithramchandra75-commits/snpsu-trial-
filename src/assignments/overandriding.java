package assignments;
class Calculator {
    void info(int a) {
        System.out.println("Printing one number: " + a);
    }
    void info(int a, int b) {
        System.out.println("Printing two numbers: " + a + ", " + b);
    }
    void calculate() {
        System.out.println("Performing basic calculation...");
    }
}
class ScientificCalc extends Calculator {
    @Override
    void calculate() {
        System.out.println("Performing advanced scientific calculation!");
    }
}
public class overandriding {
    public static void main(String[] args) {
        ScientificCalc myCalc = new ScientificCalc();
        myCalc.info(10);
        myCalc.info(10, 20);
        myCalc.calculate();
    }
}