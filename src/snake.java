public class snake {

    //position variables for rabbit
    public int xsnak;
    public int ysnak;

    private String snakyell = "Yo dead bunny!";

    public snake( Integer xsnak, Integer ysnak ) {
        this.setXsnak(xsnak);
        this.setYsnak(ysnak);
    }
    //setter for rabbit
    public void setYsnak(int ysnak) {this.ysnak = ysnak;}
    public void setXsnak(int xsnak) {this.xsnak = xsnak;}

    //getter for snake
    public int getXsnak() {return xsnak;}
    public int getYsnak() {return ysnak;}
    public String getSnakyell() {return snakyell;}
    public String toSnakepos() {return "Snake is in: "+xsnak+","+ysnak;}
}
