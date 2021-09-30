package practise;


public class TestRecruit {

	public static void main(String[] args) {
		RecruitmentProcess rp = new RecruitmentProcess();
		try {
			rp.recruit(89,99,"se");
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
