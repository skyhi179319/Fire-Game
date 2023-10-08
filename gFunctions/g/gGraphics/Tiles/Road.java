package gGraphics.Tiles;

import java.awt.Color;
import java.util.ArrayList;

import gGraphics.Colors;


public class Road {
	public static ArrayList<Integer> roads = new ArrayList<Integer>();
	// not this function
	public static boolean hasRoad() {
		if(roads.contains(gGraphics.Grid.button_clicked)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void buildRoadPiece() {
		// cost for road;
		if(gFunctions.Money.hasEnough(100) == true) {
			gFunctions.Money.Subtract(100);
			roads.add(gGraphics.Grid.button_clicked);
			gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).updateBackground(Color.BLACK,Color.YELLOW);
			gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).setText("R");
			gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).setForeground(Colors.white);
		}
		else {
			
		}
	}
}