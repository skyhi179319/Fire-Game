package gGraphics;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

import gFunctions.g.Bounds;
import gGraphics.Tiles.Tile;
import gScenes.Line;

public class Grid extends JPanel{
	// inti vars
	private static int r;
	private static int c;
	public static int columns;
	public static int rows;
	// cells
	public static ArrayList<Tile> tiles = new ArrayList<Tile>();
	// constructor
	public Grid(int col, int row) {
		r = row;
		c = col;
		columns = c;
		rows = r;
	}
	// the number of the button clicked
	public static int button_clicked;
	// setting grid
	public void set() {
		super.setLayout(new GridLayout(r,c));
		for (int i = 0; i < r*c; i++) {
			Tile j = new Tile();
			j.setName(String.valueOf(i));
			j.setBackground(Colors.gray);
			// comment out once figuring out number;
			//j.setText(String.valueOf(i));
			tiles.add(j);
			// sets button clicked
			j.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					button_clicked = Integer.parseInt(j.getName());
					System.out.println(button_clicked);
				}
				
			});
			// keyboard functions
			j.addKeyListener(new gFunctions.g.Keyboard());
			j.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					if(button_clicked == Bounds.MIDDLE) {
						
					}
					else {
						new Line();
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
			super.add(j);
		}
	}
}