/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagement;

/**
 *
 * @author Posilandia
 */
public class ManagementFunctions {
    private String UserFileName;
    private int InicialCity;
    private int FinalCity;
    private String rawData;

    public ManagementFunctions() {
        this.UserFileName = null;
        this.InicialCity = 0;
        this.FinalCity = 0;
        this.rawData = null;
    }
    
    
  /**
 * Metodo para buscar el archivo de texto y retornar el contenido
 * 
 */  
    public static void GetInfo(String[] args) {
        ManagementFunctions RetrieveData = new ManagementFunctions();
        LoadData FileInfo = new LoadData();
        FileInfo.ReadInfo(args);
        
                
         //RetrieveData.setRawData(FileInfo.getUserData());
         //RetrieveData.printRawData();

        
        
        
        
        
         //RetrieveData.setUserFileName(FileInfo.getUserFileName());
        
        
        
        /*
        while (FileInfo.getUserData().hasNext()) {
            System.out.println(FileInfo.getUserData().nextLine());
        }
        */
        //FileInfo.getUserData();
        
        
    }
    
    public static void ReadFile (){
    
    
    
    }
    
    
    /**
     * @return the UserFileName
     */
    public String getUserFileName() {
        return UserFileName;
    }

    /**
     * @param UserFileName the UserFileName to set
     */
    public void setUserFileName(String UserFileName) {
        this.UserFileName = UserFileName;
    }

    /**
     * @return the InicialCity
     */
    public int getInicialCity() {
        return InicialCity;
    }

    /**
     * @param InicialCity the InicialCity to set
     */
    public void setInicialCity(int InicialCity) {
        this.InicialCity = InicialCity;
    }

    /**
     * @return the FinalCity
     */
    public int getFinalCity() {
        return FinalCity;
    }

    /**
     * @param FinalCity the FinalCity to set
     */
    public void setFinalCity(int FinalCity) {
        this.FinalCity = FinalCity;
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
