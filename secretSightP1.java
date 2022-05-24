import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.Objects;

public class secretSightP1 extends javax.swing.JFrame {


    public secretSightP1() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel2 = new JLabel();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        Image img =  new ImageIcon(Objects.requireNonNull(this.getClass().getResource("gridv3.png"))).getImage();
        jLabel2.setIcon(new ImageIcon(img));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 30, 250, 250);

        jLabel1.setBackground(new Color(51, 204, 255));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 30, 250, 250);

        drawYourBoard(secondPlayerVsP.getTheBoard(), 34,77);

        if(canClose){
            close();
        }

        setBounds(0, 0, 400, 328);
    }// </editor-fold>

    public void drawYourBoard(int[][] array, int xP, int yP) {
        String ship = "\u25A0";
        String no = " ";
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (array[x][y] == 1) new labelSecretP1(new JLabel(ship), xP + (25 * x), yP + (25 * y));
                else new labelSecretP1(new JLabel(no), xP + (25 * x), yP + (25 * y));
            }
        }
        for (labelSecretP1 l : labelSecretP1.getRegistry()) {
            getContentPane().add(new JLabel(l.getSLabel())).setBounds(l.getyPos(), l.getxPos(), 20, 20);
        }
        Image img = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("gridv3.png"))).getImage();
        jLabel2.setIcon(new ImageIcon(img));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 30, 250, 250);

        jLabel1.setBackground(new java.awt.Color(51, 204, 255));
        jLabel1.setBounds(new java.awt.Rectangle(70, 30, 250, 250));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
    }


    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;

    public static void setCanClose() {
        canClose = true;
    }

    private static boolean canClose = false;
    // End of variables declaration
}
