public class Main {

    public static void main(String[] args) {
    animal snake = new animal(9,9,"Snake says: \"Yo dead bunny!\"", "Snake");
    animal bunny = new animal(2,2,"Rabbit says: \"Oh not again!\"", "Rabbit");

    System.out.println(snake.toAnimalPos());
    System.out.println(bunny.toAnimalPos());

        for(int i=1; i<5;i++) {

            //If for rabbit if his position is next to snake position
            if(bunny.xpos == snake.xpos -1 && bunny.xpos == snake.xpos- 1){
                System.out.println(bunny.animalYell);
            }
                snake.setXpos(--snake.xpos);
                snake.setYpos(--snake.ypos);
                System.out.println(snake.toAnimalPos());
            //if for snake if his position is the same as rabbit
            if( bunny.xpos == snake.xpos && bunny.ypos == snake.ypos){
                System.out.println(snake.animalYell);

            } else {
                bunny.setXpos(++bunny.xpos);
                bunny.setXpos(++bunny.ypos);
                System.out.println(bunny.toAnimalPos());
                }

        }




    }
}
