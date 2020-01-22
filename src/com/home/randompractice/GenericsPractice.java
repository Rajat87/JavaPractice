package com.home.randompractice;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

import com.home.randompractice.GenericsPractice.ArtistCompare;

public class GenericsPractice {
	static {
		System.out.println("Static Block Executed");
	}
	//Inner class
	class ArtistCompare implements Comparator<Song> {
		public int compare(Song one, Song two) {
		return one.getArtist().compareTo(two.getArtist());
		}
		}
	public static void main(String[] args) {
		System.out.println("Main Executed");
		BufferedReader bufferedReader=null;
		ArtistCompare artistCompare=new GenericsPractice().new ArtistCompare(); //Way to create inner class object
		HashSet<Song> hashSet=new HashSet<Song>();
		try {
		StringBuilder builder;
		ArrayList<Song> songList=new ArrayList<Song>();
		File file=new File("D:/SongListMore2ForDuplicates.txt"); //For Duplicates
		bufferedReader=new BufferedReader(new FileReader(file));	 
			String line;
			while ((line=bufferedReader.readLine())!=null) {
				String[] tokens = line.split("/");
				//songList.add(tokens[0]);
				Song song=new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
				songList.add(song);
				hashSet.add(song);
			}
			Collections.sort(songList);
			System.out.println(songList);
			Collections.sort(songList, artistCompare);
			System.out.println(songList);
			
			
			System.out.println(hashSet);
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}
	}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Vague Code
		
		/*	try {
		FileInputStream inputStream=new FileInputStream(file);
		FileReader fileReader=new FileReader(file);
		BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);//Reads data in the form of bytes line by line
		BufferedReader bufferedReader=new BufferedReader(fileReader);//Reads data in the form of Text line by line
		String line;
		builder=new StringBuilder();
		while((line=bufferedReader.readLine())!=null) {
			//System.out.println(line);
			//buffer.append(line+"\n");
			String [] asRef=line.split("/");
			builder.append(asRef[0]);
		}
		
		System.out.println(builder);
		String any=builder.toString();
		arrayList.add(any);
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
//It does not print comma separated values and does not sort the list because the compiler thinks that it is one single string read by buffered reader as one line
		//i.e any="Pink MoonSomersaultShiva MoonCirclesDeep ChannelPassengerListen";
		//this is considered as one single string
	} catch (Exception e) {
		e.printStackTrace();
	}  */
		
		
