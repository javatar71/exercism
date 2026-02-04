public class Lasagna {

    public static int expectedMinutesInOven(){
        return 40;
    }
    public static int remainingMinutesInOven(int spent_time){
        return expectedMinutesInOven()-spent_time;
    }
    public static int preparationTimeInMinutes(int layers){
        return layers*2;
    }
    public static int totalTimeInMinutes(int layers, int spent_time){
        return spent_time+preparationTimeInMinutes(layers);
    }
}
