package study.jdk8.day02.course;

import java.util.Optional;

//注意：Optional 不能被序列化
public class NewMan {

	private Optional<Godness> godness = Optional.empty();		//空的optional
	
	private Godness god;
	
	public Optional<Godness> getGod(){
		return Optional.of(god);
	}

	public NewMan() {
	}

	public NewMan(Optional<Godness> godness) {
		this.godness = godness;
	}

	public Optional<Godness> getGodness() {
		return godness;
	}

	public void setGodness(Optional<Godness> godness) {
		this.godness = godness;
	}

	@Override
	public String toString() {
		return "NewMan [godness=" + godness + "]";
	}

}
