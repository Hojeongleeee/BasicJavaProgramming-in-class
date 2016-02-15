
public class PracticeSource {

	public static void main(String[] args) {
		
		YutBundle yutresult = new YutBundle(); //
		
		String ystate[] = new String []{"모","도","개","걸","윷"};
			//출력을 위해 배면의 갯수에 따른 String을 배열로 선언
		System.out.println("윷놀이 결과 : "+ystate[yutresult.throwingAll()]+"입니다.");

	}

}
