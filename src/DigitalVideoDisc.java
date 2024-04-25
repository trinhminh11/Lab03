

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	private static int nbDigitalVideoDiscs = 0;

	public DigitalVideoDisc(){}

	public DigitalVideoDisc(String title){this.title = title; id = nbDigitalVideoDiscs; nbDigitalVideoDiscs++;}
	
	public DigitalVideoDisc(String title, String category, float cost){this(title); this.category = category; this.cost = cost;}
	
	public DigitalVideoDisc(String title, String category, String director, float cost){this(title, category, cost); this.director = director;}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost){this(title, category, director, cost); this.length = length;}

	public int getID(){
		return id;
	}
	
	public void deepCopy(DigitalVideoDisc other){
		this.title = other.title;
		this.category = other.category;
		this.director = other.director;
		this.length = other.length;
		this.cost = other.cost;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public String getCategory(){
		return category;
	}

	public String getDirector(){
		return director;
	}

	public int getLength(){
		return length;
	}

	public float getCost(){
		return cost;
	}
}
