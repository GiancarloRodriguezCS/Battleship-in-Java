import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.util.Objects;

//This class sets up the screen for the second player to choose ship location 
//as well as communicate to other classes what the second player chooses
public class player2Choose extends javax.swing.JFrame {

    //Constructor calls method to create JFrame
    public player2Choose() {
        initComponents();
    }


    //This method creates the JFrame and all of the assets
    private void initComponents() {

        JLabel jLabel1 = new JLabel();
        jLabel2 = new javax.swing.JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        inRow = new javax.swing.JTextField();
        inCol = new javax.swing.JTextField();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel9 = new JLabel();
        JLabel jLabel10 = new JLabel();
        JLabel jLabel11 = new JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        JLabel jLabel12 = new JLabel();
        // Variables declaration - do not modify
        JButton addB = new JButton();
        JButton contB = new JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        JLabel jLabel13 = new JLabel();
        JLabel jLabel14 = new JLabel();
        JLabel jLabel15 = new JLabel();
        grid = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setText("Welcome to ShipBattles");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 290, 40);

        jLabel3.setText("Row:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 310, 30, 16);

        jLabel4.setText("Col:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 310, 25, 16);

        inRow.setBounds(new java.awt.Rectangle(30, 330, 60, 26));
        getContentPane().add(inRow);
        inRow.setBounds(30, 330, 60, 26);
        getContentPane().add(inCol);
        inCol.setBounds(110, 330, 60, 26);

        jLabel5.setText("Welcome please input  ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 50, 150, 20);

        jLabel6.setText("the starting row and col ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 70, 160, 16);

        jLabel7.setText("for a chosen ship");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 90, 150, 16);

        jLabel8.setText("Finally press add to ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(310, 170, 150, 16);

        jLabel9.setText("proceed to the next ship");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(310, 190, 160, 16);

        jLabel10.setText("Note you will have one ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(310, 220, 150, 16);

        jLabel11.setText("of each ship avaliable");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(310, 240, 140, 16);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Destroyer", "Cruiser", "Submarine", "Battleship", "Carrier"}));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(200, 330, 126, 27);

        jLabel12.setText("Ship:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(210, 310, 31, 16);

        addB.setText("Add");
        addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBActionPerformed(evt);
            }
        });
        getContentPane().add(addB);
        addB.setBounds(300, 270, 97, 29);

        contB.setText("Start");
        contB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contBActionPerformed(evt);
            }
        });
        getContentPane().add(contB);
        contB.setBounds(390, 270, 97, 29);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Horizontal", "Vertical"}));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(340, 330, 120, 27);

        jLabel13.setText("Alignment:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(350, 310, 80, 16);

        jLabel14.setText("Then choose an  ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(310, 120, 150, 16);

        jLabel15.setText("alignment for the ship");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(310, 140, 150, 16);

        Image img =  new ImageIcon(Objects.requireNonNull(this.getClass().getResource("gridv3.png"))).getImage();
        grid.setIcon(new ImageIcon(img));
        grid.setBounds(new java.awt.Rectangle(30, 50, 250, 250));
        getContentPane().add(grid);

        jLabel2.setBackground(new java.awt.Color(51, 204, 255));
        jLabel2.setBounds(new java.awt.Rectangle(30, 50, 250, 250));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);

        setBounds(0, 0, 484, 399);
    }

    private void addBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int row = Integer.parseInt(inRow.getText()) - 1;
        int col = Integer.parseInt(inCol.getText()) - 1;
        String orientation = String.valueOf(jComboBox2.getSelectedItem());
        String shipType = String.valueOf(jComboBox1.getSelectedItem());
        if(checkRowAndCol(row,col)) {
            if(checkShip(shipType)) {
                if(isValidPlacement(row, col, orientation, shipType)) {
                    assignValues(row, col, orientation, shipType);
                    drawBoard();
                    amtShips++;
                    inRow.setText("");
                    inCol.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Oh no, something is wrong with your placement!" + "\n" + "Please try again!");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Oh no, you have already put this ship down!" + "\n" + "Please try again!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Oh no, you have put in a ship in a taken space!" + "\n" + "Please try again!");
        }
    }

    private void contBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(amtShips == 5){
            coverFrame();
            JOptionPane.showMessageDialog(null, "Now it is player 1's turn player 2 go away!");
            close();
            coverFrame.dispose();
            firstPlayerVsP o = new firstPlayerVsP();
            o.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "You have not placed every ship down. Place down all to move on!");
        }
    }

    //Main method to run from this class
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new player2Choose().setVisible(true);
            }
        });
    }

    //Places the desired ship a desired orientation on an array 
    public static void assignValues(int row,int col, String orientation, String shipType){
        if(orientation.equalsIgnoreCase("horizontal")){
            if(shipType.equalsIgnoreCase("carrier")){
                for(int c = col; c < col + 5; c++){
                    board[row][c] = 1;
                    shipPlaces[row][c] = 5;
                    carrier = false;
                }
            }
            else if(shipType.equalsIgnoreCase("battleship")){
                for(int c = col; c < col + 4; c++){
                    board[row][c] = 1;
                    shipPlaces[row][c] = 4;
                    battleship = false;
                }
            }
            else if(shipType.equalsIgnoreCase("cruiser") || shipType.equalsIgnoreCase("submarine")){
                for(int c = col; c < col + 3; c++){
                    board[row][c] = 1;
                    if(shipType.equalsIgnoreCase("cruiser")){
                        cruiser = false;
                        shipPlaces[row][c] = 3;
                    }
                    else{
                        submarine = false;
                        shipPlaces[row][c] = 6;
                    }
                }
            }
            else if(shipType.equalsIgnoreCase("destroyer")){
                for(int c = col; c < col + 2; c++){
                    board[row][c] = 1;
                    shipPlaces[row][c] = 2;
                    destroyer = false;
                }
            }
        }
        else if(orientation.equalsIgnoreCase("vertical")){
            if(shipType.equalsIgnoreCase("carrier")){
                for(int r = row; r < row + 5; r++){
                    board[r][col] = 1;
                    shipPlaces[r][col] = 5;
                    carrier = false;
                }
            }
            else if(shipType.equalsIgnoreCase("battleship")){
                for(int r = row; r < row + 4; r++){
                    board[r][col] = 1;
                    shipPlaces[r][col] = 4;
                    battleship = false;
                }
            }
            else if(shipType.equalsIgnoreCase("cruiser") || shipType.equalsIgnoreCase("submarine")){
                for(int r = row; r < row + 3; r++){
                    board[r][col] = 1;
                    if(shipType.equalsIgnoreCase("cruiser")){
                        cruiser = false;
                        shipPlaces[r][col] = 3;
                    }
                    else{
                        submarine = false;
                        shipPlaces[r][col] = 6;
                    }
                }
            }
            else if(shipType.equalsIgnoreCase("destroyer")){
                for(int r = row; r < row + 2; r++){
                    board[r][col] = 1;
                    shipPlaces[r][col] = 2;
                    destroyer = false;
                }
            }

        }
        System.out.println("Places");
        for(int j = 0; j < board.length; j++){
            for(int k = 0; k < board[0].length; k++){
                System.out.print(board[j][k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Ships");
        for(int j = 0; j < shipPlaces.length; j++){
            for(int k = 0; k < shipPlaces[0].length; k++){
                System.out.print(shipPlaces[j][k]);
            }
            System.out.println();
        }
        System.out.println();
    }

    //Checks to see if that point is already taken
    //Returns false if taken
    public static boolean checkRowAndCol(int row, int col){
        return board[row][col] != 1;
    }

    //checks to see if that ship has been placed
    public static boolean checkShip(String shipType){
        if(shipType.equalsIgnoreCase("carrier") && carrier){
            return true;
        }
        else if(shipType.equalsIgnoreCase("battleship") && battleship){
            return true;
        }
        else if(shipType.equalsIgnoreCase("cruiser") && cruiser){
            return true;
        }
        else if(shipType.equalsIgnoreCase("submarine") && submarine){
            return true;
        }
        else if(shipType.equalsIgnoreCase("destroyer") && destroyer){
            return true;
        }
        return false;
    }

    //Checks to see if the desired placement for ship is valid considering ship length and orientation
    public static boolean isValidPlacement(int row, int col, String orientation ,String shipType){
        if(shipType.equalsIgnoreCase("carrier")){
            if(orientation.equalsIgnoreCase("vertical")){
                return row < 6 && row >= 0;
            }
            else{
                return col < 6 && col >= 0;
            }
        }
        else if(shipType.equalsIgnoreCase("battleship")){
            if(orientation.equalsIgnoreCase("vertical")){
                return row < 7 && row >= 0;
            }
            else{
                return col < 7 && col >= 0;
            }
        }
        else if(shipType.equalsIgnoreCase("cruiser")){
            if(orientation.equalsIgnoreCase("vertical")){
                return row < 8 && row >= 0;
            }
            else{
                return col < 8 && col >= 0;
            }
        }
        else if(shipType.equalsIgnoreCase("submarine")){
            if(orientation.equalsIgnoreCase("vertical")){
                return row < 8 && row >= 0;
            }
            else{
                return col < 8 && col >= 0;
            }
        }
        else if(shipType.equalsIgnoreCase("destroyer")){
            if(orientation.equalsIgnoreCase("vertical")){
                return row < 9 && row >= 0;
            }
            else{
                return col < 9 && col >= 0;
            }
        }
        return false;
    }

    //Draws the board to display ship placement 
    public void drawBoard(){
        String ship = "\u25A0";
        String no = " ";
        for(int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (board[x][y] == 1) new labelP2Pos(new JLabel(ship), 53 + (25 * x), 38 + (25 * y));
                else new labelP2Pos(new JLabel(no), 53 + (25 * x), 38 + (25 * y));
            }
        }
        for(labelP2Pos l : labelP2Pos.getRegistry()) {
            getContentPane().add(new JLabel(l.getSLabel())).setBounds(l.getyPos(), l.getxPos(), 20, 20);
        }
        Image img =  new ImageIcon(Objects.requireNonNull(this.getClass().getResource("gridv3.png"))).getImage();
        grid.setIcon(new ImageIcon(img));
        grid.setBounds(new java.awt.Rectangle(30, 50, 250, 250));
        getContentPane().add(grid);

        jLabel2.setBackground(new java.awt.Color(51, 204, 255));
        jLabel2.setBounds(new java.awt.Rectangle(30, 50, 250, 250));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
    }


    //Closes the JFrame
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    //Removes all placed ships from the board
    public static void resetValues(){
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                board[r][c] = 0;
            }
        }
        for(int r = 0; r < shipPlaces.length; r++){
            for(int c = 0; c < shipPlaces[0].length; c++){
                shipPlaces[r][c] = 0;
            }
        }
        cruiser = true;
        carrier = true;
        battleship = true;
        submarine = true;
        destroyer = true;
    }

    //Displays a rectangle to cover the players screen during transition
    public static void coverFrame(){
        coverFrame = new JFrame();
        coverFrame.setSize(1500,800);
        coverFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel coverPanel = new JPanel(null);
        coverFrame.add(coverPanel);

        JLabel haha = new JLabel("Cover Frame");
        haha.setBounds(700,70,150,25);
        coverPanel.add(haha);

        coverFrame.setVisible(true);
    }


    private javax.swing.JTextField inCol;
    private javax.swing.JTextField inRow;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel grid;
    private static JFrame coverFrame;

    //Getter to see array ship placement 
    public static int[][] getBoard() {
        return board;
    }

    private static int[][] board = {{0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0}};

    public static int[][] getShipPlaces() {
        return shipPlaces;
    }

    private static int[][] shipPlaces = {{0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0}};



    private static boolean cruiser = true;
    private static boolean carrier = true;
    private static boolean battleship = true;
    private static boolean submarine = true;
    private static boolean destroyer = true;

    private static int amtShips = 0;
// End of variables declaration
}
