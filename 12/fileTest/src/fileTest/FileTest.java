package fileTest;
import java.io.*;
import java.util.Scanner;


public class FileTest {
	
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		File newdir = new File("./");
		System.out.println("1."+newdir.getAbsolutePath());
		System.out.println("2."+newdir.getName());
		System.out.println("3."+newdir.getCanonicalPath());
		System.out.println("4."+newdir.getPath());
		File[] dirfilelist = newdir.listFiles();

		int max=dirfilelist.length;
		
		
		for (int i=0;i<max;i++){
			System.out.println(dirfilelist[i].getName());
		}
		
		String command = scan.nextLine();
		File currentFile = null;
		
		//파일명 혹은 폴더명 입력하고 검색
		int i=0;
		while (i<max){
			System.out.println("i:"+i);
			if (command.equals(dirfilelist[i].getName())){
				currentFile = dirfilelist[i];
				System.out.println(currentFile.getName());
				break;
			} 
			i++;
		}
		

	}

}
