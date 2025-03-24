package gFunctions.g;

import javax.swing.Timer;

import gGraphics.Colors;
import gGraphics.Equipment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class timer {
	public static void fireTimer(int sec) {
		 Timer fireT = new Timer(sec * 1000, new ActionListener(){
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	Rand fireRand = new Rand();
		    	int fireTitle = fireRand.tileNumber();
				gGraphics.Grid.tiles.get(fireTitle).setBackground(Colors.brown.brighter());
				gGraphics.Grid.tiles.get(fireTitle).addMouseListener(new MouseListener() {
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						if(gGraphics.Grid.tiles.get(Bounds.Up(fireTitle)).getBackground() 
								== Equipment.Equipment.get("Attack Hose") || 
								gGraphics.Grid.tiles.get(Bounds.Down(fireTitle)).getBackground() 
								== Equipment.Equipment.get("Attack Hose") || 
								gGraphics.Grid.tiles.get(Bounds.Right(fireTitle)).getBackground() 
										== Equipment.Equipment.get("Attack Hose") ||
										gGraphics.Grid.tiles.get(Bounds.Left(fireTitle)).getBackground() 
										== Equipment.Equipment.get("Attack Hose")) {
							gGraphics.Grid.tiles.get(fireTitle).setBackground(Colors.brown.darker());
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
				Mapping.Fires.add(fireTitle);
				System.out.println(Mapping.Fires);
		    }
		});
		fireT.start();
	}
}