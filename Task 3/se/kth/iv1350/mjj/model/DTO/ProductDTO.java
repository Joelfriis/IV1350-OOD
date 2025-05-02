package se.kth.iv1350.mjj.model.DTO;

import se.kth.iv1350.mjj.util.Price;

public class ProductDTO {
    private int productID;
<<<<<<< HEAD
    private String productDesc;
    private double price;
    private double taxRate;

    ProductDTO(int productID, String productDesc, double price, int taxRate) {
        this.productID = productID;
        this.productDesc = productDesc;
        this.price = price;
        this.taxRate = taxRate;
    }
    public double getPrice() {
        return price;
    }
    public String getProductDesc() {
        return productDesc;
    }
    public int getProductID() {
    return productID;
    }
    public double getTaxRate() {
        return taxRate;
    }
}
=======
    private String productName;
    private String productDesc;
    private Price price;


    /**
     * Creates a ProductDTO from the supplied ID, description, price, and tax rate.
     * 
     * @param productID
     * @param productDesc
     * @param price
     * @param taxRate
     */
    public ProductDTO(int productID, String productName, String productDesc, double price, double taxRate) {
        this.productID = productID;
        this.productName = productName;
        this.productDesc = productDesc;
        this.price = new Price(price, taxRate);
    }

    /**
     * Getter for the product ID.
     * 
     * @return The ID of the product.
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Getter for the product name.
     * 
     * @return The name of the product.
     */

    public String getProductName() {
        return productName;
    }

    /**
     * Getter for the product description.
     * 
     * @return The product description.
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * Getter for the price of the product.
     * 
     * @return The product price.
     */
    public double getPrice() {
        return price.getPrice();
    }

    /**
     * Getter for the tax rate of the product.
     * 
     * @return The tax rate of the product.
     */
    public double getTaxRate() {
        return price.getTaxRate();
    }
}
>>>>>>> malte/sem3
