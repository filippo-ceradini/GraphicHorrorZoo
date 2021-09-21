public class animal {
    private int xpos;
    private int ypos;
    private String animalYell;
    private String animalName;
    private AnimGraph graph = new AnimGraph();

    public animal(int var1, int var2, String var3, String var4, AnimGraph var5) {
        this.setXpos(var1);
        this.setYpos(var2);
        this.setAnimalYell(var3);
        this.setAnimalName(var4);
        this.setAnimGraph(var5);
    }

    public void setXpos(int var1) {this.xpos = var1;}
    public void setYpos(int var1) {this.ypos = var1;}
    public void setAnimalYell(String var1) {this.animalYell = var1;}
    public void setAnimalName(String var1) {this.animalName = var1;}
    private void setAnimGraph(AnimGraph var1) {this.graph = var1;}

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
