package gGraphics.Tiles;

import java.awt.Color;

import gGraphics.Colors;

public class Farm {
	public static void buildFarm() {
		// cost for road;
		if(gFunctions.Money.hasEnough(2000) == true) {
			gFunctions.Money.Subtract(2000);
			gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).updateBackground(Colors.brown);
			gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).setText("F");
			gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).setForeground(Colors.white);
			gFunctions.Resources.Farm.addBuilding();
			gFunctions.Resources.Farm.start();
		}
		else {
			
		}
	}
}