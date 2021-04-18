/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package realestate;

/**
 *
 * @author denis.manning
 */
public class Property {
    private int propertyID;
    private int size;
    private int numBedrooms;
    private int price;

    public Property() {
    }

    public Property(int propertyID, int size, int numBedrooms, int price) {
        this.size = size;
        this.numBedrooms = numBedrooms;
        this.price = price;
        this.propertyID = propertyID;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public int getSize() {
        return size;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
