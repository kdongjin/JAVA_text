package chapter06.page0;

public class Rectangle {
	// 멤버 변수
    int weight;
    int width;
    int area;

    //디폴트 생성자 => 매개변수 생성자
    Rectangle(int width, int weight) {
        this.weight= weight;
        this.width= width;
    }
    // 면적 구하는 함수
    void getArea() {
        this.area =  this.weight * this.width;
    }
    // 출력하는 함수
    void rectanglePrint() {
        System.out.printf("%-5d  * %-5d  = %-5d \n",
        		weight, width, area);
    }
}