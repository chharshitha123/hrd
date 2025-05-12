@FunctionalInterface
interface MathOperation{
	int operate(int a, int b);
}
public class Lambda {

	public static void main(String[] args) {
		MathOperation add=(a,b)->a+b;
		MathOperation subtract=(a,b)->a-b;
		MathOperation multiply=(a,b)->a*b;
		MathOperation divide=(a,b)->b!=0?a/b:0;
		System.out.println("add:"+add.operate(10, 5));
		System.out.println("sub:"+subtract.operate(10, 5));
		System.out.println("mul:"+multiply.operate(10, 5));
		System.out.println("div:"+divide.operate(10, 5));
		
		

	}

}
