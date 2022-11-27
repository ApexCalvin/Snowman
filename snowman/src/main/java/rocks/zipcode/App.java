package rocks.zipcode;

public class App 
{
    public static void main( String[] args )
    {
        String input = "(print (add 2 (subtract 4 (multiply 2 (divide 4 (mod 4))))))";
        
        Compiler compiler = new Compiler();

        System.out.println(";; Input code: "+input);

        String output = compiler.compile(input);

        System.out.println(output);
    }
}