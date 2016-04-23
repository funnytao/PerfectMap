package mapapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class readMap {
	public ArrayList<Point> al = new ArrayList<Point>();
	public String[] info = new String[4];
	
	public readMap(){
		
		File f = new File("D:/NationalFile.txt");
		
		try {
			BufferedReader bf = new BufferedReader(new FileReader(f));
			String str = bf.readLine();
			info = str.split("\t");
//			while((str=bf.readLine())!=null){
//				info = str.split("\t");
//				al.add(new Point(Double.parseDouble(info[2]),Double.parseDouble(info[3]),info[0],info[1]));
//			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String loadMap() {
		
		return info[0]+","+info[1]+","+info[2]+","+info[3];
	}
}
