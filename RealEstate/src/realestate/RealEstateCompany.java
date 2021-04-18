/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realestate;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author denis.manning
 */
public class RealEstateCompany {
    ArrayList<Property> unassigned = new ArrayList<>();

    ArrayList<Property> assigned = new ArrayList<>();

    ArrayList<Agent> agents = new ArrayList<>();
    static int noOfAgents = 0;
    static int noOfProperty = 0;

    void addAgent() {
        Scanner input = new Scanner(System.in);
        String name;
        String phoneNumber;
        int annualBonus;
        System.out.println("name of agent");
        name = input.next();
        System.out.println("phoneNumber of agent");
        phoneNumber = input.next();
        System.out.println("annualBonus of agent");
        annualBonus = input.nextInt();
        agents.add(new Agent(noOfAgents,name,phoneNumber,annualBonus));
        noOfAgents++;
    }

    void addProperty() {
        Scanner input = new Scanner(System.in);
         int size;
         int numBedrooms;
         int price;
        System.out.println("size of property");
        size = input.nextInt();
        System.out.println("numBedrooms of property");
        numBedrooms = input.nextInt();
        System.out.println("price of property");
        price = input.nextInt();
        unassigned.add(new Property(noOfProperty,size,numBedrooms,price));
        noOfProperty++;
    }

    void assignProperty() {
        for(Agent a : agents){
            System.out.println(a.toString());
        }
        System.out.println("Choose");
        Scanner input = new Scanner(System.in);
        int id;
        id = input.nextInt();
        for(Property a : unassigned){
            System.out.println(a.toString());
        }
        System.out.println("Choose");
        int propid;
        propid = input.nextInt();
        for(Agent a : agents){
            if(a.getAgentID() == id){
                a.addProperty(unassigned.get(propid));

                assigned.add(unassigned.get(propid));
                unassigned.remove(propid);
            }
        }
    }

    void sellProperty() {
        for(Agent a : agents){
            System.out.println(a.toString());
        }
        System.out.println("Choose");
        Scanner input = new Scanner(System.in);
        int id;
        id = input.nextInt();
        for(Property a : agents.get(id).getProperty()){
            System.out.println(a.toString());
        }
        System.out.println("Choose");
        int propid;
        propid = input.nextInt();
        for(Property a : agents.get(id).getProperty()){
            if(a.getPropertyID() == propid){
                agents.get(id).setAnnualBonus(a.getPrice()*0.01);
                agents.get(id).removeProperty(propid);
            }
        }
    }
}
