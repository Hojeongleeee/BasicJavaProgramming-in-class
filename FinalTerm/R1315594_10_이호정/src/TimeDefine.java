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
	//연월일, 시간을 보기좋은 형태로 String화
	String ymd = year+"."+(month<10?"0"+month : month)+"."+(date<10?"0"+date : date);
	String time =(hrs<10?"0"+hrs : hrs)+":"+(min<10?"0"+min : min)+":"+(sec<10?"0"+sec : sec);			

	//스톱워치를 위한 메소드
	public long getTimes(long oldTime){
		pauseTime=System.currentTimeMillis()-oldTime;
		return System.currentTimeMillis()-oldTime;
	} //지나간 시간
	public long resetTimes(long oldTime){
		oldTime=System.currentTimeMillis();
		return oldTime;
	} //0으로 리셋하기 위해 oldTime을 현재와 같게 만듬
	public long stopTimes(long pauseTime){
		return pauseTime;
	} //시간을 멈추게 하기 위해 미리 저장해놓은 pauseTime만 리턴
	
	/*	0에서 start - getTimes 실행
	 * 	0에서 reset - NULL
	 * 	0에서 stop - NULL
	 * 	timing에서 start - NULL
	 * 	timing에서 reset - oldTime 0저장 -> 0 return  
	 * 	timing에서 stop - stopTimes 실행
	 * 	stop에서 start - 
	 * 	stop에서 reset - oldTime 0저장 -> 0 return
	 * 	stop에서 stop - NULL
	 * 
	 * 
	 * 
	 */
	
	//시분초 getter
	public int getTime(int i){
		int[] time={hrs,min,sec};
		return time[i];
	}
	
	//연월일 getter
	public int getDate(int i){
		int[] ymd={year,month,date};
		return ymd[i];
	}
		
	//시분초 String
	public String timeStr(){
		return time;
	}

}
