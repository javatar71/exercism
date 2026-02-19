import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class HighScores {

    List<Integer> highScores = new ArrayList<>();
    List<Integer> topScores = new ArrayList<>();

    public HighScores(List<Integer> highScores) {
        this.highScores = new ArrayList<>(highScores);
        this.topScores = new ArrayList<>(highScores);
        this.topScores.sort(Comparator.reverseOrder());
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.getLast();
    }

    Integer personalBest() {
        return topScores.getFirst();
    }

    List<Integer> personalTopThree() {
        return topScores.stream().limit(3).toList();
    }

}
