public class MaxiDiscount extends Rabattstrategie {

    public MaxiDiscount() {
        super("Maxidiscount");
    }

    @Override
    public double getReduzierterPreis(double regulärpreis) {
        return regulärpreis *0.7;
    }
}
