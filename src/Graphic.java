import java.util.Scanner;

public class Graphic {
    private animal dyr1;
    private animal dyr2;

    public Graphic(animal var1, animal var2) {
        this.dyr1 = var1;
        this.dyr2 = var2;
    }

    public static void Scanline() {
        Scanner var0 = new Scanner(System.in);

        while(true) {
            String var1 = var0.nextLine();
            if (!var1.isEmpty()) {
            }
        }
    }

    public static void gridAnim(animal var0, animal var1) {
        Scanner var2 = new Scanner(System.in);

        for(int var3 = 1; var3 < 10; ++var3) {
            topLine();
            if (var3 == var0.getXpos()) {
                boxAnimlines(var3, var0.getYpos(), var0.getGraph());
            } else if (var3 == var1.getXpos()) {
                boxAnimlines(var3, var1.getYpos(), var1.getGraph());
            } else {
                gridNumLine(var3);
            }
        }

        topLine();
        String var4 = var2.nextLine();
        if (!var4.isEmpty()) {
        }

    }

    public static void topLine() {
        System.out.println("+———————+———————+———————+———————+———————+———————+———————+———————+———————+");
    }

    public static void boxAnimlines(int var0, int var1, AnimGraph var2) {
        int var3;
        for(var3 = 1; var3 < 10; ++var3) {
            if (var3 == var1) {
                System.out.print(var2.getTop());
            } else {
                System.out.print("|");
                System.out.print("       ");
            }
        }

        System.out.println("|");

        for(var3 = 1; var3 < 10; ++var3) {
            if (var3 == var1) {
                System.out.print(var2.getMid());
            } else {
                System.out.print("|");
                System.out.print("  " + var0 + " " + var3 + "  ");
            }
        }

        System.out.println("|");

        for(var3 = 1; var3 < 10; ++var3) {
            if (var3 == var1) {
                System.out.print(var2.getBott());
            } else {
                System.out.print("|");
                System.out.print("       ");
            }
        }

        System.out.println("|");
    }

    public static void boxEmptLine() {
        for(int var0 = 1; var0 < 10; ++var0) {
            System.out.print("|");
            System.out.print("       ");
        }

        System.out.println("|");
    }

    public static void gridNumLine(int var0) {
        boxEmptLine();

        for(int var1 = 1; var1 < 10; ++var1) {
            System.out.print("|");
            System.out.print("  " + var0 + " " + var1 + "  ");
        }

        System.out.println("|");
        boxEmptLine();
    }
}
