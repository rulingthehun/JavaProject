package Gun43._04_ZonedDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _04_ZonedDateTime {
    //    Baska zaman bolgelerinin (Zone) zaman bilgisini alma
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
//        Su an bulundugum defualt zoneID
        System.out.println("zdt = " + zdt);

        Set<String> zamanBolgeleri = ZoneId.getAvailableZoneIds();

        for (String zoneID : zamanBolgeleri) {
//            if (zoneID.toLowerCase().contains("london"))
            System.out.println("zoneID = " + zoneID);
        }

        ZoneId zoneIdLondon = ZoneId.of("Europe/London");
        ZonedDateTime saatLondon = ZonedDateTime.now(zoneIdLondon);
        System.out.println("saatLondon = " + saatLondon);
    }
}
