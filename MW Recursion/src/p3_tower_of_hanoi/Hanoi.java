package p3_tower_of_hanoi;

public class Hanoi {
	
	public Hanoi(int n) {
		moveDiscs(n, 1, 3, 2);
	}

	private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
		if(num > 0) {
			moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
			System.out.println("Move a disc from Peg " + fromPeg + " to Peg " + toPeg);
			moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
		}
	}
	
	
}
