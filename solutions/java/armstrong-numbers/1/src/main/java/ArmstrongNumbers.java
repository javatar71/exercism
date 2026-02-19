import java.lang.Math;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        char[] word = String.
            valueOf(numberToCheck).
            toCharArray();
        int sum = 0;
        for(char a : word){
            sum+=Math.pow(Integer.parseInt(String.valueOf(a)), word.length);
        }
        return sum == numberToCheck;
    }

}
