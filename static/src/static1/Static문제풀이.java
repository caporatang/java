package static1;

public class Static����Ǯ�� {

	public static void main(String[] args) {
		Com company1 = new Com("ȫ�浿", 25, "��");
		System.out.println(company1);
		System.out.println("ȸ�� ��ü �ο���" + Com.count);
		Com company2 = new Com("��浿", 24, "��");
		System.out.println(company2);
		System.out.println("ȸ�� ��ü �ο���" + Com.count);
		Com company3 = new Com("�۱浿", 26, "��");
		System.out.println(company3);
		System.out.println("ȸ�� ��ü �ο���" + Com.count);

		System.out.println("ȸ������� ��� ���̴�" + Com.ages / Com.count + "�Դϴ�");

	}

}