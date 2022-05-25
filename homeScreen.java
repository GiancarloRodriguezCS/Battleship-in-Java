import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

//Makes a JFrame for the player to select if they want to play against an AI or another player
public class homeScreen extends javax.swing.JFrame {

    /**
     * Constructor calls a method to make JFrame
     */
    public homeScreen() {
        initComponents();
    }

    //This method creates a JFrame and displays all associated assets
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        aI = new javax.swing.JButton();
        friend = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        name2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Welcome to ShipBattles");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 10, 220, 50);

        aI.setText("Vs. AI");
        aI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aIActionPerformed(evt);
            }
        });
        getContentPane().add(aI);
        aI.setBounds(70, 240, 97, 29);

        friend.setText("Vs. Friend");
        friend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friendActionPerformed(evt);
            }
        });
        getContentPane().add(friend);
        friend.setBounds(210, 240, 106, 29);

        jLabel4.setText("Welcome if you would like to do PvP then press \"Vs. ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 70, 350, 16);

        jLabel5.setText("Friend\", if you would like to do PvE then press \"Vs. AI\"");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 90, 340, 16);

        jLabel6.setText("But first input your name to move on");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 110, 240, 16);
        getContentPane().add(name);
        name.setBounds(150, 160, 80, 26);

        jLabel2.setText("  Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 140, 80, 16);

        getContentPane().add(name2);
        name2.setBounds(150, 210, 80, 26);

        jLabel3.setText("  Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 190, 80, 16);

        setBounds(0, 0, 400, 328);
    }// </editor-fold>

    //When pressed the game will create a game in which there will be two non-AI players
    private void friendActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(name.getText().equals("") || name2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please input your name, do not worry you will not be sold into the slave trade by shady mexican cartel members");
            name.setText("");
        }
        else if(name.getText().equalsIgnoreCase("rico")){
            JOptionPane.showMessageDialog(null, "Hello grader/rico how are you doing on this fine day." + "\n"
                    + "-I hope you are well and I wanted to let you know that because you are so special" + "\n"
                    + "-that you have been granted the ability to see where the opponents ships are." + "\n"
                    + "-BTW you might have to move the current frame to the side to see the frame with the opponents ships");
            theName = name.getText();
            theName2 = name2.getText();
            close();
            mainScreen o = new mainScreen();
            o.setVisible(true);
        }
        else{
            theName = name.getText();
            theName2 = name2.getText();
            close();
            mainScreen o = new mainScreen();
            o.setVisible(true);
        }
    }

    //Creates a game in which the player will go against an AI
    private void aIActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(name.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please input your name, do not worry you will not be sold into the slave trade by shady mexican cartel members");
            name.setText("");
        }
        else if(name.getText().equalsIgnoreCase("rico")){
            JOptionPane.showMessageDialog(null, "Hello grader/rico how are you doing on this fine day." + "\n"
                    + "-I hope you are well and I wanted to let you know that because you are so special" + "\n"
                    + "-that you have been granted the ability to see where the opponents ships are." + "\n"
                    + "-BTW you might have to move the current frame to the side to see the frame with the opponents ships");
            theName = name.getText();
            theName2 = name2.getText();
            vsAi = true;
            close();
            mainScreen o = new mainScreen();
            o.setVisible(true);
        }
        else {
            theName = name.getText();
            theName2 = name2.getText();
            vsAi = true;
            close();
            mainScreen o = new mainScreen();
            o.setVisible(true);
        }
    }

    //if the player chooses to play with an AI it will make this variable false 
    //This is for communication with the player ship selection screen
    public static void setFalse(){
        vsAi = false;
    }

    //Method to close the JFrame
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    //Getters for the player names
    //If the either of the players names are "Rico" the game will display the ship location of the opponent
    public static String getTheName(){return theName;}
    public static String getName2(){return theName2;}

    // Variables declaration - do not modify
    private javax.swing.JButton aI;
    private javax.swing.JButton friend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name2;

    //getter to return the value of vsAi
    public static boolean isVsAi() {
        return vsAi;
    }

    private static boolean vsAi = false;

    private static String theName;
    private static String theName2;
    // End of variables declaration
}
