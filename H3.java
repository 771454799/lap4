import java.util.Scanner;

/**
 * Created by mashatel on 10/01/2022.
 */
public class H3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in );
        System.out.println("entar  neme");
        String name;
        name=input.next();
        name=name.replace("i","!");
        name=name.replace("s","$");
        System.out.println(name);
    }

}
