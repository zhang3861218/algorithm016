package week06.homework;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/10/25 22:16
 *
 */
public class MinPathSum {
    public int minPathSum(int[][] grid){
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (i==0&&j==0){
                    continue;
                }else if (i==0){
                    grid[i][j] =grid[i][j-1]+grid[i][j];
                }else if (j==0){
                    grid[i][j] =grid[i-1][j]+grid[i][j];
                }else {
                    grid[i][j]=Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
                }
            }

        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
