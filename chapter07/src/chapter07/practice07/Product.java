package chapter07.practice07;

public class Product {
	//멤변
	String prdouctName;
	int price;
	String brand; 
	//디생,매생
	public Product() {
	}
	//멤함(겟터, 셋터)
	public String getPrdouctName() {
		return prdouctName;
	}
	public void setPrdouctName(String prdouctName) {
		this.prdouctName = prdouctName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//멤함(기능)
	public void information() {
		System.out.printf("%-10s / %-10d / %-10s\n",prdouctName,price,brand  );
	}
	//멤함(출력: toString)
	@Override
	public String toString() {
		return "Product [prdouctName=" + prdouctName + ", price=" + price + ", brand=" + brand + "]";
	}
	
}
















