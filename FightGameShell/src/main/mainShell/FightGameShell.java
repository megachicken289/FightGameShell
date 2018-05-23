package mainShell;
4
import java.util.TreeMap;

import static mainShell.Logic.*;

public class FightGameShell {
	public static void main(String[] args) {
		intro();
		
		// call weaponArray => map
		//		// call foeArray => map
		TreeMap weaponMap   = weaponArrayInit();
		TreeMap foeMap      = foeArrayInit();
		
		// call printPickType
		printPickType("weapon",weaponMap);
		printPickType("foe",foeMap);
		
		// call choosePick => int
		String weapon  = choosePick("weapon",weaponMap);
		String foe     = choosePick("foe",foeMap);
		
		// display chosen results
		printChosenResults(weapon,foe);
		
		// call swtich
		// call results
	}
	
	private void initialize() {
	
	}
}
