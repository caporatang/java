package staticReview;

public class DayReview {

	// ������� , ��������, �ڵ����� �ʱ�ȭ �ȴ�.
	// �ڵ� �ʱ�ȭ�� ������� , �������� , �迭 �ۿ� �ȵȴ�.
	String lan; // �ʱ�ȭ �� : null
	int time; // �ʱ�ȭ �� : 0
	String lan2; // null

	static int count; // ����ƽ�� ��ü�� �������� �ʾƵ� Ŭ���� �̸����� �ٷ� ������ �� �ִ�

	// �޼��� �����
	// this�� Ŭ���� �ٷ� �Ʒ��� ������ ���������� �޼��� �ȿ� �������� ���������� �����ϱ� ���� ����Ѵ�.
	public DayReview(String lan, int time, String lan2) {
		this.lan = lan;
		this.time = time;
		this.lan2 = lan2;
	}

	@Override
	public String toString() {
		return "DayReview [lan=" + lan + ", time=" + time + ", lan2=" + lan2 + "]";
	}

}
