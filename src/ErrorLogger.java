public class ErrorLogger extends AbstarctLogger{
    public ErrorLogger(int level){
        this.level=level;
    }

    @Override
    protected void write(String message){
        System.out.println("Error Console::Logger: "+message);
    }
}
