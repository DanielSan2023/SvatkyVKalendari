package com.Engeto.Sviatky;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kalendar {
    Map<LocalDate,String name>  sviatkyVKalendari = new HashMap;


    public static loadPlantsFromFile(String filename) throws PlantException {
        PlantList result = new PlantList();
        int lineNumber = 1;
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))) { // Otevři soubor
            while (scanner.hasNextLine()) { // Dokud je k dispozici další řádek:
                String line = scanner.nextLine(); // Načti řádek ze souboru
                //System.out.println(line);           // Vypiš řádek na obrazovku.
                parseLine(line, result, lineNumber);
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            throw new PlantException("Nepodařilo se nalézt soubor "+filename+": "+e.getLocalizedMessage());
        }

        return result;
    }


}
