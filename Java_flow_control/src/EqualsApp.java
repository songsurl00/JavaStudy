import java.text.ParseException;

public class EqualsApp {
	
	public static void main(String[] args) throws ParseException{
		
		String o1 = "java";
		String o2 = new String("java");
		
		System.out.println(o1 == o2); 	// false
		System.out.println(o1.equals(o2)); 	// true
		
		// 원시 데이터타입이 아닌 것은 == 가 아닌 .equals()로 비교할 것
	}
}
