import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Angebot {
    private double flugnummer;
    private LocalDate flugdatum;
    private double regulärerPreis;
    Rabattstrategie rabattstrategie;
    private double reduziertenpreis;


    public Angebot(double flugnummer, LocalDate flugdatum, double regulärerPreis) {
        this.flugnummer = flugnummer;
        this.flugdatum = flugdatum;
        this.regulärerPreis = regulärerPreis;
        getRabattstrategie();
         reduziertenpreis = getReduziertenpreis();

    }

    public void getRabattstrategie() {
        int monatvlue=flugdatum.getMonthValue();
        if (monatvlue==1||monatvlue==4||monatvlue==10) {
            this.rabattstrategie=new MaxiDiscount();
        }
        else if (monatvlue==2||monatvlue==3) {
            this.rabattstrategie=new MidDiscount();
        }
        else {
            this.rabattstrategie= new ZeroDiscount();
        }

    }
    public double getReduziertenpreis(){
       return rabattstrategie.getReduzierterPreis(regulärerPreis);
    }


    public double getFlugnummer() {
        return flugnummer;
    }

    public void setFlugnummer(double flugnummer) {
        this.flugnummer = flugnummer;
    }

    public LocalDate getFlugdatum() {
        return flugdatum;
    }

    public void setFlugdatum(LocalDate flugdatum) {
        this.flugdatum = flugdatum;
    }

    public double getRegulärerPreis() {
        return regulärerPreis;
    }

    public void setRegulärerPreis(double regulärerPreis) {
        this.regulärerPreis = regulärerPreis;
    }
    public void anzeigen(){
        System.out.println("Regulärer Preis: "+regulärerPreis+ "Flugdatum: "+
                flugdatum.format(DateTimeFormatter.BASIC_ISO_DATE)+"Flugnummer: "+
                flugnummer +"Rabattierter Preis: "+reduziertenpreis
                +"Rabattname: "+
                rabattstrategie.getBezeichnung());

    }
}
