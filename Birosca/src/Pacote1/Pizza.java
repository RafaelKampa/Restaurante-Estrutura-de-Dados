package Pacote1;

public class Pizza extends Dish {
    private String dough;
    private String filling;
    private String edge;

    public Pizza(String name, String date, float price, float weight, String dough, String filling, String edge) {
        super(name, date, price, weight);
        this.dough = dough;
        this.filling = filling;
        this.edge = edge;
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

    public String getEdge() {
        return edge;
    }

    public void setEdge(String edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", filling='" + filling + '\'' +
                ", edge='" + edge + '\'' +
                '}';
    }
}
