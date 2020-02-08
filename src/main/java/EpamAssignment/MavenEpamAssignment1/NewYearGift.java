package EpamAssignment.MavenEpamAssignment1;
import java.util.*;
public class NewYearGift {
   public static void main(String args[]) {
	   Chocolates c1 = new Chocolates(35, 20, "5star");
	   Chocolates c2 = new Chocolates(55, 30, "Perk");
	   Chocolates c3 = new Chocolates(65, 40, "Dairymilk");
	   Chocolates c4 = new Chocolates(45, 50, "Chocos");
	   Chocolates c = new Chocolates();
       c.totalweight();
       c.sort();
       c.range(20,40);
}
}
