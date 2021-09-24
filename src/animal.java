public class animal {
    private int xpos;
    private int ypos;
    private String animalYell;
    private String animalName;
    private AnimGraph graph = new AnimGraph();

    public animal(int xpos, int ypos, String animalYell, String animalName, AnimGraph graph ) {
        this.setXpos(xpos);
        this.setYpos(ypos);
        this.setAnimalYell(animalYell);
        this.setAnimalName(animalName);
        this.setAnimGraph(graph);
    }



    private void setCell(String[] cell) {}
    public void setXpos(int xpos) {this.xpos = xpos;}
    public void setYpos(int ypos) {this.ypos = ypos;}
    public void setAnimalYell(String animalYell) {this.animalYell = animalYell;}
    public void setAnimalName(String animalName) {this.animalName = animalName;}
    private void setAnimGraph(AnimGraph graph) {this.graph = graph;}

    public String getAnimalName() {
        return this.animalName;}
    public int getXpos() {
        return this.xpos;}
    public int getYpos() {
        return this.ypos;}
    public String getAnimalYell() {
        return this.animalYell;}
    public AnimGraph getGraph() {
        return this.graph;}


    public void moveFwrd() {
        ++this.xpos;
        ++this.ypos;
        System.out.println(this.animalName + " moves to: " + this.xpos + "," + this.ypos);
    }

    public void moveBack() {
        --this.xpos;
        --this.ypos;
        System.out.println(this.animalName + " moves to: " + this.xpos + "," + this.ypos);
    }

    public String toAnimalPos() {
        return this.animalName + " is in: " + this.xpos + "," + this.ypos;
    }
}

