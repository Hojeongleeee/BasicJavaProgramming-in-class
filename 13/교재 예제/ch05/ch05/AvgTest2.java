class Avg2 {
	public String name;
	private int avg;
	public String average(int kor, int eng)
	{
		avg = (kor+eng)/2;
		return name+avg;
	}
}
public class AvgTest2 {
	public static void main(String[] args) {
		Avg2 student1 = new Avg2();
		student1.name = "±èÃ¶¼ö";
		student1.avg = 100;
	}
}