/**
 * Created by mashatel on 10/01/2022.
 */
import java.awt.*;
import java.applet.*;
public class H6 extends Applet
{
    public void Paint (Graphics g) {
        g.setColor(Color.PINK);
        g.fillRect(100,150,60,50);
        System.out.println(g);
        g.setColor(Color.pink);
        g.fillRect(100,150,60,50);
    }

}
