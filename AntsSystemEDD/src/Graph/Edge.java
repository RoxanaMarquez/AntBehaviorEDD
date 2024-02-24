/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;
import SimpleList.Node;

/**
 *
 * @author Posilandia
 */
public class Edge {
    private Node cityInit;
    private Node cityEnd;
    private int distance;

    public Edge(Node cityInit, Node cityEnd, int distance) {
        this.cityInit = cityInit;
        this.cityEnd = cityEnd;
        this.distance = distance;
    }

        public Edge() {
        this.cityInit = null;
        this.cityEnd = null;
        this.distance = 0;
    }

    
    
    
    
    /**
     * @return the cityInit
     */
    public Node getCityInit() {
        return cityInit;
    }

    /**
     * @param cityInit the cityInit to set
     */
    public void setCityInit(Node cityInit) {
        this.cityInit = cityInit;
    }

    /**
     * @return the cityEnd
     */
    public Node getCityEnd() {
        return cityEnd;
    }

    /**
     * @param cityEnd the cityEnd to set
     */
    public void setCityEnd(Node cityEnd) {
        this.cityEnd = cityEnd;
    }

    /**
     * @return the distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }
    
}
