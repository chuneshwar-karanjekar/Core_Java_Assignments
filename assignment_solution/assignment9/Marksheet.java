package assignment9;
public class Marksheet {
	Integer physics, maths, chemistry, english, hindi;
	
	
public Integer getPhysics() {
		return physics;
	}



	public void setPhysics(Integer physics) {
		this.physics = physics;
	}



	public Integer getMaths() {
		return maths;
	}



	public void setMaths(Integer maths) {
		this.maths = maths;
	}



	public Integer getChemistry() {
		return chemistry;
	}



	public void setChemistry(Integer chemistry) {
		this.chemistry = chemistry;
	}



	public Integer getEnglish() {
		return english;
	}



	public void setEnglish(Integer english) {
		this.english = english;
	}



	public Integer getHindi() {
		return hindi;
	}



	public void setHindi(Integer hindi) {
		this.hindi = hindi;
	}



public static void main(String[] args) {
	Marksheet mr = new Marksheet();
	mr.setChemistry(90);
	System.out.println(mr.getChemistry());	
	
}
}
