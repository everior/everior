package study.jdk8.day01.course;

@FunctionalInterface
public interface MyPredicate<T> {

	public boolean test(T t);
	
}
