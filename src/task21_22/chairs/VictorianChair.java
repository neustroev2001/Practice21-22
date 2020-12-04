package task21_22.chairs;

public class VictorianChair implements Chair {
    public VictorianChair() {
        System.out.println("Victorian chair you have");
    }

    @Override
    public void sit() {
            System.out.println("You sat on victorian chair");
    }
}
