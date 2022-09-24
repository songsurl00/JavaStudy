import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstancdApp {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1111");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2222");
		p2.close();

	}

}
