
public class Logger {
    private String format;

    public String getFormat(){
        return this.format;
    }

    public void setFormat(String format){
        this.format = format;
    }

    public static void main(String [] args){
        Logger log = new Logger();
        log.setFormat("I lust you");
        System.out.println(log.format);
    }
}