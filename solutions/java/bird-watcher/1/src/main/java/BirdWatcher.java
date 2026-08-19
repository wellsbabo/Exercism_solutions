
class BirdWatcher {
    private final int[] birdsPerDay;
    private static final int[] BIRDS_PER_DAY_LAST_WEEK = {0,2,5,3,7,8,4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return BIRDS_PER_DAY_LAST_WEEK;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int dayCount : birdsPerDay){
            if(dayCount == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdCount = 0;
        if(numberOfDays > birdsPerDay.length){
            numberOfDays = birdsPerDay.length;
        }
        for(int i = 0; i < numberOfDays; i++){
            birdCount += birdsPerDay[i];
        }
        return birdCount;
    }

    public int getBusyDays() {
        int busyDaysCount = 0;
        for(int dayCount : birdsPerDay){
            if(dayCount >= 5){
                busyDaysCount ++;
            }
        }
        return busyDaysCount;
    }
}
