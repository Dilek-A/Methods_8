package assignments.Methods_8;

public class Question_13 {

	public static void main(String[] args) {

		double a = waterTax(55);
		System.out.println(a);

	}

	public static double waterTax(double units) {
		double bill;
		if (units <= 50) {
			bill = units * 0.60;
			return bill;
		} else if (units > 50) {
			if (units >= 100) {
				if (units >= 150) {
					bill = 100 + (units * 0.90);
					return bill;
				} else {
					bill = (units * 0.90) + 50;
					return bill;
				}
			} else {
				bill = units * 0.90;
				return bill;
			}
		}
		return 0;
	}

}
