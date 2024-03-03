

public class CustomException {

    public static void main(String[] args) throws AgeException {
        validateAge(-1);
        
    }
    private static void validateAge(int age) throws AgeException{
        if(age<0){
            throw new AgeException("ohhh no something went wrong");
        }
    }
}
