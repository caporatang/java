package static1;

public class Day {

	// �ɹ�����, ���� ����, �ڵ� �ʱ�ȭ
	// �ڵ��ʱ�ȭ�� �迭, ��������, �ɹ� ���� �ۿ� ����
	String doing; // null
	int time; // 0
	String location;// null new �Ҷ����� doing , time , location�� ���ϵȴ�.

	static int sum;
	static int count; // static ������ new�ص� ���� �������� �ʴ´�

	public Day(String doing, int time, String location) {

		this.doing = doing; // this�� ������ ���� �� ���� ������ �ǹ��Ѵ�.
		this.time = time;
		this.location = location;
		count++;
		sum += time;
	}
	// static �޼���� ��ü �������� �ʾƵ� �ƹ����� Ŭ���� �̸�����
	// �����ؼ� �� ����� ó���ϰ� �� �� �ִ�.
	// ���� ���� ����� static �޼���� ����� ������ �ƹ����� �� �� �־ ���ϴ�.

	public static int getAvg() {
		return sum / count;
		// static �޼��� �ȿ��� static������ ��� ����!!! instance���� ��� �Ұ��� !!
		// instance������ ��ü ������ ���� �����ϱ� �����̴�
		// static�޼���� ��ü �������� �ʾƵ� �����ؼ� ó���� �ؾ��Ѵ�.
		// return doing;
	}

	@Override
	public String toString() {
		return "day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}

}