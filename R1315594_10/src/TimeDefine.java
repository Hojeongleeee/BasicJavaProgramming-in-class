public class TimeDefine{

	//스톱워치에 표시될 변수들
	private int microsec=0;
	private int seconds=0;
	private int minutes=0;
	private String str;
	
	//스톱워치 작동을 위한 메소드
	
	/*	start();
	 *  호출될 때 마다 0.01초씩 증가시킴
	 */
	public String start(){
		if (microsec<60){
			microsec++;
		} else if (microsec==60){
			microsec=0;
			seconds++;
			if (seconds==60){
				seconds=0;
				microsec=0;
				minutes++;
			}
		}
		str = (minutes<10?"0"+minutes:minutes)+"'"+(seconds<10?"0"+seconds:seconds)+"'"+(microsec<10?"0"+microsec:microsec);
		return str /*	00'00''00	*/;
	} 
	
	/*	reset();
	 * 	호출될 때 0으로 초기화, 디폴트 return
	 */
	public String reset(){
		microsec=0;
		seconds=0;
		minutes=0;
		return "00'00''00";
	}
	
	/*	stop();
	 *  현재 저장된 스톱워치 시각 return
	 */
	public String stop(){
		return str;
	}
	
	
}
