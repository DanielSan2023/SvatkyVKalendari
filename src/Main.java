import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<LocalDate, List<String>> svatkyVKalendari = new HashMap<>();


        svatkyVKalendari.put (LocalDate.of(2023,3,8),new ArrayList<>(List.of("Anna")));

        svatkyVKalendari.put (LocalDate.of(2023, 5, 8),new ArrayList<>(List.of("Dasa")));
        svatkyVKalendari.put (LocalDate.of(2023, 7, 21),new ArrayList<>(List.of("Daniel")));
        svatkyVKalendari.put (LocalDate.of(2023, 12, 24),new ArrayList<>(List.of("Eva")));
        svatkyVKalendari.put (LocalDate.of(2023, 12, 31),new ArrayList<>(List.of("Silvester")));

        // Získání data zítra
        LocalDate tomorrow = LocalDate.now().plusDays(1);

        // Získání seznamu jmen pro svátek zítra
        List<String> jmenaNaSvatekZitra = svatkyVKalendari.get(tomorrow);

        if (jmenaNaSvatekZitra != null) {
            System.out.println("Svátek zítra: " + jmenaNaSvatekZitra);
        } else {
            System.out.println("Zítra není svátek přiřazen.");
        }


    }
}