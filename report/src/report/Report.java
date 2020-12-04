package report;

public class Report {

	public static void main(String[] args) {
		int kor = 0;
		int eng = 0;
		int math = 0;
		int sci = 0;
		
		kor = 90;
		eng = 80;
		math = 70;
		sci = 60;
		
		int eve = (kor + eng + math + sci)/4;
		int hap = kor + eng + math + sci;
		
		System.out.println(eve);
		System.out.println(hap);
				

	}

}
