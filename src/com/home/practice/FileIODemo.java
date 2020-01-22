package com.home.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIODemo {
//File Read operation
	void readFromFile() {
		FileInputStream fileInputStream= null;//It is marked as null because it is important to initialize before calling the close method
		FileReader fileReader=null;//It will return data in the form of characters
		BufferedReader bufferedReader=null;
try {
    File file=new File("C:/Users/Rajat Pandey/Downloads/App.java");
    
    //InputStream -> It will read the data as binary i.e 0 and 1
  /*   fileInputStream=new FileInputStream(file); //We will have to use try catch for handling IO exceptions because all API's in io package throw IO exceptions
    int ch=0;//Storing variable is int because the data returned is binary
    while((ch=fileInputStream.read())!=-1) {  //Put whatever we read in ch until fis.read is != -1 where -1 means end of file
    	//System.out.print(ch);
    	System.out.print((char)ch);//Do not use next line as it is also a character
    }*/
    
    // FileReader 
    fileReader=new FileReader(file);
    bufferedReader=new BufferedReader(fileReader);
    /*int data;
    while((data=fileReader.read())!=-1) {
    	//System.out.print(data);
    	System.out.print((char)data);
    }*/
    String value="";
    StringBuffer buffer=new StringBuffer();
    while((value=bufferedReader.readLine())!=null) {
    	System.out.println(value);
    	//Can't figure out how to do it with builder or buffer directly
    	//Application->Source code analysis
    	//Count the no. of objects and there type in the source code
    	//Also count the no. of classes and interfaces in a program
    }
    
    
    }catch(Exception e){
     System.out.println(e);
}finally {
	try {
		//fileInputStream.close(); //close method also throws IO exception and being a important method it should always run and thus is placed in the finally block
		fileReader.close();
		bufferedReader.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
	}
	
	void writeIntoFile() {
		FileOutputStream fileOutputStream=null;
		FileWriter fileWriter=null;
		try {
			File file=new File("C:/Users/Rajat Pandey/Downloads/MyApp.txt");//The file to be written will be created automatically
			//Learn how o write text in a file using fileOutputStream!!!
			//fileOutputStream=new FileOutputStream(file);
			//fileOutputStream.write(12);
			fileWriter=new FileWriter(file, true);  // true->append mode
			fileWriter.write("Be Exceptional");
			fileWriter.write("Never shy away from Hardwork");
			System.out.println("File Written");
			BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		FileIODemo ioRef=new FileIODemo();
		//ioRef.readFromFile();
		ioRef.writeIntoFile();
	}

}
