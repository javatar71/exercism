class Acronym {

    String[] acr_arr;

    Acronym(String phrase) {
        this.acr_arr = phrase
        .toUpperCase()
        .replaceAll("[^A-Za-z']+", " ")
        .split(" ");
    }

    String get() {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < this.acr_arr.length; i++){
            if(this.acr_arr[i] != ""){
                str.append(acr_arr[i].substring(0,1));
            }
 
        }
        return str.toString();
    }

}