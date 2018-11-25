/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershop;

import java.util.Objects;

/**
 *
 * @author Atlas
 */
public class FlowerCatalog {
    
    private String flowerName;
    private double price;

    public FlowerCatalog(String flowerName, double price) {
        this.flowerName = flowerName;
        this.price = price;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public double getPrice() {
        return price;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.flowerName);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
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
        final FlowerCatalog other = (FlowerCatalog) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.flowerName, other.flowerName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FlowerCatalog{" + "flowerName=" + flowerName + ", price=" + price + '}';
    }

   
    
}
