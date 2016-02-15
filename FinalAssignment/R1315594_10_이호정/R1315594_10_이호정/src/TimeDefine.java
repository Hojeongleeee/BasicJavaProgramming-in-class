/*
 * �ð� ǥ�ø� ���� String�� return�ϴ� �޼ҵ� ����
 * start() - ���� �̺�Ʈ��, workTask���� 1�� �����ϴ� String return
 * reset() - ���� �̺�Ʈ��, 0���� �ʱ�ȭ �� 0 return
 * stop() - stop �̺�Ʈ��, ������Ű�� �ʰ� ���� �� ��� return
 * 
 */
public class TimeDefine{

	//�����ġ�� ǥ�õ� ������
	private int microsec=0;
	private int seconds=0;
	private int minutes=0;
	private String str;
	
	//�����ġ �۵��� ���� �޼ҵ�
	
	/*	start();
	 *  ȣ��� �� ���� 0.01�ʾ� ������Ŵ
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
		str = (minutes<10?"0"+minutes:minutes)+":"+(seconds<10?"0"+seconds:seconds)+":"+(microsec<10?"0"+microsec:microsec);
		return str /*	00'00''00	*/;
	} 
	
	/*	reset();
	 * 	ȣ��� �� 0���� �ʱ�ȭ, ����Ʈ return
	 */
	public String reset(){
		microsec=0;
		seconds=0;
		minutes=0;
		str = (minutes<10?"0"+minutes:minutes)+":"+(seconds<10?"0"+seconds:seconds)+":"+(microsec<10?"0"+microsec:microsec);
		return "00:00:00";
	}
	
	/*	stop();
	 *  ���� ����� �����ġ �ð� return
	 */
	public String stop(){
		return str;
	}
	
	
}
