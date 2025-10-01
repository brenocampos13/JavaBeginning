import java.awt.Toolkit;
import java.awt.Dimension;

public class GetResolution{
    public static void main(String[] args){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension resolution = toolkit.getScreenSize();

        int width = resolution.width;
        int height = resolution.height;

        System.out.printf("A resolução da tela é " + width + "x" + height);
    }
}