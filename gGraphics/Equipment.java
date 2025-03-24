package gGraphics;

import java.util.HashMap;
import java.awt.Color;

public class Equipment {
	public static HashMap<String, Color> Equipment = new HashMap<String, Color>();
	public static void setEquipment() {
		Equipment.put("Supply Hose", Colors.darkgoldenrod);
		Equipment.put("Attack Hose", Colors.yellow);
	}
}