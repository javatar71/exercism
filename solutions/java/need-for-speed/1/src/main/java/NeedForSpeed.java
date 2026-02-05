class NeedForSpeed {

    int speed;
    int batteryDrain;

    int distance = 0;
    int battery = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if(!batteryDrained()){
            this.distance+=this.speed;
            this.battery-=this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    
    int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.speed*(100/car.batteryDrain) >= distance;
    }
}
