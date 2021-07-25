import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Application {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setLocation(400,200);
        f.setVisible(true);

        /*关闭窗口*/
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}

