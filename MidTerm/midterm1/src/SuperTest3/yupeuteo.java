package SuperTest3;

class yupeuteo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4 a4 = new A4();
		
		A4 a4obj = (A4) new A1();
		A1 a1obj = new A4(); //다운캐스팅 A1에 선언한 객체를 A4에서 생성
		
		a1obj.a1Cast();
		int n = a1obj.a1;
		a4obj.a1Cast();
		n = a4obj.a2;
	}

}

class A1{
	int a1 = 1;
	
	A1(){
		System.out.println("A1 묵시적 생성자 수행");
	}

	void a1Cast(){
		System.out.println();
	}
}

class A2 extends A1 {
	int a2 = 2;
	
	A2(){
		System.out.println("A2 묵시적 생성자 수행");
	}
	
	void a2Cast(){
		
	}
}

class A3 extends A2 {
	int i=2, j=5; //무관
	A3(int i, int j){ 
		System.out.println("A3 명시적 생성자 수행, i+j="+(i+j));
	}
	
	void a3Cast(){
		
	}
}

class A4 extends A3 {
	int a4 = 4;
	
	A4(){
		super(5,7); //없으면 안되는 생성자
		System.out.println("없으면 안되는 생성자, A4 묵시적 생성자 수행+super(5,7)수행");
	}
	
	void a4Cast(){
		
	}
}