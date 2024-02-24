/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIS;

/*
* Librerias Para manejo de Archivos
*/

import DataManagement.ManagementFunctions;






import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import static javax.swing.UIManager.get;

/**
 *
 * @author Posilandia
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShowCurrentInfo = new javax.swing.JTextArea();
        LoadFileButton = new javax.swing.JButton();
        SaveFileButton = new javax.swing.JButton();
        AddCityButton = new javax.swing.JButton();
        DeleteCityButton = new javax.swing.JButton();
        StartSimulationButton = new javax.swing.JButton();
        SavedFileName = new javax.swing.JTextField();
        SourceFileName = new javax.swing.JTextField();
        SourceFileLabel = new javax.swing.JLabel();
        SavedFileLabel = new javax.swing.JLabel();
        NextStepButton = new javax.swing.JButton();
        EndCiclesButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NewSimulationButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.lightGray);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 10, 10));
        jLabel1.setText("Ants Systems");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 50));

        ShowCurrentInfo.setColumns(20);
        ShowCurrentInfo.setRows(5);
        ShowCurrentInfo.setText("----------------------------\n\n             No\n             hay\n       informacion\n          cargada \n             en \n             el \n          sistema\n----------------------------");
        ShowCurrentInfo.setFocusable(false);
        jScrollPane1.setViewportView(ShowCurrentInfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 120, 340));

        LoadFileButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        LoadFileButton.setText("Cargar Archivo");
        LoadFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadFileButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoadFileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, -1));

        SaveFileButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        SaveFileButton.setText("Guardar archivo");
        getContentPane().add(SaveFileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, -1));

        AddCityButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        AddCityButton.setText("Agregar ciudad");
        getContentPane().add(AddCityButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, -1));

        DeleteCityButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        DeleteCityButton.setText("Eliminar ciudad");
        getContentPane().add(DeleteCityButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, -1));

        StartSimulationButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        StartSimulationButton.setText("Iniciar Ciclos");
        getContentPane().add(StartSimulationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 120, -1));

        SavedFileName.setText("---No ha guardado el archivo---");
        getContentPane().add(SavedFileName, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 260, -1));

        SourceFileName.setText(" ----No Hay ningun archivo abierto---");
        SourceFileName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SourceFileNameActionPerformed(evt);
            }
        });
        getContentPane().add(SourceFileName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 260, -1));

        SourceFileLabel.setForeground(new java.awt.Color(51, 51, 51));
        SourceFileLabel.setText("Archivo origen:");
        getContentPane().add(SourceFileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 240, -1));

        SavedFileLabel.setForeground(new java.awt.Color(51, 51, 51));
        SavedFileLabel.setText("Archivo destino:");
        getContentPane().add(SavedFileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 250, -1));

        NextStepButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        NextStepButton.setText("Siguiente Ciclo");
        NextStepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextStepButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NextStepButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 120, -1));

        EndCiclesButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        EndCiclesButton.setText("Finalizar Ciclos");
        EndCiclesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndCiclesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EndCiclesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Informacion actual:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 130, -1));

        NewSimulationButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        NewSimulationButton.setText("Nueva Simulacion");
        NewSimulationButton.setMargin(new java.awt.Insets(2, 8, 2, 8));
        NewSimulationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewSimulationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NewSimulationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 120, -1));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Roxana Marquez UNIMET 2024");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 690, 210, -1));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Background1.jpg"))); // NOI18N
        Background.setLabelFor(this);
        Background.setToolTipText("");
        Background.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Background.setOpaque(true);
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1060, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void SourceFileNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SourceFileNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SourceFileNameActionPerformed

    private void LoadFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadFileButtonActionPerformed
        // TODO add your handling code here:
        ManagementFunctions LoadFile = new ManagementFunctions();
        String[] texto = null;
        LoadFile.GetInfo(texto);
        System.out.println(texto);
        // this.ShowCurrentInfo.setText(texto);
    }//GEN-LAST:event_LoadFileButtonActionPerformed

    private void EndCiclesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndCiclesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndCiclesButtonActionPerformed

    private void NewSimulationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewSimulationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewSimulationButtonActionPerformed

    private void NextStepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextStepButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NextStepButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCityButton;
    private javax.swing.JLabel Background;
    private javax.swing.JButton DeleteCityButton;
    private javax.swing.JButton EndCiclesButton;
    private javax.swing.JButton LoadFileButton;
    private javax.swing.JButton NewSimulationButton;
    private javax.swing.JButton NextStepButton;
    private javax.swing.JButton SaveFileButton;
    private javax.swing.JLabel SavedFileLabel;
    private javax.swing.JTextField SavedFileName;
    private javax.swing.JTextArea ShowCurrentInfo;
    private javax.swing.JLabel SourceFileLabel;
    private javax.swing.JTextField SourceFileName;
    private javax.swing.JButton StartSimulationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    /**
     * *
     *
     * public class Background extends JPanel{
     *
     * public void image (Graphics g){ ImageIcon imagen = new
     * ImageIcon(get.class().getResource("Pictures\Background1.jpg"));
     * g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
     * setOpaque(false); super.paint(g); } }
**
     */
}
