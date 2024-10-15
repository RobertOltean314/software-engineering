import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> variable = new HashSet<>(); // Valori unice in Set()
        variable.add("42");
        variable.add("3");
        System.out.println(variable);
        variable.add("test");
        System.out.println(variable);

        List<String> variable2 = new LinkedList<>(); // Valori ordinate in List()
        variable2.add("42");
        variable2.add("3");
        System.out.println(variable2);
        variable2.add("test");
        System.out.println(variable2);

        Map<String, Integer> variable3 = new HashMap<>(); // Copie chiave-valore in Map()
        variable3.put("unu", 1);
        variable3.put("doi", 2);
        System.out.println(variable3);
        variable3.put("test", 0);
        System.out.println(variable3);
    }
}