package com.home.practice;

import java.io.File;

public class fileDemo {

	public static void main(String[] args) {
		//Simple operations on File API
		
	//	File file=new File("C:/Users/Rajat Pandey/Downloads/App.java");
	//	File file=new File("C:/Users/Rajat Pandey/Downloads","AppNew.java"); //Can also be written like this first write path and then file name
		File file=new File("C:/Users/Rajat Pandey/Downloads","Parkspot important files"); //To access Directory or Folder
		
		if(file.exists()) {
			if(file.isDirectory()) {
				System.out.println(file.getName()+" is a directory and is on the disk");
				String [] names=file.list();  //This function gives the names of all the files.
				for(String value : names) {
					/*if(value.endsWith(".png")) {
						System.out.println(value);
					}*/
					System.out.println(value); //Prints all the names of files and folders in  Parkspot important files folder
				}
			}else {
				System.out.println(file.getName()+" is a File and is on the disk");
				System.out.println("Total Space is:"+file.getTotalSpace());
				System.out.println("Last modified on:"+file.lastModified());
				
				//Rename Operation
			/*	File fileNew=new File("C:/Users/Rajat Pandey/Downloads","AppNew.java");
				file.renameTo(fileNew);
				System.out.println("Renamed"); */
				//System.out.println(file.getName());
				file.delete();
				System.out.println("File Deleted");
			}
			
		}else {
			System.out.println(file.getName()+" is not on the disk");
		}

	}

}
