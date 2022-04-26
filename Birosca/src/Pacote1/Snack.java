package Pacote1;

public class Snack extends Dish {
    private String dough;
    private String filling;

    public Snack(String name, String date, float price, float weight, String dough, String filling) {
        super(name, date, price, weight);
        this.dough = dough;
        this.filling = filling;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "dough='" + dough + '\'' +
                ", filling='" + filling + '\'' +
                '}';
    }
}
