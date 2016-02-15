class Avg1 {
	String name;
	int avg;
	public String average(int kor, int eng)
	{
		avg = (kor+eng)/2;
		return name+avg;
	}
}

class Avg1Total extends Avg1 {
	public int total(int kor, int eng)
	{
		int score = kor + eng;
		return score;
	}
}

public class AvgTest1 {
	public static void main(String[] args) {
		Avg1Total student1 = new Avg1Total();
		Avg1Total student2 = new Avg1Total();
		student1.name = "±èÃ¶¼ö";
		student2.name = "±è¿µÈñ";
		String st1_avg = student1.average(70,80);
		String st2_avg = student2.average(80,90);
		int st1_total = student1.total(70,80);
		int st2_total = student2.total(80,90);
		System.out.println(st1_avg+" ÃÑÁ¡=" + st1_total);
		System.out.println(st2_avg+" ÃÑÁ¡=" + st2_total);
	}
}