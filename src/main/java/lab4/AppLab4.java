package lab4;

import java.util.*;

public class AppLab4 {
    public static void main(String[] args) {
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

        Set<Map.Entry<String, Integer>> entries = varste.entrySet(); //parcurgerea intrarilor in Map, cu iterator
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry);
        }
        System.out.println("\n");
        Set<Map.Entry<String, String>> entries2 = adrese.entrySet(); //parcurgerea intrarilor in Map, cu iterator
        Iterator<Map.Entry<String, String>> iterator2 = entries2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry<String, String> entry2 = iterator2.next();
            System.out.println(entry2);
        }

        HashMap<String, Tanar> tineri = new HashMap<>();
        for(String name : varste.keySet()) { //parcurgere Map folosind for-each
            int age = varste.get(name);
            String address = adrese.get(name);
            tineri.put(name, new Tanar(name, age, address));
        }

        System.out.println("\n");
        Set<Map.Entry<String, Tanar>> entries3 = tineri.entrySet(); //parcurgerea intrarilor in Map, cu iterator
        Iterator<Map.Entry<String, Tanar>> iterator3 = entries3.iterator();
        while(iterator3.hasNext()) {
            Map.Entry<String, Tanar> entry3 = iterator3.next();
            System.out.println(entry3);
        }
    }
}
