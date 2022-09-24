class Accounting {
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	public double getVAT() {
		return  valueOfSupply * vatRate;
	}
	
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	public double getExpense() {
		return valueOfSupply * expenseRate;
	}
	
	public double getIncome() {
		return valueOfSupply - getExpense();
	}
	
	public double getDeviend1() {
		return getIncome() *0.5;
	}
	
	public double getDeviend2() {
		return getIncome() *0.3;
	}
	
	public double getDeviend3() {
		return getIncome() *0.2;
	}
	
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend 1 : " + getDeviend1());
		System.out.println("Dividend 2 : " + getDeviend2());
		System.out.println("Dividend 3 : " + getDeviend3());
	}
}
public class AccountingClassApp {
	
	public static void main(String[] args) {
		// instance
		Accounting account1 = new Accounting();
		account1.valueOfSupply = 10000.0;
		account1.vatRate = 0.1;
		account1.expenseRate = 0.3;
		account1.print();
		
		System.out.println("---------------------------------");
		
		Accounting account2 = new Accounting();
		account2.valueOfSupply = 50000.0;
		account2.vatRate = 0.05;
		account2.expenseRate = 0.2;
		account2.print();
	}

}
