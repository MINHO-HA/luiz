package java_example_11_180530;

public abstract class _12_Phone {

	//필드 선언
	public String owner;
	
	//생성자
	public _12_Phone(String owner) {
		this.owner=owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
