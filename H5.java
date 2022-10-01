/**
 * Created by mashatel on 10/01/2022.
 */
import java.util.Random;
public class H5 {
    public static void main(String[] args) {
        Random r=new Random();
        int num;
        for (int i=0;i<=10;i++)
        {
            num=1+r.nextInt(6);
            System.out.println(num+" ");
        }

    }
}
