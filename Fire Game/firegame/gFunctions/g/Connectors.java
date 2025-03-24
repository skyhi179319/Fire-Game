package gFunctions.g;


import gGraphics.Equipment;
import gGraphics.Grid;
/*
 * make sure code is within bounds for connections
 * 
 */
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
		// checks to see if player FH is connected to supply line
		public boolean connectedToSupply() {
			if(Grid.tiles.get(Bounds.Down(Bounds.MIDDLE)).getBackground() == Equipment.Equipment.get("Supply Hose")) {
				return true;
			}
			else {
				return false;
			}
		}
		// checks to see if attack is connected to FH
		public boolean connectedToFH() {
			if(Grid.tiles.get(Mapping.FH_Placement - 1).getBackground() == Equipment.Equipment.get("Attack Hose") ||
					Grid.tiles.get(Mapping.FH_Placement + 1).getBackground() == Equipment.Equipment.get("Attack Hose")||
					Grid.tiles.get(Mapping.FH_Placement + Grid.columns).getBackground() == Equipment.Equipment.get("Attack Hose")) {
				return true;
			}
			else {
				return false;
			}
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