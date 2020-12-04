package task21_22.chairs;

public class MagicChair implements Chair{
    public MagicChair() {
        System.out.println("Magic chair you have)");
    }

    @Override
    public void sit() {
        System.out.println("You sat on magic chair");
    }
}
