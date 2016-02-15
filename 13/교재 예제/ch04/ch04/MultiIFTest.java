public class MultiIFTest {
	public static void main(String args[])
	{
		int grade = Integer.parseInt(args[0]);
		if (grade >= 90)
			System.out.println("AÇÐÁ¡ Ãëµæ");
		else if (grade >= 80)
			System.out.println("BÇÐÁ¡ Ãëµæ");
		else if (grade >= 70)
			System.out.println("CÇÐÁ¡ Ãëµæ");
		else if (grade >= 60)
			System.out.println("DÇÐÁ¡ Ãëµæ");
		else
			System.out.println("ÇÐÁ¡ Ãëµæ ½ÇÆÐ");
	}
}