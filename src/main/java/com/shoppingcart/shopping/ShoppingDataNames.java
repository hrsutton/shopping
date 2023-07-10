package com.shoppingcart.shopping;

import java.math.BigDecimal;

public class ShoppingDataNames {
  
    BigDecimal itemPrice; 
    String itemName; 
    boolean taxable;

    
    public BigDecimal getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public boolean isTaxable() {
        return taxable;
    }
    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }
   



    
}
