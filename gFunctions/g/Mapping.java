package gFunctions.g;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashSet;

import gGraphics.Colors;
import gGraphics.Equipment;

public class Mapping {
	public static int fire1;
	public static int fire2;
	public static int fire3;
	public static HashSet<Integer> Fires = new HashSet<Integer>(); 
	public static int FH_Placement = Bounds.MIDDLE + gGraphics.Grid.columns * 2;
	public static void resetTile(int tile) {
		gGraphics.Grid.tiles.get(tile).setBackground(Colors.gray);
	}
	public static void CreateMap() {
		// Player
		gGraphics.Grid.tiles.get(Bounds.MIDDLE).setBackground(Colors.brightgreen);
		// delete
		gGraphics.Grid.tiles.get(Bounds.MIDDLE).addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//new gScenes.Player();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		// Selects Player from start
		gGraphics.Grid.tiles.get(Bounds.MIDDLE).doClick();
		// fire hydrant 
		if(FH_Placement > gGraphics.Grid.columns * gGraphics.Grid.rows) {
			
		}
		else {
			gGraphics.Grid.tiles.get(FH_Placement).setBackground(Colors.red.darker());
		}
		// Fires
		Rand fire1Result = new Rand();
		Rand fire2Result = new Rand();
		Rand fire3Result = new Rand();
		System.out.println("\n");
		fire1 = fire1Result.tileNumber();
		fire2 = fire2Result.tileNumber();
		fire3 = fire3Result.tileNumber();
		System.out.println("Fire 1: " + fire1);
		System.out.println("Fire 2: " + fire2);
		System.out.println("Fire 3: " + fire3);
		Fires.add(fire1);
		Fires.add(fire2);
		Fires.add(fire3);
		System.out.println(Fires);
		// Fire 1
		gGraphics.Grid.tiles.get(fire1).setBackground(Colors.brown.brighter());
		gGraphics.Grid.tiles.get(fire1).addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(gGraphics.Grid.tiles.get(Bounds.Up(fire1)).getBackground() 
						== Equipment.Equipment.get("Attack Hose") || 
						gGraphics.Grid.tiles.get(Bounds.Down(fire1)).getBackground() 
						== Equipment.Equipment.get("Attack Hose") || 
						gGraphics.Grid.tiles.get(Bounds.Right(fire1)).getBackground() 
								== Equipment.Equipment.get("Attack Hose") ||
								gGraphics.Grid.tiles.get(Bounds.Left(fire1)).getBackground() 
								== Equipment.Equipment.get("Attack Hose")) {
					gGraphics.Grid.tiles.get(fire1).setBackground(Colors.brown.darker());
				}
				else {
					
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		// Fire 2
		gGraphics.Grid.tiles.get(fire2).setBackground(Colors.brown.brighter());
		gGraphics.Grid.tiles.get(fire2).addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(gGraphics.Grid.tiles.get(Bounds.Up(fire2)).getBackground() 
						== Equipment.Equipment.get("Attack Hose") || 
						gGraphics.Grid.tiles.get(Bounds.Down(fire2)).getBackground() 
						== Equipment.Equipment.get("Attack Hose") || 
						gGraphics.Grid.tiles.get(Bounds.Right(fire2)).getBackground() 
								== Equipment.Equipment.get("Attack Hose") ||
								gGraphics.Grid.tiles.get(Bounds.Left(fire2)).getBackground() 
								== Equipment.Equipment.get("Attack Hose")) {
					gGraphics.Grid.tiles.get(fire2).setBackground(Colors.brown.darker());
				}
				else {
					
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		// Fire 3
		gGraphics.Grid.tiles.get(fire3).setBackground(Colors.brown.brighter());
		gGraphics.Grid.tiles.get(fire3).addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(gGraphics.Grid.tiles.get(Bounds.Up(fire3)).getBackground() 
						== Equipment.Equipment.get("Attack Hose") || 
						gGraphics.Grid.tiles.get(Bounds.Down(fire3)).getBackground() 
						== Equipment.Equipment.get("Attack Hose") || 
						gGraphics.Grid.tiles.get(Bounds.Right(fire3)).getBackground() 
								== Equipment.Equipment.get("Attack Hose") ||
								gGraphics.Grid.tiles.get(Bounds.Left(fire3)).getBackground() 
								== Equipment.Equipment.get("Attack Hose")) {
					gGraphics.Grid.tiles.get(fire3).setBackground(Colors.brown.darker());
				}
				else {
					
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		timer.fireTimer(30);
	}
}