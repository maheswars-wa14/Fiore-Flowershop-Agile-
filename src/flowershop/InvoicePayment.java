/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershop;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author Atlas
 */
public class InvoicePayment {
    private int invoiceNo,customerID, date, quantity;
    private double price, totalprice;
    private String flowName, description, limited;

    public InvoicePayment(int invoiceNo, int customerID, int date, int quantity, double price, double totalprice, String flowName, String description, String limited) {
        this.invoiceNo = invoiceNo;
        this.customerID = customerID;
        this.date = date;
        this.quantity = quantity;
        this.price = price;
        this.totalprice = totalprice;
        this.flowName = flowName;
        this.description = description;
        this.limited = limited;
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getDate() {
        return date;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public String getFlowName() {
        return flowName;
    }

    public String getDescription() {
        return description;
    }

    public String getLimited() {
        return limited;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLimited(String limited) {
        this.limited = limited;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.invoiceNo;
        hash = 37 * hash + this.customerID;
        hash = 37 * hash + this.date;
        hash = 37 * hash + this.quantity;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totalprice) ^ (Double.doubleToLongBits(this.totalprice) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.flowName);
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.limited);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InvoicePayment other = (InvoicePayment) obj;
        if (this.invoiceNo != other.invoiceNo) {
            return false;
        }
        if (this.customerID != other.customerID) {
            return false;
        }
        if (this.date != other.date) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalprice) != Double.doubleToLongBits(other.totalprice)) {
            return false;
        }
        if (!Objects.equals(this.flowName, other.flowName)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.limited, other.limited)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InvoicePayment{" + "invoiceNo=" + invoiceNo + ", customerID=" + customerID + ", date=" + date + ", quantity=" + quantity + ", price=" + price + ", totalprice=" + totalprice + ", flowName=" + flowName + ", description=" + description + ", limited=" + limited + '}';
    }

   

   
}
