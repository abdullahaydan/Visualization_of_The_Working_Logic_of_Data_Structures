package data.linker.v2;

import java.awt.BorderLayout;
public class ProgramPanel{
    javax.swing.JPanel program;
    public ProgramPanel(){
         program = new javax.swing.JPanel();
         program.setLayout(new BorderLayout());
         program.setOpaque(true);
         program.setBackground(new java.awt.Color(200,200,200));
    }
    public ProgramPanel(int i, Main cerceve){
        program = new javax.swing.JPanel();
        program.setBounds(0,60,1920,1020);
        javax.swing.JLabel  text= new javax.swing.JLabel();
        text.setText("<html><body><p style='color:red;font-size:14px;'>Main Modülü Bulunamadı!</p></body></html>");
        text.setBounds(100, 20 ,300,50);
        program.add(text);
        cerceve.getContentPane().add(program, BorderLayout.CENTER, -1);
        cerceve.repaint();
    }
    public ProgramPanel(javax.swing.JPanel program, Main cerceve){
        if(cerceve.programPanel.program != null){
            cerceve.remove(cerceve.programPanel.program);
        }
        //program.setLocation(0, 60);
        this.program = program;
        //this.program.setLayout(new BorderLayout());
        cerceve.getContentPane().add(this.program, -1);
        this.program.revalidate();
        cerceve.repaint();
        System.out.println("Buraya Geldi!");
        
    }
}
