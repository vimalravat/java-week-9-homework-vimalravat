import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> carList = new ArrayList<String>();
        carList.add("Mercedes");
        carList.add("Jaguar");
        carList.add("BMW");
        carList.add("Audi");
        carList.add("Mazda");
        carList.add("Nissan");

        System.out.println(carList);

        String element = carList.get(1);
        System.out.println("Second element: "+element);
        element = carList.get(4);
        System.out.println("Fifth element: "+element);
    }
}
