package data.linker.v2;

import java.awt.Color;
import javax.swing.BorderFactory;
import java.util.*; 
import javax.swing.JFrame;


public class AcilirMenu extends javax.swing.JPanel{
    Main cerceve;
    String kutuphaneIsımleri[] = {"Sorting", "Recursive", "Stack and Queue", "Linked List", "Array Based List", "Hash Tables", "Binary Tree", "Graph", };
    javax.swing.JPanel yanMenu;
    
    class secenek extends javax.swing.JLabel{
        
        String yazi;
        int id;
        
        public void Sec(int i){
            if(i == 8){
                try{
                    cerceve.programPanel = new ProgramPanel(new Sort_a.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.ISort)new Sort_a.Sort(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 9){
                try{
                    cerceve.programPanel = new ProgramPanel(new sort_b.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.ISort)new sort_b.Sort(), cerceve, id);
                }catch(Throwable e){
                    
                            
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 10){
                try{
                    cerceve.programPanel = new ProgramPanel(new Sort_c.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.ISort)new Sort_c.Sort(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 18){
                try{
                    cerceve.programPanel = new ProgramPanel(new recursive_a.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IRecursive)new recursive_a.Recursive(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 19){
                try{
                    cerceve.programPanel = new ProgramPanel(new recursiveproject.Main(), cerceve);
                }catch(Throwable e){
                    System.out.println(e);
                    System.out.println(e);
                            
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IRecursive)new recursiveproject.Recursive(), cerceve, id);
                }catch(Throwable e){
                    System.out.println(e);
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 20){
                try{
                    cerceve.programPanel = new ProgramPanel(new Recursive_c.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IRecursive)new Recursive_c.Recursive(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 28){
                try{
                    cerceve.programPanel = new ProgramPanel(new StackQueues_a.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IStactQueue)new StackQueues_a.StackandQueue(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 29){
                try{
                    cerceve.programPanel = new ProgramPanel(new stackqueues_b.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IStactQueue)new stackqueues_b.StackQueues(5), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 30){
                try{
                    cerceve.programPanel = new ProgramPanel(new stackqueues_c.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IStactQueue)new stackqueues_c.Stack(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 38){
                try{
                    cerceve.programPanel = new ProgramPanel(new LinkedList_a.Main(), cerceve);
                    cerceve.pack();
                    cerceve.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                }catch(Throwable e){
                    System.out.println(e);
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.ILinkedList)new LinkedList_a.LinkedList(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 39){
                try{
                    cerceve.programPanel = new ProgramPanel(new LinkedList_b.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.ILinkedList)new LinkedList_b.LinkedList(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 40){
                try{
                    cerceve.programPanel = new ProgramPanel(new LinkedList_c.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.ILinkedList)new LinkedList_c.LinkedList(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 48){
                try{
                    cerceve.programPanel = new ProgramPanel(new arraybasedlist_a.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IArrayBasedList)new arraybasedlist_a.ArrayBasedList(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 49){
                try{
                    cerceve.programPanel = new ProgramPanel(new ArrayBasedList_b.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IArrayBasedList)new ArrayBasedList_b.ArrayBasedList(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 50){
                try{
                    cerceve.programPanel = new ProgramPanel(new arraybasedlist_c.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IArrayBasedList)new arraybasedlist_c.ArrayBasedList(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 58){
                
                try{
                    cerceve.programPanel = new ProgramPanel(new hashtables_a.Main(), cerceve);
                }catch(Throwable e){
                    System.out.println(e);
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IHashTable)new hashtables_a.HashTables(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
                
            }else if(i == 59){
                try{
                    cerceve.programPanel = new ProgramPanel(new hashtables_b.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IHashTable)new hashtables_b.HashTables(new long[0],""), cerceve, id);
                }catch(Throwable e){
                    System.out.println(e);
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 60){
                try{
                    cerceve.programPanel = new ProgramPanel(new hashtables_c.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IHashTable)new hashtables_c.HashTables(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 68){
                try{
                    cerceve.programPanel = new ProgramPanel(new binarytree_a.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IBinaryTree)new binarytree_a.Binarytree(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 69){
                try{
                    cerceve.programPanel = new ProgramPanel(new binarytree_b.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IBinaryTree)new binarytree_b.BinaryTree_b(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 70){
                try{
                    cerceve.programPanel = new ProgramPanel(new BinaryTree_c.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IBinaryTree)new BinaryTree_c.Binarytree(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
             }else if(i == 78){
                try{
                    cerceve.programPanel = new ProgramPanel(new graph_a.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IGraph)new graph_a.Graph(5), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 79){
                try{
                    cerceve.programPanel = new ProgramPanel(new graph_b.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IGraph)new graph_b.Graph(5), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }else if(i == 80){
                try{
                    cerceve.programPanel = new ProgramPanel(new graph_c.Main(), cerceve);
                }catch(Throwable e){
                    cerceve.programPanel = new ProgramPanel(0,cerceve);
                    return;
                }
                try{
                    cerceve.istatistikPanel = new Istatistik((interfaces.IGraph)new graph_c.Graph(), cerceve, id);
                }catch(Throwable e){
                    cerceve.istatistikPanel = new Istatistik();
                }
            }
            else{
                cerceve.programPanel = new ProgramPanel(i, cerceve);
            }
            
        }
        secenek(String yazi, int id, int x, int y, int w, int h){
            setBounds(x, y, w, h);
            this.yazi = yazi;
            this.id = id;
            setText(this.yazi);
            addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                   if(id < 8){
                        cerceve.remove(yanMenu);
                        yanMenu = new javax.swing.JPanel();
                        //yanMenu.setLayout(null);
                        yanMenu.setBackground(new Color(240,240,240));
                        yanMenu.setBounds(165, (int)cerceve.ekran_uzunlugu/18 + getY(), 100, (int)cerceve.ekran_uzunlugu/15);
                        yanMenu.add(new secenek("Grup A", id * 10 + 8, 5, 0, 100, (int)yanMenu.getHeight()/3));
                        yanMenu.add(new secenek("Grup B", id * 10 + 9, 5, (int)yanMenu.getHeight()/3, 100, (int)yanMenu.getHeight()/3));
                        yanMenu.add(new secenek("Grup C", id * 10 + 10, 5, (int)yanMenu.getHeight()*2/3, 100, (int)yanMenu.getHeight()/3));
                        cerceve.add(yanMenu, 0);
                        cerceve.repaint();
                   }else{
                       //javax.swing.JFrame x = new HashTables.Main();
                       if(cerceve.istatistikPanel != null){
                           cerceve.istatistikPanel.dispose();
                       }
                       if(cerceve.programPanel.program != null){
                           cerceve.remove(cerceve.programPanel.program);
                           cerceve.repaint();
                       }
                       Sec(id);
                       
                       cerceve.remove(cerceve.ustPanel.acilirMenu);
                       cerceve.remove(yanMenu);
                       cerceve.ustPanel.kutuphaneMenuKapali = true;
                       cerceve.repaint();
                   }
                }
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    setOpaque(true);
                    setBackground(new Color(230,230,255));
                }
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    setOpaque(false);
                    setBackground(new Color(0,0,0,0));
                }
            });
        }
        
    }
    
    AcilirMenu(Main cerceve){
        this.cerceve = cerceve;
        //setLayout(null);
        
        yanMenu = new javax.swing.JPanel();
        //yanMenu.setLayout(null);
        yanMenu.setBackground(new Color(240,240,240));
        
        setBackground(new Color(240,240,240));
        setBounds(5, (int)cerceve.ekran_uzunlugu/18, 160, (int)cerceve.ekran_uzunlugu/4);
        setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220), 1));
        
        int i = 0;
        for(String isim : kutuphaneIsımleri){
            add(new secenek(isim, i, 5, (int)getHeight() * i /8, 160, (int)getHeight()/8));
            i += 1;
        }
    }
}

