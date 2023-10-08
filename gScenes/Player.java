package gScenes;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gFunctions.g.Mapping;
import gGraphics.Button;
import gGraphics.Colors;
import gGraphics.Equipment;
import gGraphics.Grid;

public class Player extends JFrame{
	public Player(){
		Color supply = Equipment.Equipment.get("Supply Hose");
		Color attack =  Equipment.Equipment.get("Attack Hose");
		JButton supplyBTN = new Button(80, "Supply", true, Colors.Black, Colors.Black, new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(gGraphics.Grid.tiles.get(Grid.button_clicked).getBackground() == supply) {
					Mapping.resetTile(Grid.button_clicked);
				}
				else {
					gGraphics.Grid.tiles.get(Grid.button_clicked).setBackground(supply);
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
		JButton AttackBTN = new Button(80, "Attack", true, Colors.Black, Colors.Black, new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(gGraphics.Grid.tiles.get(Grid.button_clicked).getBackground() == attack) {
					Mapping.resetTile(Grid.button_clicked);
				}
				else {
					gGraphics.Grid.tiles.get(Grid.button_clicked).setBackground(attack);
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
		super.setBounds(600, 300, 300, 300);
		JPanel p = new JPanel();
		p.add(AttackBTN);
		p.add(supplyBTN);
		super.add(p);
		super.show();
	}
}