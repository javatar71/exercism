class ResistorColorTrio {

    enum Resistor{
        BLACK   (0),
        BROWN   (1),
        RED     (2),
        ORANGE  (3),
        YELLOW  (4),
        GREEN   (5),
        BLUE    (6),
        VIOLET  (7),
        GREY    (8),
        WHITE   (9);

        private int num;

        private Resistor(int num){
            this.num = num;
        }

        public int getNum(){
            return this.num;
        }

        public static Resistor getObj(String color){
            for(Resistor a: Resistor.values()){
                if(a.toString().toLowerCase().equals(color)) return a;
            }
            return null;
        }
    }

    String label(String[] colors) {

        return suffix(getValue(colors));
    }

    long getValue(String[] colors){
        return (
                Resistor.getObj(colors[0]).getNum()*10 +
                Resistor.getObj(colors[1]).getNum()
            )*(long) Math.pow(10,Resistor.getObj(colors[2]).getNum());
    }

    String suffix(long val) {
        int power  = 0;
        while(val >= 1000){
            val = val/1000;
            power++;
        }
        switch (power){ 
            case 1:
                return val+" kiloohms";
            case 2:
                return val+" megaohms";
            case 3:
                return val+" gigaohms";
            default:
                return val+" ohms";
        }
    }
}
