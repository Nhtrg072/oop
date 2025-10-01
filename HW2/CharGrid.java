public class CharGrid {
	private char[][] grid;

	/**
	 * Khởi tạo CharGrid với bảng cho trước.
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Tính diện tích hình chữ nhật nhỏ nhất chứa tất cả ký tự ch.
	 */
	public int charArea(char ch)
	{
		int minRow = Integer.MAX_VALUE, maxRow = Integer.MIN_VALUE;
		int minCol = Integer.MAX_VALUE, maxCol = Integer.MIN_VALUE;
		boolean found = false;

		for (int row = 0; row < grid.length; row++)
		{
			for (int col = 0; col < grid[row].length; col++)
			{
				if (grid[row][col] == ch)
				{
					found = true;
					if (row < minRow) minRow = row;
					if (row > maxRow) maxRow = row;
					if (col < minCol) minCol = col;
					if (col > maxCol) maxCol = col;
				}
			}
		}

		if (!found) return 0;
		return (maxRow - minRow + 1) * (maxCol - minCol + 1);
	}
	
	/**
	 * Đếm số lượng hình chữ thập trong bảng.
	 */
	public int countPlus()
	{
		int count = 0;
		for (int row = 1; row < grid.length - 1; row++)
		{
			for (int col = 1; col < grid[row].length - 1; col++)
			{
				if (isPlus(row, col))
				{
					count++;
				}
			}
		}

		return count;
	}

	private boolean isPlus(int row, int col)
	{
		char center = grid[row][col];
		int armLength = getArmLength(row, col, center);
		return armLength >= 2; // Mỗi nhánh ít nhất 2 ký tự (bao gồm tâm)
	}
	
	private int getArmLength(int row, int col, char center)
	{
		int armLength = 1;
		// Kiểm tra độ dài tối đa có thể mở rộng trong cả 4 hướng
		while (row - armLength >= 0 && row + armLength < grid.length &&
				col - armLength >= 0 && col + armLength < grid[row].length &&
				grid[row - armLength][col] == center && // lên
				grid[row + armLength][col] == center && // xuống  
				grid[row][col - armLength] == center && // trái
				grid[row][col + armLength] == center)   // phải
		{
			armLength++;
		}
		return armLength;
	}
}