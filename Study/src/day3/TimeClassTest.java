package day3;
//기본적인 타임클래스만들기.
public class TimeClassTest {
	private int hour;
	private int minute;
	private float second;

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public float getSecond() {
		return second;
	}
	//get은 멤버변수의 값은 읽어준다.
//setter로 유효성검사를 하고 값을 변경한다. 
	public void setHour(int h) {
		if (h < 0 || h > 23) {
			return;
		}
		this.hour = h;
	}

	public void setMinute(int m) {
		if (m < 0 || m > 59) {
			return;
		}
		this.minute = m;
	}

	public void setSecond(float s) {
		if (s < 0.0f || s > 59.99f) {
			return;
		}
		this.second = s;
	}
	//set으로 은닉된 멤버변수의 값을 설정할수있다. 
}
