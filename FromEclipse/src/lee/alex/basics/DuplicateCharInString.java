package lee.alex.basics;

public class DuplicateCharInString {

	public static void main(String[] args) {
	
		String sentence = "How many duplicates are there?";
		System.out.println(sentence);
//		System.out.println(sentence.charAt(0));
		String characters = "";
		String duplicates = "";
		
		for(int i=0; i<sentence.length(); i++) {
			String current = Character.toString(sentence.charAt(i));
			if(characters.contains(current)) {
				if(!duplicates.contains(current)) {
					duplicates += current + ",";
				}
			}
			characters += current;
		
		}
		System.out.println(duplicates);
		
	}
}
