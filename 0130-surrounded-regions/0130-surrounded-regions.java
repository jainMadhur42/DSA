class Solution {

    int[] x = {0,0,-1,1};
    int[] y = {-1,1,0,0};

    public boolean isValid(int i , int j, char[][] grid) {
        
        System.out.println(i+" "+j+"  " +" 3");

        if( (i >=0 && i<grid.length) 
        && (j>=0 && j<grid[0].length) 
        && (grid[i][j] == 'O')) {
            
                return true;
        }
        
        
        return false;
    }

    public void update0(char[][] board, int i , int j , int row, int col) {
        
        System.out.println(i+" "+j+" "+board[i][j] +" 1");

        if(board[i][j] == 'O') {
            board[i][j] = '1';
        }

        for(int index = 0; index < 4; index++ ) {
            
            System.out.println((i+x[index])+" "+(j+y[index])+"  " +" 2");
            if(isValid(i+ x[index],j+y[index],board)) {
                
                update0(board, i + x[index], j+y[index] , row, col);

                System.out.println(i+" "+j+" "+board[i][j] +" 5");
            }
            
        }
    }

    public void solve(char[][] board) {

        int row = board.length-1;
        int col = board[0].length-1;

            
            for(int j =0; j <= col;j++) {
                //System.out.print(board[0][j]+" ");
                if(board[0][j] == 'O') {
                   update0(board,0,j,row,col);     
                }
            }

            for(int k = 1; k <=row;k++) {
                //System.out.print(board[k][col]+" ");
                if(board[k][col] == 'O') {
                     update0(board,k,col,row,col);   
                }
                
            }

            for(int k = col-1;k >=0; k--) {
                //System.out.print(board[row][k]+" ");
                if(board[row][k] == 'O') {
                    update0(board,row,k,row,col);
                }
                
            }


            for(int k = row-1; k > 0; k--) {
               // System.out.println(board[k][0]+" "+k+" 0");
               if(board[k][0] == 'O') {
                    update0(board,k,0,row,col);
               }
              // System.out.println(board[k][0]+" "+k+" 0");
            }
            System.out.println("+++++++++");
            for(int i =0;i<=row;i++) {
                for(int j = 0; j<=col;j++) {
                    //System.out.println(board[i][j]+" "+i+" "+j);
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }

            for(int i =0;i<=row;i++) {
                for(int j = 0; j<=col;j++) {
                      if(board[i][j] == 'O')
                        board[i][j] = 'X';
                      else if(board[i][j] == '1')    
                        board[i][j] = 'O';
                }
            }  
    }
}