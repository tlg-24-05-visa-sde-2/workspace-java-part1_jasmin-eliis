import java.util.Collection;
import java.util.HashMap;
import java.util.Map;



class MapTest {
    public static void main(String[] args) {
        Map<String, Double> gpaMap = new HashMap<>();
        gpaMap.put("Kea", 4.0);
        gpaMap.put("Jasmin", 3.6);
        gpaMap.put("Deshon", 2.5);
        gpaMap.put("Kelvin", 1.7);
        gpaMap.put("Sherie", 3.84);
        gpaMap.put("Tyler", 3.9);

        Double jasminGPA = gpaMap.get("Jasmin");
        System.out.println("Jasmin's GPA was : " + jasminGPA);
        System.out.println();

        dump(gpaMap);

        //print all names and number of those with 2.5 or greater
        for (var entry : gpaMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            if (entry.getValue() >= 2.5) {
                System.out.println(entry.getKey());
                System.out.println();
            }
        }


        //PRINT ALL GPAS THAT 3.5 OR GREATER
        Collection<Double> gpas = gpaMap.values();
        for (Double gpa : gpas) {
            if (gpa >= 3.5) {
                System.out.println(gpa);
                System.out.println();
            }
        }
    }

        private static void dump(Map<String,Double> gpaMap) {
            for (Map.Entry<String, Double> entry : gpaMap.entrySet()) {     //collection of rows
                System.out.println(entry.getKey());
            }
        }
    }
