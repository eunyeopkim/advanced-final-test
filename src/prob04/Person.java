package prob04;

public class Person {
	private static int numberOfPerson; // 전체 인구수
	private int age;
	private String name;

	public Person( String name ){
		setAge(12);
		setName(name);
		numberOfPerson++;
	}
	
	public Person(int age, String name){
		setAge(age);
		setName(name);
		numberOfPerson++;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void selfIntroduce(){
		System.out.println("내이름은 "+getName()+"이며, 나이는 "+getAge()+"살입니다.");
		
	}

	static int getPopulation(){
		return numberOfPerson;
	}
}

