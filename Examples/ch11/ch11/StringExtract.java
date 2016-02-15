public class StringExtract {
	public static void main(String args[]) {
		String a1 = "WorldCup Korea";
		System.out.println("추출된 문자 : " + a1.charAt(2));
		char buff[] = new char[3];
		a1.getChars(5,8,buff,0);
		System.out.println(buff);
	}
}