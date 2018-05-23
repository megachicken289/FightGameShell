package mainShell;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Frank Borges XPTHQ on 5/22/2018.
 */
public class Logic {
	
	
	protected static TreeMap<Integer,String> weaponArrayInit() {
		String[] weaponArray = {
				"melee", "pistol","shotgun","MSG","M1BA Assault Rifle",
				"energy Sword","rocket launcher","sniper","grenade",
				"battle rifle","TEH NOoB COMBO",
		};
		// TODO: PLANNED ENHANCEMENT grab size from db
		// populate weapons field
		
		TreeMap weaponMap = convertToMap(weaponArray);
		
		
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
		
		TreeMap foeMap = convertToMap(foeArray);
		
		return foeMap;
	}
	
	protected static TreeMap<Integer,String> convertToMap(String[] array) {
		int arrLen = array.length;
		TreeMap newMap = new TreeMap();
		for (int i = 0; i>arrLen; i++) {
			newMap.put(i,array[i]);
			System.out.println(newMap);
		}
		
		return newMap;
	}
	
	protected static void printPickType(String pickType, TreeMap inMap) {
	
	}
	
	@Deprecated // use printPickType
	private void printWeapons() {
	
	}
	
	@Deprecated // use printPickType
	private void printFoes() {
	
	}
	
	protected static int choosePick(Scanner input, String pickType, TreeMap inMap) {
		int thePick = -1;
		
		System.out.println("Pick a number between " + inMap.firstKey() +
				" and " + inMap.lastKey() + ": ");
		
		return thePick;
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
				"cooperation!");
	}
	
	// switch
	// math
}
