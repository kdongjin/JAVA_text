package chapter07.practice08;

import java.util.Arrays;

public class Zoo {
	//멤버변수
	private String name; 		//동물원이름
	private String location;	//동물원위치
	private String[] animals; 	//동물원에 있는 동물이름들
	private int animalCount; 	//animals 배열에 들어있는 동물이름 카운트
	//생성자(디생, 매생)
	public Zoo() {
		this.animals = new String[5]; 
		this.animalCount = 0;
	}
	public Zoo(String name, String location) {
		this.name = name; 
		this.location = location; 
		this.animals = new String[5]; 
		this.animalCount = 0;
	}
	//멤함(겟터,셋터)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String[] getAnimals() {
		return animals;
	}
	public void setAnimals(String[] animals) {
		this.animals = animals;
	}
	public int getAnimalCount() {
		return animalCount;
	}
	//멤함(기능)
	public int addAnimal(String animalName) {
		//[    ] 문자열배열에 동물이름 추가한다. 배열사이즈 5개 가능하다.
		//animalcount 5 이상이면 더이상 추가할 수 없다.
		if (animalCount >= 5) {
			System.out.printf("%s \n","더이상 저장할 장소가 없습니다.");
			return -1; 
		}
		animals[animalCount++] = animalName;
		
		return animalCount; 
	}
	//멤함(출력)
	@Override
	public String toString() {
		return "Zoo [name=" + name + ", location=" + location + ", animals=" + Arrays.toString(animals)
				+ ", animalCount=" + animalCount + "]";
	}
	
}











