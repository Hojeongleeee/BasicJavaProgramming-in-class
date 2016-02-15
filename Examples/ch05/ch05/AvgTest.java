class Avg {
	String name;
	int avg;
	public String average(int kor, int eng)
	{
		avg = (kor+eng)/2;
		return name+avg;
	}
}

public class AvgTest {
	public static void main(String[] args) {
		Avg student1 = new Avg();
		Avg student2 = new Avg();
		student1.name = "±èÃ¶¼ö";
		student2.name = "±è¿µÈñ";
		String st1_avg = student1.average(70,80);
		String st2_avg = student2.average(80,90);
		System.out.println(st1_avg);
		System.out.println(st2_avg);
	}
}