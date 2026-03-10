class Solution {
    public boolean[] visited;

    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        // 가로 검증
        for(int i = 0 ; i < m ; i++){
            visited = new boolean[10];
            for(int j = 0 ; j < n ; j++){
                char currValue = board[i][j];
                
                if(currValue == '.') continue;

                if(visited[currValue - '0']){
                    return false;
                }

                visited[currValue - '0'] = true;
            }
        }

        // 세로 검증

        for(int j = 0 ; j < n ; j++){
            visited = new boolean[10];
            for(int i = 0 ; i < m ; i++){
                char currValue = board[i][j];
                    
                if(currValue == '.') continue;
                
                if(visited[currValue - '0']){
                    return false;
                }

                visited[currValue - '0'] = true;
            }
        }
    

        // 내부 박스 검증
        for(int boxRow = 0 ; boxRow < 3 ; boxRow++){
            for(int boxCol = 0 ; boxCol < 3 ; boxCol++){

                visited = new boolean[10];
                for(int i = 0 ; i < 3 ; i++){
                    for(int j = 0 ; j < 3 ; j++){
                        int cy = boxRow * 3 + i;
                        int cx = boxCol * 3 + j;
                            
                        char currValue = board[cy][cx];

                        if(currValue == '.') continue;

                        if(visited[currValue - '0']){
                            return false;
                        }
                        
                        visited[currValue - '0'] = true;
                    }
                }
            }
        }

        // 정답이다 연금술사!!
        return true;

    }
}