import java.util.Scanner;

public class Graphic {
    private animal dyr1;
    private animal dyr2;

    public Graphic(animal dyr1, animal dyr2) {
        this.dyr1 = dyr1;
        this.dyr2 = dyr2;
    }

    //Method for waiting a print a board every time
    public static void Scanline() {
        Scanner userInput = new Scanner(System.in);
        while (true) {
            String input = userInput.nextLine();
            if (!input.isEmpty()) {
            }
        }
    }




    //Method for Drawing the board with the animal
    public static void gridAnim(animal dyr1, animal dyr2) {
        Scanner userInput = new Scanner(System.in);
        for (int x = 1; x < 10; x++) {
            topLine();
            if (x == dyr1.getXpos()){
                boxAnimlines(x, dyr1.getYpos(), dyr1.getGraph());
            }  else if (x == dyr2.getXpos()){
                boxAnimlines(x, dyr2.getYpos(), dyr2.getGraph());
            } else {
                gridNumLine(x);
            }
        }
        topLine();
        String input = userInput.nextLine();
        if (!input.isEmpty()) {

        }
    }


    public static void topLine() {
        System.out.println("+———————+———————+———————+———————+———————+———————+———————+———————+———————+");
    }

    public static void boxAnimlines(int x, int ay, AnimGraph graph) {
        //prints topline of animal 1 || animal 2
        for (int y = 1; y < 10; y++) {
            if (y == ay) {
                System.out.print(graph.getTop());
            } else{
                System.out.print("|");
                System.out.print("       ");
            }
        }
        System.out.println("|");

        //prints midline
        for (int y = 1; y < 10; y++) {
            if (y == ay) {
                System.out.print(graph.getMid());
            } else{
                System.out.print("|");
                System.out.print("  " + x + " " + y + "  ");
            }
        }
        System.out.println("|");

        //prints bottomline
        for (int y = 1; y < 10; y++) {
            if (y == ay) {
                System.out.print(graph.getBott());
            } else{
                System.out.print("|");
                System.out.print("       ");
            }
        }
        System.out.println("|");
    }

    public static void boxEmptLine() {
        for (int y = 1; y < 10; y++) {
            System.out.print("|");
            System.out.print("       ");
        }
        System.out.println("|");
    }

    public static void gridNumLine(int x) {
        boxEmptLine();
        for (int y = 1; y < 10; y++) {
            System.out.print("|");
            System.out.print("  " + x + " " + y + "  ");
        }
        System.out.println("|");
        boxEmptLine();
    }
}