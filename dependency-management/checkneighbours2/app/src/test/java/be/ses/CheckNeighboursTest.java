package be.ses;

import org.junit.Test;  
import static org.junit.Assert.*;

public class CheckNeighboursTest {

  
  @Test
  public void gegevenTeller2Noemer4_wanneerDivide_danResult0point5() {
    // 1. Arrange
    CheckNeighboursInGrid checkNeighboursInGrid = new CheckNeighboursInGrid();
    int [] grid = new int[]{  0, 0, 1, 0,
                              1, 1, 0, 2,
                              2, 0, 1, 3,
                              0, 1, 1, 1 };

    // 2. Act
    Iterable<Integer> result = checkNeighboursInGrid.getSameNeighboursIds(grid, 4, 4, 5);
    System.out.println(result);

    // 3. Assert
    assertThat(result).isEqualTo(new int[]{ 2, 4, 10});

    
  }
}
