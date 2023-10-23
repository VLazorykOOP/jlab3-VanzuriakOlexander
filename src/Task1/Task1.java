package Task1;

public class Task1 {
    public static void main(String[] args) {
        Organization organization1 = new Organization("Ford", 200000, 300, "Auto");
        System.out.println(organization1.toString());
        InsuranceCompany insuranceCompany1 = new InsuranceCompany("Tiger", 3000, 50);
        System.out.println(insuranceCompany1.toString());
        OilGasCompany oilGasCompany = new OilGasCompany("Good oil", 3000000, 250);
        System.out.println(oilGasCompany.toString());
        Factory factory1 = new Factory("Wood", 340000, 200);
        System.out.println(factory1.toString());
    }
}
