package staticReview;

public class Statice����Review {

	public static void main(String[] args) {
		ComReview company1 = new ComReview("������", "����", 15); // ������ ���� ������ ���� �̸��� ���� �⺻ �����ڰ� ���� �����̴�.
		System.out.println(company1);
		System.out.println(ComReview.count);
		ComReview company2= new ComReview("������", "����", 17); // ������ ���� ������ ���� �̸��� ���� �⺻ �����ڰ� ���� �����̴�.
		System.out.println(company2);
		System.out.println(ComReview.count);
		ComReview company3 = new ComReview("������", "����", 19); // ������ ���� ������ ���� �̸��� ���� �⺻ �����ڰ� ���� �����̴�.
		System.out.println(company3);
		System.out.println(ComReview.count);
		
		System.out.println("���� ������ ������" + ComReview.sum);
		System.out.println("���� ������ �����" + ComReview.sum/ComReview.count);
		
		
	}

}
