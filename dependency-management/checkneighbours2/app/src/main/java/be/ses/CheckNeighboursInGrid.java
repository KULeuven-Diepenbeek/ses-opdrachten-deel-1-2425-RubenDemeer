package be.ses;

import java.util.ArrayList;

public class CheckNeighboursInGrid {
    public static void main(String[] args) {
        System.out.println(getSameNeighboursIds(new int[]{ 0, 0, 1, 0,
            1, 1, 0, 2,
            2, 0, 1, 3,
            0, 1, 1, 1 }, 4, 4, 5));
    }

   /**
   * This method takes a 1D Iterable and an element in the array and gives back an iterable containing the indexes of all neighbours with the same value as the specified element
   *@return - Returns a 1D Iterable of ints, the Integers represent the indexes of all neighbours with the same value as the specified element on index 'indexToCheck'.
   *@param grid - This is a 1D Iterable containing all elements of the grid. The elements are integers.
   *@param width - Specifies the width of the grid.
   *@param height - Specifies the height of the grid (extra for checking if 1D grid is complete given the specified width)
   *@param indexToCheck - Specifies the index of the element which neighbours that need to be checked
   */
   public static Iterable<Integer> getSameNeighboursIds(int[] grid,int width, int height, int indexToCheck){
        ArrayList<Integer> result = new ArrayList<Integer>(); 
        if (indexToCheck > width && indexToCheck % width > 0 ) { // check if indexToCheck is not on the top left corner
            if (grid[indexToCheck] == grid [indexToCheck - (width+1)]){ 
                result.add(indexToCheck - (width+1)); 
            }
        }

        if (indexToCheck > width) { // check if indexToCheck is not on the top edge
            if (grid[indexToCheck] == grid [indexToCheck - width]) {
                result.add(indexToCheck - width); 
            }
        }

        if (indexToCheck > width && (indexToCheck+1) % width > 0 ) {//check if indexToCheck is not on the top right corner
            if (grid[indexToCheck] == grid [indexToCheck - (width-1)]) {
                result.add(indexToCheck - (width-1)); 
            }
        }

        if (indexToCheck % width > 0) { // check if indexToCheck is not on the left edge
            if (grid[indexToCheck] == grid [indexToCheck - 1]) {
                result.add(indexToCheck - 1); 
            }
        }

        if (indexToCheck % width > 0) { // check if indexToCheck is not on the right edge
            if (grid[indexToCheck] == grid [indexToCheck + 1]) {
                result.add(indexToCheck + 1); 
            }
        }

        if (indexToCheck < width*(height-1) && indexToCheck % width > 0 ) { // check if indexToCheck is not on the bottom left corner
            if (grid[indexToCheck] == grid [indexToCheck + (width-1)]){ 
                result.add(indexToCheck + (width-1)); 
            }
        }

        if (indexToCheck < width*(height-1) ) { // check if indexToCheck is not on the bottom edge
            if (grid[indexToCheck] == grid [indexToCheck + (width)]){ 
                result.add(indexToCheck + (width)); 
            }
        }

        if (indexToCheck < width*(height-1) && (indexToCheck+1) % width > 0 ) { // check if indexToCheck is not on the bottom right corner
            if (grid[indexToCheck] == grid [indexToCheck + (width+1)]){ 
                result.add(indexToCheck + (width+1)); 
            }
        }
        return result;
   }

}