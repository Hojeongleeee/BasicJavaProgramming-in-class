import java.util.Arrays;
public class ArraysTest2 {
	static String array1[] = {"IMF", "제주도", "자바도사",
	"한글나라", "Computer", "모카", "JAVA", "인터넷탐색",
	"초롱초롱", "come", "바람", "스크립터", "군고구마", "도서",
	"their", "country" };
	public static void main(String args[]) {
		System.out.println("======= 정렬 전 데이터 ==========");
		System.out.println(Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("======= 정렬 후 데이터 ==========");
		System.out.println(Arrays.toString(array1));
	}
}