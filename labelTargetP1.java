import javax.swing.*;
import java.util.ArrayList;

public class labelTargetP1 {

    private JLabel label;
    private int xPos;
    private int yPos;

    public static ArrayList<labelTargetP1> registry;
    public static ArrayList<labelTargetP1> getRegistry() { return registry; }

    public labelTargetP1(JLabel label, int x, int y) {
        if(registry == null) registry = new ArrayList<>();
        this.label = label;
        xPos = x;
        yPos = y;
        registry.add(this);
    }

    public labelTargetP1(JLabel label, int x, int y, boolean regenerateRegistry) {
        if(registry == null || regenerateRegistry) registry = new ArrayList<>();
        this.label = label;
        xPos = x;
        yPos = y;
        registry.add(this);
    }

    public JLabel getLabel() {
        return label;
    }

    public String getSLabel() {
        return label.getText();
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }



}
