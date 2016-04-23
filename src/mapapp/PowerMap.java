package mapapp;

import java.applet.Applet;
import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;

public class PowerMap extends Applet{
	public ArrayList<Point> mem1 = new ArrayList<Point>();
	public ArrayList<Point> mem2 = new ArrayList<Point>();
	
	public String print(String s){
		return s;
	}
	
	
	public String loadMap() {
///		return "a";
		readMap readmap = new readMap();
		return readmap.loadMap();
	}
	
	public String initialize1(String state, String city, String xpos, String ypos){
		String[] states = state.split(",");
		String[] cities = city.split(",");
		String[] xposs = xpos.split(",");
		String[] yposs = ypos.split(",");
		
		for(int i = 0; i<states.length; i++){
			mem1.add(new Point(Double.parseDouble(xposs[i]),Double.parseDouble(yposs[i]),states[i],cities[i]));
		}
		return mem1.size()+"";
	}
	
	public String initialize2(String state, String city, String xpos, String ypos){
		String[] states = state.split(",");
		String[] cities = city.split(",");
		String[] xposs = xpos.split(",");
		String[] yposs = ypos.split(",");
		
		for(int i = 0; i<states.length; i++){
			mem2.add(new Point(Double.parseDouble(xposs[i]),Double.parseDouble(yposs[i]),states[i],cities[i]));
		}
		return mem2.size()+"";
	}
	
	public String knn(String s1, String s2){
		
		String res = "";
		PriorityQueue<Point> queue = new PriorityQueue<Point>(11,new Comparator<Point>(){
			public int compare(Point arg0, Point arg1) {
				return (int) (arg1.distance-arg0.distance);
			}
		});
		
			double x = 0;
			double y = 0;
			double distance = 0;
			double px = Double.parseDouble(s1);
			double py = Double.parseDouble(s2);
			
			for(Point p : mem1){
				
				x = (p.y-py)*Math.cos((p.x+px)/2);
				y = p.x-px;
				p.distance = (Math.sqrt((x*x+y*y)))*6371;
				//System.out.println(x+ " " + y + " " + distance);
				if(queue.size()<10) {
					queue.add(p);
				}
				else{
					if(p.distance<queue.peek().distance){
						queue.poll();
						queue.add(p);
					}
				}
			}
			
			for(Point p : queue){
				res += p.x + ",";
				res += p.y + ",";
				res += p.state + ",";
				res += p.city + ",";
				res += p.distance + "//";
			}
			
		
		return res;
	}
	
	public String range(String s1x, String s1y, String s2x, String s2y) {
		double lux = Double.parseDouble(s1x);
		double luy = Double.parseDouble(s1y);
		double rdx = Double.parseDouble(s2x);
		double rdy = Double.parseDouble(s2y);
		String res = "";
		for(Point p : mem1) {
			if (p.x>=rdx && p.x<=lux && p.y>=luy && p.y<=rdy) {
				res += p.x + ",";
				res += p.y + ",";
				res += p.state + ",";
				res += p.city + "//";
			}
		}
		return res;
	}
}
