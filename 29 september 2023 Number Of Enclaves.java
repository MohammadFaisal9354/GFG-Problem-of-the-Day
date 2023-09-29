class Solution {
    void f(int i  , int j ,int n , int m ,  int[][] grid , int[][] visited){
        visited[i][j]=1;
        int dx[] = {-1 , 1, 0 , 0};
        int dy[]={0,0,-1,1};
        
        for(int k=0;k<4;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(x>=0 && x<n && y>=0 && y<m && visited[x][y]==0 && grid[x][y]==1){
                f(x , y , n ,m , grid , visited);
            }
        }
    }
    
    int numberOfEnclaves(int[][] grid) {
        int n = grid.length , m = grid[0].length;
        int[][] visited = new int[n][m];
        for(int[] row : visited)
            Arrays.fill(row , 0); 
        for(int i=0;i<n;i++)
            if(visited[i][0]==0 && grid[i][0]==1) f(i , 0 , n , m , grid , visited);
        for(int i=0;i<n;i++)
            if(visited[i][m-1]==0 && grid[i][m-1]==1) f(i , m-1 , n , m , grid , visited);
        for(int j=0;j<m;j++)
            if(visited[0][j]==0 && grid[0][j]==1) f(0 , j , n , m , grid , visited);
        for(int j=0;j<m;j++)
            if(visited[n-1][j]==0 && grid[n-1][j]==1) f(n-1, j , n , m , grid , visited);
        int ans =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==0 && grid[i][j]==1) ans++;
            }
        }
        return ans;
    }
}
