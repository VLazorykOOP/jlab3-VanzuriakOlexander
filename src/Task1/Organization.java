package Task1;

public class Organization {
    private String name;
    private double money_per_month;
    private int number_of_employers;
    private String type;

    public Organization(String name, double money_per_month, int number_of_employers, String type) {
        this.name = name;
        this.money_per_month = money_per_month;
        this.number_of_employers = number_of_employers;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getMoney_per_month() {
        return money_per_month;
    }

    public int getNumber_of_employers() {
        return number_of_employers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMoney_per_month(double money_per_month) {
        this.money_per_month = money_per_month;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber_of_employers(int number_of_employers) {
        this.number_of_employers = number_of_employers;
    }

    public void employ() {
        this.number_of_employers++;
    }

    @Override
    public String toString() {
        return "Organization " +
                "name='" + name + '\'' +
                ", money_per_month=" + money_per_month +
                ", number_of_employers=" + number_of_employers +
                ", type='" + type + '\'' +
                ' ';
    }
}

