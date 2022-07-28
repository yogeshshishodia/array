package arraypractise;

public class Person {

	
	private Integer personId;
	private String personname;
	
	
	public Person(Integer personId, String personname) {
		super();
		this.personId = personId;
		this.personname = personname;
	}
	public Person(){
		
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personname=" + personname + "]";
	}
	
	




}
