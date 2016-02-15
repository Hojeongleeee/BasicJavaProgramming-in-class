
public class YutBundle {
	
	//윷 4개는 각각 Yut클래스에 대한 객체로 선언
	Yut yut1 = new Yut();
	Yut yut2 = new Yut();
	Yut yut3 = new Yut();
	Yut yut4 = new Yut();
	
	//윷 4개를 던져서 배면의 갯수를 n으로 반환
	public int throwingAll(){
		int n = yut1.throwing()+yut2.throwing()+yut3.throwing()+yut4.throwing(); 
			//각각의 객체에 throwing return값으로 boolHorT (등or배)
		return n; //배면의 갯수
	}	
	
}
