public class rabbit {

        //position variables for rabbit
        public int xrabb;
        public int yrabb;

        //string for rabbit scream
        private String rabbyell = "oh not again!";

        public rabbit( int xrabb, int yrabb ) {
            this.setXrabb(xrabb);
            this.setYrabb(yrabb);
        }
        //setter for rabbit
        public void setYrabb(int yrabb) {this.yrabb = yrabb;}
        public void setXrabb(int xrabb) {this.xrabb = xrabb;}

        //getter for snake
        public int getXrabb() {return xrabb;}
        public int getYrabb() {return yrabb;}
        public String getRabbyell() {return rabbyell;}
        public String toRabbpos() {return "Rabbit is in: "+xrabb+","+yrabb;}
    }
