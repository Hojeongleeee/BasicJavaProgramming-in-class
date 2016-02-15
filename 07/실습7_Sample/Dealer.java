import java.util.Scanner;

public class Dealer {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int selectNo;

			do{
				selectNo = firstMenu();
				switch(selectNo){
					case 0 : {
						System.out.println("감사합니다.");
						break;
					}
					case 1 : {
						Car auto = carOrder();
						
						break;
					}
					case 2 : {
						Bus auto = busOrder();
						
						break;
					}
					case 3 : {
						Truck auto = truckOrder();
						
						break;
					}
					default : {
						System.out.println("잘못 선택하였습니다!");
						break;
					}
				}
			} while (selectNo != 0);
	
	}

	private static int firstMenu(){
		int a;
		System.out.println("원하는 작업을 선택하시오.");
		System.out.println("1.승용차 구매");
		System.out.println("2.버스구매");
		System.out.println("3.트럭구매");
		System.out.println("0.작업종료");
		System.out.print("작업: ");
		a = scan.nextInt();
		return a;
	}
	private static Car carOrder(){
		Car aCar;
		int orderType = 1;
		System.out.println();
		System.out.println("승용차 구매");
		aCar = new Car(selectEngineType(orderType), selectEngineSize(orderType), selectColor(),
				   selectNoOfPassenger(orderType));
			return aCar;
	}
	private static Bus busOrder(){
		Bus aBus;
		int orderType = 2;
		System.out.println();
		System.out.println("버스 구매");

		
		return aBus;
	}
	private static Truck truckOrder(){
		Truck aTruck;
		int orderType = 3;
		System.out.println();
		System.out.println("트럭 구매");

		
		return aTruck;
	}
	private static String selectEngineType(int orderType){
		String eType = "";
		switch(orderType){
			case 1:{
				int a;
				do{
					System.out.println();
					System.out.println("원하는 엔진형식을 선택하시오.");
					System.out.println("1.가솔린");
					System.out.println("2.디젤");
					System.out.println("3.LPG");
					System.out.print("엔진형식: ");
					a = scan.nextInt();
				} while(a < 1 && a > 3);
				switch(a){
					case 1 :{
						eType ="가솔린";
						break;
					}
					case 2 :{
						eType ="디젤";
						break;
					}
					case 3 :{
						eType ="LPG";
						break;
					}
				}
				break;
			}
			case 2:{
				int a;
				do{
					System.out.println();
					System.out.println("원하는 엔진형식을 선택하시오.");
					System.out.println("1.디젤");
					System.out.println("2.LNG");
					System.out.print("엔진형식: ");
					a = scan.nextInt();
				} while(a < 1 && a > 2);
				switch(a){
					case 1 :{
						eType ="디젤";
						break;
					}
					case 2 :{
						eType ="LNG";
						break;
					}
				}
				
				break;
				
			}
			case 3:{
				eType ="디젤";
				break;
			}
		}
		return eType;
	}
	
	private static int selectEngineSize(int orderType){
		int eSize;
		
		return eSize;
	}	
	private static String selectColor(){
		String color="";


		return color;
	}
	private static String selectUses(){
		String uses="";


		return uses;
	}
	private static int selectWheels(){
		int wheels=0;


		return wheels;
	}
	private static int selectNoOfPassenger(int orderType){
		int passengers = 0;


		return passengers;
	}
	private static int selectCargo(){
		int cargo = 0;

		return cargo;
	}
}
