class Node {
    private int y;
    private int x;

    public Node(int y, int x){
        this.y = y;
        this.x = x;
    }
    
    public int getY(){
        return y;
    }
    public int getX(){
        return x;
    }
}
class Solution {



    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        Queue<Node> q = new LinkedList<>();

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(matrix[i][j] == 0){
                    q.offer(new Node(i, j));
                }
            }
        }

        while(!q.isEmpty()){
            Node now = q.poll();
            int cy = now.getY();
            int cx = now.getX();

            //rows
            Arrays.fill(matrix[cy], 0);
            
            //columns
            for(int i = 0 ; i < m ; i++){
                matrix[i][cx] = 0;
            }
        }
    }
}