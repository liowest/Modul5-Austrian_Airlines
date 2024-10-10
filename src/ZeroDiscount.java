public class ZeroDiscount extends Rabattstrategie{
    public ZeroDiscount() {
        super("Zero Discount");
    }

    @Override
    public double getReduzierterPreis(double regulärpreis) {
       return regulärpreis;
    }



}
