import java.util.*;
public class ArraysTest1 {
	public static void main(String[] args) {
		int[] int1 = {0,1,2,3,4,5,6,7,8,9};
		System.out.println("�ʱ�迭 : " + Arrays.toString(int1));
		Arrays.fill(int1, 3, 5, 33);
		System.out.println("fill() ���� �� : " + Arrays.toString(int1));
		Arrays.sort(int1);
		System.out.println("sort() ���� �� : " + Arrays.toString(int1));
		System.out.println("33�� �迭�� " + Arrays.binarySearch(int1,33) + "��° ���");
		int[] int2 = {5,4,3,2,1};
		System.out.println("�� ��° �迭 : " + Arrays.toString(int2));
		System.out.println("�� ���� �迭�� ������? " + Arrays.equals(int1, int2));
	}
}