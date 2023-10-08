package gGraphics.Tiles;

import java.awt.Color;

import gGraphics.Colors;

public class House {
	public static int PEOPLE;
	public static void buildHouse() {
		// cost for road;
		if(gFunctions.Money.hasEnough(5000) == true && gFunctions.House.ableToBuy() == true) {
			gFunctions.Money.Subtract(5000);
			if(Power.hasPowerSource()) {
				gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).updateBackground(Colors.purple);
				gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).setText("H");
				gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).setForeground(Colors.white);
			}
			else {
				gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).updateBackground(Colors.purple);
				gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).setText("H");
				gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).setForeground(Colors.white);
			}
			if(Water.hasWaterSource()) {
				gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).updateBackground(Colors.purple);
				gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).setText("H");
				gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).setForeground(Colors.white);
			}
			else {
				gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).updateBackground(Colors.purple);
				gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).setText("H");
				gGraphics.Grid.tiles.get(gGraphics.Grid.button_clicked).setForeground(Colors.white);
			}
			
		}
		else {
			
		}
		PEOPLE = PEOPLE + 6;
	}
}