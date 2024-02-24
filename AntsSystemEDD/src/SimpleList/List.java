/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleList;

/**
 *
 * @author Posilandia
 */
public class List {
    private Node city;
    private int size;
    private Node head;
    private Node initialCity;
    private Node finalCity;

    public List(Node city, int size, Node head, Node initialCity, Node finalCity) {
        this.city = null;
        this.size = 0;
        this.head = null;
        this.initialCity = null;
        this.finalCity = null;
    }
    
        public List() {
        this.city = city;
        this.size = size;
        this.head = head;
        this.initialCity = initialCity;
        this.finalCity = finalCity;
    }
        
        
    public void addCity(String newCityId){
         Node newNode = new Node();
         newNode.setCityId(newCityId);
        
        if (this.size == 0){
            this.setCity(newNode);
            this.setHead(newNode);
            this.setInitialCity(newNode);
            this.setSize(1);
        }else {
            this.city.setNext(newNode);
            this.setCity(newNode);
            this.setFinalCity(newNode);
            this.setSize(getSize()+1);
            this.setFinalCity(newNode);
        }
    
    }    
    
    public void printList(){
        Node newNode = new Node(); 
        System.out.println("Ciudad inicial");
        this.initialCity.printNode();
        System.out.println("ciudad final");
        this.finalCity.printNode();
        System.out.println("Ciudades");
        newNode = this.head;
        while (newNode != null) {
            newNode.printNode();
            newNode = newNode.getNext();
         }
        
        
       
        
     }
        
         
    
    

    /**
     * @return the city
     */
    public Node getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(Node newCity) {
        this.city = newCity;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the head
     */
    public Node getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * @return the initialCity
     */
    public Node getInitialCity() {
        return initialCity;
    }

    /**
     * @param initialCity the initialCity to set
     */
    public void setInitialCity(Node initialCity) {
        this.initialCity = initialCity;
    }

    /**
     * @return the finalCity
     */
    public Node getFinalCity() {
        return finalCity;
    }

    /**
     * @param finalCity the finalCity to set
     */
    public void setFinalCity(Node finalCity) {
        this.finalCity = finalCity;
    }
    
    
}
