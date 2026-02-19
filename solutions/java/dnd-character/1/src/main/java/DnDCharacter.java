import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    int[] chars = new int[6]; 

    Random rnd = new Random();
    

    DnDCharacter(){
        for(int i = 0; i < 6; i++){
            this.chars[i] = ability(rollDice());
        }
    }

    int ability(List<Integer> scores) {
        List<Integer>  copy = new ArrayList<>(scores);
        return copy.
        stream().
        sorted(Comparator.reverseOrder()).limit(3).
        mapToInt(Integer::intValue).
        sum();
    }

    List<Integer> rollDice() {
        List<Integer> rnd_list = new ArrayList<>();
        for(int i = 1; i <=4; i++){
            rnd_list.add(rnd.nextInt(6)+1);
        }
        return rnd_list;      
    }

    int modifier(int input) {
        return input/2 - 5;
    }

    int getStrength() {
        return chars[0];
    }

    int getDexterity() {
        return chars[1];
    }

    int getConstitution() {
        return chars[2];
    }

    int getIntelligence() {
        return chars[3];
    }

    int getWisdom() {
        return chars[4];
    }

    int getCharisma() {
        return chars[5];
    }

    int getHitpoints() {
        return modifier(getConstitution())+10;
    }
}
