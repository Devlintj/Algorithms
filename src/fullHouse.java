import java.util.Arrays;


public class fullHouse {
	public static void main(String[] args) {
		int[] deck = new int[]{4, 4, 6, 1, 1, 3, 3, 2, 3, 3, 5, 5, 5, 6};
		System.out.println(fullHouseMethod(deck));
	}
	
	public static boolean fullHouseMethod(int[] deck) {
		int oneCardType = 0;
		int twoCardType = 0;
		int oneCardCount = 0;
		int twoCardCount = 0;
		for(int i = 0; i < deck.length; i++) {
			if(i == 0 || oneCardType == deck[i]) {
				oneCardType = deck[i];
				oneCardCount++;
			} else if (oneCardCount == 2) {
				twoCardType = deck[i];
			} else {
				oneCardCount = 0;
				oneCardType = deck[i];
				oneCardCount++;
			}
			if(twoCardType == deck[i]) {
				twoCardCount++;
			} else {
				twoCardCount = 0;
			}
			if(twoCardCount == 3) {
				return true;
			}
			System.out.println(oneCardType + "  " + oneCardCount + "  " + twoCardType + "  " + twoCardCount);
		}
		return false;
	}
}
