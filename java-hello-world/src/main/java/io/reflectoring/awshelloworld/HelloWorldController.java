package io.reflectoring.awshelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

@RestController
public class HelloWorldController {

  @GetMapping("/hello")
  public String helloWorld(){
		String returnText = " ";
    	File[] paths;
        FileSystemView fsv = FileSystemView.getFileSystemView();
        
        // returns pathnames for files and directory
        paths = File.listRoots();
        
        // for each pathname in pathname array
        for(File path:paths)
        {
            // prints file and directory paths
            System.out.println(" Drive Name: "+path);
			returnText += " Drive Name: " + path;
            System.out.println(" Description: " + fsv.getSystemTypeDescription(path));
            returnText += " Description: " + fsv.getSystemTypeDescription(path);
		} 
	return returnText + " Hello AWS ! ";
  }

}
