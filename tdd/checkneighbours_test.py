import unittest
from checkneighbours import get_same_neighbours_ids

class TestFunctions(unittest.TestCase):
    def test_gegevenVoorbeeldgridWith4Height4IndexToCheck5_wanneerGetSameNeighboursIds_dan2en4en10(self):
        # Arrange
        voorbeeld_grid = [ 0, 0, 1, 0,
                          1, 1, 0, 2,
                          2, 0, 1, 3,
                          0, 1, 1, 1 ]
        # Act
        result = get_same_neighbours_ids(voorbeeld_grid, 4, 4, 5)
        # Assert
        self.assertEqual(result, [2,4,10])

    def test_gegevenVoorbeeldgridWith4Height4IndexToCheck0_wanneerGetSameNeighboursIds_dan1(self):
        # Arrange
        voorbeeld_grid = [ 0, 0, 1, 0,
                          1, 1, 0, 2,
                          2, 0, 1, 3,
                          0, 1, 1, 1 ]
        # Act
        result = get_same_neighbours_ids(voorbeeld_grid, 4, 4, 0)
        # Assert
        self.assertEqual(result, [1])   

    def test_gegevenVoorbeeldgridWith3Height3IndexToCheck2_wanneerGetSameNeighboursIds_dan1en4(self):
        # Arrange
        voorbeeld_grid = [ 0, 1, 1,
                          1, 1, 0,
                          2, 0, 1]
        # Act
        result = get_same_neighbours_ids(voorbeeld_grid, 3, 3, 2)
        # Assert
        self.assertEqual(result, [1,4])

    def test_gegevenVoorbeeldgridWith4Height4IndexToCheck14_wanneerGetSameNeighboursIds_dan10en13en15(self):
        # Arrange
        voorbeeld_grid = [ 0, 0, 1, 0,
                          1, 1, 0, 2,
                          2, 0, 1, 3,
                          0, 1, 1, 1 ]
        # Act
        result = get_same_neighbours_ids(voorbeeld_grid, 4, 4, 14)
        # Assert
        self.assertEqual(result, [10,13,15])

    def test_gegevenVoorbeeldgridWith4Height4IndexToCheck11_wanneerGetSameNeighboursIds_danNull(self):
        # Arrange
        voorbeeld_grid = [ 0, 0, 1, 0,
                          1, 1, 0, 2,
                          2, 0, 1, 3,
                          0, 1, 1, 1 ]
        # Act
        result = get_same_neighbours_ids(voorbeeld_grid, 4, 4, 11)
        # Assert
        self.assertEqual(result, [None])

if __name__ == '__main__':
    unittest.main()