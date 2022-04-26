package Pacote1;

public class Dish {
    private String name;
    private String date;
    private float price;
    private float weight;

    public Dish(String nome, String date, float price, float weight) {
        this.name = nome;
        this.date = date;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", weight=" + weight +
                '}';
    }
}
