package p08.lecture;

public class Cat extends KindaCat implements Pet {

	@Override
	public void sit() {
		System.out.println("고양이가 앉습니다.");
	}
}
