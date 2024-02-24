/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleList;

/**
 *
 * @author Posilandia
 */
public class Node {
    private String CityId ;
    private Node next ;

    
    
      /**
     * @param next 
     * @param CityId the CityId to set
     */
    public Node(String CityId) {
        this.CityId = CityId;
        this.next = next;
    }

    
    
      /**
     * Constructor de la Clase Node 
     * @param CityId the CityId to set
     */ 
    public Node (){
        this.CityId ="";
        this.next = null;
    
    }
    
    
   
    /**
     * @return the CityId
     */
    public String getCityId() {
        return CityId;
    }

    /**
     * @param CityId the CityId to set
     */
    public void setCityId(String CityId) {
        this.CityId = CityId;
    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }
    
    /**
     * imprime el nodo
     */
    public void printNode () {
        System.out.println(this.CityId);
        //System.out.println(this.getNext().CityId);
    }
    
    
    
    
}
