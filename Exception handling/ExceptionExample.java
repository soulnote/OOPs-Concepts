
public class ExceptionExample {

    public static void main(String[] args) {

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            System.out.println("we have got two numbers");
            int result =  n1/n2;
            System.out.println("division is "+result);
            

        }catch(ArithmeticException e){
            System.out.println("n2 can not be zero");
            System.out.println(e.getMessage());
        } 
        catch(NumberFormatException e){
            System.out.println("Invalid numbers ");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error occured");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("finally block executed");
        }
        System.out.println("code terminated...");
    }

} 