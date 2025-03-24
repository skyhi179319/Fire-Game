package gFunctions.g;
import java.util.Random;
public class Rand {
	public static int tileNumber() {
		Random rand = new Random();
		// zones not allowed
		int zone1 = Bounds.MIDDLE + gGraphics.Grid.columns * 2;
		int zone2 = Bounds.MIDDLE;
		int zone3 = Bounds.MIDDLE + gGraphics.Grid.columns * 2 + gGraphics.Grid.columns;

        // Generate random integers in range of grid
        int rand_int= rand.nextInt(gGraphics.Grid.rows * gGraphics.Grid.columns);
        if(rand_int == zone1 || rand_int == zone2 || rand_int == zone3) {
        	return tileNumber();
        }
        else {
        	return rand_int;
        }
	}
}