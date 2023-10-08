package gFunctions.g;

public class Bounds {
	public static int TOP_LEFT = 0;
	public static int TOP_RIGHT = gGraphics.Grid.columns;
	public static int BOTTOM_LEFT = gGraphics.Grid.columns * gGraphics.Grid.rows - gGraphics.Grid.columns + 1;
	public static int BOTTOM_RIGHT = gGraphics.Grid.columns * gGraphics.Grid.rows;
	private static int MIDDLER =Math.round((gGraphics.Grid.rows / 2)) * gGraphics.Grid.columns ;
	private static int MIDDLEC =Math.round((gGraphics.Grid.columns / 2));
	public static int MIDDLE = MIDDLER + MIDDLEC;
	// proxy
	public static int Up(int c) {
		try {
			return c - gGraphics.Grid.columns;
		 } catch (IndexOutOfBoundsException error) {
		 // Output expected IndexOutOfBoundsExceptions.
			return (Integer) null;
		 } 
	}
	public static int Down(int c) {
		try {
			return c + gGraphics.Grid.columns;
		 } catch (IndexOutOfBoundsException error) {
		 // Output expected IndexOutOfBoundsExceptions.
			return (Integer) null;
		 } 
	}
	public static int Right(int c) {
		try {
			return c + 1;
		 } catch (IndexOutOfBoundsException error) {
		 // Output expected IndexOutOfBoundsExceptions.
			return (Integer) null;
		 } 
	}
	public static int Left(int c) {
		try {
			return c - 1;
		 } catch (IndexOutOfBoundsException error) {
		 // Output expected IndexOutOfBoundsExceptions.
			return (Integer) null;
		 } 
	}
}