
public class ThreadClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirstThread ft = new FirstThread("ㅇㅇㅇ");
		SecondThread st = new SecondThread("ㅇㅇㅇㅇㅇ");
		System.out.println("***스레드시작전****");
		ft.start();
		st.start();
		ft.join();
		st.join();
		System.out.println("***스레드시작후****");
	}

}

class FirstThread extends Thread {
	String str;
	int i = 0;
	FirstThread(String str){
		this.str=str;
		this.setName(str);
	}
	public void run(){
		for(;i<10;i++){
			System.out.println("1."+i+" "+this.getName());
		}
	}
}

class SecondThread extends Thread {
	String str;
	int i = 0;
	SecondThread(String str){
		this.str=str;
		this.setName(str);
	}
	public void run(){
		for(;i<10;i++){
			System.out.println("2."+i+" "+this.getName());
		}
	}
}