import java.util.Scanner;

public class Run {
    public static void main(String[] var0) {

        //Scanner to wait for user input
        Scanner userInput = new Scanner(System.in);

        //Printsout of what the animals say when the conditions ask for it
        String yellSnake = """
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
        String yellBunny = """
                +—————————————————————————————+
                |                         .". |
                |“C'mon not again!”      /  | |
                |              \\        /  /  |
                |               \\      / ,"   |
                |          .-------.--- /     |
                |         "._ __.-/ o. o\\     |\s
                |            "   (    Y  )    |
                |                 )     /     |
                |                /     (      |
                |               /       Y     |
                |           .-"         |     |
                |          /  _     \\    \\    |
                |         /    `. ". ) /' )   |
                |        Y       )( / /(,/    |
                |       ,|      /     )       |
                |      ( |     /     /        |
                |       " \\_  (__   (__       |
                |           “-._,)—._,_)      |
                +————————————————————————————-+""";

        String input;

        //AnimGraph is an object that contains the building blocks to print the cell with the animal
        //on the grid. It's basically an array.
        AnimGraph boxSnake = new AnimGraph("|   Y   ", "|  (\")  ", "|   \\\\  ");
        AnimGraph boxBunny = new AnimGraph("| (\\_/) ", "| (o.o) ", "| (___)0");


        //Animal is the class that represents the animal, both have the position,
        //yell, name and the object anim graph is associated to them
        animal snake = new animal(9, 9, yellSnake, "Snake", boxSnake);
        animal bunny = new animal(1, 1, yellBunny, "Rabbit", boxBunny);

        //The program prints out the position of the animals at the beginning
        System.out.println(snake.toAnimalPos());
        System.out.println(bunny.toAnimalPos());

        //after this the first print of the grid is printed
        //to show the grid one at the time(there is a scanner in the Graphic object
        Graphic.gridAnim(snake, bunny);

        while(bunny.getXpos() != snake.getXpos() && bunny.getYpos() != snake.getYpos()) {
            bunny.moveFwrd();
            Graphic.gridAnim(snake, bunny);
            if (bunny.getXpos() == snake.getXpos() - 1 && bunny.getYpos() == snake.getYpos() - 1) {
                System.out.println(bunny.getAnimalYell());
                String wait4input = userInput.nextLine();
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
                String wait4input = userInput.nextLine();
                }
            }
        System.out.println(snake.getAnimalYell());
    }
}
