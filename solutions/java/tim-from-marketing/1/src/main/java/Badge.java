class Badge {
    public String print(Integer id, String name, String department) {
        String result = "";
        if(id != null) {
            result+="[" + id + "] - ";
        }
        result+=name + " - ";
        if(department != null){
             result+=department.toUpperCase();
            }
        else {
            result+="OWNER";
        }
        return result;
    }
}
