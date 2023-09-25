
public class ViDu {
	public static void main(String[] args) {
		int out, in = 0;
		for (out = 0; out <10; out ++) {
			for (in = 0; in < 20; in ++)
				if (in>10) break;
			System.out.println("Inside of out: out = "+out +"in =" +in);
		}
		
	}
}
