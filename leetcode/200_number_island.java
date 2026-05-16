class Solution {
    public boolean[][] marque=new boolean[grid.length][grid[0].length];
    public int numIslands(char[][] grid) {
        //en gros algo de parcours en largeur pour déterminer les composantes connexes
        //

    }
    public void parcoursProfondeur(char[][] grid,boolean[][] marque,int i,int j) {
        if(!marque[i][j]) {
             marque[i][j]=true;
            int[][] voi=voisin(grid,marque,i,j);
            for(int v=0;v<voi.length;v++) {
                int iV=voi[v][0];
                int jV=voi[v][1];
                parcoursProfondeur(grid,marque,iV,jV)
            }
        }
    }
    public int[][] voisin(char[][] grid,boolean[][] marque,int i,int j) {
        
        if(0<i && i<grid.length-1) {
            if(0<j && j<grid.length-1) {
                
            }
        }

        if(grid[iV][jV]=="1") {

        }
    }
    
}
