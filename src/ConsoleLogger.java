public class ConsoleLogger extends AbstarctLogger{
    public ConsoleLogger(int level){
        this.level=level;    
    }
    @Override
    protected void write(String message){
        System.out.println("Standard Consle::Logger: "+message);
    }
}
