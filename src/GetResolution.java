import java.awt.Toolkit;
import java.awt.Dimension;

public class GetResolution {
    public static void main (String[] args){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        int width = dimension.width;
        int height = dimension.height;

        System.out.println("The screen size is: " + width + "x" + height);
    }
}