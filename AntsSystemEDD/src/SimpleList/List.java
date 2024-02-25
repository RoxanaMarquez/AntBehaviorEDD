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
    private String listFileName;

    public List(Node city, int size, Node head, Node initialCity, Node finalCity) {
        this.city = null;
        this.size = 0;
        this.head = null;
        this.initialCity = null;
        this.finalCity = null;
        this.listFileName = "";
    }
    
        public List() {
        this.city = city;
        this.size = size;
        this.head = head;
        this.initialCity = initialCity;
        this.finalCity = finalCity;
        this.listFileName = "";

    }
        
    /*
     * Metodo para agregar ciudades (al final)
     */    
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
    
    
     /*
     * Metodo para eliminar ciudades 
     */     
    public int deleteCity(Node delCity){
        Node nextNode = new Node();
        Node indexNode = new Node();
        Node auxNode = new Node();
        
        String returnMessage = "";
        int retorno = 0;
        Boolean deleted = false;
        
        if (this.size == 0){
            returnMessage = "No puedes eliminar una ciudad! Carga una lista de ciudades en el sistema.";
            retorno = 1;
        }else{
             indexNode = this.head;
             if (indexNode == delCity){
                 auxNode = this.head.getNext();
                 this.setHead(auxNode);
                 this.setInitialCity(auxNode);
                 deleted = true;
                 returnMessage ="La ciudad " +delCity.getCityId()+" ha sido eliminada correctamente. ";
                 retorno = 3;
             }else{
                 while (this.city != null){
                        nextNode = this.city.getNext();
                        if (nextNode == delCity){
                            auxNode = nextNode.getNext();
                            nextNode.setNext(null);
                            this.city.setNext(auxNode);
                            deleted = true;
                            returnMessage ="La ciudad " +delCity.getCityId()+" ha sido eliminada correctamente. ";
                            retorno = 3;
                        }
                 }
             }
             if (deleted == false){
            returnMessage ="La ciudad no existe, intente nuevamente. ";
            retorno = 2;
             }
        }
        return retorno;
    }
    
    /*
     * Metodo para imprimir la lista
     */       
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

    /**
     * @return the listFileName
     */
    public String getListFileName() {
        return listFileName;
    }

    /**
     * @param listFileName the listFileName to set
     */
    public void setListFileName(String listFileName) {
        this.listFileName = listFileName;
    }
    
    
}
