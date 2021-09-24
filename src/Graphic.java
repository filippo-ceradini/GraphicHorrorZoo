import java.util.Scanner;

public class Graphic {
    private animal dyr1;
    private animal dyr2;

    public Graphic(animal dyr1, animal dyr2) {
        this.dyr1 = dyr1;
        this.dyr2 = dyr2;
    }

    
    public static void gridAnim(animal dyr1, animal dyr2) {
        Scanner userInput = new Scanner(System.in);
        for(int x = 1; x < 10; ++x) {
            topLine();
            if (x == dyr1.getXpos()) {
                boxAnimlines(x, dyr1.getYpos(), dyr1.getGraph());
            } else if (x == dyr2.getXpos()) {
                boxAnimlines(x , dyr2.getYpos(), dyr2.getGraph());
            } else {
                gridNumLine(x );
            }
        }
        topLine();
        String input = userInput.nextLine();

    }

    public static void topLine() {
        System.out.println("+———————+———————+———————+———————+———————+———————+———————+———————+———————+");
    }

    public static void boxAnimlines(int x, int dyrY, AnimGraph dyr2) {
        int y ;
        for(y = 1; y < 10; ++y ) {
            if (y == dyrY) {
                System.out.print(dyr2.getTop());
            } else {
                System.out.print("|");
                System.out.print("       ");
            }
        }

        System.out.println("|");

        for(y = 1; y < 10; ++y ) {
            if (y == dyrY) {
                System.out.print(dyr2.getMid());
            } else {
                System.out.print("|");
                System.out.print("  " + x + " " + y + "  ");
            }
        }

        System.out.println("|");

        for(y = 1; y < 10; ++y) {
            if (y == dyrY) {
                System.out.print(dyr2.getBott());
            } else {
                System.out.print("|");
                System.out.print("       ");
            }
        }
        System.out.println("|");
    }

    public static void boxEmptLine() {
        for(int y = 1; y < 10; ++y) {
            System.out.print("|");
            System.out.print("       ");
        }
        System.out.println("|");
    }

    public static void gridNumLine(int x) {
        boxEmptLine();
        for(int y = 1; y < 10; ++y) {
            System.out.print("|");
            System.out.print("  " + x + " " + y + "  ");
        }
        System.out.println("|");//final return
        boxEmptLine();
    }
}
