package by.htp.flowers.model;

public class Flower {

	public String title;
	public String color;
	
	public Petal[] petal;
	

	// Перегрузка конструктор
	public Flower() {

	}

	public Flower(String title1, String color1) {
		title = title1;
		color = color1;
	}
	
	// Метод описывающий цветение, объявляется переменная размерности количества лепестков
	public Flowerbud bloom(int petalCount) {
		
		if (petalCount > 0) {
			//Объявляем и инициализируем массив для лепестков
			petal = new Petal[petalCount];
			// Заполняем его каким-то стандартным значением
			for (int i = 0; i < petal.length; i++) {
				petal[i] = new Petal(4, "oval", "white");
			}

		}
		Flowerbud flbud = new Flowerbud();
		flbud.onBloom();
		
		return flbud;

	}

	//Метод для процесса увядания (меняем цвет цветка и удаляем часть лепестков)
	public Flowerbud littleFade() {
		this.color = "Brown";
		
		for(int i = 0; i < petal.length; i+=3) {
			this.petal[i] = null;
		}
		Flowerbud flbud = new Flowerbud();
		flbud.onLittleFade();
		
		return flbud;
	
	}
	
	//Метод для финализированного увядания (меняем цвет цветка и удаляем все лепестки)
	public Flowerbud totalFade() {
		this.color = "Black";
		for(int i = 0; i < petal.length; i++) {
			if(this.petal[i] != null) {
				this.petal[i] = null;
			}
		}
		
		Flowerbud flbud = new Flowerbud();
		flbud.onTotalFade();
		
		return flbud;
		
	}

}
