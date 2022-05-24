public class ai {

    private static int[][] aiBoardO1 = {{0,1,1,1,0,0,0,0,0,0},
                                        {0,0,0,0,0,0,0,0,0,0},
                                        {0,1,1,1,1,1,0,0,0,0},
                                        {0,0,0,0,0,0,0,0,1,0},
                                        {0,0,1,0,0,0,0,0,1,0},
                                        {0,0,1,0,1,0,0,0,1,0},
                                        {0,0,0,0,1,0,0,0,0,0},
                                        {0,0,0,0,1,0,0,0,0,0},
                                        {0,0,0,0,1,0,0,0,0,0},
                                        {0,0,0,0,0,0,0,0,0,0}};

    private static int[][] board01Ships = {{0,3,3,3,0,0,0,0,0,0},
                                           {0,0,0,0,0,0,0,0,0,0},
                                           {0,5,5,5,5,5,0,0,0,0},
                                           {0,0,0,0,0,0,0,0,6,0},
                                           {0,0,2,0,0,0,0,0,6,0},
                                           {0,0,2,0,4,0,0,0,6,0},
                                           {0,0,0,0,4,0,0,0,0,0},
                                           {0,0,0,0,4,0,0,0,0,0},
                                           {0,0,0,0,4,0,0,0,0,0},
                                           {0,0,0,0,0,0,0,0,0,0}};

    private static int[][] aiBoardO2 = {{0,1,0,0,0,0,0,0,1,0},
                                        {0,1,0,0,0,0,0,0,1,0},
                                        {0,1,0,0,0,0,0,0,0,0},
                                        {0,0,0,0,0,1,0,0,0,0},
                                        {0,0,0,0,0,1,0,0,0,0},
                                        {0,0,0,0,0,1,0,0,0,0},
                                        {0,0,0,0,0,1,0,0,0,0},
                                        {0,0,0,1,1,1,1,1,0,0},
                                        {0,0,0,0,0,0,0,0,0,0},
                                        {0,0,0,0,0,1,1,1,0,0}};

    private static int[][] board02Ships = {{0,6,0,0,0,0,0,0,2,0},
                                           {0,6,0,0,0,0,0,0,2,0},
                                           {0,6,0,0,0,0,0,0,0,0},
                                           {0,0,0,0,0,4,0,0,0,0},
                                           {0,0,0,0,0,4,0,0,0,0},
                                           {0,0,0,0,0,4,0,0,0,0},
                                           {0,0,0,0,0,4,0,0,0,0},
                                           {0,0,0,5,5,5,5,5,0,0},
                                           {0,0,0,0,0,0,0,0,0,0},
                                           {0,0,0,0,0,3,3,3,0,0}};

    private static int[][] aiBoardO3 = {{0,0,0,0,0,1,0,0,0,0},
                                        {0,0,0,0,0,1,0,1,0,0},
                                        {0,1,0,0,0,1,0,1,0,0},
                                        {0,1,0,0,0,0,0,0,0,0},
                                        {0,1,0,1,0,0,0,0,0,0},
                                        {0,1,0,1,0,0,0,0,0,0},
                                        {0,0,0,1,0,0,1,1,1,0},
                                        {0,0,0,1,0,0,0,0,0,0},
                                        {0,0,0,1,0,0,0,0,0,0},
                                        {0,0,0,0,0,0,0,0,0,0}};

    private static int[][] board03Ships = {{0,0,0,0,0,3,0,0,0,0},
                                           {0,0,0,0,0,3,0,2,0,0},
                                           {0,4,0,0,0,3,0,2,0,0},
                                           {0,4,0,0,0,0,0,0,0,0},
                                           {0,4,0,5,0,0,0,0,0,0},
                                           {0,4,0,5,0,0,0,0,0,0},
                                           {0,0,0,5,0,0,6,6,6,0},
                                           {0,0,0,5,0,0,0,0,0,0},
                                           {0,0,0,5,0,0,0,0,0,0},
                                           {0,0,0,0,0,0,0,0,0,0}};

    private static int[][] aiBoardO4 = {{1,0,0,0,0,0,0,0,0,0},
                                        {1,0,0,0,0,1,1,1,0,0},
                                        {0,0,1,0,0,0,0,0,0,0},
                                        {0,0,1,0,0,0,0,0,0,0},
                                        {0,0,1,0,0,0,0,0,0,0},
                                        {0,0,1,0,0,1,1,1,1,1},
                                        {0,0,0,0,0,0,0,0,0,0},
                                        {0,0,0,0,1,0,0,0,0,0},
                                        {0,0,0,0,1,0,0,0,0,0},
                                        {0,0,0,0,1,0,0,0,0,0}};

    private static int[][] board04Ships = {{2,0,0,0,0,0,0,0,0,0},
                                           {2,0,0,0,0,6,6,6,0,0},
                                           {0,0,4,0,0,0,0,0,0,0},
                                           {0,0,4,0,0,0,0,0,0,0},
                                           {0,0,4,0,0,0,0,0,0,0},
                                           {0,0,4,0,0,5,5,5,5,5},
                                           {0,0,0,0,0,0,0,0,0,0},
                                           {0,0,0,0,3,0,0,0,0,0},
                                           {0,0,0,0,3,0,0,0,0,0},
                                           {0,0,0,0,3,0,0,0,0,0}};

    private static int[][] aiBoard5 = {{0,0,0,0,0,0,0,0,1,1},
                                       {0,0,0,0,0,1,0,0,1,1},
                                       {0,0,0,0,0,1,0,0,0,1},
                                       {0,0,0,0,0,1,0,0,0,0},
                                       {0,0,0,0,0,1,0,0,0,0},
                                       {0,0,0,0,0,1,0,0,0,0},
                                       {0,0,0,1,1,1,1,0,0,0},
                                       {0,0,0,0,0,0,0,0,0,0},
                                       {0,0,0,0,0,0,1,1,1,0},
                                       {0,0,0,0,0,0,0,0,0,0}};

    private static int[][] board05Ships = {{0,0,0,0,0,0,0,0,2,6},
                                           {0,0,0,0,0,5,0,0,2,6},
                                           {0,0,0,0,0,5,0,0,0,6},
                                           {0,0,0,0,0,5,0,0,0,0},
                                           {0,0,0,0,0,5,0,0,0,0},
                                           {0,0,0,0,0,5,0,0,0,0},
                                           {0,0,0,4,4,4,4,0,0,0},
                                           {0,0,0,0,0,0,0,0,0,0},
                                           {0,0,0,0,0,0,3,3,3,0},
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


    private static int[][] board;
    private static int[][] ships;

    public static int[][] getTheBoard(){return board;}
    public static int[][] getShips(){return ships;}

    public static void getBoard(){
        double ran = Math.random();
        if(ran >= 0.8){
            board = aiBoardO1;
            ships = board01Ships;
        }
        else if(ran >= 0.6){
            board = aiBoardO2;
            ships = board02Ships;
        }
        else if(ran >= 0.4){
            board = aiBoardO3;
            ships = board03Ships;
        }
        else if(ran >= 0.2){
            board = aiBoardO4;
            ships = board04Ships;
        }
        else{
            board = aiBoard5;
            ships = board05Ships;
        }
    }

    public static boolean isDead(){
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[r].length; c++){
                if(board[r][c] == 1){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isCarrierDead(){
        for(int r = 0; r < ships.length; r++){
            for(int c = 0; c < ships[r].length; c++){
                if(ships[r][c] == 5){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isBattleShipDead(){
        for(int r = 0; r < ships.length; r++){
            for(int c = 0; c < ships[r].length; c++){
                if(ships[r][c] == 4){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSubmarineDead(){
        for(int r = 0; r < ships.length; r++){
            for(int c = 0; c < ships[r].length; c++){
                if(ships[r][c] == 6){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isCruiserDead(){
        for(int r = 0; r < ships.length; r++){
            for(int c = 0; c < ships[r].length; c++){
                if(ships[r][c] == 3){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isDestroyerDead(){
        for(int r = 0; r < ships.length; r++){
            for(int c = 0; c < ships[r].length; c++){
                if(ships[r][c] == 2){
                    return false;
                }
            }
        }
        return true;
    }

    public static int ranRow(){
        int row = (int)(Math.random() * 10);
        return row;
    }
    public static int ranCol(){
        int col = (int)(Math.random() * 10);
        return col;
    }

    public static void getHit(int row, int col){
        board[row][col] = 0;
        ships[row][col] = 0;
    }

    public static boolean isValidShot(int row, int col){
        if(hasShot[row][col]){
            setShot(row,col);
            return true;
        }
        return false;
    }

    public static void setShot(int row, int col){
        hasShot[row][col] = false;
    }


}
