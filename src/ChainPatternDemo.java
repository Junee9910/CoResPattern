public class ChainPatternDemo {
    private static AbstarctLogger getChainOfLogger(){
        AbstarctLogger errorLogger=new ErrorLogger(AbstarctLogger.ERROR);
        AbstarctLogger fileLogger=new FileLogger(AbstarctLogger.DEBUG);
        AbstarctLogger consoleLogger=new ConsoleLogger(AbstarctLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstarctLogger loggerChain=getChainOfLogger();

        loggerChain.logMessage(AbstarctLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstarctLogger.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(AbstarctLogger.ERROR, "This is an error information.");
    }
}
