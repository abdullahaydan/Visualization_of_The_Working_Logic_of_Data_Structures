package data.linker.v2;


import java.util.ArrayList;
import java.util.Random;



public class Istatistik extends javax.swing.JFrame{
    javax.swing.JPanel panel;
    IntCompare intCmp = new IntCompare();
    private boolean siralimi(Object[] arr){
        if(arr == null){
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if(intCmp.compare(arr[i], arr[i + 1]) == 1){
                return false;
            }
        }
        return true;
    }
    private boolean siralimi(int[] arr){
        if(arr == null){
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if(intCmp.compare(arr[i], arr[i + 1]) == 1){
                return false;
            }
        }
        return true;
    }
 
    private void Tanimla(){
        setLayout(null);
        setBounds(600,300,500,500);
        setBackground(new java.awt.Color(0,0,0));
        setResizable(false);
    }
    Istatistik(){
        Tanimla();
        javax.swing.JLabel txt= new javax.swing.JLabel();
        setTitle("HATA!!");
        txt.setText("<html><body><p color='red'>Modül Bulunamadı!</p></body></html>");
        txt.setBounds(0,0,200,100);
        add(txt);
        setVisible(true);
    }
    Istatistik(interfaces.IHashTable hash, Main cerceve, int id){
        String gecici;
        long HashTestDizi[] = {99,9999,123,312,
        99,9999,123,312,
        99,9999,123,312};/*new long[101]*/
        //int i = 0;
        /*for(i = 0; i < 100; i++){
            HashTestDizi[i] = i + 1;
        }*/
        long millis;
        long millis2;
        Tanimla();

        //  Test için hazırlık
        String grup;
        if(id % 10 == 8){
            grup = "A";
        }else if(id % 10 == 9){
            grup = "B";
        }else{
            grup = "C";
        }
        setTitle("Hash Tables " + grup + " Grubu İstatistik Sonuçları");
        try{
            hash.diziOlustur(new long[211]);
            millis = System.currentTimeMillis();
            for(long eleman:HashTestDizi){
                hash.HT_Linear(eleman);
            }
            millis2 = System.currentTimeMillis();
            gecici = "<html><body><p color='green'>Lineer Hash Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Lineer Hash Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (long)(millis2-millis) + " ms</b> </p>";
        }catch(Throwable e){
            gecici = "<html><body><p color='red'>Lineer Hash Fonksiyonu Bulunamadı!</p>";
        }
        javax.swing.JLabel text = new javax.swing.JLabel();
        text.setText(gecici);
        try{
            hash.diziOlustur(new long[211]);
            millis = System.currentTimeMillis();
            for(long eleman:HashTestDizi){
                hash.HT_Double(eleman);
            }
            millis2 = System.currentTimeMillis();
            System.out.println(millis);
            System.out.println(millis2);
            gecici = "<br><p color='green'>Double Hash Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Double Hash Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " ms</b> </p>";
        }catch(Throwable e){
            System.out.println(e);
            gecici = "<br><p color='red'>Double Hash Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            hash.diziOlustur(new long[211]);
            millis = System.currentTimeMillis();
            for(long eleman:HashTestDizi){
                hash.HT_Quadratic(eleman);
            }
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>Quadratic Hash Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Quadratic Hash Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " ms</b> </p>";
        }catch(Throwable e){
            System.out.println(e);
            gecici = "<br><p color='red'>Quadratic Hash Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            hash.diziOlustur(new long[0]);
            millis = System.currentTimeMillis();
            for(long eleman:HashTestDizi){
                hash.HT_Chaining(eleman);
            }
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>Chaining Hash Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Chaining Hash Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " ms</b> </p>";
        }catch(Throwable e){
            gecici = "<br><p color='red'>Chaining Hash Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        
        text.setBounds(10,10, getWidth() - 10, getHeight() - 10);
        
        text.setText(text.getText() + "</body></html>");
        add(text);
        setVisible(true);
    }  
    Istatistik(interfaces.IStactQueue stack, Main cerceve, int id){
           ArrayList <String> array= new ArrayList <String> (); 
           array.add("deneme0");
           array.add("deneme1");
           array.add("deneme2");
           array.add("deneme3");
           array.add("deneme4");
        String eleman;
        String gecici;
        long millis;
        long millis2;
        Tanimla();

        //  Test için hazırlık
        String grup;
        if(id % 10 == 8){
            grup = "A";
        }else if(id % 10 == 9){
            grup = "B";
        }else{
            grup = "C";
        }
        setTitle("Stack And Queue " + grup + " Grubu İstatistik Sonuçları");
        try{
            millis = System.currentTimeMillis();
            for (int i = 0; i < array.size(); i++) {
                eleman=array.get(i);
                stack.push(eleman);
            }
            millis2 = System.currentTimeMillis();
            gecici = "<html><body><p color='green'>Push Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Push Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            System.out.println(e);
            gecici = "<html><body><p color='red'>Push Fonksiyonu Bulunamadı!</p>";
        }
        javax.swing.JLabel text = new javax.swing.JLabel();
        text.setText(gecici);
        try{
            
            millis = System.currentTimeMillis();
           
             for (int i = 0; i < array.size(); i++) {
               
                stack.pop();
            }
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>Pop Fonksiyonu Stack Boyutu Kadar Çağrıldı</p>"
                + "<p  color='blue'>Pop Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            System.out.println(e);
            gecici = "<br><p color='red'>Pop Fonksiyonu Bulunamadı!</p>";
        }
	text.setText(text.getText() + gecici);
		
		
        boolean sonuc = true;
        try{
                sonuc=stack.isEmpty();
                gecici = "<br><p color='green'>isEmpty Fonksiyonu Çağrıldı</p>";
                if (!sonuc){
                    gecici += "<p color='red'>Hata:!!!Stack Dolu Pop fonksiyonu Stacki Boşaltmadı</p>";
                }else{
                    gecici += "<p color='green'>isEmpty Fonksiyonu Doğru Bir Şekilde Çalıştı</p>";
                }
        }catch(Throwable e){
            System.out.println(e);
                     gecici = "<br><p color='red'>isEmpty fonksiyonu bulunamadı</p>";
        }
        text.setText(text.getText() + gecici);
        
        
        try{
           
            millis = System.currentTimeMillis();
            for (int i = 0; i < array.size(); i++) {
                stack.enqueue(array.get(i));
            }
            
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>Enqueue Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Enqueue Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            System.out.println(e);
            gecici = "<br><p color='red'>Enqueue Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
           
            millis = System.currentTimeMillis();
            for (int i = 0; i < array.size(); i++) {
                stack.dequeue();
                
            }
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>Dequeue Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Dequeue Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            System.out.println(e);
            gecici = "<br><p color='red'>Dequeue Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
          try{
           
            millis = System.currentTimeMillis();
           stack.clear();
           sonuc=stack.isEmpty();
           millis2 = System.currentTimeMillis();
            
            gecici = "<br><p color='green'>Clear Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Clear Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            if(!sonuc) gecici += "<br><p color='red'>Clear Fonk. Hatalı!</p>";
        }catch(Throwable e){
            System.out.println(e);
            gecici = "<br><p color='red'>Clear Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
          
        
        
        text.setBounds(10,10, getWidth() - 10, getHeight() - 10);
        
        text.setText(text.getText() + "</body></html>");
        add(text);
        setVisible(true);
        
        setVisible(true);
    }
    Istatistik(interfaces.ISort sort, Main cerceve, int id){
        String gecici;
        long millis;
        long millis2;
        Object arr []=new Object [30];
        for (int i = 0; i < arr.length; i++) {
        
        arr[i]= (int)30 - i; 
           
       }
        Tanimla();
        setSize(500,1050);
        //  Test için hazırlık
        String grup;
        if(id % 10 == 8){
            grup = "A";
        }else if(id % 10 == 9){
            grup = "B";
        }else{
            grup = "C";
        }
        setTitle("Sort" + grup + " Grubu İstatistik Sonuçları");
        javax.swing.JLabel text = new javax.swing.JLabel();
        try{
            sort.setData(arr);
            
            gecici = "<html><body><p color='green'>setData Fonksiyonu Çağrıldı</p>";
        }catch(Throwable e){
            System.out.println(e);
            gecici = "<html><body><p color='red'>setData Fonksiyonu Çalışmadı!<br>Test Bitti..</p></body></html>";
            text.setText(gecici);
            text.setBounds(10,10, getWidth() - 10, getHeight() - 10);
            add(text);
            setVisible(true);
            return;
        }
        text.setText(gecici);
        try{
            millis = System.currentTimeMillis();
            sort.selectionSort();
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>Selection Sort Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Selection Sort Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            System.out.println(e);
            gecici = "<br><p color='red'>Selection Sort Fonksiyonu Bulunamadı!</p>"+e;
        }
        text.setText(text.getText() + gecici);
        Object sonuc[] = {};
        try {
            
            sonuc = sort.getData();
            gecici = "<br><p color='green'>getData Fonksiyonu Çağrıldı</p>";
            if(siralimi(sonuc)){
                gecici += "<p color='green'>Selection Sort Algoritması Doğru Çalışıyor</p>";
            }else{
                gecici += "<p color='red'>Selection Sort Algoritması Yanlış Çalışıyor!</p>";
            }
        } catch (Throwable e) {
            gecici = "<br><p color='red'>getData Fonksiyonu Çalışmadı!<br>Test Bitti..</p></body></html>";
            text.setText(text.getText() + gecici);
            text.setBounds(10,10, getWidth() - 10, getHeight() - 10);
            add(text);
            setVisible(true);
            return;
        }
        
        text.setText(text.getText() + gecici);
        
        sort.setData(arr);
        try{
            
            millis = System.currentTimeMillis();
            sort.bobbleSort();
            millis2 = System.currentTimeMillis();
            sonuc =sort.getData();
            gecici = "<br><p color='green'>Bubble Sort Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Bubble Sort Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            if(siralimi(sonuc)){
                gecici += "<p color='green'>Bubble Sort Algoritması Doğru Çalışıyor</p>";
            }else{
                gecici += "<p color='red'>Bubble Sort Algoritması Yanlış Çalışıyor!</p>";
            }
        }catch(Throwable e){
            gecici = "<br><p color='red'>Bubble Sort Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            
            sort.setData(arr);
            millis = System.currentTimeMillis();
            sort.insertionSort();
            millis2 = System.currentTimeMillis();
            sonuc =sort.getData();
            gecici = "<br><p color='green'>İnsertion Sort Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>İnsertion Sort Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            if(siralimi(sonuc)){
                gecici += "<p color='green'>İnsertion Sort Algoritması Doğru Çalışıyor</p>";
            }else{
                gecici += "<p color='red'>İnsertion Sort Algoritması Yanlış Çalışıyor!</p>";
            }
        }catch(Throwable e){
            gecici = "<br><p color='red'>İnsertion Sort Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            
            sort.setData(arr);
            millis = System.currentTimeMillis();
            sort.mergeSort();
            millis2 = System.currentTimeMillis();
            sonuc =sort.getData();
            gecici = "<br><p color='green'>Merge Sort Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Merge Sort Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            if(siralimi(sonuc)){
                gecici += "<p color='green'>Merge Sort Algoritması Doğru Çalışıyor</p>";
            }else{
                gecici += "<p color='red'>Merge Sort Algoritması Yanlış Çalışıyor!</p>";
            }    
        }catch(Throwable e){
            gecici = "<br><p color='red'>Merge Sort Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            
            sort.setData(arr);
            millis = System.currentTimeMillis();
            sort.quickSort();
            millis2 = System.currentTimeMillis();
            sonuc = sort.getData();
            gecici = "<br><p color='green'>Quick Sort Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Quick Sort Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            if(siralimi(sonuc)){
                gecici += "<p color='green'>Quick Sort Algoritması Doğru Çalışıyor</p>";
            }else{
                gecici += "<p color='red'>Quick Sort Algoritması Yanlış Çalışıyor!</p>";
            }  
        }catch(Throwable e){
            gecici = "<br><p color='red'>Quick Sort Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            sort.setData(arr);
            millis = System.currentTimeMillis();
            sort.heapSort();
            millis2 = System.currentTimeMillis();
            sonuc =sort.getData();
            gecici = "<br><p color='green'>Heap Sort Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Heap Sort Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            if(siralimi(sonuc)){
                gecici += "<p color='green'>Heap Sort Algoritması Doğru Çalışıyor</p>";
            }else{
                gecici += "<p color='red'>Heap Sort Algoritması Yanlış Çalışıyor!</p>";
            }  
        }catch(Throwable e){
            gecici = "<br><p color='red'>Heap Sort Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            sort.setData(arr);
            millis = System.currentTimeMillis();
            sort.treeSort();
            millis2 = System.currentTimeMillis();
            sonuc =sort.getData();
            gecici = "<br><p color='green'>Tree Sort Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Tree Sort Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            if(siralimi(sonuc)){
                gecici += "<p color='green'>Tree Sort Algoritması Doğru Çalışıyor</p>";
            }else{
                gecici += "<p color='red'>Tree Sort Algoritması Yanlış Çalışıyor!</p>";
            }
        }catch(Throwable e){
            gecici = "<br><p color='red'>Tree Sort Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            sort.setData(arr);
            millis = System.currentTimeMillis();
            sort.radixSort();
            millis2 = System.currentTimeMillis();
            sonuc =sort.getData();
            gecici = "<br><p color='green'>Radix Sort Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Radix Sort Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            if(siralimi(sonuc)){
                gecici += "<p color='green'>Radix Sort Algoritması Doğru Çalışıyor</p>";
            }else{
                gecici += "<p color='red'>Radix Sort Algoritması Yanlış Çalışıyor!</p>";
            }
        }catch(Throwable e){
            gecici = "<br><p color='red'>Radix Sort Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            sort.setData(arr);
            millis = System.currentTimeMillis();
            sort.gnomeSort();
            millis2 = System.currentTimeMillis();
            sonuc =sort.getData();
            gecici = "<br><p color='green'>Gnome Sort Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Gnome Sort Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            if(siralimi(sonuc)){
                gecici += "<p color='green'>Gnome Sort Algoritması Doğru Çalışıyor</p>";
            }else{
                gecici += "<p color='red'>Gnome Sort Algoritması Yanlış Çalışıyor!</p>";
            }
        }catch(Throwable e){
            gecici = "<br><p color='red'>Gnome Sort Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            sort.setData(arr);
            millis = System.currentTimeMillis();
            sort.brickSort();
            millis2 = System.currentTimeMillis();
            sonuc =sort.getData();
            gecici = "<br><p color='green'>Brick Sort Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Brick Sort Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            if(siralimi(sonuc)){
                gecici += "<p color='green'>Brick Sort Algoritması Doğru Çalışıyor</p>";
            }else{
                gecici += "<p color='red'>Brick Sort Algoritması Yanlış Çalışıyor!</p>";
            }
        }catch(Throwable e){
            gecici = "<br><p color='red'>Brick Sort Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            sort.setData(arr);
            millis = System.currentTimeMillis();
            sort.pigeonHoleSort();
            millis2 = System.currentTimeMillis();
            sonuc =sort.getData();
            gecici = "<br><p color='green'>Pigeon Hole Sort Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Pigeon Hole Sort Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            if(siralimi(sonuc)){
                gecici += "<p color='green'>Pigeon Sort Algoritması Doğru Çalışıyor</p>";
            }else{
                gecici += "<p color='red'>Pigeon Sort Algoritması Yanlış Çalışıyor!</p>";
            }
        }catch(Throwable e){
            gecici = "<br><p color='red'>Pigeon Hole Sort Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            sort.setData(arr);
            millis = System.currentTimeMillis();
            sort.shellSort();
            millis2 = System.currentTimeMillis();
            sonuc =sort.getData();
            gecici = "<br><p color='green'>Shell Sort Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Shell Sort Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            if(siralimi(sonuc)){
                gecici += "<p color='green'>Shell Sort Algoritması Doğru Çalışıyor</p>";
            }else{
                gecici += "<p color='red'>Shell Sort Algoritması Yanlış Çalışıyor!</p>";
            }
        }catch(Throwable e){
            gecici = "<br><p color='red'>Shell Sort Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            sort.setData(arr);
            millis = System.currentTimeMillis();
            sort.shellInsortSort();
            millis2 = System.currentTimeMillis();
            sonuc =sort.getData();
            gecici = "<br><p color='green'>Shell İnsort Sort Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Shell İnsort Sort Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            if(siralimi(sonuc)){
                gecici += "<p color='green'>Shell Sort Algoritması Doğru Çalışıyor</p>";
            }else{
                gecici += "<p color='red'>Shell Sort Algoritması Yanlış Çalışıyor!</p>";
            }
        }catch(Throwable e){
            gecici = "<br><p color='red'>Shell İnsort Sort Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            sort.setData(arr);
            millis = System.currentTimeMillis();
            sort.binaryInsertionSort();
            millis2 = System.currentTimeMillis();
            sonuc =sort.getData();
            gecici = "<br><p color='green'>Binary İnsort Sort Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Binary İnsort Sort Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            if(siralimi(sonuc)){
                gecici += "<p color='green'>Binary Sort Algoritması Doğru Çalışıyor</p>";
            }else{
                gecici += "<p color='red'>Binary Sort Algoritması Yanlış Çalışıyor!</p>";
            }
        }catch(Throwable e){
            gecici = "<br><p color='red'>Binary İnsort Sort Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        
        text.setBounds(10,10, getWidth() - 10, getHeight() - 10);
        
        text.setText(text.getText() + "</body></html>");
        add(text);
        setVisible(true);
    }
    Istatistik(interfaces.IRecursive recursive, Main cerceve, int id){
        String gecici;
        long millis;
        long millis2;
        Tanimla();

        //  Test için hazırlık
        String grup;
        if(id % 10 == 8){
            grup = "A";
        }else if(id % 10 == 9){
            grup = "B";
        }else{
            grup = "C";
        }
        setTitle("Recursive " + grup + " Grubu İstatistik Sonuçları");
        int sonuc;
        try{
            millis = System.currentTimeMillis();
            sonuc=recursive.faktoriyelIterator(8);
            millis2 = System.currentTimeMillis();
            if (sonuc==40320 ){
               gecici = "<html><body><p color='green'>faktoriyelIterator Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>faktoriyelIterator Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            }else{  
                gecici = "<html><body><p color='red'>faktoriyelIterator Fonksiyonu Doğru Sonucu Bulamadı!</p>";
            }
            
            
        }catch(Throwable e){
            gecici = "<html><body><p color='red'>faktoriyelIterator Fonksiyonu Bulunamadı!</p>";
        }
        javax.swing.JLabel text = new javax.swing.JLabel();
        text.setText(gecici);
        try{
            millis = System.currentTimeMillis();
            sonuc=recursive.faktoriyelRecursive(8);
            millis2 = System.currentTimeMillis();
            if (sonuc==40320){
               gecici = "<br><p color='green'>faktoriyelRecursive Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>faktoriyelRecursive Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            }else{  
                gecici = "<br><p color='red'>Faktöriyel Recursive Fonksiyonu Doğru Sonucu Bulamadı!</p>";
            }
        }catch(Throwable e){
            gecici = "<br><p color='red'>faktoriyelRecursive Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
           
            millis = System.currentTimeMillis();
            sonuc =recursive.fibonacciRecursive(8, 0);
            millis2 = System.currentTimeMillis();
            if (sonuc != 34){
                gecici = "<p color='red'>fibonacciRecursive Doğru Sonucu Bulamadı!</p>";
            }else{
                gecici = "<br><p color='green'>fibonacciRecursive Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>fibonacciRecursive Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            }
        }catch(Throwable e){
            gecici = "<br><p color='red'>fibonacciRecursive Fonksiyonu Bulunamadı!</p>";
        }
        
        text.setText(text.getText() + gecici);
        try{
          
            millis = System.currentTimeMillis();
            sonuc =recursive.fibonacciIterator(8);
            millis2 = System.currentTimeMillis();
            if (sonuc!=34){
                gecici = "<br><p color='red'>fibonacciIterator Doğru Sonucu Bulamadı!</p>";
            }else{
                gecici = "<br><p color='green'>fibonacciIterator Fonksiyonu Çağrıldı</p>"
                    + "<p  color='blue'>fibonacciIterator Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            }

        }catch(Throwable e){
            gecici = "<br><p color='red'>fibonacciIterator Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
          try{
          
            millis = System.currentTimeMillis();
           sonuc = recursive.numberPowRecursive(3, 0);
           millis2 = System.currentTimeMillis();
           if (sonuc != 32){
               gecici = "<br><p color='red'>Pow Recursive Fonksiyonu Doğru Çalışmıyor!</p>";
           }else{
               gecici = "<br><p color='green'>numberPowRecursive Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>numberPowRecursive Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
           }
        }catch(Throwable e){
            gecici = "<br><p color='red'>numberPowRecursive Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
          try{
          
            millis = System.currentTimeMillis();
            sonuc =recursive.numberPowIterator(3);
            millis2 = System.currentTimeMillis();
            if (sonuc!=32) {
                gecici = "<br><p color='red'>numberPowIterator Fonksiyonu Doğru Sonucu Bulamadı!</p>";
            }else{
                gecici = "<br><p color='green'>numberPowIterator Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>numberPowIterator Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            }
        }catch(Throwable e){
            gecici = "<br><p color='red'>numberPowIterator Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
          try{
          
            millis = System.currentTimeMillis();
            sonuc = recursive.oddNumberIterator(100);
            millis2 = System.currentTimeMillis();
            if(sonuc != 2500){
                gecici = "<br><p color='red'>oddNumberIterator Fonksiyonu Doğru Sonucu Bulamadı!</p>";
            }else{
                gecici = "<br><p color='green'>oddNumberIterator Fonksiyonu Çağrıldı</p>"
                    + "<p  color='blue'>oddNumberIterator Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            }
        }catch(Throwable e){
            gecici = "<br><p color='red'>oddNumberIterator Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
          try{
          
            millis = System.currentTimeMillis();
            sonuc = recursive.oddNumberRecursive(100, 0);
            millis2 = System.currentTimeMillis();
            if(sonuc != 2500){
                gecici = "<br><p color='red'>oddNumberRecursive Fonksiyonu Doğru Sonucu Bulamadı!</p>";
            }else{
                gecici = "<br><p color='green'>oddNumberRecursive Fonksiyonu Çağrıldı</p>"
                    + "<p  color='blue'>oddNumberRecursive Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            }
        }catch(Throwable e){
            gecici = "<br><p color='red'>oddNumberRecursive Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
          
            
            int array[] =new int[20];
            for (int i = 0; i <array.length; i++) {
                array[i]= 20 - i;
            }
            millis = System.currentTimeMillis();
            recursive.mergeSort(array, array.length);
            millis2 = System.currentTimeMillis();
            if(siralimi(recursive.diziDondur())){
                gecici = "<br><p color='green'>mergeSort Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>mergeSort Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
            }else{
                gecici = "<br><p color='red'>mergeSort Fonksiyonu Doğru Sonucu Bulamadı!</p>";
            }
            
        }catch(Throwable e){
            gecici = "<br><p color='red'>mergeSort Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        text.setBounds(10,10, getWidth() - 10, getHeight() - 10);
        
        text.setText(text.getText() + "</body></html>");
        add(text);
        setVisible(true);
    }
    Istatistik(interfaces.IArrayBasedList arrayList, Main cerceve, int id){
       String gecici;
        long millis;
        long millis2;
        Tanimla();

        //  Test için hazırlık
        String grup;
        if(id % 10 == 8){
            grup = "A";
        }else if(id % 10 == 9){
            grup = "B";
        }else{
            grup = "C";
        }
        setTitle("Array Based " + grup + " Grubu İstatistik Sonuçları");
        javax.swing.JLabel text = new javax.swing.JLabel();
        int dizi[] = new int[1000];
        

            
        
        try{
            millis = System.currentTimeMillis();
            for (int i = 0; i < 1000; i++) {
                arrayList.insertEnd(i);
            }
            millis2 = System.currentTimeMillis();
            gecici = "<html><body><p color='green'>insertEnd Fonksiyonu 1000 kere Çağrıldı</p>"
                + "<p  color='blue'>insertEnd Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<html><body><p color='red'>insertEnd Fonksiyonu Bulunamadı!</p>";
        }
        
        text.setText(gecici);
        try{
            
            millis = System.currentTimeMillis();
            arrayList.search(999);
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>search Fonksiyonu En Son Elemanı Bulacak Şekilde Çağrıldı</p>"
                + "<p  color='blue'>search Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<br><p color='red'>search Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            
            millis = System.currentTimeMillis();
           arrayList.insertAt(500, 1500);
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>insertAt Fonksiyonu Tam Dizinin Ortasına Eleman Koyacak Şekilde Çağrıldı</p>"
                + "<p  color='blue'>insertAt Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<br><p color='red'>insertAt Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
           
            millis = System.currentTimeMillis();
           arrayList.clearList();
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>clearList Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>clearList Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<br><p color='red'>clearList Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        
         
         
        text.setBounds(10,10, getWidth() - 10, getHeight() - 10);
        
        text.setText(text.getText() + "</body></html>");
        add(text);
        setVisible(true);
    }
    Istatistik(interfaces.IBinaryTree tree, Main cerceve, int id){
       String gecici;
        long millis;
        long millis2;
        Tanimla();

        //  Test için hazırlık
        String grup;
        if(id % 10 == 8){
            grup = "A";
        }else if(id % 10 == 9){
            grup = "B";
        }else{
            grup = "C";
        }
        setTitle("Binary Tree " + grup + " Grubu İstatistik Sonuçları");
        javax.swing.JLabel text = new javax.swing.JLabel();
        try{
            millis = System.currentTimeMillis();
            for (int i = 0; i < 30; i++) {
                tree.insertNode(i);
            }
            millis2 = System.currentTimeMillis();
            gecici = "<html><body><p color='green'>insertNode Fonksiyonu 30 Kere Çağrıldı</p>"
                + "<p  color='blue'>insertNode Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<html><body><p color='red'>insertNode Fonksiyonu Bulunamadı!</p>";
        }
        
        text.setText(gecici);
        try{
            
            millis = System.currentTimeMillis();
            tree.balance();
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>balance Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>balance Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<br><p color='red'>balance Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
            
            millis = System.currentTimeMillis();
           tree.deleteNode(new interfaces.IBinaryTree.Node());
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>deleteNode Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>deleteNode Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<br><p color='red'>deleteNode Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
           
            millis = System.currentTimeMillis();
           tree.agaciSifirla();
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>agaciSifirla Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>agaciSifirla Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<br><p color='red'>agaciSifirla Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        
        
        text.setBounds(10,10, getWidth() - 10, getHeight() - 10);
        
        text.setText(text.getText() + "</body></html>");
        add(text);
        setVisible(true);
    }
    Istatistik(interfaces.IGraph graph, Main cerceve, int id){
               String gecici;
        long millis;
        long millis2;
        Tanimla();

        //  Test için hazırlık
        String grup;
        if(id % 10 == 8){
            grup = "A";
        }else if(id % 10 == 9){
            grup = "B";
        }else{
            grup = "C";
        }
        setTitle("Graph " + grup + " Grubu İstatistik Sonuçları");
        try{
            millis = System.currentTimeMillis();
            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 2);
            graph.addEdge(1, 3);
            graph.addEdge(1, 4);
            graph.addEdge(2, 4);
            millis2 = System.currentTimeMillis();
            gecici = "<html><body><p color='green'>addEdge Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>addEdge Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<html><body><p color='red'>addEdge Fonksiyonu Bulunamadı!</p>";
        }
        javax.swing.JLabel text = new javax.swing.JLabel();
        text.setText(gecici);
        try{
            
            millis = System.currentTimeMillis();
            graph.BFS(0);
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>BFS Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>BFS Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<br><p color='red'>BFS Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
     
        try{
           
            millis = System.currentTimeMillis();
          graph.DFS(0);
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>DFS Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>DFS Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<br><p color='red'>DFS Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        
        text.setBounds(10,10, getWidth() - 10, getHeight() - 10);
        
        text.setText(text.getText() + "</body></html>");

        add(text);
        setVisible(true);
    }
    Istatistik(interfaces.ILinkedList linked, Main cerceve, int id){
       String gecici;
        long millis;
        long millis2;
        Tanimla();

        //  Test için hazırlık
        String grup;
        if(id % 10 == 8){
            grup = "A";
        }else if(id % 10 == 9){
            grup = "B";
        }else{
            grup = "C";
        }
        setTitle("Linked List " + grup + " Grubu İstatistik Sonuçları");
        javax.swing.JLabel text = new javax.swing.JLabel();

        try{
            millis = System.currentTimeMillis();
            for (int i = 1; i < 1000; i++) {
                linked.add(i);
            }
             millis2 = System.currentTimeMillis();
            gecici = "<html><body><p color='green'>add Fonksiyonu 1000 kere Çağrıldı</p>"
                + "<p  color='blue'>add Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<html><body><p color='red'>add Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(gecici);
          try{
           
            millis = System.currentTimeMillis();
            linked.length();
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>length Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>length Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<br><p color='red'>length Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
         try{
           
            millis = System.currentTimeMillis();
           linked.get(998);
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>get Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>get Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<br><p color='red'>get Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        try{
           
            millis = System.currentTimeMillis();
           linked.contains(999);
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>contains Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>Contains Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<br><p color='red'>contains Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
        
        try{
            
            millis = System.currentTimeMillis();
           linked.remove(857);
            millis2 = System.currentTimeMillis();
            gecici = "<br><p color='green'>remove Fonksiyonu Çağrıldı</p>"
                + "<p  color='blue'>remove Algoritması Çalışma Zamanı:&emsp;&emsp;<b>" + (double)(millis2-millis) + " </b> </p>";
        }catch(Throwable e){
            gecici = "<br><p color='red'>remove Fonksiyonu Bulunamadı!</p>";
        }
        text.setText(text.getText() + gecici);
     
        text.setBounds(10,10, getWidth() - 10, getHeight() - 10);
        
        text.setText(text.getText() + "</body></html>");
        add(text);
        setVisible(true);
    }
    
   
}
