import javax.swing.JLabel;
import java.util.ArrayList;

//Handles putting ships of the opponent for the player to see
public class labelSecretP2 {

    private JLabel label;
    private int xPos;
    private int yPos;

    public static ArrayList<labelSecretP2> registry;

    //Getter for arraylist
    public static ArrayList<labelSecretP2> getRegistry() {
        return registry;
    }

    //Constructor which gives a JLabel a position
    public labelSecretP2(JLabel label, int x, int y) {
        if (registry == null) registry = new ArrayList<>();
        this.label = label;
        xPos = x;
        yPos = y;
        registry.add(this);
    }

    public labelSecretP2(JLabel label, int x, int y, boolean regenerateRegistry) {
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

