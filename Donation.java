/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodnetworkrescue;

/**
 *
 * @author EmoshiogweOmokhudu
 */
public class Donation {
    private String foodType;
    private int quantity;
    private String expiryDate;
    private String availabilityTime;


    
public Donation(String foodType, int quantity, String expiryDate, String availabilityTime){
    this.foodType = foodType;
    this.quantity = quantity;
    this.expiryDate = expiryDate;
    this.availabilityTime = availabilityTime;

}

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getAvailabilityTime() {
        return availabilityTime;
    }

    public void setAvailabilityTime(String availabilityTime) {
        this.availabilityTime = availabilityTime;
    }

public String getDetails(){
    return "Food Type:" +foodType+
            ",Quantity:" +quantity+
            ",Expiry Date:"+expiryDate+
            ",Availability Time:" +availabilityTime;
             
}
}

    
