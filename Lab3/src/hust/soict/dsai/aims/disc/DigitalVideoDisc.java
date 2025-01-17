package hust.soict.dsai.aims.disc;
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs; 
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs; 
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs; 
	}

	

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs; 
	}

	public int getId() {
        return id;
    }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getcategory() {
		return category;
	}
	public void setcategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public boolean isMatch(String title) {
	    if (this.title == null || title == null) {
	        return false;
	    }
	    return this.title.toLowerCase().contains(title.toLowerCase());
	}

	
//	@override
	public String toString(){
		return String.format("ID: %d, title: %s, category: %s, director: %s, length: %d, cost: %.2f.",
               this.id, this.title, this.category, this.director, this.length, this.cost);
	}
}
