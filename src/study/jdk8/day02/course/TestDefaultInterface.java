package study.jdk8.day02.course;

public class TestDefaultInterface {
	
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		System.out.println(sc.getName());
		
		MyInterface.show();
	}

}
