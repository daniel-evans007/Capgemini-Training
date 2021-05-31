package atm_collections;

public class ATM {

	private String location;
	private String branchName;
	
	public ATM() {
		
	}
	
	public ATM(String location, String branchName) {
		super();
		this.location = location;
		this.branchName = branchName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public void show() {
		System.out.print(this.branchName);
		System.out.println(this.location);
	}
}