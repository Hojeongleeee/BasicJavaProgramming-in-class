import java.io.*;
public class FileWriterTest {
	public static void main(String args[]) throws Exception {
		String source = "비어있어야 비로서 가득해 지는 사랑\n" + " 영원히 사랑한다는 것은\n" + " 평온한 마음으로 아침을 맞는다는 것입니다.\n";
		char input[] = new char[source.length()];
		source.getChars(0, source.length(), input, 0);
		FileWriter fw = new FileWriter(args[0]);
		fw.write(input);
		fw.close();
	}
}