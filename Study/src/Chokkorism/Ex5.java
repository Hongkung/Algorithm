package Chokkorism;

public class Ex5 {

	public static void main(String[] args) {

		int a = 1, b = 1, c = 0, cut = 2, sum = 2;
		do {
			/*�Ǻ���ġ������ 20��° �ױ����� �հ�
			 * ī���Ϳ� �հ��� ���� �ʱ�ȭ���� 2�ΰ��� �ָ�����
			 * �̹� a , b �� 1��°��, 2��° ���̱� ������ 
			 * ī���͵� 2���� �����ϰ� �հ赵 2���� �����ϴ°�.
			 * */
			c = a + b;
			sum += c;
			a = b;
			b = c;
			cut++;
		} while (cut < 20);
		System.out.println(sum);

	}

}
