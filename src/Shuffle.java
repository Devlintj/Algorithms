import java.util.Arrays;

public class Shuffle {
	public static void main(String[] args){
		int[] deck = new int[]{1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(shuffleMethod(deck)));
	}
	
	public static int[] shuffleMethod(int[] deck) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < deck.length; j++) {
				int temp = (int)(Math.random() * deck.length);
				int temp2 = deck[temp];
				deck[temp] = deck[j];
				deck[j] = temp2;
			}
		}
		return deck;
	}
}
