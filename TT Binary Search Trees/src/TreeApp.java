
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TreeApp {

	public static void main(String[] args) throws IOException {
		int value;
		Tree theTree = new Tree();
		
		theTree.insert(1, 1.5);
		theTree.insert(2, 1.2);
		theTree.insert(3, 1.7);
		theTree.insert(4, 1.5);
		theTree.insert(5, 1.2);
		theTree.insert(6, 1.7);
		theTree.insert(7, 1.7);
		theTree.insert(8, 1.5);
		theTree.insert(9, 1.7);
		theTree.insert(10, 1.5);
		theTree.insert(11, 1.5);
		
		while (true) {
			System.out.print("Enter first letter of show, ");
			System.out.print("insert, find, delete, or traverse: ");
			int choice = getChar();
			switch (choice) {
			case 's':
				theTree.displayTree();
				break;
			case 'i':
				System.out.print("Enter value to insert: ");
				value = getInt();
				theTree.insert(value, value + 0.9);
				break;
			case 'f':
				System.out.print("Enter value to find: ");
				value = getInt();
				Node found = theTree.find(value);
				if(found != null) {
					System.out.print("found: ");
					found.displayNode();
					System.out.println("\n");
				} else {
					System.out.print("Could not find ");
					System.out.print(value + '\n');
				}
				break;
			case 'd':
				System.out.print("Enter value to delete: ");
				value = getInt();
				boolean didDelete = theTree.delete(value);
				if(didDelete) {
					System.out.print("Deleted " + value + "\n");
				} else {
					System.out.print("Could not delete ");
					System.out.print(value + '\n');
				}
				break;
			case 't':
				System.out.print("Enter type 1, 2 or 3: ");
				value = getInt();
				theTree.traverse(value);
				break;
			default:
				System.out.print("Invalid entry.\n");
			} // end switch
		}	// end while
	}	// end main()
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}
	
	public static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}
}
