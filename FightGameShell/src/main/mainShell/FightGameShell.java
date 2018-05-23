package mainShell;

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
//		Scanner input = new Scanner(System.in);
		// call intro
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
