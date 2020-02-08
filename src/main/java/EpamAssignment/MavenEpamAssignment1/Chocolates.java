package EpamAssignment.MavenEpamAssignment1;

import java.util.ArrayList;
import java.util.*;
public class Chocolates extends NewYearGift  {
    static ArrayList<Integer>w = new ArrayList<Integer>();
    static Map<Integer,String>c = new HashMap<Integer,String>();
    Chocolates(){}
    Chocolates(int weight,int cost,String s){
    	w.add(weight);
    	c.put(cost,s);
    }
    public static int totalweight() {
      int total = 0;
      for(int i = 0; i < w.size(); i++) {
    	total +=  w.get(i);
      }
      return total;
    }
    static TreeMap<Integer,String>t=new TreeMap<Integer,String>();
    public static void sort() {
        t.putAll(c);
        for(Map.Entry<Integer,String> entry : t.entrySet()) {
        	Integer key = entry.getKey();
        	String value = entry.getValue();
        	System.out.println(key+" "+value);
        }
    }
    public static void range(int l, int h) {
    	for(Map.Entry<Integer,String> entry : t.entrySet()) {
    		Integer key = entry.getKey();
    		String value = entry.getValue();
    		if(key >= l && key <= h)
    			System.out.println(value);
    			
    	}
    }
}