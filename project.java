package com.mphasis.basics;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class project {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    int operation = 0;
    System.out.println("Enter 1 for display file,2 for create file and add, 3 for delete file,4 for search file,5 exit:");
    Scanner sc=new Scanner(System.in);
    operation=sc.nextInt();
    while(true)
    {
    switch(operation){
    case 1:
    String path="C:\\java\\";
    System.out.println("Enter the file to display:");
    File f=new File(path);
    File filename[]=f.listFiles();
    for(File ff:filename) {
    	System.out.println(ff.getName());
     break;
    }
    
    case 2:
    	String path1="C:\\java\\";
    	Scanner sc2=new Scanner(System.in);

    	ArrayList<String> al=new ArrayList<>();
    	while(true) {
    	System.out.println("enter the file name to create");
    	String filename1=sc2.next();
    	String finalname=path1+filename1;
    	System.out.println(finalname);
    	
    	//create a file
    	File f2=new File(finalname);
    	boolean b=f2.createNewFile();
    	if(b!=true) {
    		System.out.println("the file not created");
    	}
    	else {
    		al.add(filename1);
    		System.out.println("file created");
    		break;
    	}

    	System.out.println("the collection of files is "+ al);
    	}
    	break;
    	
    	case 3:
    		String path2="C:\\java\\";
    		Scanner sc3=new Scanner(System.in);
    		System.out.println("enter the file name to be deleted");
    		String filname=sc.next();
    		String finalfile=path2+filname;
    		File file=new File(finalfile);
    		file.delete();
    		System.out.println("file deleted");
    		break;
    		
    	case 4:
    		String path3="C:\\java\\";
    		File f2=new File(path3);
    		Scanner sc4=new Scanner(System.in);
    		System.out.println("enter the file name to search");
    		String filsearchname=sc4.next();
    		File filename2[]=f2.listFiles();
    		int flag=0;
    		for(File ff:filename2) {
    			if(ff.getName().equals(filsearchname)) {
    				flag=1;
    				break;
    			}
    			else {
    				flag=0;
    			}
    			
    			
    			
    		}

    		if(flag==1) {
    			System.out.println("found the file");
    		}
    		else {
    			System.out.println("file is not found");
    		}
            break;
            
    	case 5:
    		System.exit(0);
    		break;


    	
    	

    	
    	

    }

    }
	}
}