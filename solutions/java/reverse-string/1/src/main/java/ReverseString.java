
class ReverseString {

    String reverse(String inputString) {
        char[] str = inputString.toCharArray();
        char temp;
        for(int i = 0; i < str.length/2; i++){
            temp = str[i];
            str[i] = str[str.length-i-1];
            str[str.length-i-1] = temp;
        }
        return String.copyValueOf(str);
    }
}
