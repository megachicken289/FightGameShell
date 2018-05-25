package mainShell;

import java.util.TreeMap;

import static mainShell.Logic.choosePick;
import static mainShell.Logic.foeArrayInit;
import static mainShell.Logic.foeArrayInit2;
import static mainShell.Logic.intro;
import static mainShell.Logic.printChosenResults;
import static mainShell.Logic.printPickType;
import static mainShell.Logic.weaponArrayInit;
import static mainShell.Logic.weaponArrayInit2;

/**
 * Created by Frank Borges XPTHQ on 5/23/2018.
 */
public class CallLogic {
	protected static void doMainWork() {
		TreeMap<String, String> pickMap = new TreeMap<String, String>();
		pickMap.put("weapon","");
		pickMap.put("foe","");
		
//		TreeMap<Integer,TreeMap<String,String>> pickMap = new TreeMap<Integer, TreeMap<String, String>>();
		
		
		intro();
		
		// call weaponArray => map
		// call foeArray => map
//		TreeMap weaponMap   = weaponArrayInit();
//		TreeMap foeMap      = foeArrayInit();
		
		TreeMap weaponMap   = weaponArrayInit2();
		TreeMap foeMap      = foeArrayInit2();
		
		// call printPickType
//		printPickType("weapon",weaponMap);
//		printPickType("foe",foeMap);
		
		
		// call choosePick => int
//		String weapon  = choosePick("weapon",weaponMap);
//		String foe     = choosePick("foe",foeMap);
		
		pickMap.put("weapon", choosePick("weapon",weaponMap));
		pickMap.put("foe", choosePick("foe",foeMap));
		
		// display chosen results
//		printChosenResults(weapon,foe);
		printChosenResults(pickMap);
		// call swtich
		// call results
	}
	
	private void initialize() {
	
	}
}
