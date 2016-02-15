import java.util.Date;

public class TimeDefine{
	Date dt = new Date(); 
	int year = 1900+dt.getYear();
	int month = 1+dt.getMonth();
	int date = dt.getDate();
	int hrs = dt.getHours();
	int min = dt.getMinutes();
	int sec = dt.getSeconds();

	long oldTime = System.currentTimeMillis();
	long newTime = System.currentTimeMillis();
	long pauseTime = 0;
	//������, �ð��� �������� ���·� Stringȭ
	String ymd = year+"."+(month<10?"0"+month : month)+"."+(date<10?"0"+date : date);
	String time =(hrs<10?"0"+hrs : hrs)+":"+(min<10?"0"+min : min)+":"+(sec<10?"0"+sec : sec);			

	//�����ġ�� ���� �޼ҵ�
	public long getTimes(long oldTime){
		pauseTime=System.currentTimeMillis()-oldTime;
		return System.currentTimeMillis()-oldTime;
	} //������ �ð�
	public long resetTimes(long oldTime){
		oldTime=System.currentTimeMillis();
		return oldTime;
	} //0���� �����ϱ� ���� oldTime�� ����� ���� ����
	public long stopTimes(long pauseTime){
		return pauseTime;
	} //�ð��� ���߰� �ϱ� ���� �̸� �����س��� pauseTime�� ����
	
	/*	0���� start - getTimes ����
	 * 	0���� reset - NULL
	 * 	0���� stop - NULL
	 * 	timing���� start - NULL
	 * 	timing���� reset - oldTime 0���� -> 0 return  
	 * 	timing���� stop - stopTimes ����
	 * 	stop���� start - 
	 * 	stop���� reset - oldTime 0���� -> 0 return
	 * 	stop���� stop - NULL
	 * 
	 * 
	 * 
	 */
	
	//�ú��� getter
	public int getTime(int i){
		int[] time={hrs,min,sec};
		return time[i];
	}
	
	//������ getter
	public int getDate(int i){
		int[] ymd={year,month,date};
		return ymd[i];
	}
		
	//�ú��� String
	public String timeStr(){
		return time;
	}

}
