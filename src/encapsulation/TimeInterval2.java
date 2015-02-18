package encapsulation;
 
public class TimeInterval2 {
 
    private int startHour; // >= 0 og < 24
    private int startMin; // >= 0 og < 60
    
    private int endHour; // være etter start
    private int endMin; //
    
    public TimeInterval2(int startHour, int startMin, int endHour, int endMin) {
        checkHour(startHour);
        checkMin(startMin);
        checkHour(endHour);
        checkMin(endMin);
        checkEndTimeIsLaterOrEqualToStartTime(startHour, startMin, endHour, endMin);
        this.startHour = startHour;
        this.startMin = startMin;
        this.endHour = endHour;
        this.endMin = endMin;
    }
 
    public void setStartTime(int startHour, int startMin) {
        checkHour(startHour);
        checkMin(startMin);
        checkEndTimeIsLaterOrEqualToStartTime(startHour, startMin, this.endHour, this.endMin);
        this.startHour = startHour;
        this.startMin = startMin;
    }
    
    public void setEndTime(int endHour, int endMin) {
        checkHour(endHour);
        checkMin(endMin);
        checkEndTimeIsLaterOrEqualToStartTime(this.startHour, this.startMin, endHour, endMin);
        this.endHour = endHour;
        this.endMin = endMin;
    }
 
    @Override
    public String toString() {
        return String.format("%02d:%02d-%02d:%02d", startHour, startMin, endHour, endMin);
    }
 
    private void checkEndTimeIsLaterOrEqualToStartTime(int startHour, int startMin, int endHour, int endMin) {
        if (endHour < startHour || (endHour == startHour && endMin < startMin)) {
            throw new IllegalArgumentException("Slutt må være etter eller lik start");
        }
    }
 
    public int getStartHour() {
        return startHour;
    }
 
    public boolean isValidHour(int hour) {
        return (hour >= 0 && hour < 24);
    }
 
    private void checkHour(int hour) {
        if (! isValidHour(hour)) {
            throw new IllegalArgumentException("En time kan ikke være mindre enn 0 eller større eller lik 24");
        }
    }
    
    public void setStartHour(int startHour) {
        checkHour(startHour);
        checkEndTimeIsLaterOrEqualToStartTime(startHour, this.startMin, this.endHour, this.endMin);
        this.startHour = startHour;
    }
    
    public int getStartMin() {
        return startMin;
    }
    
    public boolean isValidMin(int min) {
        return (min >= 0 && min < 60);
    }
    
    private void checkMin(int min) {
        if (! isValidMin(min)) {
            throw new IllegalArgumentException("Et minutt kan ikke være mindre enn 0 eller større eller lik 60");
        }
    }
    
    public void setStartMin(int startMin) {
        checkMin(startMin);
        checkEndTimeIsLaterOrEqualToStartTime(this.startHour, startMin, this.endHour, this.endMin);
        this.startMin = startMin;
    }
 
    public int getEndHour() {
        return endHour;
    }
 
    public void setEndHour(int endHour) {
        checkHour(endHour);
        checkEndTimeIsLaterOrEqualToStartTime(this.startHour, this.startMin, endHour, this.endMin);
        this.endHour = endHour;
    }
 
    public int getEndMin() {
        return endMin;
    }
 
    public void setEndMin(int endMin) {
        checkMin(endMin);
        checkEndTimeIsLaterOrEqualToStartTime(this.startHour, this.startMin, this.endHour, endMin);
        this.endMin = endMin;
    }
 
    public static void main(String[] args) {
        TimeInterval2 timeInterval = new TimeInterval2(14, 15, 16, 0);
        System.out.println(timeInterval);
    }
}
 
