package static1;

public class DayUse {

	public static void main(String[] args) {
		Day day1 = new Day("�ڹ� ����", 10, "����"); // �⺻�����ڰ� ���� ������ ó���� new�ؼ� ���� ���� ��쿡 ������ �߻��ȴ�.
		System.out.println(Day.count);
		Day day2 = new Day("����", 15, "������");
		System.out.println(Day.count);
		Day day3 = new Day("�", 11, "��Ʈ�Ͻ�");
		System.out.println(Day.count);
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(Day.sum + "�ð�");
		System.out.println((Day.sum / Day.count) + "�ð�");
		System.out.println(Day.getAvg()); // static �޼��� �ٷ� ���
		//day 1, 2 , 3�� Ŭ������ �ν��Ͻ���� �Ѵ�
		//(Ʋ)                  (���� ��ǰ)
	}

} 