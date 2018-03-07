import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Exercise13 {

    /*
Write a method isUnique that accepts a map whose keys and values are strings as a parameter and returns true if
no two keys map to the same value (and false if any two or more keys do map to the same value). For example, if
the map contains the following key/value pairs, your method would return true: {Marty=Stepp, Stuart=Reges,
Jessica=Miller, Amanda=Camp, Hal=Perkins}. But calling it on the following map would return false,
because of two mappings for Perkins and Reges: {Kendrick=Perkins, Stuart=Reges, Jessica=Miller,
Bruce=Reges, Hal=Perkins}.
     */

    public static void main(String[] args)
    {
        Map nytmap = new TreeMap();

        boolean sandt;

        nytmap.put("Stepp", "Marty");
        nytmap.put("Rages", "Stuart");
        nytmap.put("Miller","Jessika");
        nytmap.put("Camp","Amanda");
        nytmap.put("Perkins","Hal");

        sandt = isUnigue(nytmap);

        System.out.println("Map: " + sandt);

        Map mappet = new TreeMap<>();
        mappet.put("Hal","Perkins");
        mappet.put("Bruce","Reges");
        mappet.put("Jessica","Miller");
        mappet.put("Rages", "Stuart");
        mappet.put("Kendrick","Perkins");

        sandt = isUnigue(mappet);
        System.out.println("Når der returneres: " + sandt);
    }

    public static boolean isUnigue (Map map)
    {
        Set value = new HashSet<>();

        for (Object ve :
                map.keySet())
        {
            String nøgle = (String) map.get(ve);
            value.add(nøgle);
        }
        return value.size() == map.size();
    }
}
