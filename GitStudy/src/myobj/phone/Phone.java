package myobj.phone;

public class Phone {
	private String name;
	private String tel;
	private String address;
	
	public Phone(String name, String tel, String address) {
		super();
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + " ��ȭ��ȣ : " + tel + " �ּ� : " + address;
	}
	
	
}


