import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Angebot angebot1 = new Angebot(1211212122, LocalDate.of(2024,12,23),150);
        Angebot angebot2 = new Angebot(3434655, LocalDate.of(2024,10,23),170);
        Angebot angebot3 = new Angebot(9898988, LocalDate.of(2024,3,23),190);
angebot1.anzeigen();
angebot2.anzeigen();
angebot3.anzeigen();

    }
}