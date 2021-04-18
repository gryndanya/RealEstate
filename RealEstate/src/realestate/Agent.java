package realestate;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Agent {
    private int agentID;
    private String name;
    private String phoneNumber;
    private double annualBonus=0;


    private ArrayList<Property> property = new ArrayList<>();

    public void removeProperty(int id){
        for(Property p : property){
            if(p.getPropertyID()==id){
                this.property.remove(p);
            }
        }
    }
    public Agent() {
    }

    public Agent(int agentID, String name, String phoneNumber, int annualBonus) {
        this.agentID = agentID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public void addProperty(Property property){
        this.property.add(property);
    }
    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus+= annualBonus;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "agentID=" + agentID +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public ArrayList<Property> getProperty() {
        return property;
    }

    public void setProperty(ArrayList<Property> property) {
        this.property = property;
    }
}
