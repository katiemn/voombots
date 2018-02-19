package voombots;

public class Voombots {
	
	/*  Takes a String with the first line as the upper-right 
	 *  coordinates of the room, each bot then has two lines of input,
	 *  the first is the starting location and direction of the bot,
	 *  and the next is the bot's series of instructions,
	 *  Moves the bot according to the instructions and outputs
	 *  each bot's final location and direction
	 */
	
	public static String finalLocation (String input) {
		
		// Breaks up each line of input and puts it into an array
		String[] lines = input.split(System.getProperty("line.separator"));
		
		// Establishes upper-right coordinates of the room
		String first = lines[0];
		String[] coordinates = first.split(" ");
		int MAX_X = Integer.parseInt(coordinates[0]);
		int MAX_Y = Integer.parseInt(coordinates[1]);
		String result = "";
		
		// Loops through every bot's initial location and set of instructions
		for (int i = 2; i < lines.length; i = i + 2) {
			String s = lines[i-1];
			String in = lines[i];
			String start = s.trim();
			String instruction = in.trim();
			String[] startLocation = start.split(" ");
			int x = Integer.parseInt(startLocation[0]);
			int y = Integer.parseInt(startLocation[1]);
			char direction = startLocation[2].charAt(0);
			if (x > MAX_X || y > MAX_Y) {
				throw new IllegalArgumentException();
			}
			
			// Iterates through each instruction and moves bot accordingly
			for (int j = 0; j < instruction.length(); j++) {
				if (instruction.charAt(j) == 'L') {
					if (direction == 'N') {
						direction = 'W';
					} else if (direction == 'E') {
						direction = 'N';
					} else if (direction == 'S'){
						direction = 'E';
					} else {
						direction = 'S';
					}
				} else if (instruction.charAt(j) == 'R')  {
					if (direction == 'N') {
						direction = 'E';
					} else if (direction == 'E') {
						direction = 'S';
					} else if (direction == 'S'){
						direction = 'W';
					} else {
						direction = 'N';
					}
				} else {
					if (direction == 'N') {
						y++;
					} else if (direction == 'E') {
						x++;
					} else if (direction == 'S'){
						y--;
					} else {
						x--;
					}
				}
			}
			if (i == lines.length -1) {
				result += x + " " + y + " " + direction;
			} else {
				result += x + " " + y + " " + direction + "\n";
			}
		}
		return result; 
	}
}



