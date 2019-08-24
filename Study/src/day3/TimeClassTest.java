package day3;
//�⺻���� Ÿ��Ŭ���������.
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
	//get�� ��������� ���� �о��ش�.
//setter�� ��ȿ���˻縦 �ϰ� ���� �����Ѵ�. 
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
	//set���� ���е� ��������� ���� �����Ҽ��ִ�. 
}
