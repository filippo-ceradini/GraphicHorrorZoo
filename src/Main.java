import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Yells for the two animals for the final statements
        String snakeyell = "+—————————————————————————————+\n" +
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
                "+————————————————————————————-+" +
                "" +
                "" +
                "" +
                "" +
                "";
        String rabbityell = "+—————————————————————————————+\n" +
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
                "+————————————————————————————-+";

        //Animal Graphic element is an object that takes three strings to build a little animal for the grid
        AnimGraph gSnake = new AnimGraph("|   Y   ", "|  (\")  ", "|   \\\\  ");
        AnimGraph gRabbit = new AnimGraph("| (\\_/) ", "| (o.o) ", "| (___)0");


        //Animals: position x&y, what the animal yells and the name of the animal,
        // also the GAnimal who contains info to build the animal on the grid
        animal snake = new animal(9, 9, snakeyell, "Snake", gSnake);
        animal bunny = new animal(1, 1, rabbityell, "Rabbit", gRabbit);

        //The system first prints out the initial position of the animal
        //both as a print and as a grid
        System.out.println(snake.toAnimalPos());
        System.out.println(bunny.toAnimalPos());
        //Gridanim is an object that contains a method to print a grid with 2 animals
        Graphic.gridAnim(bunny, snake);

        //this Scanner line allows the print to wait to the operator enter key to print the next grid
        Scanner userInput = new Scanner(System.in);

        //While cycle: until the snake and the rabbit have the same coordinates,
        // the rabbit will move forward and the snake will move backwards.
        //2 break methods have been added so no matter if either animal is in an odd or even space,
        // the snake is the last to move
        while (bunny.getXpos() != snake.getXpos() && bunny.getYpos() != snake.getYpos()) {
            bunny.moveFwrd();
            Graphic.gridAnim(snake, bunny);
            if (bunny.getXpos() == snake.getXpos() -1 && bunny.getYpos() == snake.getYpos() - 1) {
                System.out.println(bunny.getAnimalYell());
                //This allow us to wait until next enter key is pressed
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

        //After the while cycle is over, the programs assumes the snake is in the rabbit cell and
        //prints out the snake yell
        System.out.println(snake.getAnimalYell());


    }
}





