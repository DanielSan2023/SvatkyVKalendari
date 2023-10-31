package com.Engeto.Sviatky;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kalendar {
    private Map<String,String>  sviatkyVKalendari;

    public Kalendar() {
        sviatkyVKalendari = new HashMap<>();
    }

    public void loadFromFile(String filename) {
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                String[] blocks = line.split("\\s+");
                if (blocks.length != 2) {
                    throw new DateTimeException("Nesprávný počet položek na řádku: " + line);
                }
                String datum = blocks[0];
                String mena = blocks[1];
                sviatkyVKalendari.put(datum, mena);
            }
        } catch (FileNotFoundException e) {
            throw new DateTimeException("Nepodařilo se nalézt soubor "+filename+": "+e.getLocalizedMessage());
        }
    }

    public void printAllDateName() {
        for (Map.Entry<String, String> entry : sviatkyVKalendari.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public String najdiSviatokPodlaDatumu(String datum) {
        String menoSviatku = sviatkyVKalendari.get(datum);
        if (menoSviatku != null) {
            return "Má svátek: " + menoSviatku;
        } else {
            return "Nemá svátek.";
        }
    }


}
