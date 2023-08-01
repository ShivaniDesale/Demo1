
public class Patient {
	
	private int pId;
	private String pName;
	private char bloodGroup;
	private int pAge;
	
	public void display() {
		System.out.println(pId+ "," +pName+ "," +bloodGroup+ "," +pAge);
	}

	public Patient() {
		super();
	
	}
	
	
	
public Patient(int pId, String pName, char bloodGroup, int pAge) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.bloodGroup = bloodGroup;
		this.pAge = pAge;
	}



	public int getpId() {
	return pId;
}

public void setpId(int pId) {
	this.pId = pId;
}

public String getpName() {
	return pName;
}

public void setpName(String pName) {
	this.pName = pName;
}

public char getBloodGroup() {
	return bloodGroup;
}

public void setBloodGroup(char bloodGroup) {
	this.bloodGroup = bloodGroup;
}

public int getpAge() {
	return pAge;
}

public void setpAge(int pAge) {
	this.pAge = pAge;
}




	public static void main(String[] args) {
		
		Patient pt = new Patient();
		pt.display();
		
	}
	
	
}
