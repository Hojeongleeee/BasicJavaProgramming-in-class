public class IntegerTest1 {
	public static void main(String args[]) {
		Integer num1 = new Integer(13);
		Integer num2 = 25;
		int hap = num1.intValue() + num2.intValue();
		System.out.println("num1이 포장하고 있는 정수는 : " + num1.intValue());
		System.out.println("num2가 포장하고 있는 정수는 : " + num2.intValue());
		System.out.println("두수의 합 = " + hap);
		System.out.println("합의 2진 표현 : " + Integer.toBinaryString(hap));
		System.out.println("합의 8진 표현 : " + Integer.toOctalString(hap));
		System.out.println("합의 16진 표현 : " + Integer.toHexString(hap));
		System.out.println("if(num1 == num2) 는 : " + num1.equals(num2));
		Integer num3 = new Integer("444");
		System.out.println("문자열 ‘444’의 값은 : " + num3.intValue());
	}
}