package Week_1.DesignPrinciplesAndPatterns.Exercise1_ImplementingtheSingletonPattern.Code;

public class Logger {
    private static Logger loggerInstance;
    private Logger(){

    }
    public static Logger getInstance(){
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    public void log(String message) {
        System.out.println("Log message: " + message);
    }

}

class TestLogger{
    public static void main(String[] args) {
        Logger person1 = Logger.getInstance();
        Logger person2 = Logger.getInstance();

        System.out.println(person1 == person2); //true - only one instance is used

        person1.log("Person1 has logged in");
        person2.log("Person2 has logged in"); //Both person1 and person2 can use the same log() method.

        // Why are we checking if both can access the same method log()? because we know that both person1 and person2
        // are the same objects, it means we have only ONE INSTANCE, not TWO. So obviously they will be referring
        // to the same method, and since we have made the constructor private no other instance can be created, and
        // therefore it cannot access the log() method. This way we are proving that person1 = person2.

    }
}
