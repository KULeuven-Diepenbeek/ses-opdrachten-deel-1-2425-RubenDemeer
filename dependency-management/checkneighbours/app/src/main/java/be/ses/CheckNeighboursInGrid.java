package be.ses;

public class CheckNeighboursInGrid {
    public static void main(String[] args) {
        //System.out.println(getSameNeighboursIds(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3, 3, 4));
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
      // TODO write your code below so you return the correct result
      Iterable<Integer> result = null;
      return result;
   }

}