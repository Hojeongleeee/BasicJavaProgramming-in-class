public class NestedLoopForTest{
	public static void main(String args[])
	{
		int i,j;
		for ( i=2; i<=9 ; i=i+1 )
		{
			System.out.println("*** " + i + "´Ü ***");
			for( j=1; j<=9; j=j+1 )
				System.out.println(i+" * " + j + " = " + i*j);
			System.out.println();
		}
	}
}