public class NoOtherDubException extends Exception{
    public NoOtherDubException(String message){
        super(message);
    }
    public String getMessage(){
        return super.getMessage();
    }
}
