class SqueakyClean {
    static String clean(String identifier) {
        identifier = whitespaceClean(identifier);
        identifier = kebabToCamel(identifier);
        identifier = unLeet(identifier);
        return unOmit(identifier);


    }
    static String whitespaceClean(String str){
        return str.replace(" ","_");
    }

    static String kebabToCamel(String str){
        int dash = str.indexOf("-");
        while(dash > -1){
            str = str.replace(
                "-" +
                str.charAt(dash + 1),
                String.valueOf(str.charAt(dash + 1)).toUpperCase());
                dash = str.indexOf("-");
        }
        return str;
    }

    static String unLeet(String str){
        char leetMap[][] = {
            {'4', '3', '0', '1','7'},
            {'a', 'e', 'o', 'l', 't'}
        };
        for(int i = 0; i < leetMap[0].length; i++){
            str = str.replace(leetMap[0][i], leetMap[1][i]);
        }

        return str;
    }

    static String unOmit(String str){
        for(int i = 0; i < str.length(); i++){
            if (!Character.isLetter(str.charAt(i)) && str.charAt(i) != '_'){
                str = str.replace(String.valueOf(str.charAt(i)), "");
                i--;
            }
        }
        return str;
    }
}
