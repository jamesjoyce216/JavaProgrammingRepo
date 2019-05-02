public class MagicSquare {

	int[][] square;

	public MagicSquare(int[][] sqin) {
		square = new int[sqin.length][];
		for (int ix = 0; ix < sqin.length; ix++) {
			square[ix] = new int[sqin[ix].length];
			for (int iy = 0; iy < sqin[ix].length; iy++) {
				square[ix][iy] = sqin[ix][iy];
			}
		}
	}

	public boolean isAMagicSquare() {
		int nDim = square.length;
		int total = 0;

		// Check if array is a square
		for (int ix = 0; ix < nDim; ix++) {
			if (nDim != square[ix].length)
				return false;
		}

		// formula for magic square
		int commonSum = nDim * (nDim * nDim + 1);

		// rows
		for (int ix = 0; ix < nDim; ix++) {
			total = 0;
			for (int iy = 0; iy < nDim; iy++) {
				total += square[ix][iy];
			}
			if (commonSum != total)
				return false;
		}
		// columns
		for (int iy = 0; iy < nDim; iy++) {
			total = 0;
			for (int ix = 0; ix < nDim; ix++) {
				total += square[ix][iy];
			}
			if (commonSum != total)
				return false;
		}

		// (main diag)
		for(int ix = 0; ix < nDim; ix++)
		{
			total = total + square[ix][ix];
			if (total != commonSum)
			    return false;
		}
		
		total = 0;
		
		//off diag
		for(int ix = 0; ix < nDim; ix++) 
		{
			total = total + square[ix][nDim-1-ix];
			if (total != commonSum)
				return false;
		}

		return true;
	}

	public String toString() {
		String str = new String("");
		for (int ix = 0; ix < square.length; ix++) {
			for (int iy = 0; iy < square.length; iy++) {
				str = str + String.format("%4d", square[ix][iy]);
				str = str + "\n";
			}
		}
		return str;
	}
}
