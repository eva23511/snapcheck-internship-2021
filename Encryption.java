public class Encryption {

	public static void main(String[] args) {
		System.out.println(encrypt("if man was meant to stay on the ground god would have given us roots"));
		System.out.println(encrypt("haveaniceday")); // sample output 0
		System.out.println(encrypt("feedthedog")); // sample output 1
		System.out.println(encrypt("chillout")); // sample output 2
	}
	
	public static String encrypt(String input) {
		input = input.replaceAll("\\s", "");
		
		if (input.length() == 0) {
			return input;
		}
		
		double L = input.length();
		int row = (int)Math.floor(Math.sqrt(L));
		int col = (int)Math.ceil(Math.sqrt(L));
		
		if (row * col < L) {
			row = col;
		}
		
		StringBuilder res = new StringBuilder();
		
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				if (j * col + i >= input.length()) {
					continue;
				}
				res.append(input.charAt(j * col + i));
			}
			res.append(" ");
		}
		
		return res.toString();
	}

}
