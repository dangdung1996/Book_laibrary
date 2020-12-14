public class Book {
    //properties
    String name;
    String author;
    double weight;
    int price;
    int amount;

    //-getter
    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }
    public double getWeight() {
        return this.weight;
    }

    public int getPrice() {
        return this.price;
    }

    public int getAmount() {
        return this.amount;
    }

    //-Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    //method
    public double getTottalPrice() {
        return this.price * this.amount;
    }

    public double getTottalWeight() {
        return this.weight * this.weight;
    }

}
