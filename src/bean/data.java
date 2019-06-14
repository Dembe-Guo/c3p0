package bean;

public class data {
    private String username;
    private String name;
    private String num;
    private String price;

    @Override
    public String toString() {
        return "data{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
