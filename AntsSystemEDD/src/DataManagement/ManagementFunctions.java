/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagement;

/*
* Mis librerias
*/
import Graph.CityMap;
import SimpleList.List;


/**
 *
 * @author Posilandia
 */
public class ManagementFunctions {
    private String UserFileName;
    private String rawData;
    

    public ManagementFunctions() {
        this.UserFileName = null;
        this.rawData = null;
    }
    
    
  /**
 * Metodo para buscar el archivo de texto y retornar el contenido
 * 
 */  
    public static void GetInfo(String[] args, List cityList, CityMap map) {
        ManagementFunctions RetrieveData = new ManagementFunctions();
        LoadData FileInfo = new LoadData();
        FileInfo.ReadInfo(args, cityList,  map);

    }
   
    
    /**
     * @return the rawData
     */
    public String getRawData() {
        return rawData;
    }

    /**
     * @param rawData the rawData to set
     */
    public void setRawData(String rawData) {
        this.rawData = rawData;
    }
    
    
        public void printRawData() {
            System.out.println(this.UserFileName);
        
            //System.out.println(this.rawData);
        }
    
}
