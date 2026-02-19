
class ResistorColor {

    String[] colorSet = {"black",
    "brown",
    "red",
    "orange",
    "yellow",
    "green",
    "blue",
    "violet",
    "grey",
    "white"};

    int colorCode(String color) {
        for(int i = 0; i <= 9; i++){
            if(color == colorSet[i]) return i;
        }
        throw new IllegalArgumentException();
    }

    String[] colors() {
        return colorSet;
    }
}
