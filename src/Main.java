import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        //Riprendi uno degli esercizi già svolti e corretti: esercizio Date-5
        //Aggiungi Junit al progetto
        //Crea una funzione di test che non dia errori

        //Esercizio Date-5: Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataUno = data1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        //Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        String dataDue = data2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        //verificare che la prima data è precedente alla seconda
        boolean isBefore = data1.isBefore(data2);
        //verificare che la seconda data è successiva alla prima
        boolean isAfter = data2.isAfter(data1);
        //verificare che le due date sono uguali ad ora
        boolean isEqual = data1.isEqual(data2);
        //Stampa il risultato
        System.out.println(dataUno);
        System.out.println(dataDue);
        System.out.println("La prima data è precedente alla seconda: " + isBefore);
        System.out.println("La seconda data è successiva alla prima: " + isAfter);
        System.out.println("Le due date sono uguali ad ora: " + isEqual);
    }
}