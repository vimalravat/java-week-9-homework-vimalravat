import java.util.HashMap;

public class Task10 {
    public static void main(String[] args) {
        HashMap<Integer, String> metropolitanLine = new HashMap<>();


        metropolitanLine.put(1 , " Baker Street");
        metropolitanLine.put(2 , " King's Cross St. Pancras");
        metropolitanLine.put(3 , " Farringdon");
        metropolitanLine.put(4 , " Barbican");
        metropolitanLine.put(5 , " Moorgate");
        metropolitanLine.put(6 , " Liverpool Street");

        HashMap<Integer, String> centralLine = new HashMap<>();
        centralLine.put(1 ," Bond Street");
        centralLine.put(2, " Oxford Circus");
        centralLine.put(3, " Holborn");
        centralLine.put(4, " Bank");
        centralLine.put(5, " Liverpool Street");
        centralLine.put(6, " Shoreditch High Street");

        for (Integer i : metropolitanLine.keySet()) {
            System.out.println("Metropolitane Line Station:  " + i +  metropolitanLine.get(i));

        }


        System.out.println();
        for (Integer i : centralLine.keySet()) {
            System.out.println("Central Line Station:  " + i + centralLine.get(i));


        }
    }
}
