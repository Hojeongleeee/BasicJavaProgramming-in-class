public class MultiArrayTest3 {
	public static void main(String args[])
	{
		int threeD[][][] = new int[3][4][5];
		int i, j, k, count=11;
		for( i=0 ; i < threeD.length ; i++)
			for( j=0; j < threeD[i].length ; j++)
				for( k=0; k < threeD[i][j].length ; k++)
				{
					threeD[i][j][k] = count;
					count++;
				}
		for(i=0; i<threeD.length; i++)
		{
			System.out.println((i+1) + "��° 2 ���� �迭 ");
			for(j=0; j<threeD[i].length; j++)
			{
				for(k=0; k<threeD[i][j].length; k++)
					System.out.print(threeD[i][j][k] + " ");
				System.out.println();
			}
			System.out.println();
		}
	}
}