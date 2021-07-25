import javax.swing.*;
import java.awt.*;

public class MyShape implements Icon {
    private int width;
    private int height;
    private String shape;
    private String color;

    public MyShape(String shape, String color){
        width = 100;
        height = 100;
        this.shape = shape;
        this.color = color;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if(color.equals("red"))
            g.setColor(Color.RED);
        if(color.equals("yellow"))
            g.setColor(Color.YELLOW);
        if(color.equals("green"))
            g.setColor(Color.GREEN);

        if(shape.equals("oval"))
            g.fillOval(x, y, width, height);
        if(shape.equals("rectangle"))
            g.fillRect(x, y, width, height);
        if(shape.equals("triangle")) {
            Polygon triangle = new Polygon();
            triangle.addPoint(150,150);
            triangle.addPoint(200,200);
            triangle.addPoint(350,150);
            g.fillPolygon(triangle);
        }

    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public int getIconHeight() {
        return height;
    }
}
