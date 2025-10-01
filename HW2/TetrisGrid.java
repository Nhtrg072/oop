public class TetrisGrid {
	
	private boolean[][] grid;
	
	/**
	 * Khởi tạo TetrisGrid với bảng cho trước.
	 */
	public TetrisGrid(boolean[][] grid)
	{
		this.grid = grid;
	}
	
	
	/**
	 * Xóa các dòng đầy, hạ dòng trên xuống và thêm dòng trống lên đỉnh.
	 */
	public void clearRows()
	{
		int width = grid.length;
		int height = grid[0].length;
		boolean[][] newGrid = new boolean[width][height];
		int newRow = 0;

		for (int y = 0; y < height; y++)
		{
			boolean fullRow = true;
			for (int x = 0; x < width; x++)
			{
				if (!grid[x][y])
				{
					fullRow = false;
					break;
				}
			}
			if (!fullRow)
			{
				for (int x = 0; x < width; x++)
				{
					newGrid[x][newRow] = grid[x][y];
				}
				newRow++;
			}
		}
		grid = newGrid;
	}
	
	/**
	 * Trả về bảng grid nội bộ để kiểm tra.
	 */
	public boolean[][] getGrid()
	{
		return grid;
	}
}
