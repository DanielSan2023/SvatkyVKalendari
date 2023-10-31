import com.Engeto.Sviatky.Kalendar;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<LocalDate, String> svatkyVKalendari = new HashMap<>();

//
//        svatkyVKalendari.put (LocalDate.of(2023,3,8),new ArrayList<>(List.of("Anna")));
//
//        svatkyVKalendari.put (LocalDate.of(2023, 5, 8),new ArrayList<>(List.of("Dasa")));
//        svatkyVKalendari.put (LocalDate.of(2023, 7, 21),new ArrayList<>(List.of("Daniel")));
//        svatkyVKalendari.put (LocalDate.of(2023, 12, 24),new ArrayList<>(List.of("Eva")));
//        svatkyVKalendari.put (LocalDate.of(2023, 12, 31),new ArrayList<>(List.of("Silvester")));


        Kalendar kalendar = new Kalendar();
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,d");

        String formattedDate = tomorrow.format(formatter);
        System.out.println(formattedDate);
        String filename = "kalendarmien.txt";

        kalendar.loadFromFile(filename);
        System.out.println(kalendar.najdiSviatokPodlaDatumu("2023,5,1"));
        System.out.println(kalendar.najdiSviatokPodlaDatumu(formattedDate));



    }
}