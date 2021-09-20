import java.lang.reflect.Array;
import java.util.Arrays;

public class animal {

    //variables for animal
    private int xpos;
    private int ypos;

    //public int[] getPos() {return pos;}
    //public void setPos(int[] pos) {this.pos = pos;}

    //private int[] pos = {xpos, ypos};
    private String animalYell;
    private String animalName;
    private AnimGraph graph = new AnimGraph();

    public animal(int xpos, int ypos, String animalYell, String animalName, AnimGraph graph) {
        this.setXpos(xpos);
        this.setYpos(ypos);
        this.setAnimalYell(animalYell);
        this.setAnimalName(animalName);
        this.setAnimGraph(graph);
    }

    //setter for Animal
    public void setXpos(int xpos) {this.xpos = xpos;}
    public void setYpos(int ypos) {this.ypos = ypos;}
    public void setAnimalYell(String animalYell) {this.animalYell = animalYell;}
    public void setAnimalName(String animalName) {this.animalName = animalName;}
    private void setAnimGraph(AnimGraph graph) { this.graph = graph;}
    //getter for Animal
    public String getAnimalName() {return animalName;}
    public int getXpos() {return xpos;}
    public int getYpos() {return ypos;}
    public String getAnimalYell() {return animalYell;}
    public AnimGraph getGraph() {return graph;}

    //Animal Methods
    public void moveFwrd() {
        xpos++;
        ypos++;
        System.out.println(animalName + " moves to: " + xpos + "," + ypos);
    }

    public void moveBack() {
        xpos--;
        ypos--;
        System.out.println(animalName + " moves to: " + xpos + "," + ypos);
    }

    //Return string for animal
    public String toAnimalPos() {
        return animalName + " is in: " + xpos + "," + ypos;
    }
    //public String toAnimPos() {return animalName +" is in:" + pos;}
}
