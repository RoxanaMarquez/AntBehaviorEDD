/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;
import SimpleList.List;
import SimpleList.Node;

/**
 *
 * @author Posilandia
 */
public class CityMap {
    private List cityList;
    private Edge road;
    private Edge map;

    
    
    public CityMap(){
        this.cityList = null;
        this.road = null;   
    }
    
    public CityMap(List cityList, Edge road){
        this.cityList = cityList;
        this.road = road;
    }

    
    public void makemap(){
        Edge mapMat [];
        
    }
                                        
    
    
  
    public void addroad(Edge road){
        Node auxNode = new Node();
        
        
        if (this.cityList != null){
            while (this.cityList.getCity()!= null){
                if (this.cityList.getCity() == road.getCityInit()){
                    
                }
            }
        }
    }
    
    /**
     * @return the cityList
     */
    public List getCityList() {
        return cityList;
    }

    /**
     * @param cityList the cityList to set
     */
    public void setCityList(List cityList) {
        this.cityList = cityList;
    }

    /**
     * @return the road
     */
    public Edge getRoad() {
        return road;
    }

    /**
     * @param road the road to set
     */
    public void setRoad(Edge road) {
        this.road = road;
    }
    
 
}
