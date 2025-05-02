package se.kth.iv1350.mjj.model.DTO;
import java.util.ArrayList;
<<<<<<< HEAD

public class SaleDTO {
    double runningTotal;
    double totalTax;
    ArrayList<ProductDTO> productsInSale = new ArrayList<ProductDTO>();

    SaleDTO(double runningTotal, double totalTax) {
        this.runningTotal = runningTotal;
        this.totalTax = totalTax;
    }
    public double getRunningTotal() {
        return runningTotal;
    }
    public double getTotalTax() {
        return totalTax;
    }
    public ArrayList<ProductDTO> getProductsInSale() {
        return productsInSale;
    }
}
=======
import java.util.Map.Entry;

public class SaleDTO {
    private double runningTotal;
    private double totalTax;
    private ArrayList<Entry<ProductDTO, Integer>> productsInSale;

    /**
     * Creates a SaleDTO from the supplied running total, total tax, and list of products
     * 
     * @param runningTotal      The running total of the sale
     * @param totalTax          The total amount of tax in the sale
     * @param productsInSale    An ArrayList of products in the sale.
     */
    public SaleDTO(double runningTotal, double totalTax, ArrayList<Entry<ProductDTO, Integer>> productsInSale) {
        this.runningTotal = runningTotal;
        this.totalTax = totalTax;
        this.productsInSale = productsInSale;
    }

    /**
     * Getter for the running total.
     * 
     * @return The running total for the sale.
     */
    public double getRunningTotal() {
        return runningTotal;
    }

    /**
     * Getter for the total tax amount.
     * 
     * @return The total amount of tax.
     */
    public double getTotalTax() {
        return totalTax;
    }

    /**
     * Getter for the products featured in the sale.
     * 
     * @return An arraylist of products featured in the sale.
     */
    public ArrayList<Entry<ProductDTO, Integer>> getProductsInSale() {
        return productsInSale;
    }
}
>>>>>>> malte/sem3
