package question08;

public class Student {
	
	public String name;
	public int number;
	public String department;
	
	@Override // toString -> ctrl+space
	public String toString() {
		return ("이름 : "+name+"\n 학번: "+number+"\n소속학과: "+department);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

	

}
