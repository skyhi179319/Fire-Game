package gFunctions.g;


import gGraphics.Grid;

public class Connectors {
	public static class Supply{
		private static int count = 0;
		public static void add() {
			int new_count = count + 1;
			count = new_count;
		}
		public static void subtract() {
			int new_count = count - 1;
			count = new_count;
		}
		public static int getCount() {
			return count;
		}
		public static boolean Connected(int i) {
			if(Grid.tiles.get(i).getBackground() != Grid.tiles.get(Bounds.Up(i)).getBackground() ||
					Grid.tiles.get(i).getBackground() != Grid.tiles.get(Bounds.Down(i)).getBackground() || 
					Grid.tiles.get(i).getBackground() != Grid.tiles.get(Bounds.Right(i)).getBackground() ||
					Grid.tiles.get(i).getBackground() != Grid.tiles.get(Bounds.Left(i)).getBackground()){
				return true;
			}
			else if(count == 0) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	public static class Attack{
		private static int count = 0;
		public static void add() {
			int new_count = count + 1;
			count = new_count;
		}
		public static void subtract() {
			int new_count = count - 1;
			count = new_count;
		}
		public static int getCount() {
			return count;
		}
		public static boolean Connected(int i) {
			if(Grid.tiles.get(i).getBackground() != Grid.tiles.get(Bounds.Up(i)).getBackground() ||
					Grid.tiles.get(i).getBackground() != Grid.tiles.get(Bounds.Down(i)).getBackground() || 
					Grid.tiles.get(i).getBackground() != Grid.tiles.get(Bounds.Right(i)).getBackground() ||
					Grid.tiles.get(i).getBackground() != Grid.tiles.get(Bounds.Left(i)).getBackground()){
				return true;
			}
			else if(count == 0) {
				return true;
			}
			else {
				return false;
			}
		}
	}
}