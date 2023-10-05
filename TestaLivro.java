
public class TestaLivro {
	
	public static void main(String[] args) {
		Livro x1 = new Livro("One Good Deep", "David Baldacci", 2019, "Grand Central Publishing");
		Livro x2 = new Livro("Little Fires Everywhehre", "Celeste Ng", 2017, "penguin press" );
		Livro x3 = new Livro("The Alchemist", "Paulo Coelho", 1988, "HarperOne");
		
		System.out.println(x1.toString());
		System.out.println(x2.toString());
		System.out.println(x3.toString());
	
	}
}
