package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;

    //static
    private static int nbDigitalVideoDiscs = 0;

    //getter
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getId() {
        return id;
    }

    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    //constructor
    public DigitalVideoDisc(String title) {
        this.title = title;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.title = title;
        this.director = director;
        this.category = category;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.cost = cost;
        this.length = length;
        this.director = director;
        this.category = category;
        this.id = ++nbDigitalVideoDiscs;
    }

    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
    }

    public boolean isMatch(String title){
        return this.title.equalsIgnoreCase(title);
    }
}
