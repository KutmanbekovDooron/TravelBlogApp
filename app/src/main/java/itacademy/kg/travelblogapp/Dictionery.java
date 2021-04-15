package itacademy.kg.travelblogapp;

public class Dictionery {
    private int image;
    private String name;
    private String dictionery;



    public Dictionery(int image, String name, String dictionery) {
        this.image = image;
        this.name = name;
        this.dictionery = dictionery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDictionery() {
        return dictionery;
    }

    public void setDictionery(String dictionery) {
        this.dictionery = dictionery;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
