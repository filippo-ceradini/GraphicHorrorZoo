public class main {

    public static void main(String[] args) {
    snake snake1 = new snake(9,9);
    rabbit rabbit1 = new rabbit(2,2);

    System.out.println(rabbit1.toRabbpos());
    System.out.println(snake1.toSnakepos());
    for(int i=1; i<4;i++) {
        snake1.setXsnak(--snake1.xsnak);
        snake1.setYsnak(--snake1.ysnak);
        System.out.println(snake1.toSnakepos());
        rabbit1.setXrabb(++rabbit1.xrabb);
        rabbit1.setYrabb(++rabbit1.yrabb);
        System.out.println(rabbit1.toRabbpos());
    }

        System.out.println(rabbit1.getRabbyell());
        snake1.setXsnak(--snake1.xsnak);
        snake1.setYsnak(--snake1.ysnak);
        System.out.println(snake1.toSnakepos());
        System.out.println(snake1.getSnakyell());



    }
}
