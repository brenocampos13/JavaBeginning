import java.awt.Toolkit;
import java.awt.Dimension;

public class GetResolution {
    static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension resolution = toolkit.getScreenSize();
        int width = resolution.width; //largura
        int height = resolution.height; //altura
        System.out.printf("A resolução do monitor é %dx%d", width, height);
    }
}