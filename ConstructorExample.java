package VijapurJava;

class Movie
{
	int movieId;
	String movieName;
	String coll;
	Movie(int mid,String mName,String collection)
	{
		movieId = mid;
		movieName =mName;
		coll = collection;
	}

	void disData() {
		System.out.println("Movie Id is " + movieId);
		System.out.println("Movie Name is " + movieName);
		System.out.println("Movie Collection is " + coll);
	}
}
public class ConstructorExample {
		public static void main(String[] args) {
				Movie obj = new Movie(1,"Dangal","1CR");
				obj.disData();
		}
}
/*
 * 
 * Employee Class
 * => Eid,Name,Designation,Salary 
 * => Constuctor Pass => Annual Salary
 *  
 * 
 * 
 * */
