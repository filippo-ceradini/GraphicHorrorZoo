import java.util.Scanner;

public class Run {
    public Run() {
    }

    public static void main(String[] var0) {
        String var1 = """
                +—————————————————————————————+
                |   “You’re Dead Bunny!       |
                |      ---_ ......._-_--.     |   \s
                |     (|\\ /      / /| \\  \\    |
                |     /  /     .'  -=-'   `.  |
                |    /  /    .'             ) |
                |  _/  /   .'        _.)   /  |
                | / o   o        _.-' /  .'   |
                | \\          _.-'    / .'*|   |
                |  \\______.-'//    .'.' \\*|   |
                |   \\|  \\ | //   .'.' _ |*|   |
                |    `   \\|//  .'.'_ _ _|*|   |
                |     .  .// .'.' | _ _ \\*|   |
                |     \\`-|\\_/ /    \\ _ _ \\*\\  |
                |      `/'\\__/      \\ _ _ \\*\\ |
                |     /^|            \\ _ _ \\*\\|
                |    '  `             \\ _ _ \\*|\s
                |                      \\ - - \\|
                +————————————————————————————-+""";
        String var2 = "+—————————————————————————————+\n|                         .\". |\n|   “Oh, not again!”     /  | |\n|              \\        /  /  |\n|               \\      / ,\"   |\n|          .-------.--- /     |\n|         \"._ __.-/ o. o\\     | \n|            \"   (    Y  )    |\n|                 )     /     |\n|                /     (      |\n|               /       Y     |\n|           .-\"         |     |\n|          /  _     \\    \\    |\n|         /    `. \". ) /' )   |\n|        Y       )( / /(,/    |\n|       ,|      /     )       |\n|      ( |     /     /        |\n|       \" \\_  (__   (__       |\n|           “-._,)—._,_)      |\n+————————————————————————————-+";
        AnimGraph var3 = new AnimGraph("|   Y   ", "|  (\")  ", "|   \\\\  ");
        AnimGraph var4 = new AnimGraph("| (\\_/) ", "| (o.o) ", "| (___)0");
        animal var5 = new animal(9, 9, var1, "Snake", var3);
        animal var6 = new animal(1, 1, var2, "Rabbit", var4);
        System.out.println(var5.toAnimalPos());
        System.out.println(var6.toAnimalPos());
        Graphic.gridAnim(var6, var5);
        Scanner var7 = new Scanner(System.in);

        while(var6.getXpos() != var5.getXpos() && var6.getYpos() != var5.getYpos()) {
            var6.moveFwrd();
            Graphic.gridAnim(var5, var6);
            String var8;
            if (var6.getXpos() == var5.getXpos() - 1 && var6.getYpos() == var5.getYpos() - 1) {
                System.out.println(var6.getAnimalYell());
                var8 = var7.nextLine();
                if (!var8.isEmpty()) {
                }


                var5.moveBack();
                Graphic.gridAnim(var5, var6);
                break;
            }

            if (var6.getXpos() == var5.getXpos() && var6.getYpos() == var5.getYpos()) {
                break;
            }

            var5.moveBack();
            Graphic.gridAnim(var5, var6);
            if (var6.getXpos() == var5.getXpos() - 1 && var6.getYpos() == var5.getYpos() - 1) {
                System.out.println(var6.getAnimalYell());
                var8 = var7.nextLine();
                if (!var8.isEmpty()) {
                }
            }
        }

        System.out.println(var5.getAnimalYell());
    }
}
