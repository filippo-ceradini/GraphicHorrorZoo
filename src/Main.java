import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Graphic for the animals: 3 lines defining them.
        AnimGraph gSnake = new AnimGraph("|   Y   ", "|  (\")  ", "|   \\\\  ");
        AnimGraph gRabbit = new AnimGraph("| (\\_/) ", "| (o.o) ", "| (___)0");
        //Animals: position x&y, what the animal yells and the name of the animal
        animal snake = new animal(9, 9, "+—————————————————————————————+\n" +
                "|   “You’re Dead Bunny!       |\n" +
                "|      ---_ ......._-_--.     |    \n" +
                "|     (|\\ /      / /| \\  \\    |\n" +
                "|     /  /     .'  -=-'   `.  |\n" +
                "|    /  /    .'             ) |\n" +
                "|  _/  /   .'        _.)   /  |\n" +
                "| / o   o        _.-' /  .'   |\n" +
                "| \\          _.-'    / .'*|   |\n" +
                "|  \\______.-'//    .'.' \\*|   |\n" +
                "|   \\|  \\ | //   .'.' _ |*|   |\n" +
                "|    `   \\|//  .'.'_ _ _|*|   |\n" +
                "|     .  .// .'.' | _ _ \\*|   |\n" +
                "|     \\`-|\\_/ /    \\ _ _ \\*\\  |\n" +
                "|      `/'\\__/      \\ _ _ \\*\\ |\n" +
                "|     /^|            \\ _ _ \\*\\|\n" +
                "|    '  `             \\ _ _ \\*| \n" +
                "|                      \\ - - \\|\n" +
                "+————————————————————————————-+", "Snake", gSnake);
        animal bunny = new animal(1, 1, "+—————————————————————————————+\n" +
                "|                         .\". |\n" +
                "|   “Oh, not again!”     /  | |\n" +
                "|              \\        /  /  |\n" +
                "|               \\      / ,\"   |\n" +
                "|          .-------.--- /     |\n" +
                "|         \"._ __.-/ o. o\\     | \n" +
                "|            \"   (    Y  )    |\n" +
                "|                 )     /     |\n" +
                "|                /     (      |\n" +
                "|               /       Y     |\n" +
                "|           .-\"         |     |\n" +
                "|          /  _     \\    \\    |\n" +
                "|         /    `. \". ) /' )   |\n" +
                "|        Y       )( / /(,/    |\n" +
                "|       ,|      /     )       |\n" +
                "|      ( |     /     /        |\n" +
                "|       \" \\_  (__   (__       |\n" +
                "|           “-._,)—._,_)      |\n" +
                "+————————————————————————————-+", "Rabbit", gRabbit);
        //The system prints out the position of the animal
        System.out.println(snake.toAnimalPos());
        System.out.println(bunny.toAnimalPos());
        Graphic.gridAnim(bunny, snake);

        Scanner userInput = new Scanner(System.in);
        //While cycle: until the snake and the rabbit have the same coordinates,
        // the rabbit will move forward and the snake will move backwards.
        //2 break methods have been added so no matter if either animal is in an odd or even space,
        // the snake is the last to move
        while (bunny.getXpos() != snake.getXpos() && bunny.getYpos() != snake.getYpos()) {
            bunny.moveFwrd();
            Graphic.gridAnim(snake, bunny);
            if (bunny.getXpos() == snake.getXpos() - 1 && bunny.getYpos() == snake.getYpos() - 1) {
                System.out.println(bunny.getAnimalYell());
                String input = userInput.nextLine();
                if (!input.isEmpty()) {}

                snake.moveBack();
                Graphic.gridAnim(snake, bunny);
                break;
            }
            if (bunny.getXpos() == snake.getXpos() && bunny.getYpos() == snake.getYpos()) {break;}
            snake.moveBack();
            Graphic.gridAnim(snake, bunny);
            if (bunny.getXpos() == snake.getXpos() - 1 && bunny.getYpos() == snake.getYpos() - 1) {
                System.out.println(bunny.getAnimalYell());
                String input = userInput.nextLine();
                if (!input.isEmpty()) {}
            }
        }


        System.out.println(snake.getAnimalYell());

    }
}





