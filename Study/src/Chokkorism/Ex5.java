package Chokkorism;

public class Ex5 {

	public static void main(String[] args) {

		/*int a = 1, b = 1, c = 0, cut = 2, sum = 2;
		do {
			�Ǻ���ġ������ 20��° �ױ����� �հ�
			 * ī���Ϳ� �հ��� ���� �ʱ�ȭ���� 2�ΰ��� �ָ�����
			 * �̹� a , b �� 1��°��, 2��° ���̱� ������ 
			 * ī���͵� 2���� �����ϰ� �հ赵 2���� �����ϴ°�.
			 * 
			c = a + b;
			sum += c;
			a = b;
			b = c;
			cut++;
		} while (cut < 20);
		System.out.println(sum);
		 */
		int a=1 ,b=1;
		int sum, cut, c;
		/*�Ǻ���ġ�� ������ 1 1 2 3 5 8 13...�����⶧���� 1����, 2������ 1�� �������ִ�
		 * �׷��� a,b �� 1�� �����ϴ���. 
		 * �׸��� ���� sum�� 1�� 1�� ���� 2�� ������ �Ѵ�. 
		 * ī������ ��� �̹� 2��° �ױ��� ����� �ϰ� �����ϱ� ������ 
		 * ī���� ���� 2�� �����ϴ°�.
		 */
		sum = 2;
		cut = 2;
		while (true) {
			c = a + b;
			sum += c;

			cut++;
			if (cut < 20) {
				a = b;
				b = c;
			} else {
				System.out.println("�հ�: " + sum);
				break;
			}
		}
	}

}
