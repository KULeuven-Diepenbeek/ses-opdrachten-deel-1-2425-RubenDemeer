package be.ses;

import org.junit.Test;  
// import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;


import java.util.ArrayList;

public class CheckNeighboursTest {
  @Test
  public void gegevenIndexIs5_resultIs2_4_10() {
    // 1. Arrange
    CheckNeighboursInGrid checkNeighboursInGrid = new CheckNeighboursInGrid();
    int [] grid = new int[]{  0, 0, 1, 0,
                              1, 1, 0, 2,
                              2, 0, 1, 3,
                              0, 1, 1, 1 };

    // 2. Act
    ArrayList<Integer> result = (ArrayList<Integer>) checkNeighboursInGrid.getSameNeighboursIds(grid, 4, 4, 5);
    
    System.out.println(result);

    // 3. Assert
    int [] oplossing = new int[]{2, 4, 10};
    
    for (int i = 0; i < 3; i++){
      assertThat(result.get(i)).isEqualTo(oplossing[i]);
    } 
  }   
 
  @Test
  public void gegevenIndexIs15_resultIs10_14() {
    // 1. Arrange
    CheckNeighboursInGrid checkNeighboursInGrid = new CheckNeighboursInGrid();
    int [] grid = new int[]{  0, 0, 1, 0,
                              1, 1, 0, 2,
                              2, 0, 1, 3,
                              0, 1, 1, 1 };

    // 2. Act
    ArrayList<Integer> result = (ArrayList<Integer>) checkNeighboursInGrid.getSameNeighboursIds(grid, 4, 4, 15);
    
    System.out.println(result);

    // 3. Assert
    int [] oplossing = new int[]{10, 14};
    
    for (int i = 0; i < 2; i++){
      assertThat(result.get(i)).isEqualTo(oplossing[i]);
    } 
  }

  @Test
  public void gegevenIndexIs14_resultIs10_13_15() {
    // 1. Arrange
    CheckNeighboursInGrid checkNeighboursInGrid = new CheckNeighboursInGrid();
    int [] grid = new int[]{  0, 0, 1, 0,
                              1, 1, 0, 2,
                              2, 0, 1, 3,
                              0, 1, 1, 1 };

    // 2. Act
    ArrayList<Integer> result = (ArrayList<Integer>) checkNeighboursInGrid.getSameNeighboursIds(grid, 4, 4, 14);
    
    System.out.println(result);

    // 3. Assert
    int [] oplossing = new int[]{10, 13, 15};
    
    for (int i = 0; i < 3; i++){
      assertThat(result.get(i)).isEqualTo(oplossing[i]);
    } 
  }

  @Test
  public void gegevenIndexIs3_resultIs6() {
    // 1. Arrange
    CheckNeighboursInGrid checkNeighboursInGrid = new CheckNeighboursInGrid();
    int [] grid = new int[]{  0, 0, 1, 0,
                              1, 1, 0, 2,
                              2, 0, 1, 3,
                              0, 1, 1, 1 };

    // 2. Act
    ArrayList<Integer> result = (ArrayList<Integer>) checkNeighboursInGrid.getSameNeighboursIds(grid, 4, 4, 3);
    
    System.out.println(result);

    // 3. Assert
    int [] oplossing = new int[]{6};
    
    for (int i = 0; i < 1; i++){
      assertThat(result.get(i)).isEqualTo(oplossing[i]);
    } 
  }

  @Test
  public void gegevenIndexIs0_resultIs1() {
    // 1. Arrange
    CheckNeighboursInGrid checkNeighboursInGrid = new CheckNeighboursInGrid();
    int [] grid = new int[]{  0, 0, 1, 0,
                              1, 1, 0, 2,
                              2, 0, 1, 3,
                              0, 1, 1, 1 };

    // 2. Act
    ArrayList<Integer> result = (ArrayList<Integer>) checkNeighboursInGrid.getSameNeighboursIds(grid, 4, 4, 0);
    
    System.out.println(result);

    // 3. Assert
    int [] oplossing = new int[]{1};
    
    for (int i = 0; i < 1; i++){
      assertThat(result.get(i)).isEqualTo(oplossing[i]);
    } 
  }

  @Test
  public void gegevenIndexIs11_resultIsNull() {
    // 1. Arrange
    CheckNeighboursInGrid checkNeighboursInGrid = new CheckNeighboursInGrid();
    int [] grid = new int[]{  0, 0, 1, 0,
                              1, 1, 0, 2,
                              2, 0, 1, 3,
                              0, 1, 1, 1 };

    // 2. Act
    ArrayList<Integer> result = (ArrayList<Integer>) checkNeighboursInGrid.getSameNeighboursIds(grid, 4, 4, 11);
    
    System.out.println(result);

    // 3. Assert
      assertThat(result.size()).isEqualTo(0);
    
  }

  @Test
  public void gegevenIndexIs2_gridIs3x3_resultIs1_4() {
    // 1. Arrange
    CheckNeighboursInGrid checkNeighboursInGrid = new CheckNeighboursInGrid();
    int [] grid = new int[]{  0, 1, 1,
                              1, 1, 0, 
                              2, 0, 1};

    // 2. Act
    ArrayList<Integer> result = (ArrayList<Integer>) checkNeighboursInGrid.getSameNeighboursIds(grid, 3, 3, 2);
    
    System.out.println(result);

    // 3. Assert
    int [] oplossing = new int[]{1,4};
    
    for (int i = 0; i < 2; i++){
      assertThat(result.get(i)).isEqualTo(oplossing[i]);
    } 
  }

  @Test
  public void gegevenIndexIs17_grid4x4_IndexOutOfBoundsException() {
    //when
    Throwable thrown = catchThrowable(() -> {
      // 1. Arrange
      CheckNeighboursInGrid checkNeighboursInGrid = new CheckNeighboursInGrid();
      int [] grid = new int[]{  0, 0, 1, 0,
                                1, 1, 0, 2,
                                2, 0, 1, 3,
                                0, 1, 1, 1 };

      // 2. Act
      ArrayList<Integer> result = (ArrayList<Integer>) checkNeighboursInGrid.getSameNeighboursIds(grid, 4, 4, 17);
    });
    
    
    // 3. Assert
       assertThat(thrown)
       .isInstanceOf(IndexOutOfBoundsException.class)
       .hasMessageContaining("out of bounds");
}

}
