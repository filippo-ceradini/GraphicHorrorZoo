//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decomp
import java.util.Scanner;

public class Run {
    public Run() {
    }

    public static void main(String[] args) {
        String snakeyell = "+—————————————————————————————+\n|   “You’re Dead Bunny!       |\n|      ---_ ......._-_--.     |    \n|     (|\\ /      / /| \\  \\    |\n|     /  /     .'  -=-'   `.  |\n|    /  /    .'             ) |\n|  _/  /   .'        _.)   /  |\n| / o   o        _.-' /  .'   |\n| \\          _.-'    / .'*|   |\n|  \\______.-'//    .'.' \\*|   |\n|   \\|  \\ | //   .'.' _ |*|   |\n|    `   \\|//  .'.'_ _ _|*|   |\n|     .  .// .'.' | _ _ \\*|   |\n|     \\`-|\\_/ /    \\ _ _ \\*\\  |\n|      `/'\\__/      \\ _ _ \\*\\ |\n|     /^|            \\ _ _ \\*\\|\n|    '  `             \\ _ _ \\*| \n|                      \\ - - \\|\n+————————————————————————————-+";
        String rabbityell = "+—————————————————————————————+\n|                         .\". |\n|   “Oh, not again!”     /  | |\n|              \\        /  /  |\n|               \\      / ,\"   |\n|          .-------.--- /     |\n|         \"._ __.-/ o. o\\     | \n|            \"   (    Y  )    |\n|                 )     /     |\n|                /     (      |\n|               /       Y     |\n|           .-\"         |     |\n|          /  _     \\    \\    |\n|         /    `. \". ) /' )   |\n|        Y       )( / /(,/    |\n|       ,|      /     )       |\n|      ( |     /     /        |\n|       \" \\_  (__   (__       |\n|           “-._,)—._,_)      |\n+————————————————————————————-+";
        AnimGraph gSnake = new AnimGraph("|   Y   ", "|  (\")  ", "|   \\\\  ");
        AnimGraph gRabbit = new AnimGraph("| (\\_/) ", "| (o.o) ", "| (___)0");
        animal snake = new animal(9, 9, snakeyell, "Snake", gSnake);
        animal bunny = new animal(1, 1, rabbityell, "Rabbit", gRabbit);
        System.out.println(snake.toAnimalPos());
        System.out.println(bunny.toAnimalPos());
        Graphic.gridAnim(bunny, snake);
        Scanner userInput = new Scanner(System.in);

        while(bunny.getXpos() != snake.getXpos() && bunny.getYpos() != snake.getYpos()) {
            bunny.moveFwrd();
            Graphic.gridAnim(snake, bunny);
            String input;
            if (bunny.getXpos() == snake.getXpos() - 1 && bunny.getYpos() == snake.getYpos() - 1) {
                System.out.println(bunny.getAnimalYell());
                input = userInput.nextLine();
                if (!input.isEmpty()) {
                }

                snake.moveBack();
                Graphic.gridAnim(snake, bunny);
                break;
            }

            if (bunny.getXpos() == snake.getXpos() && bunny.getYpos() == snake.getYpos()) {
                break;
            }

            snake.moveBack();
            Graphic.gridAnim(snake, bunny);
            if (bunny.getXpos() == snake.getXpos() - 1 && bunny.getYpos() == snake.getYpos() - 1) {
                System.out.println(bunny.getAnimalYell());
                input = userInput.nextLine();
                if (!input.isEmpty()) {
                }
            }
        }

        System.out.println(snake.getAnimalYell());
    }
}
