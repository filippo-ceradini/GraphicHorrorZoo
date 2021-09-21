public class AnimGraph {
    private String top;
    private String mid;
    private String bott;

    public AnimGraph() {
    }

    public AnimGraph(String var1, String var2, String var3) {
        this.top = var1;
        this.mid = var2;
        this.bott = var3;
    }

    public String getTop() {
        return this.top;
    }

    public String getMid() {
        return this.mid;
    }

    public String getBott() {
        return this.bott;
    }
}
