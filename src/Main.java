public class Main {
    public static void main(String[] args) {
        /*int rand1 = (int)Math.floor(Math.random()*(8));
        int rand2 = (int)Math.floor(Math.random()*(8));
        int rand3 = (int)Math.floor(Math.random()*(8));
        int rand4 = (int)Math.floor(Math.random()*(8));*/

        animal snake = new animal(9, 9, "Snake says: \"Yo dead bunny!\"", "Snake");
        animal bunny = new animal(0, 0, "Rabbit says: \"Oh not again!\"", "Rabbit");

        System.out.println(snake.toAnimalPos());
        System.out.println(bunny.toAnimalPos());

            while (bunny.getXpos() != snake.getXpos() && bunny.getYpos() != snake.getYpos()) {
                bunny.moveFwrd();
                if (bunny.getXpos() == snake.getXpos() - 1 && bunny.getYpos() == snake.getYpos() - 1) {
                    System.out.println(bunny.getAnimalYell());
                    snake.moveBack();
                    break;
                }
                if (bunny.getXpos() == snake.getXpos() && bunny.getYpos() == snake.getYpos()) {break;}
                snake.moveBack();
                if (bunny.getXpos() == snake.getXpos() - 1 && bunny.getYpos() == snake.getYpos() - 1) {
                    System.out.println(bunny.getAnimalYell());}

            }
            System.out.println(snake.getAnimalYell());
        //if (bunny.getPos() ==snake.getPos()){System.out.println("equal");}
    }
}



