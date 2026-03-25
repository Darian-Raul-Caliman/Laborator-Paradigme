package ro.ulbs.proiectaresoftware.lab4;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj","Simina", "Alba-Iulia","Marius", "Medias", "Mihai", "Cisnadie","Daniela", "Sibiu");
        varste.put("Vlad", 19);
        varste.put("Iulia", 19);
        afisare(varste);
        HashMap<String, Tanar> tineri = new HashMap<>();
        populareTineri(varste, adrese, tineri);
        afisareTineri(tineri);
    }


    public static void afisare(HashMap<String, Integer> varste){
        System.out.println("\n--- Afisare  ---");
        for(String s: varste.keySet()){
            System.out.println(s);
        }
    }

    public static void afisareTineri(HashMap<String, Tanar> tineri) {
        System.out.println("\n--- Afisare Tineri ---");
        for(String nume : tineri.keySet()) {
            Tanar tanarCurent = tineri.get(nume);
            System.out.println(nume + " -> " + tanarCurent);
        }
    }

    public static void populareTineri(HashMap<String, Integer> varste , Map<String, String> adrese, HashMap<String, Tanar> tineri){
        for(String nume: varste.keySet()){
            int varsta = varste.get(nume);
            String adresa = adrese.getOrDefault(nume, "Necunoscuta");
            Tanar tanarNou = new Tanar(nume, varsta, adresa);
            tineri.put(nume, tanarNou);
        }

    }
}
