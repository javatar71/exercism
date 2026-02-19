import java.util.Map;

class ResistorColorDuo {

    Map <String, String> colorSet = Map.of(
    "black",    "0",
    "brown",    "1",
    "red",      "2",
    "orange",   "3",
    "yellow",   "4",
    "green",    "5",
    "blue",     "6",
    "violet",   "7",
    "grey",     "8",
    "white",    "9"
);
    int value(String[] colors) {
        return Integer.parseInt(colorSet.get(colors[0])+colorSet.get(colors[1]));
    }
}
