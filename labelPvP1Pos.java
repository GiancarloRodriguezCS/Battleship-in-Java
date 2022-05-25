import javax.swing.*;
import java.util.ArrayList;

//Handles putting ships, missed shots, and hit shots on the board to see
public class labelPvP1Pos {

    private JLabel label;
    private int xPos;
    private int yPos;

    public static ArrayList<labelPvP1Pos> registry;

    //Getter for arraylist
    public static ArrayList<labelPvP1Pos> getRegistry() {
        return registry;
    }

    //Constructor which gives a JLabel a position
    public labelPvP1Pos(JLabel label, int x, int y) {
        if (registry == null) registry = new ArrayList<>();
        this.label = label;
        xPos = x;
        yPos = y;
        registry.add(this);
    }

    public labelPvP1Pos(JLabel label, int x, int y, boolean regenerateRegistry) {
        if (registry == null || regenerateRegistry) registry = new ArrayList<>();
        this.label = label;
        xPos = x;
        yPos = y;
        registry.add(this);
    }

    //Getters
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
