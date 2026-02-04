public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if(speed < 5) return (double) speed*221;
        if(speed < 9) return (double) speed*221*0.9;
        if(speed < 10) return (double) speed*221*0.8;
        return speed*221*0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }
}
