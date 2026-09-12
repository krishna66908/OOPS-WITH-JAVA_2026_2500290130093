import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class PredefinedException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int[] arr = {1,2,3,4};
            int i,b;
            FileReader fr = new FileReader(fileName:"abc.txt");
            i = sc.nextInt();
            b = sc.nextInt();
            System.out.println(arr[i]);
            System.out.println(arr[i]/b);
        }
        catch (ArithmeticException e){
            System.out.println("Except caught is " + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Except caught is " + e.getMessage());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
                sc.close();
                System.out.println("finally executed");
    }
}
//inherting by either exception class(for checked exception) or REn time for unchecked exception
//define that userdefined exceptionclass by creating its constructor calling its superclass constructor inside it