import Models.TShirt;
import Models.Order;

public class MainApp {
    public static void main(String[] args) {

        TShirt tShirt1 = new TShirt("Nepali Flag", 123, 999.0, "Nepal Clothing",
                "Nepal's national flag design", new String[]{"S", "M", "L"});


        tShirt1.describeTShirt();

        Order order1 = new Order("Ram Bahadur", "9876543210",
                new int[]{999}, new double[]{666.0});

        order1.printBillWithVAT();
    }
}