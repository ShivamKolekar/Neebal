

	class Staff {
	    String codeName;
	    
	    public Staff(String codeName) {
	        this.codeName = codeName;
	    }
	    
	    public String getCodeName() {
	        return codeName;
	    }
	}

	class Teacher extends Staff {
	    String subject;
	    
	    public Teacher(String codeName, String subject) {
	        super(codeName);
	        this.subject = subject;
	    }
	    
	    public String getSubject() {
	        return subject;
	    }
	}

	class Typist extends Staff {
	    int speed;
	    
	    public Typist(String codeName, int speed) {
	        super(codeName);
	        this.speed = speed;
	    }
	    
	    public int getSpeed() {
	        return speed;
	    }
	}

	class Regular extends Typist {
	    double salary;
	    
	    public Regular(String codeName, int speed, double salary) {
	        super(codeName, speed);
	        this.salary = salary;
	    }
	    
	    public double getSalary() {
	        return salary;
	    }
	}

	class Casual extends Typist {
	    double dailyWages;
	    
	    public Casual(String codeName, int speed, double dailyWages) {
	        super(codeName, speed);
	        this.dailyWages = dailyWages;
	    }
	    
	    public double getDailyWages() {
	        return dailyWages;
	    }
	}

	class Officer extends Staff {
	    String grade;
	    
	    public Officer(String codeName, String grade) {
	        super(codeName);
	        this.grade = grade;
	    }
	    
	    public String getGrade() {
	        return grade;
	    }
	}

	public class EducationalInstitute 
	{ 
	
	    public static void main(String[] args) 
	    {
	        Teacher teacher = new Teacher("Satyam", "Math");
	        System.out.println("Teacher: " + teacher.getCodeName() + ", Subject: " + teacher.getSubject());
	        
	        Officer officer = new Officer("Rakesh", "A");
	        System.out.println("Officer: " + officer.getCodeName() + ", Grade: " + officer.getGrade());
	   
	        Regular regularTypist = new Regular("Shivam", 60, 2000.0);
	        System.out.println("Regular Typist: " + regularTypist.getCodeName() + ", Speed: " + regularTypist.getSpeed() + ", Salary: " + regularTypist.getSalary());
	        
	        Casual casualTypist = new Casual("Sundaram", 50, 100.0);
	        System.out.println("Casual Typist: " + casualTypist.getCodeName() + ", Speed: " + casualTypist.getSpeed() + ", Daily Wages: " + casualTypist.getDailyWages());
	        
	        
	    }
	
	}
