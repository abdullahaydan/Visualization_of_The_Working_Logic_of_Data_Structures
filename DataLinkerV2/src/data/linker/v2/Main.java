package data.linker.v2;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Main extends javax.swing.JFrame{
    
    //  Ekran Boyutu Tanımlamaları
    double ekran_genisligi = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
    double ekran_uzunlugu = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    
    //  Panel Tanımlamaları
    CercevePaneli ustPanel;
    Istatistik istatistikPanel;
    ProgramPanel programPanel;
    //interfaces.HashTable x = new hashtables_c.HashTables();
    
    Main(){
        //setLayout(null);
        setLayout(new BorderLayout());

        ustPanel = new CercevePaneli(this);
        programPanel = new ProgramPanel();
        
        getContentPane().add(ustPanel, BorderLayout.NORTH, 0);
        getContentPane().add(programPanel.program, BorderLayout.CENTER);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(210,210,210));
        pack();
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        Main cerceve = new Main();
    }
    
}
