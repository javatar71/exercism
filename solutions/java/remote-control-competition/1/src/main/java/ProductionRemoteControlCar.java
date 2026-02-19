class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int speed = 10;
    private int distance = 0;
    private int victories;

    public void drive() {
        this.distance+=this.speed;
    }

    public int getDistanceTravelled() {;
        return distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar arg0) {
        return Integer.compare(this.victories, arg0.victories);
    }
}
