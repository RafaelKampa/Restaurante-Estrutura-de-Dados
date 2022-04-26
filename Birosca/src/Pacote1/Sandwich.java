package Pacote1;

public class Sandwich extends Dish {
    private String bread;
    private String filling;
    private String sauce;

    public Sandwich(String name, String date, float price, float weight, String bread, String filling, String sauce) {
        super(name, date, price, weight);
        this.bread = bread;
        this.filling = filling;
        this.sauce = sauce;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", filling='" + filling + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
