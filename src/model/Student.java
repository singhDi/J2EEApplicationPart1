package model;

public class Student {

	private int id;
	private String name;
	private String address;
	private String userName;
	private String password;
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String address, String userName, String password) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.userName = userName;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", userName=" + userName
				+ ", password=" + password + "]";
	}
	
	
}

