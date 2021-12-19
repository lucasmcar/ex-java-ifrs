public class Main {

    public static void main(String[] args) throws WithoutWordException {

        String phrase = "Aqui tem uma rua";
        if(!phrase.toLowerCase().contains("minha")){
            throw new WithoutWordException();
        }
    }
}
