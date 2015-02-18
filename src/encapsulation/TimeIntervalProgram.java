package encapsulation;
public class TimeIntervalProgram {
 
    TimeInterval2 timeInterval;
    
    public void init() {
        timeInterval = new TimeInterval2(14, 15, 16, 0);
    }
    
    public void run() {
        System.out.println(timeInterval);
    }
    
    public static void main(String[] args) {
        TimeIntervalProgram program = new TimeIntervalProgram();
        program.init();
        program.run();
    }
}