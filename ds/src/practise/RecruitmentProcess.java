package practise;

public class RecruitmentProcess {
	public void recruit(int salary, int age, String qualification) throws InvalidAgeException{
		if (salary < 10000 || salary > 50000) {
			throw new InvalidSalaryException("invalid salary");
		}
		
		if (age < 18 || age > 60) {
			throw new InvalidAgeException("invalid age");
		}
	}
}