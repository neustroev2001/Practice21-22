package task21_22.chairs;

import java.util.Scanner;

public class Client implements Chair {
    private Chair chair;

    public Client() {
        System.out.println("Choose chair:");
        System.out.println("1.Victorian chair");
        System.out.println("2.Multifunctional chair");
        System.out.println("3.Magic chair");
        int i;
        Scanner scanner = new Scanner(System.in);
        i=scanner.nextInt();
        if (i==1){
            Fabrika fabrika = new VictorianChairFabrika();
            chair= fabrika.createChair();
        }
        else  if (i==2){
            Fabrika fabrika = new MultyfunctionChairFabrika();
            chair= fabrika.createChair();
        }
        else  if (i==3){
            Fabrika fabrika = new MagicChairFabrika();
            chair= fabrika.createChair();
        }
    }

    @Override
    public void sit() {
        chair.sit();
    }
}
