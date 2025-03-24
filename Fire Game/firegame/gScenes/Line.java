package gScenes;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gFunctions.g.Connectors;
import gFunctions.g.Mapping;
import gGraphics.Button;
import gGraphics.Colors;
import gGraphics.Equipment;
import gGraphics.Grid;

public class Line extends JFrame{
	private void closeWindow() {
		this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
	}
	public Line(){
		Color supply = Equipment.Equipment.get("Supply Hose");
		Color attack =  Equipment.Equipment.get("Attack Hose");
		Connectors.Attack Attack = new Connectors.Attack();
		Connectors.Supply Supply = new Connectors.Supply();
		JButton supplyBTN = new Button(80, "Supply", true, Colors.Black, Colors.Black, new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
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
				closeWindow();
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
		JButton AttackBTN = new Button(80, "Attack", true, Colors.Black, Colors.Black, new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
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
				closeWindow();
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
		JButton SuppressBTN = new Button(80, "Suppress", true, Colors.Black, Colors.Black, new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
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
				closeWindow();
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
		super.setBounds(600, 300, 300, 300);
		JPanel p = new JPanel();
		p.add(AttackBTN);
		p.add(supplyBTN);
		p.add(SuppressBTN);
		super.add(p);
		super.show();
	}
}