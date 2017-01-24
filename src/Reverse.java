import java.util.Arrays;


public class Reverse {
	public static void main(String[] args){
		int[] deck = new int[]{1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(reverseMethod(deck)));
	}
	
	public static int[] reverseMethod(int[] deck) {
		int end = deck.length - 1;
		for(int i = 0; i < end; i++) {
			int temp = deck[i];
			deck[i] = deck[end];
			deck[end] = temp;
			end--;
		}
		return deck;
	}
}
