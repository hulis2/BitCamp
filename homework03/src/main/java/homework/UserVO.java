package homework;

public class UserVO {

	private String name;
	private String gender;
	private String birthyear;
	private String birthmonth;
	private String birthday;
	private String phonnumber;
	private String address;
	
	private String birth;	
	private boolean active;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}

	
	public void setGender(String gender) {
		this.gender = gender;
	}

	//session¿ë
	public String getBirth() {
		birth = birthyear+"."+birthmonth+"."+birthday;
		return birth;
	}
	
	public String getBirthyear() {
		return birthyear;
	}


	public void setBirthyear(String birthyear) {
		this.birthyear = birthyear;
	}


	public String getBirthmonth() {
		return birthmonth;
	}


	public void setBirthmonth(String birthmonth) {
		this.birthmonth = birthmonth;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	
	public String getPhonnumber() {
		return phonnumber;
	}


	public void setPhonnumber(String phonnumber) {
		this.phonnumber = phonnumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	@Override
	public String toString() {
		return "User VO [name=" +name+",gender="+gender+",birthyear="+birthyear
				+",birthmonth="+birthmonth+",birthday="+birthday
				+",phonnumber="+phonnumber+",address="+address+"]";
				
	}

}
