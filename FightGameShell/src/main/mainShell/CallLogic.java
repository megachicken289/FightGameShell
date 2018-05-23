package mainShell;

import java.util.TreeMap;

import static mainShell.Logic.choosePick;
import static mainShell.Logic.foeArrayInit;
import static mainShell.Logic.intro;
import static mainShell.Logic.printChosenResults;
import static mainShell.Logic.printPickType;
import static mainShell.Logic.weaponArrayInit;

/**
 * Created by Frank Borges XPTHQ on 5/23/2018.
 */
public class CallLogic {
	protected static void doMainWork() {
		TreeMap<String, String> pickMap = new TreeMap<String, String>();
		pickMap.put("weapon","");
		pickMap.put("foe","");
		
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
