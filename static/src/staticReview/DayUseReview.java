package staticReview;

public class DayUseReview {

	public static void main(String[] args) {

		// �Ķ���ͷ� �� ������ �ν��Ͻ� ������
		DayReview day11 = new DayReview("�ڹ�", 13, "������"); // ��ü�� �����ؼ� ���� ����(day11)�� Ŭ������ �ν��Ͻ��̴�.
		DayReview day12 = new DayReview("��Ʋ��", 14, "c++"); // Ŭ���������� ��������̰� , ���⼭ �� ������ �ν��Ͻ� ������� �Ѵ�.
		DayReview day13 = new DayReview("����Ŭ", 12, "mysql"); // ��������� �ν��Ͻ� ������� ȥ���ؼ� ����ϱ⵵ �Ѵ�.

		System.out.println(day11); // Ŭ������ �ν��Ͻ� ��� > object!!
		System.out.println(day12);
		System.out.println(day13);

		// count�� static���� ���� ���־��� ������ Ŭ���� �̸����� ��ü�� �������� �ʰ� �ٷ� �����ؼ� ����Ѵ�.
		System.out.println(DayReview.count); // �ν��Ͻ��� ��� ���� �ߴ��� ī��Ʈ

	}

}
