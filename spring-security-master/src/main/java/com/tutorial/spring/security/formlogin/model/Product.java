package com.tutorial.spring.security.formlogin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(name="productCode", nullable=false, unique=true)
    private String productCode;

    @Column(name="productName")
    private String productName;

    @Column(name="productLine")
    private String productLine;

    @Column(name="productScale")
    private String productScale;

    @Column(name="productVendor")
    private String productVendor;

    @Column(name="productDescription")
    private String productDescription;

    @Column(name="productImageLink")
    private String productImageLink;

    @Column(name="quantityInStock")
    private int quantityInStock;

    @Column(name="buyPrice")
    private double buyPrice;

    @Column(name="MSRP")
    private double MSRP;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLine() {
        return productLine;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public String getProductScale() {
        return productScale;
    }

    public void setProductScale(String productScale) {
        this.productScale = productScale;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getMSRP() {
        return MSRP;
    }

    public void setMSRP(double MSRP) {
        this.MSRP = MSRP;
    }

    public String getProductImageLink() {
        return productImageLink;
    }

    public void setProductImageLink(String productImageLink) {
        this.productImageLink = productImageLink;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productLine='" + productLine + '\'' +
                ", productScale='" + productScale + '\'' +
                ", productVendor='" + productVendor + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", buyPrice=" + buyPrice +
                ", MSRP=" + MSRP +
                '}';
    }


}