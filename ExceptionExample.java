
public class ExceptionExample {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        System.out.println("we have got two numbers");
        int result =  n1/n2;
        System.out.println("division is "+result);
        System.out.println("code terminated...");
    }
}