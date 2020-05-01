//describes java Time class Functions
public class Time_classs{

	public static void main(String[] args) {
		Timer ti=new Timer();
		System.out.println(ti.ShowTime());
		ti.SetTime(13,40,51);
		System.out.println(ti.ShowTime());
	}
	
}
class Timer{
		int hour;
		int miniute;
		int second;
	public  void SetTime(int h,int m,int s) {
		hour=((h>=0 && h<24) ? h:0);
		miniute=((m>=0 && m<60) ? m:0);
		second=((s>=0 && h<60) ? s:0);
	}
	public  String ShowTime()
	{
		return String.format("%02d:%02d:%02d",hour,miniute,second);   //%02d specifies take the string of length 2
	}

}