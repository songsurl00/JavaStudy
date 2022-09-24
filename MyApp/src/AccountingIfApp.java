
public class AccountingIfApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		double dividend1;
		double devidend2;
		double devidend3;
		if(income > 10000.0 ) {
			dividend1 = income * 0.5;
			devidend2 = income * 0.3;
			devidend3 = income * 0.2;
		} else {
			dividend1 = income * 1;
			devidend2 = income * 0;
			devidend3 = income * 0;
		}
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Dividend 1 : " +dividend1);
		System.out.println("Dividend 2 : " +devidend2);
		System.out.println("Dividend 3 : " +devidend3);

	}

}
