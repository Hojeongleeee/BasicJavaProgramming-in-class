public class ConvertStringTest {
	public static void main(String args[]) {
		int a = 2002 ;
		char b[] = {'W','o','r','l','d','c','u','p'};
		System.out.println(String.valueOf(a) + " " + String.valueOf(b) + " in Korea");
		String s1 = String.valueOf(b);
		System.out.println(String.valueOf(a) + " " + s1.toUpperCase() + " in Korea");
		System.out.println(String.valueOf(a) + " " + String.valueOf(b).toUpperCase() + " in Korea");
	}
}