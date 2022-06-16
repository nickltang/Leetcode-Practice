/**
 * FLOOD FILL
 * Level: Easy
 * 
 * 
 * An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
 * 
 * You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].
 * 
 * To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color
 * as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the
 * color of all of the aforementioned pixels with color.
 * 
 * Return the modified image after performing the flood fill.
 */
package java.easy.treesgraphs;

public class FloodFill {
    // Recursive DFS Approach
    // Time Complexity: O(n*m)
    // Space Complexity: O(1)
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color)
            return image;
        floodFillUtil(image, sr, sc, image[sr][sc], color);
        return image;
    }
    
    public void floodFillUtil(int[][] image, int sr, int sc, int original, int newColor) {
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != original)
            return;
        
        image[sr][sc] = newColor;
        floodFillUtil(image, sr - 1, sc, original, newColor);
        floodFillUtil(image, sr + 1, sc, original, newColor);
        floodFillUtil(image, sr, sc - 1, original, newColor);
        floodFillUtil(image, sr, sc + 1, original, newColor);
                
    }
}
