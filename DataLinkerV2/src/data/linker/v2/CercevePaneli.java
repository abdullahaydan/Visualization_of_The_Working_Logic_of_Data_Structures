package data.linker.v2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class CercevePaneli extends javax.swing.JPanel{
    Main cerceve;
    AcilirMenu acilirMenu;
    javax.swing.JLabel logo,title,kucult,kapat, libs;
    boolean kutuphaneMenuKapali = true;
    public void programiKapat(){
        java.awt.Window win[] = java.awt.Window.getWindows();
        for(int i=0;i<win.length;i++){
            win[i].dispose();
        } 
    }
    public CercevePaneli(Main cerceve){
        this.cerceve = cerceve;
        //setLayout(null);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(90, 60));
        setBackground(new Color(250,250,250));
        
        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        kucult = new javax.swing.JLabel();
        kapat = new javax.swing.JLabel();
        libs = new javax.swing.JLabel();
        acilirMenu = new AcilirMenu(this.cerceve);
        
        //logo.setBounds(5,10,20,getHeight() / 3);
        logo.setPreferredSize(new Dimension(25,100));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/linker/v2/UI/logo.png")));
        
        //title.setBounds(30, 0, 150, getHeight() * 2 / 3);
        title.setPreferredSize(new Dimension(150,100));
        title.setFont(new java.awt.Font("Impact", 0, 16));
        title.setText("DATA LINKER 1.2");
        
        //kucult.setBounds(getWidth() * 38 / 40, 0, getWidth() / 40, getHeight() / 2);
        kucult.setPreferredSize(new Dimension(40,30));
        kucult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/linker/v2/UI/asagiAt.png")));
        kucult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kucult.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(cerceve.istatistikPanel != null){
                    cerceve.istatistikPanel.setState(java.awt.Frame.ICONIFIED);
                }
                
                cerceve.setState(java.awt.Frame.ICONIFIED);
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kucult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/linker/v2/UI/asagiAtRenkli.png")));
                kucult.setOpaque(true);
                kucult.setBackground(new Color(230,230,230));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kucult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/linker/v2/UI/asagiAt.png")));
                kucult.setOpaque(false);
                kucult.setBackground(new Color(0,0,0,0));
            }
        });
        
        //kapat.setBounds(getWidth() * 39 / 40, 0, getWidth() / 40, getHeight() / 2);
        kapat.setPreferredSize(new Dimension(40,30));
        kapat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/linker/v2/UI/kapat.png")));
        kapat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kapat.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programiKapat();
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kapat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/linker/v2/UI/kapatRenkli.png")));
                kapat.setOpaque(true);
                kapat.setBackground(new Color(255,0,0));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kapat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/linker/v2/UI/kapat.png")));
                kapat.setOpaque(false);
                kapat.setBackground(new Color(0,0,0,0));
            }
        });
        
        //libs.setBounds(5, getHeight() * 2 / 3, 100, getHeight() / 3);  
        libs.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); //
        libs.setText("Kütüphaneler");
        libs.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(kutuphaneMenuKapali){
                    cerceve.add(acilirMenu, 0);
                    cerceve.repaint();
                    kutuphaneMenuKapali = false;
                }else{
                    cerceve.remove(acilirMenu);
                    cerceve.remove(acilirMenu.yanMenu);
                    cerceve.repaint();
                    kutuphaneMenuKapali = true;
                }
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                libs.setOpaque(true);
                libs.setBackground(new Color(230,230,255));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                libs.setOpaque(false);
                libs.setBackground(new Color(0,0,0,0));
            }
        });
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(250,250,250));
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setPreferredSize(new Dimension(175,100));
        titlePanel.add(logo, BorderLayout.WEST);
        titlePanel.add(title, BorderLayout.EAST);
        
        JPanel sagPanel = new JPanel();
        sagPanel.setBackground(new Color(250,250,250));
        sagPanel.setLayout(new BorderLayout());
        sagPanel.setPreferredSize(new Dimension(80,100));
        sagPanel.add(kucult, BorderLayout.WEST);
        sagPanel.add(kapat, BorderLayout.EAST);
        
        
        add(titlePanel, BorderLayout.WEST);
        add(sagPanel, BorderLayout.EAST);
        add(libs, BorderLayout.SOUTH);
        
       
        
        
        
        
    }
}
