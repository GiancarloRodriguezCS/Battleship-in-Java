import javax.swing.*;
import java.util.ArrayList;

public class labelPvEPos {

    private JLabel label;
    private int xPos;
    private int yPos;

    public static ArrayList<labelPvEPos> registry;

    public static ArrayList<labelPvEPos> getRegistry() {
        return registry;
    }

    public labelPvEPos(JLabel label, int x, int y) {
        if (registry == null) registry = new ArrayList<>();
        this.label = label;
        xPos = x;
        yPos = y;
        registry.add(this);
    }

    public labelPvEPos(JLabel label, int x, int y, boolean regenerateRegistry) {
        if (registry == null || regenerateRegistry) registry = new ArrayList<>();
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
