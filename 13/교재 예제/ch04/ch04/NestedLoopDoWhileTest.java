public class NestedLoopDoWhileTest{
	public static void main(String args[])
	{
		int i=2;
		do{
			System.out.println("*** " + i + "´Ü ***");
			int j=1;
			do{
				System.out.println(i+" * " + j + " = " + i*j);
				j++;
			}while ( j<=9 );
			System.out.println();
			i++;
		}while ( i<=9 );
	}
}