package gFunctions.g;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import gGraphics.Colors;
import gGraphics.Equipment;
import gGraphics.Grid;

public class Keyboard implements KeyListener{
	boolean colorBoolean(Color one, Color two) {
		if(one == two) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Connectors.Attack Attack = new Connectors.Attack();
		Connectors.Supply Supply = new Connectors.Supply();
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		if(Grid.button_clicked == Mapping.FH_Placement || Mapping.Fires.contains(Grid.button_clicked)) {
			if(Mapping.Fires.contains(Grid.button_clicked)) {
				if(key == KeyEvent.VK_C) {
					Grid.tiles.get(Grid.button_clicked).setBackground(Colors.gray);
					Mapping.Fires.remove(Grid.button_clicked);
				}
				if(key == KeyEvent.VK_W) {
					Grid.tiles.get(Grid.button_clicked).setBackground(Colors.brown.darker());
				}
			}
		}
		else {
			if(key == KeyEvent.VK_S) {
				if(gGraphics.Grid.tiles.get(Grid.button_clicked).getBackground() == 
						Equipment.Equipment.get("Supply Hose")) {
					Mapping.resetTile(Grid.button_clicked);
					Supply.subtract();
					System.out.println(Supply.getCount());
				}
				else {
					if(Supply.Connected(Grid.button_clicked) == true) {
						gGraphics.Grid.tiles.get(Grid.button_clicked).setBackground(Equipment.Equipment.get("Supply Hose"));
						Supply.add();
						System.out.println(Supply.getCount());
					}
					else {
						Mapping.resetTile(Grid.button_clicked);
					}
				}
			}
			if(key == KeyEvent.VK_A) {
				if(Attack.connectedToSupply()) {
					if(Attack.connectedToFH()){
						if(gGraphics.Grid.tiles.get(Grid.button_clicked).getBackground() == 
								Equipment.Equipment.get("Attack Hose")) {
							Mapping.resetTile(Grid.button_clicked);
							Attack.subtract();
							System.out.println(Attack.getCount());
						}
						else {
							if(Attack.Connected(Grid.button_clicked) == true) {
								gGraphics.Grid.tiles.get(Grid.button_clicked).setBackground(Equipment.Equipment.get("Attack Hose"));
								Attack.add();
								System.out.println(Attack.getCount());
							}
							else {
								Mapping.resetTile(Grid.button_clicked);
							}
						}
					}
					else {
						if(Attack.getCount() == 0) {
							if(Mapping.FH_Placement - 1 == Grid.button_clicked || Mapping.FH_Placement + 1 == Grid.button_clicked  || 
									Mapping.FH_Placement + Grid.columns == Grid.button_clicked ) {
								if(gGraphics.Grid.tiles.get(Grid.button_clicked).getBackground() == 
										Equipment.Equipment.get("Attack Hose")) {
									Mapping.resetTile(Grid.button_clicked);
									Attack.subtract();
									System.out.println(Attack.getCount());
								}
								else {
									if(Attack.Connected(Grid.button_clicked) == true) {
										gGraphics.Grid.tiles.get(Grid.button_clicked).setBackground(Equipment.Equipment.get("Attack Hose"));
										Attack.add();
										System.out.println(Attack.getCount());
									}
									else {
										Mapping.resetTile(Grid.button_clicked);
									}
								}
							}
						}
					}
				}
				else {
					
				}
			}
		}
		
		if(key == KeyEvent.VK_LEFT) {
			Grid.button_clicked = Grid.button_clicked - 1;
		}
		if(key == KeyEvent.VK_RIGHT) {
			Grid.button_clicked = Grid.button_clicked + 1;
		}
		if(key == KeyEvent.VK_DOWN) {
			Grid.button_clicked = Grid.button_clicked + Grid.columns;
		}
		if(key == KeyEvent.VK_UP) {
			Grid.button_clicked = Grid.button_clicked - Grid.columns;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

}