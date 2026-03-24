package lab4;

import java.util.*;

import static java.lang.Character.getName;

public class AppLab4 {
    static void main() {
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);
        varste.put("Vlad", 19);
        varste.put("Iulia", 19);
        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj","Simina", "Alba-Iulia","Marius", "Medias", "Mihai", "Cisnadie","Daniela", "Sibiu");

        Set entries = varste.entrySet(); //parcurgerea intrarilor in Map, cu iterator
        Iterator iterator = entries.iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(entry);
        }
        System.out.println("\n");
        Set entries2 = adrese.entrySet(); //parcurgerea intrarilor in Map, cu iterator
        Iterator iterator2 = entries.iterator();
        while(iterator2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) iterator2.next();
            Object key = entry2.getKey();
            Object value = entry2.getValue();
            System.out.println(entry2);
        }

        HashMap<String, Tanar> tineri = new HashMap<>();
        for(Object key : varste.keySet()) { //parcurgere Map folosind for-each
            Object value = varste.get(key);
            tineri.put(value, null);
        }

        Set entries3 = tineri.entrySet(); //parcurgerea intrarilor in Map, cu iterator
        Iterator iterator3 = entries.iterator();
        while(iterator2.hasNext()) {
            Map.Entry entry3 = (Map.Entry) iterator2.next();
            Object key = entry3.getKey();
            Object value = entry3.getValue();
            System.out.println(entry3);
        }
    }
}
