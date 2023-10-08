import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import gGraphics.*;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Grid
		Grid main = new Grid(25,25);
		gFunctions.g.Mapping map = new gFunctions.g.Mapping();
		// Bounds
		System.out.println(gFunctions.g.Bounds.TOP_LEFT);
		System.out.println(gFunctions.g.Bounds.TOP_RIGHT);
		System.out.println(gFunctions.g.Bounds.BOTTOM_LEFT);
		System.out.println(gFunctions.g.Bounds.BOTTOM_RIGHT);
		System.out.print(gFunctions.g.Bounds.MIDDLE);		// setting grid
		main.set();
		// mapping
		map.CreateMap();
		// set equipment
		Equipment.setEquipment();
		// main window
		JFrame frame = new JFrame();
		frame.setBounds(0, 0, 500, 600);
		frame.add(main,BorderLayout.CENTER);
		frame.show();
	}
}
