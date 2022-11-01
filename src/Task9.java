import java.util.HashMap;
import java.util.Map;

public class Task9 {
    public static void main(String[] args) {
        Map<String, Integer> people= new HashMap<>();
        people.put("Alpha", 20);
        people.put("Beta", 30);
        people.put("Charlie", 40);
        people.put("Danny", 50);
        people.put("Echo", 60);
        people.put("Foxtrot", 70);

        for( String i: people.keySet()){
            System.out.println("Name:  " + i + "     Age:  " + people.get(i));

        //for (Map.Entry<String, Integer> Task9 : people.entrySet() ) {
           // System.out.println("Key:  "   + Task9 + "Value:  " );

            
        }


    }
}
