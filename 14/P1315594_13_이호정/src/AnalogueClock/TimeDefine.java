package AnalogueClock;

import java.util.Date;

public class TimeDefine{
	Date dt = new Date(); 
	int year = 1900+dt.getYear();
	int month = 1+dt.getMonth();
	int date = dt.getDate();
	int hrs = dt.getHours();
	int min = dt.getMinutes();
	int sec = dt.getSeconds();

	//연월일, 시간을 보기좋은 형태로 String화
	String ymd = year+"."+(month<10?"0"+month : month)+"."+(date<10?"0"+date : date);
	String time =(hrs<10?"0"+hrs : hrs)+":"+(min<10?"0"+min : min)+":"+(sec<10?"0"+sec : sec);			

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
	
	//연월일 Str (yyyy.mm.dd)
	public String ymdStr(){
		return ymd;
	}
	
	//시분초 Str (hh:mm:ss)
	public String timeStr(){
		return time;
	}

}
