import java.util.Scanner;

public class Person implements Comparable{

	Scanner scan = new Scanner(System.in);
	
	private String name;
	private double height;
	private double weight;
	private int scoreBMI;	
	
	Person(){
		this.scoreBMI=(int)(weight/((height-100)*0.9)*100); //소수점이하 X
	}
	
	Person(String name, double weight, double height){ //생성자
		System.out.print("이름:");
		setName("aaa");
		System.out.print("키:");
		setHeight(scan.nextDouble());
		System.out.print("몸무게:");
		setWeight(scan.nextDouble());
	}
	/*
	Person(){ //생성자
		System.out.print("이름:");
		setName(scan.nextLine());
		System.out.print("키:");
		setHeight(scan.nextDouble());
		System.out.print("몸무게:");
		setWeight(scan.nextDouble());
		this.scoreBMI=(int)(weight/((height-100)*0.9)*100); //소수점이하 X
	}*/
	

	@Override
	public int compareTo(Object obj) {
		Person person = (Person)obj;
		
		if(this.scoreBMI>=person.getScoreBMI()) //this>person
			return 1;
		else  //자료 정렬에서 return값이 1이아닌이상 의미없음
			return 0;
	}

	//getter
	public int getScoreBMI() {
		return scoreBMI;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	
	//setter
	public void setWeight(double weight) {
		this.weight=weight;
	}

	public void setHeight(double height) {
		this.height=height;
	}
	
	public void setName(String name) {
		this.name = name;
	}




}
