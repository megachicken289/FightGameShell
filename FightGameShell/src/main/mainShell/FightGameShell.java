package mainShell;

import mainShell.Logic;

import java.util.Scanner;
import java.util.TreeMap;

import static mainShell.Logic.*;

public class FightGameShell {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//
//		int weaponArraySize = 9;
//		int foeArraySize    = 10;
//
//		int[] weaponArray = new int[weaponArraySize];
//		int[] foeArray    = new int[foeArraySize];
//
//
//		int weaponPick = weaponPick(input);
//		int foePick = foePick(input);
		
		// call intro
		// call weaponArray => map
		// call foeArray => map
		// call printPickType
		
		// call choosePick => int
		
		// call swtich
		// call results
		Scanner input = new Scanner(System.in);
		
		// call intro
		intro();
		
		// call weaponArray => map
		TreeMap weaponMap = weaponArrayInit();
		
		// call foeArray => map
		TreeMap foeMap = foeArrayInit();
		
		// call printPickType
		printPickType("weapon",weaponMap);
		printPickType("foe",foeMap);
		
		// call choosePick => int
		choosePick(input,"weapon",weaponMap);
		choosePick(input,"foe",foeMap);
		
		// call swtich
		// call results
	}
	
	private void initialize() {
	
	}
}
