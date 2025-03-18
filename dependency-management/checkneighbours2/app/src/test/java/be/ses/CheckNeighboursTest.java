package be.ses;

import org.junit.Test;  
// import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;


import java.util.ArrayList;

public class CheckNeighboursTest {

  
  @Test
  public void gegevenIndexIs5_resultIs() {
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
}
