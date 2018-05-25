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
	private TreeMap<Integer,TreeMap<String,String>> weaponsMap  = new TreeMap<Integer, TreeMap<String, String>>();
	private TreeMap<Integer,TreeMap<String,String>> foesMap     = new TreeMap<Integer, TreeMap<String, String>>();
	
	private static Scanner input = new Scanner(System.in);
	
	@Deprecated
	protected static TreeMap<Integer,String> weaponArrayInit() {
		String[] weaponArray = {
				"melee", "pistol","shotgun","MSG",
				"M1BA Assault Rifle","energy Sword",
				"rocket launcher","sniper","grenade",
				"battle rifle","TEH NOoB COMBO",
				"plasma pistol", "plasma rifle",
		};
		// TODO: PLANNED ENHANCEMENT grab size from db
		// populate weapons field
		
		return convertToMap(weaponArray);
	}
	
	@Deprecated
	protected static TreeMap<Integer,String> foeArrayInit() {
		String[] foeArray = {
				"grunt","elite","jackal","hunter","brute",
				"infection","infected human","infected elite",
				"infected brute", "infection bomb",
		};
		// TODO: PLANNED ENHANCEMENT grab size from db
		// populate foe field
		
		return convertToMap(foeArray);
	}
	
	// TODO: integrate to make -> [1,(weaponVal,desc)]
	protected static TreeMap<Integer,TreeMap<String,String>> weaponArrayInit2() {
		String[][] weaponArray = {
				{"melee","beat the man with meat paws"},
				{"pistol","overpowered pos"},
				{"shotgun","best flood deterance"},
				{"msg","for when aiming isn't important"},
				{"M1BA assault rifle","for when you need to aim, but you also need a compass"},
				{"energy sword","because playing fair isn't important"},
				{"rocket launcher","because blowing shit up is fun"},
				{"sniper","for when you want to camp"},
				{"grenade","because explosions are fun, but you're also cold"},
				{"battle rifle","for when you need to aim really well"},
				{"plasma pistol","sometimes you paintball, sometimes you alien"},
				{"plasma rifle","when you always paintball"},
				{"TEH nOoB cOMbO","for when you a cheeter"},
		};
		
		TreeMap<String,String> pickDesc = convertToMapStringString(weaponArray);
		
		return giveKeyToPicDesc(pickDesc);
	}
	
	protected static TreeMap<Integer,TreeMap<String,String>> foeArrayInit2() {
		String[][] foeArray = {
				{"grunt","grunt1"},
				{"jackal","jackal1"},
				{"elite","elite1"},
				{"hunter","hunter1"},
				{"brute","brute1"},
				{"infection","infection1"},
				{"infected human","infected human1"},
				{"infected elite","infected elite1"},
				{"infected brute","infected brute1"},
				{"infection bomb","infection bomb1"},
//				{"",""},
		};
		
		TreeMap<String,String> pickDesc = convertToMapStringString(foeArray);
		
		return giveKeyToPicDesc(pickDesc);
	}
	
	// TODO
	protected static TreeMap<String,String> mergePickAndDesc(String[][] inArray) {
		TreeMap<String,String> dummy = new TreeMap<String, String>();
		
		convertToMapStringString(inArray);
		
		return dummy;
	}
	
	// TODO: Factory where [1,(weaponVal,desc)] for weaponArrayInit2 method
	protected static TreeMap<Integer,TreeMap<String,String>> giveKeyToPicDesc(TreeMap<String,String> inMap) {
		TreeMap<Integer,TreeMap<String,String>> newMap = new TreeMap<Integer, TreeMap<String, String>>();
		
		int mapSize = inMap.size();
		for (int i = 0; i<mapSize; i++) {
			newMap.put(i,inMap);
		}
		
		return newMap;
	}
	
	protected static TreeMap<Integer,String> convertToMap(String[] inArray) {
		int arrLen = inArray.length;
		TreeMap<Integer,String> newMap = new TreeMap<Integer,String>();
		for (int i = 0; i<arrLen; i++) {
			newMap.put(i, inArray[i]);
//			System.out.println(String.valueOf(array[i]));   // keep for debug
		}
		
		return newMap;
	}
	
	protected static TreeMap<String,String> convertToMapStringString(String[][] inArray) {
		int arrLenW = inArray.length;
		int arrLenL = inArray[0].length;
		TreeMap<String, String> newMap = new TreeMap<String, String>();
		int i = 0;
		while (i < arrLenW) {
			for (i=0; i < arrLenW; i++) {
			newMap.put(inArray[i][0], inArray[i][1]);
			System.out.println("[" + i + "]" + inArray[i][0] + " | " + inArray[i][1]);
//			System.out.println(String.valueOf(array[i]));   // keep for debug
		}
	}
		
		return newMap;
	}
	
//	@Deprecated
//	protected static void printPickType(String pickType, TreeMap inMap) {
////		for (Map.Entry<Integer,String> entry : inMap.entrySet()) {
////			Integer key =  entry.getKey();
////			String value = entry.getValue();
////
////			System.out.println(key + " => " + value);
////		}
//
//		System.out.println("+++" + pickType.toUpperCase() + "+++");
//		Set set = inMap.entrySet();
//		Iterator itr = set.iterator();
//		while (itr.hasNext()) {
//			Map.Entry me = (Map.Entry)itr.next();
//			String outputKey = "[" + me.getKey() + "] | ";
//			String outputValue = String.valueOf(me.getValue());
//			int outputTotalLength = outputKey.length() + outputValue.length();
//
//			System.out.println(outputKey + outputValue);
//			for (int i = 0; i < outputTotalLength; i++) {
//				System.out.printf("=");
//			}
//			System.out.println();
//		}
//		System.out.println();
//	}
	
	protected static void printPickType(TreeMap<Integer,TreeMap<String,String>> inMap) {
//		for (Map.Entry<Integer,String> entry : inMap.entrySet()) {
//			Integer key =  entry.getKey();
//			String value = entry.getValue();
//
//			System.out.println(key + " => " + value);
//		}
		
		Set set = inMap.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println("+++" + me.getValue() + "+++");
			String outputKey = "[" + me.getKey() + "] | ";
			String outputValue = String.valueOf(me.getValue());
			int outputTotalLength = outputKey.length() + outputValue.length();
			
			System.out.println(outputKey + outputValue);
			for (int i = 0; i < outputTotalLength; i++) {
				System.out.printf("=");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	protected static String choosePick(String pickType, TreeMap inMap) {
		System.out.println("Pick a number between " + inMap.firstKey() + " and " +
				inMap.lastKey() + " that corresponds to the " + pickType + " you wish to choose: ");
		
		return siftResults(inMap, input.nextInt());
	}
	
	private static String siftResults(TreeMap inMap, int pick) {
		return String.valueOf(inMap.get(pick));
	}
	
	protected static void printChosenResults(TreeMap<String,String> pickTypeMap) {
		for (Map.Entry<String,String> entry : pickTypeMap.entrySet()) {
			System.out.println("For a " + entry.getKey() + ", you picked: " +
			entry.getValue());
		}
	}
	
	@Deprecated
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
	
	private static void patchPickAndDesc(TreeMap<Integer,String> pick,
	                                     TreeMap<String,String> pickDesc) {
				
	}
	
	protected static void intro() {
		System.out.printf("This is an unconstructed intro\n" +
				"please bear with us while we clean up this\n" +
				"mess. Thank you for your\n" +
				"cooperation!\n");
	}
	
	// TODO: Main Menu
	protected static void menu() {
		// this menu shows up after intro
		// allows user to choose options
		// Options:
		//  1) play
		//  2) configure
		//  ...
		//  n) exit
	}
	
	// switch
	// math
}
