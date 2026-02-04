class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return getLastWeek()[getLastWeek().length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length -1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int a: this.birdsPerDay){
            if(a == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for(int i = 0; 
            i < (numberOfDays < birdsPerDay.length ? numberOfDays : birdsPerDay.length);
             i++)
              sum+=this.birdsPerDay[i];
        return sum;
    }

    public int getBusyDays() {
        int a = 0;
        for(int i = 0; i < this.birdsPerDay.length; i++)
            if (this.birdsPerDay[i] >= 5) a++;
        return a;
    }
}
