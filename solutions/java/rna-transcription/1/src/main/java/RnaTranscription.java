class RnaTranscription {

    String transcribe(String dnaStrand) {
        char[] str = dnaStrand.toCharArray();
        for(int i = 0; i < str.length; i++){
            switch (str[i]){
                case 'G':
                    str[i] = 'C';
                    break;
                case 'C':
                    str[i] = 'G';
                    break;
                case 'T':
                    str[i] = 'A';
                    break;
                case 'A':
                    str[i] = 'U';
                    break;
            }
        }
        return String.copyValueOf(str);
    }

}
