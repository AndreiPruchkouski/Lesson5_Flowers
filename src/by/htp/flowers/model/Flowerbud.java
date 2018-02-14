package by.htp.flowers.model;

public class Flowerbud {

	public String color;
	public int size;

	public Flowerbud() {

	}

	public Flowerbud(String color, int size) {
		this.color = color;
		this.size = size;
	}
	
	//Задаем параметры при первом упоминании бутона
	public void onBloom() {
		this.color = "Green";
		this.size = 15;
	}
	
	//Изменение статуса бутона при частичном увядании
	public void onLittleFade() {
		this.color = "Brown";
		this.size = 10;
	}
	//Изменение статуса бутона при полном увядании
	public void onTotalFade() {
		this.color = "Gray";
		this.size = 5;
	}

}
