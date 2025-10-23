package p2_apps;

public class DemoTowerOfHanoi {

	public static void main(String[] args) {
		moveDiscs(5, 1, 3, 2);
	}
	
	public static void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
		if(num > 0) {
			moveDiscs(num-1, fromPeg, tempPeg, toPeg);
			System.out.println("Move a disc from peg " + fromPeg + " to peg " + toPeg );
			moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
		}
	}

}
