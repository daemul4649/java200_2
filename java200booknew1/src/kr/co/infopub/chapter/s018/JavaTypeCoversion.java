package kr.co.infopub.chapter.s018;
// Ÿ�� ��ȯ�� �ʿ伺
public class JavaTypeCoversion {
	public static void main(String[] args) {
		String slat=" 37.52127220511242     ";
		//String slat="hello";
		//���� ���� �� double�� Ÿ�� ��ȯ
		double latitude=Double.parseDouble(slat.trim()); 
		System.out.println(latitude);
	}
}
