package Task1;

public class InsuranceCompany extends Organization {
    public InsuranceCompany(String name, double money_per_month, int number_of_employers) {
        super(name, money_per_month, number_of_employers, "Insurance company");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}