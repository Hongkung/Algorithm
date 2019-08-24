package day2;


public class Method {
	public static void main(String[] args) {
		MyMathTest mm = new MyMathTest();
		long result1 = mm.add(5L,3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L,3L) = "+ result1);
		System.out.println("subreact(5L,3L) = "+ result2);
		System.out.println("multply(5L,3L) = "+ result3);
		System.out.println("divide(5L,3L) = "+ result4);

	}
}

class MyMathTest {
		long add(long a, long b) {
			return a+b;
		}
		long subtract(long a, long b) {return a-b;}
		long multiply(long a, long b) {return a*b;}
		double divide(double a, double b) { return a/b;		}

}
