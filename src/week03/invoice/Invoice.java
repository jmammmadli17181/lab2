package week03.invoice;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = Math.max(quantity, 0);
        this.pricePerItem = Math.max(pricePerItem, 0.0);
    }

    public String getNomer() {
        return partNumber;
    }

    public void setNomer(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDscr() {
        return partDescription;
    }

    public void setDscr(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getPurch() {
        return quantity;
    }

    public void setPurch(int quantity) {
        this.quantity = Math.max(quantity, 0);
    }

    public double getPrice() {
        return pricePerItem;
    }

    public void setPrice(double pricePerItem) {
        this.pricePerItem = Math.max(pricePerItem, 0.0);
    }

    public double getInvoiceAmount() {
        System.out.println("Invoice amount of the package: ");
        return pricePerItem * quantity;
    }
}