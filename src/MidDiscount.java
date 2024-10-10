public class MidDiscount extends Rabattstrategie {

    public MidDiscount() {
        super("MidDiscount");
    }

    @Override
    public double getReduzierterPreis(double regulärpreis) {
       return regulärpreis *0.9;
    }
}
