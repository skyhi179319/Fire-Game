package gGraphics.Tiles;

import gGraphics.Colors;

public class Casino {
	public static void buildCasino() {
		// cost for road;
		if(gFunctions.Money.hasEnough(5000) == true) {
			gFunctions.Money.Subtract(5000);
			gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).updateBackground(Colors.gold);
			gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).setText("C");
			gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).setForeground(Colors.white);
			gFunctions.Resources.Casino.addCasino();
			gFunctions.Resources.Casino.start();
		}
		else {
			
		}
	}
}