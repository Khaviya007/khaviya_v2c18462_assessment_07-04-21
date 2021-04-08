package predictcls;
import java.util.ArrayList;
import java.util.function.BiPredicate;
public class Predemo1 {
	public static void main(String[] args) {
		ArrayList<Shoe> list = new ArrayList<Shoe>();
		list.add(new Shoe(101, 6, 25, 15));
		list.add(new Shoe(103, 4, 80, 88));
		list.add(new Shoe(102, 3, 54, 34));
		list.add(new Shoe(104, 1, 02, 13));
		BiPredicate<Integer, Integer> bp1 = (lase, socks) -> ((lase + socks) >= 50);
		BiPredicate<Integer, Integer> bp2 = (lase, socks) -> ((lase + socks) <= 50);
		for (Shoe p : list) {
			if (bp1.test(p.laceprice, p.socksprice)) {
				System.out.println("Costly "+p.size + " " + p.laceprice + " " + p.socksprice);
				//System.out.println("\n");
			} else if (bp2.test(p.laceprice, p.socksprice)) {
				System.out.println("Cheep "+p.size + " " + p.laceprice + " " + p.socksprice);
				//System.out.println("\n");
			}
		}
		 System.out.println("\n");
		for (Shoe p1 : list) {
			if (((p1.size) >= 5) && ((p1.laceprice + p1.socksprice) <= 50)) {
			    System.out.println("Best product "+p1.size + " " + p1.laceprice + " " + p1.socksprice);
			  
		}
	}
}

}
class Shoe {
	int id;
	int size;
	int laceprice;
	int socksprice;

	public Shoe(int id, int size, int laseprice, int shocksprice) {
		super();
		this.id = id;
		this.size = size;
		this.laceprice = laseprice;
		this.socksprice = shocksprice;
	}
}
