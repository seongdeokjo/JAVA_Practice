package pr_1;

public class Contact {
	private String name;
	private String ph;
	private String email;
	private String address;
	private String birth;
	private String group;
	
	public Contact(String name, String ph, String email, String address, String birth, String group) {
		this.name = name;
		this.ph = ph;
		this.email = email;
		this.address = address;
		this.birth = birth;
		this.group = group;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public void showData() {
		System.out.println("이름: "+getName());
		System.out.println("전화번호: "+getPh());
		System.out.println("이메일: "+getEmail());
		System.out.println("주소: "+getAddress());
		System.out.println("생일: "+getBirth());
		System.out.println("그룹: "+getGroup());
	}
	
	public String toString() {
		return getName() +", "+getPh()+", " + getEmail()+", " + getAddress()+", " + getBirth()+", " + getGroup(); 
	}
	
}
