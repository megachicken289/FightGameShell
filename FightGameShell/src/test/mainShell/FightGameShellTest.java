package mainShell;

import org.junit.Test;

import java.util.Scanner;
import java.util.TreeMap;

import static mainShell.Logic.choosePick;
import static mainShell.Logic.foeArrayInit;
import static mainShell.Logic.intro;
import static mainShell.Logic.printPickType;
import static mainShell.Logic.weaponArrayInit;

/**
 * Created by Frank Borges XPTHQ on 5/22/2018.
 */
public class FightGameShellTest {
	
	@Test
	public void pretendMain() {
		Scanner input = new Scanner(System.in);
		
		// call intro
		intro();
		
		// call weaponArray => map
		TreeMap weaponMap = weaponArrayInit();
		
		// call foeArray => map
		TreeMap foeMap = foeArrayInit();
		
		// call printPickType
//		printPickType("weapon",weaponMap);
//		printPickType("foe",foeMap);
		
		
		// call choosePick => int
		choosePick("weapon",weaponMap);
		choosePick("foe",foeMap);
		
		// call swtich
		// call results
	}
	
	/*
	private TreeMap<Integer,String> dummyArray() {
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
	
	public void convertToMapTest() {
		String[] dummyArray = {
				"melee", "pistol","shotgun","MSG","M1BA Assault Rifle",
				"energy Sword","rocket launcher","sniper","grenade",
				"battle rifle","TEH NOoB COMBO",
		};
		
		Map dummyMap = convertToMap(dummyArray);
	}
	*/
}
