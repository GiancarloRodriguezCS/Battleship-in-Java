import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.util.Objects;

public class secondPlayerVsP extends javax.swing.JFrame {

    public secondPlayerVsP() {
        initComponents();
    }

    public static int[][] getTheBoard() {
        return yoBoard;
    }


    private void initComponents() {

        yourGrid = new javax.swing.JLabel();
        targetGrid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        inRow = new javax.swing.JTextField();
        inCol = new javax.swing.JTextField();
        // Variables declaration - do not modify
        javax.swing.JButton fireB = new javax.swing.JButton();
        JLabel jLabel7 = new JLabel();
        JLabel jLabel8 = new JLabel();
        JLabel jLabel9 = new JLabel();
        JLabel jLabel10 = new JLabel();
        JLabel jLabel11 = new JLabel();
        JLabel jLabel12 = new JLabel();
        JLabel jLabel13 = new JLabel();
        JLabel jLabel14 = new JLabel();
        JLabel jLabel15 = new JLabel();
        JLabel jLabel16 = new JLabel();
        JLabel jLabel17 = new JLabel();
        JLabel jLabel18 = new JLabel();
        yourShipsLeft = new javax.swing.JLabel();
        oppShipsLeft = new javax.swing.JLabel();
        JLabel jLabel19 = new JLabel();
        JLabel jLabel20 = new JLabel();
        javax.swing.JButton restartB = new javax.swing.JButton();
        javax.swing.JButton newB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        Image img =  new ImageIcon(Objects.requireNonNull(this.getClass().getResource("gridv3.png"))).getImage();
        yourGrid.setIcon(new ImageIcon(img));
        getContentPane().add(yourGrid);
        yourGrid.setBounds(30, 100, 250, 250);
        targetGrid.setIcon(new ImageIcon(img));
        getContentPane().add(targetGrid);
        targetGrid.setBounds(300, 100, 250, 250);

        jLabel1.setBackground(new java.awt.Color(51, 204, 255));
        jLabel1.setOpaque(true);
        jLabel1.setSize(new java.awt.Dimension(250, 250));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 100, 250, 250);

        jLabel2.setBackground(new java.awt.Color(51, 204, 255));
        jLabel2.setOpaque(true);
        jLabel2.setSize(new java.awt.Dimension(250, 250));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 100, 250, 250);

        jLabel3.setText("Your Board:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 70, 100, 16);

        jLabel4.setText("Target Board:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 70, 90, 16);

        jLabel5.setText("Row:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 370, 30, 16);

        jLabel6.setText("Col:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 370, 45, 16);

        inRow.setBounds(new java.awt.Rectangle(40, 390, 70, 26));
        getContentPane().add(inRow);
        getContentPane().add(inCol);
        inCol.setBounds(140, 390, 70, 26);

        fireB.setText("Fire");
        getContentPane().add(fireB);
        fireB.setBounds(250, 390, 97, 29);
        fireB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireBActionEvent(evt);
            }
        });

        jLabel7.setText("Rules:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(570, 100, 180, 16);

        jLabel8.setText("-The game is played with a 10 ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(560, 130, 280, 16);

        jLabel9.setText("by ten grid");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(570, 150, 110, 16);

        jLabel10.setText("-You choose a row and a col to ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(560, 180, 210, 16);

        jLabel11.setText("shoot at");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(570, 200, 70, 16);

        jLabel12.setText("-If the point is red then you hit ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(560, 230, 210, 16);

        jLabel13.setText("if it is gray then you missed");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(570, 250, 180, 16);

        jLabel14.setText("-You cannot shoot the same ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(560, 280, 200, 16);

        jLabel15.setText("place twice");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(570, 300, 160, 16);

        jLabel16.setText("-You win if you kill the all of the");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(560, 330, 210, 16);

        jLabel17.setText("opponents ship and you lose");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(570, 350, 200, 16);

        jLabel18.setText("if they sink all of your ships");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(570, 370, 220, 16);

        yourShipsLeft.setText(ships);
        getContentPane().add(yourShipsLeft);
        yourShipsLeft.setBounds(370, 370, 160, 16);

        oppShipsLeft.setText(oShips);
        getContentPane().add(oppShipsLeft);
        oppShipsLeft.setBounds(370, 400, 190, 16);

        jLabel19.setFont(new java.awt.Font("Lucida Grande", Font.PLAIN, 24)); // NOI18N
        jLabel19.setText("ShipBattles");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(350, 10, 130, 40);

        jLabel20.setText("Player 2");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(390, 50, 49, 16);


        drawYourBoard(yoBoard,102,38);
        drawTargetBoard(targetBoard, 105,307);
        aiBoard = firstPlayerVsP.getTheBoard();
        getAmtShips();

        restartB.setText("Restart");
        restartB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartBActionPerformed(evt);
            }
        });
        getContentPane().add(restartB);
        restartB.setBounds(550, 420, 88, 29);

        newB.setText("New");
        newB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBActionPerformed(evt);
            }
        });
        getContentPane().add(newB);
        newB.setBounds(660, 420, 75, 29);

        if(homeScreen.getTheName().equalsIgnoreCase("rico")){
            secretSightP2 o = new secretSightP2();
            o.setVisible(true);
        }

        setBounds(0, 0, 772, 488);
    }

    public void drawYourBoard(int[][] array, int xP, int yP){
        String ship = "\u25A0";
        String hit = "\u0078";
        String miss = "\u25A2";
        String no = " ";
        for(int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (array[x][y] == 1) new labelPvP2Pos(new JLabel(ship), xP + (25 * x), yP + (25 * y));
                else if (array[x][y] == 7) new labelPvP2Pos(new JLabel(hit), xP + (25 * x), yP + (25 * y));
                else if (array[x][y] == 8) new labelPvP2Pos(new JLabel(miss), xP + (25 * x), yP + (25 * y));
                else new labelPvP2Pos(new JLabel(no), xP + (25 * x), yP + (25 * y));
            }
        }
        for(labelPvP2Pos l : labelPvP2Pos.getRegistry()) {
            getContentPane().add(new JLabel(l.getSLabel())).setBounds(l.getyPos(), l.getxPos(), 20, 20);
        }
        Image img =  new ImageIcon(Objects.requireNonNull(this.getClass().getResource("gridv3.png"))).getImage();
        yourGrid.setIcon(new ImageIcon(img));
        getContentPane().add(yourGrid);
        yourGrid.setBounds(30, 100, 250, 250);

        jLabel2.setBackground(new java.awt.Color(51, 204, 255));
        jLabel2.setBounds(new java.awt.Rectangle(30, 100, 250, 250));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);

    }

    public void drawTargetBoard(int[][]array, int xP, int yP){
        String ship = "\u0078";
        String miss = "\u25A2";
        String no = " ";
        for(int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (array[x][y] == 2) new labelTargetP2(new JLabel(ship), xP + (25 * x), yP + (25 * y));
                else if (array[x][y] == 1) new labelTargetP2(new JLabel(miss), xP + (25 * x), yP + (25 * y));
                else new labelTargetP2(new JLabel(no), xP + (25 * x), yP + (25 * y));
            }
        }
        for(labelTargetP2 l : labelTargetP2.getRegistry()) {
            getContentPane().add(new JLabel(l.getSLabel())).setBounds(l.getyPos(), l.getxPos(), 20, 20);
        }
        Image img =  new ImageIcon(Objects.requireNonNull(this.getClass().getResource("gridv3.png"))).getImage();
        targetGrid.setIcon(new ImageIcon(img));
        getContentPane().add(targetGrid);
        targetGrid.setBounds(300, 100, 250, 250);

        jLabel1.setBackground(new java.awt.Color(51, 204, 255));
        jLabel1.setBounds(new java.awt.Rectangle(300, 100, 250, 250));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
    }

    private void fireBActionEvent(java.awt.event.ActionEvent evt){
        int row = Integer.parseInt(inRow.getText()) - 1;
        int col = Integer.parseInt(inCol.getText()) - 1;
        boolean hit = false;
        amtOShips = 5;
        amtShips = 5;

        //if you are dead
        if(youAreDead()){
            JOptionPane.showMessageDialog(null, "You have lost please select a new mode or restart your board");
        }
        //if the ai is dead
        else if(firstPlayerVsP.youAreDead()){
            JOptionPane.showMessageDialog(null, "You have won the game already, either restart the board or select a new mode");
        }
        // if both are alive
        else {
            //if you have shot there already
            if (hasShot[row][col]) {
                //if you hit a boat
                if (aiBoard[row][col] == 1) {
                    targetBoard[row][col] = 2;
                    hasShot[row][col] = false;
                    hit = true;
                    firstPlayerVsP.getHit(row, col);
                    JOptionPane.showMessageDialog(null, "Captain we've hit them great!" + "\n" + "Get those men back on the cannons");
                }
                //if you missed a boat
                else {
                    targetBoard[row][col] = 1;
                    hasShot[row][col] = false;
                    firstPlayerVsP.getMiss(row,col);
                    coverFrame();
                    JOptionPane.showMessageDialog(null, "Oh no Captain we have missed our shot we have to wait for the men to load the cannons back up" + "\n" + "Hand the Computer to Player 1");
                    close();
                    coverFrame.dispose();
                    if(cum == 1){
                        o = new firstPlayerVsP();
                        o.setVisible(true);
                        cum = 2;
                    }
                    else
                        o.setVisible(true);
                }
                //if you hit check to see how many boats are left
                if (hit) {
                    if (firstPlayerVsP.isDestroyerDead()) {
                        amtOShips--;
                    }
                    if (firstPlayerVsP.isCarrierDead()) {
                        amtOShips--;
                    }
                    if (firstPlayerVsP.isSubmarineDead()) {
                        amtOShips--;
                    }
                    if (firstPlayerVsP.isBattleShipDead()) {
                        amtOShips--;
                    }
                    if (firstPlayerVsP.isCruiserDead()) {
                        amtOShips--;
                    }
                    oppShipsLeft.setText("Opponents Ships Left: " + amtOShips);
                    if (firstPlayerVsP.youAreDead()) {
                        JOptionPane.showMessageDialog(null, "Congrats " + homeScreen.getName2() + " you have won the game, you beat the AI" + "\n"
                                + "Your prize is an NFT of Jack Young Pogging");
                        ImageIcon emoji = new ImageIcon(Objects.requireNonNull(getClass().getResource("IMG_3010.png")));
                        JOptionPane.showMessageDialog(null,"L'Jack", "Prize", JOptionPane.INFORMATION_MESSAGE, emoji);
                    }
                }
            }
            //if you have shot there already
            else {
                JOptionPane.showMessageDialog(null, "You have already shot there please pick somewhere else!");
                inRow.setText("");
                inCol.setText("");
            }
        }
        drawTargetBoard(targetBoard, 105,307);
        drawYourBoard(yoBoard,102,38);
    }

    public static boolean youAreDead(){
        for(int r = 0; r < yoBoard.length; r++){
            for(int c = 0; c < yoBoard[0].length; c++){
                if(yoBoard[r][c] == 1){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isCarrierDead(){
        for(int r = 0; r < yoShips.length; r++){
            for(int c = 0; c < yoShips[r].length; c++){
                if(yoShips[r][c] == 5){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isBattleShipDead(){
        for(int r = 0; r < yoShips.length; r++){
            for(int c = 0; c < yoShips[r].length; c++){
                if(yoShips[r][c] == 4){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isSubmarineDead(){
        for(int r = 0; r < yoShips.length; r++){
            for(int c = 0; c < yoShips[r].length; c++){
                if(yoShips[r][c] == 6){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isCruiserDead(){
        for(int r = 0; r < yoShips.length; r++){
            for(int c = 0; c < yoShips[r].length; c++){
                if(yoShips[r][c] == 3){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isDestroyerDead(){
        for(int r = 0; r < yoShips.length; r++){
            for(int c = 0; c < yoShips[r].length; c++){
                if(yoShips[r][c] == 2){
                    return false;
                }
            }
        }
        return true;
    }

    private void restartBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(homeScreen.getTheName().equalsIgnoreCase("rico")){
            secretSightAi o = new secretSightAi();
            o.dispose();
        }
        player2Choose.resetValues();
        close();
        player2Choose o = new player2Choose();
        o.setVisible(true);
    }

    private void newBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if(homeScreen.getTheName().equalsIgnoreCase("rico")){
            secretSightAi o = new secretSightAi();
            o.dispose();
        }
        player2Choose.resetValues();
        homeScreen.setFalse();
        close();
        homeScreen o = new homeScreen();
        o.setVisible(true);
    }

    public void getAmtShips(){
        amtShips = 5;
        amtOShips = 5;
        if(isDestroyerDead()){
            amtShips--;
        }
        if(isCarrierDead()){
            amtShips--;
        }
        if(isSubmarineDead()){
            amtShips--;
        }
        if(isBattleShipDead()){
            amtShips--;
        }
        if(isCruiserDead()){
            amtShips--;
        }
        if (secondPlayerVsP.isDestroyerDead()) {
            amtOShips--;
        }
        if (secondPlayerVsP.isCarrierDead()) {
            amtOShips--;
        }
        if (secondPlayerVsP.isSubmarineDead()) {
            amtOShips--;
        }
        if (secondPlayerVsP.isBattleShipDead()) {
            amtOShips--;
        }
        if (secondPlayerVsP.isCruiserDead()) {
            amtOShips--;
        }
        yourShipsLeft.setText("Your Ships left: " + amtShips);
        oppShipsLeft.setText("Opponents Ships Left: " + amtOShips);
    }

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

    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    public static void getHit(int row, int col, boolean isFirst){
        if(isFirst)
        yoBoard[row][col] = 7;
        else
            yoBoard[row][col] = 0;
        yoShips[row][col] = 0;
    }

    public static void getMiss(int row, int col){
        yoBoard[row][col] = 8;
    }

    private javax.swing.JTextField inCol;
    private javax.swing.JTextField inRow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel oppShipsLeft;
    private javax.swing.JLabel targetGrid;
    private javax.swing.JLabel yourGrid;
    private javax.swing.JLabel yourShipsLeft;

    private static JFrame coverFrame;

    private int amtShips = 5;
    private int amtOShips = 5;

    private final String ships = "Your Ships left: " + amtShips;
    private final String oShips = "Opponents Ships Left: " + amtOShips;

    public static void setYoBoard() {
        yoBoard = player2Choose.getBoard();
        yoShips = player2Choose.getShipPlaces();
    }

    private static int[][] yoBoard;
    private static int[][] yoShips;
    private int[][] aiBoard;

    //one if miss two is hit
    private int[][] targetBoard = {{0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0}};

    private static boolean[][] hasShot = {{true,true,true,true,true,true,true,true,true,true},
            {true,true,true,true,true,true,true,true,true,true},
            {true,true,true,true,true,true,true,true,true,true},
            {true,true,true,true,true,true,true,true,true,true},
            {true,true,true,true,true,true,true,true,true,true},
            {true,true,true,true,true,true,true,true,true,true},
            {true,true,true,true,true,true,true,true,true,true},
            {true,true,true,true,true,true,true,true,true,true},
            {true,true,true,true,true,true,true,true,true,true},
            {true,true,true,true,true,true,true,true,true,true}};
    firstPlayerVsP o;
    private int cum = 1;
    // End of variables declaration
}
