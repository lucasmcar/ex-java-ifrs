public class WithoutWordException extends Exception{

    @Override
    public String getMessage() {
        return "There is no such word in your sentence";
    }
}
