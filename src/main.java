public class main {

    public static void main(String[] args) {
    snake snake1 = new snake(9,9);
    rabbit rabbit1 = new rabbit(2,2);

    System.out.println(snake1.toSnakepos());
    System.out.println(rabbit1.toRabbpos());

        for(int i=1; i<5;i++) {

            //If for rabbit if his position is next to snake position
            if( rabbit1.xrabb == snake1.xsnak -1 && rabbit1.yrabb == snake1.ysnak- 1){
                System.out.println(rabbit1.getRabbyell());

            } 
                snake1.setXsnak(--snake1.xsnak);
                snake1.setYsnak(--snake1.ysnak);
                System.out.println(snake1.toSnakepos());




            //if for snake if his position is the same as rabbit
            if( rabbit1.xrabb == snake1.xsnak && rabbit1.yrabb == snake1.ysnak){
                System.out.println(snake1.getSnakyell());

            } else {
                rabbit1.setXrabb(++rabbit1.xrabb);
                rabbit1.setYrabb(++rabbit1.yrabb);
                System.out.println(rabbit1.toRabbpos());
            }

        }




    }
}
