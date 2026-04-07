package ro.ulbs.proiectaresoftware.lab3;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\raulc\\IdeaProjects\\LaboratoareSoftware\\src\\main\\java\\ro\\ulbs\\proiectaresoftware\\lab3\\text.txt";
        String outFileName = "C:\\Users\\raulc\\IdeaProjects\\LaboratoareSoftware\\src\\main\\java\\ro\\ulbs\\proiectaresoftware\\lab3\\out.txt";
        Path path = Paths.get(fileName);
        Path outPath = Paths.get(outFileName);

        List<String> text = citireFisier(path);
        adaugaRandNou(text);
        separaDupaPunct(text);
        scriereFisier(text, outPath);
    }

    public static void adaugaRandNou(List<String> listaNoua) {
        for (int i = 0; i < listaNoua.size(); i++) {
            String liniaCurenta = listaNoua.get(i);
            listaNoua.set(i, liniaCurenta + "\n");
        }

        System.out.println("----------------------Textul rezultat: \n");
        for (String linie : listaNoua) {
            System.out.print(linie);
        }
    }

    public static void separaDupaPunct(List<String> listaNoua) {
        for (int i = 0; i < listaNoua.size(); i++) {
            String liniaCurenta = listaNoua.get(i);
            String liniaModificata = liniaCurenta.replace(".", ".\n");
            listaNoua.set(i, liniaModificata);
        }

        System.out.println("--------------------Separare dupa punct :  \n");
        for (String linie : listaNoua) {
            System.out.println(linie);
        }
    }

    public static List<String> citireFisier(Path path) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Eroare la citire: " + e.getMessage());

        }
        return lines;
    }


    public static void scriereFisier(List<String> iesire, Path path) throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (String linie : iesire) {
                writer.write(linie);
                writer.newLine();
            }
        }
    }
}