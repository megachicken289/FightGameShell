import java.util.Scanner;

public class FightGameShell {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int weaponArraySize = 9;
		int foeArraySize    = 10;

		int[] weaponArray = new int[weaponArraySize];
		int[] foeArray    = new int[foeArraySize];


		System.out.println("Pick a number between " + Math.floor(weaponArraySize) + " and " + Math.ceil(weaponArraySize) + ": ");
		int weaponPick = input.nextInt();

		System.out.println("Pick a number between " + Math.floor(weaponArraySize) + " and " + Math.ceil(weaponArraySize) + ": ");
		int foePick = input.nextInt();
		
		// call swtich
		// call results
	}
	
	private int[] weaponArrayInit() {
		int[] weaponArray = new int[0];
		
		// grab size from db
		
		return weaponArray;
	}
	
	private int[] foeArrayInit() {
		int[] foeArray = new int[0];
		
		// grab size from db
		
		return foeArray;
	}
	
	private void weaponSwitch(int weaponPick) {
	
	}
	
	private void foePSwitch(int foePick) {
	
	}
	
	private void mathMath(int weaponPick, int foePick) {
	
	}
	
	private void intro() {
	
	}
	
	// switch
	// math
}
