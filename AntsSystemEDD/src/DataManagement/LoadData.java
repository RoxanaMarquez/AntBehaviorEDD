/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataManagement;

/*
*       MIS LIBRERIAS
*/
import Graph.CityMap;
import SimpleList.List;
/*
*        LIBRERIAS EXTERNAS
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *Clase que Define los metodos para cargar archivos al sistema. Lee el texto en String y los introduce en una 
 * lista convertidos a enteros.
 * @author Posilandia
 */
public class LoadData {
    private String userData;

    public LoadData() {
        this.userData = ""; 
    }
    
    /**
     * Metodo para buscar el archivo de data en formato txt utilizando jfileChooser
     * La carpeta que se abrira por defecto es la misma donde esta el proyacto, ahi habra un archivo de pruba por default
     * @param args 
     */
    public static void ReadInfo(String[] args, List cityList, CityMap map) {
        
        // -----------------        Inicializacion de variables
        Boolean flagc = false; // esta variable controla que la informacion que esta en el texto es correcta
        Boolean flaga = false;
        Boolean flagERROR = false;
        
         LoadData dataEntry = new LoadData();
         List aristasList = new List();
                 
         // ----------------           cuerpo del metodo
         Scanner entry = null;
         JFileChooser fileChooser = new JFileChooser("");
         FileFilter txtfilter = new FileNameExtensionFilter(" ","txt"); 
         fileChooser.setFileFilter(txtfilter);
         int valor = fileChooser.showOpenDialog(fileChooser);
         if (valor == JFileChooser.APPROVE_OPTION) {
                String ruta = fileChooser.getSelectedFile().getAbsolutePath();
                try {
                     File f = new File(ruta);
                     cityList.setListFileName(ruta);
                     entry = new Scanner(f);
                      if (entry != null) {
                                    // entry.nextLine();
                                   while (entry.hasNextLine()){
                                            dataEntry.setuserData(entry.nextLine());
                                            //System.out.println(dataEntry.getuserData());
                                            if (dataEntry.getuserData().equals("ciudad")|| flagc){
                                                flagc = true;    
                                            }else if (dataEntry.getuserData().equals("aristas")|| flaga){
                                                flagc = false;
                                                flaga =  true;
                                            }else{
                                                flagERROR = true;
                                                flaga = false;
                                                flagc = false;
                                                break;
                                            }
                                            if (flagc){
                                                dataEntry.fillCityList(dataEntry.getuserData(),cityList );
                                            }
                                            if (flaga){aristasList.addCity(dataEntry.userData);}
                                   }  
                          }        
                       //DataEntry.appendUserData(entry.nextLine());
                       cityList.printList();
                      //aristasList.printList();

                  } catch (FileNotFoundException e) {
                         System.out.println(e.getMessage());
                  } finally {
                        if (entry != null) {
                            entry.close();
                        }
                }
         } else {
                System.out.println("No se ha seleccionado ningún fichero");
         }
     }

    /*
    *       metodo para llenar la lista simple de ciudades
    */
    public void fillCityList(String name, List cityList){
        int number =0;
        try{
            if ((name.equals("ciudad") == false)  && (name.isEmpty() == false)){
            number = Integer.parseInt(name);
            cityList.addCity(name);
            }
            
        } catch ( NumberFormatException n){
            number = 0;
        }
    }

    /**
     * @return the UserData
     */
    public String getuserData() {
        return userData;
    }

    /**
     * @param UserData the UserData to set
     */
    public void setuserData(String userData) {
        this.userData = userData;
    }
    
    public void appenduserData(String NewEntry){
        this.userData = userData + NewEntry;
    }
}
    

 
      
    

