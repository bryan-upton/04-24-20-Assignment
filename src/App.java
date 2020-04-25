
public class App {
	
	public static void main(String[] args) {
		System.out.println(true && false);
		System.out.println(true || true);
		System.out.println(false && false);
		
		System.out.println(true && (false || true));
		System.out.println(false || (true && false));
		System.out.println(false || 1 < 5);
		System.out.println(5 >= 4 && 1 > 3);
		System.out.println(12 >= 2 && 1 < 24);
		System.out.println("Hello".charAt(0) == 'h');
		
		boolean isHotOutside = true;
		boolean isWeekDay = true;
		boolean hasMoneyInPocket = false;
		double costOfMilk = 2.49;
		double moneyInWallet = 5;
		int thirstLevel = 7;
		
		boolean shouldBuyIcecream = isHotOutside == true && hasMoneyInPocket == true;
		System.out.println(shouldBuyIcecream);
		
		boolean willGoSwimming = isHotOutside == true && isWeekDay == false;
		System.out.println(willGoSwimming);	
		
		boolean isAGoodDay = isHotOutside == true && hasMoneyInPocket == true && isWeekDay == true;
		System.out.println(isAGoodDay);
		
		boolean willBuyMilk = isHotOutside == true && thirstLevel >= 3 && moneyInWallet >= costOfMilk*2;
		System.out.println(willBuyMilk);

	}
}