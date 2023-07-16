public class Main {
    public static void main(String[] args) throws WrongLoginException {
        try {
            Validator.check("asd", "abc", "abc");
            System.out.println("Логин успешно принят");
        }catch (WrongLoginException e){
            throw new RuntimeException(e);
        }
    }
}