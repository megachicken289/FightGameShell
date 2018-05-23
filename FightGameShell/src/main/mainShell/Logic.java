package mainShell;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Frank Borges XPTHQ on 5/22/2018.
 */
public class Logic {
	private static Scanner input = new Scanner(System.in);
	
	protected static TreeMap<Integer,String> weaponArrayInit() {
		String[] weaponArray = {
				"melee", "pistol","shotgun","MSG","M1BA Assault Rifle",
				"energy Sword","rocket launcher","sniper","grenade",
				"battle rifle","TEH NOoB COMBO",
		};
		// TODO: PLANNED ENHANCEMENT grab size from db
		// populate weapons field
		
		TreeMap<Integer,String> weaponMap = convertToMap(weaponArray);
//		printPickType("weapon", weaponMap);
		
		return weaponMap;
	}
	
	protected static TreeMap<Integer,String> foeArrayInit() {
		String[] foeArray = {
				"grunt","elite","jackal","hunter","brute",
				"infection","infected human","infected elite",
				"infected brute", "infection bomb",
		};
		// TODO: PLANNED ENHANCEMENT grab size from db
		// populate foe field
		
		TreeMap<Integer,String> foeMap = convertToMap(foeArray);
//		printPickType("foe", foeMap);
		
		return foeMap;
	}
	
	protected static TreeMap<Integer,String> convertToMap(String[] array) {
		int arrLen = array.length;
		TreeMap<Integer,String> newMap = new TreeMap<Integer,String>();
//		newMap.put(0,"trash");
		for (int i = 1; i<arrLen; i++) {
			newMap.put(i,array[i]);
//			System.out.println(String.valueOf(array[i]));
		}
		
		return newMap;
	}
	
	protected static void printPickType(String pickType, TreeMap inMap) {
//		for (Map.Entry<Integer,String> entry : inMap.entrySet()) {
//			Integer key =  entry.getKey();
//			String value = entry.getValue();
//
//			System.out.println(key + " => " + value);
//		}
		
		System.out.println("+++" + pickType.toUpperCase() + "+++");
		Set set = inMap.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println("[" + me.getKey() + "]: " + me.getValue());
		}
	}
			
	@Deprecated // use printPickType
	private void printWeapons() {
	}
	
	@Deprecated // use printPickType
	private void printFoes() {
	}
	
	protected static String choosePick(String pickType, TreeMap inMap) {
		int thePick = -1;
	
		System.out.println("Pick a number between " + inMap.firstKey() + " and " +
				inMap.lastKey() + "that corresponds to the " + pickType + " you wish to choose: ");
		
		String pick = siftResults(inMap, input.nextInt());
		
		return pick;
	}
	
	private static String siftResults(TreeMap inMap, int pick) {
		return String.valueOf(inMap.get(pick));
	}
	
	@Deprecated
	private int weaponPick(Scanner input, int weaponArraySize) {
		System.out.println("Pick a number between " + Math.floor(weaponArraySize) +
				" and " + Math.ceil(weaponArraySize) + ": ");
		return input.nextInt();
	}
	
	@Deprecated
	private int foePick(Scanner input, int foeArraySize) {
		System.out.println("Pick a number between " + Math.floor(foeArraySize) +
				" and " + Math.ceil(foeArraySize) + ": ");
		return input.nextInt();
	}
	
	protected static void printChosenResults(String weapon, String foe){
		// TODO: PLANNED ENHANCMENT: merge together the pickTypes
		System.out.println("For a weapon, you picked: " + weapon);
		System.out.println("For a foe, you picked: " + foe);
	}
	
	private void weaponSwitch(int weaponPick) {
	
	}
	private void foePSwitch(int foePick) {
	
	}
	
	private void mathMath(int weaponPick, int foePick) {
	
	}
	
	protected static void intro() {
		System.out.printf("This is an unconstructed intro\n" +
				"please bear with us while we clean up this\n" +
				"mess. Thank you for your\n" +
				"cooperation!\n");
	}
	
	// switch
	// math
}
