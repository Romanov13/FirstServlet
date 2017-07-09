package servlet;

import java.io.File;
import java.io.FilenameFilter;


    public class GalleryFormer{
        public class JPGFilter implements FilenameFilter{

            private String ext = ".png";
            
            
        @Override
        public boolean accept(File dir, String name) {
            return name.toLowerCase().endsWith(ext);
        }
           
        }
    public String formGallery(){
        
        StringBuilder result = new StringBuilder();
        result.append("<div>");
        result.append("\n");
        
    /**
     *
     */
    
        String path = "C:/Users/samsung/Documents/NetBeansProjects/FirstServlet/images";
                File dir = new File(path);
        File[] imgList = dir.listFiles();
                
        for(int x = 0; x<imgList.length; x++){
            result.append("<div>");
    result.append("<img src='images/");
    result.append(imgList[x].getName());
    result.append("'/>");
 
    result.append("</div");
    
}
        result.append("\n</div>");
        return String.valueOf(result);
    }

    }

