package com.test;
//ĸ��ȭ ��
class Company{
	  private String name;
	  private String location;
	  public void setCompanyAll(String name, String location) {
		   this.name = name;
		   this.location = location;
	  }
	  public String getCompanyAll() {
		  return this.name + location;
	  }
	  public void setLocation(String location) {
		  this.location = location;
	  }
	  public String getLocation () {
		  return this.location;
	  }
	  public void setName(String name) {
		  this.name = name;
	  }
	  public String getName() { //getter 
		  return this.name;
	  }
}
public class Sample09 {

	public static void main(String[] args) {
		Company c = new Company();
		c.setName("ȫ�浿");
		String name = c.getName();
		System.out.println(name);
		
		c.setLocation("��");
		String location = c.getLocation();
		System.out.println(location);
		c.setCompanyAll("��","����");
		String companyAll = c.getCompanyAll();
		System.out.println(companyAll);
		
	
		
	}

}
