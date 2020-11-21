package assignments.Methods_8;

public class Question_11 {

	public static void main(String[] args) {

		System.out.println(c_profit(100, 1500));
		System.out.println(c_profit(20, 20));
		System.out.println(c_profit(100, 10));

	}

	public static String c_profit(int buyPrice, int sellPrice) {
		if (buyPrice < sellPrice) {
			return "profit";
		} else if (buyPrice > sellPrice) {
			return "loss";
		}
		return "no loss";
		
		
	}

}
