package mediatheque;

public class PrintOnlyCDs implements Visitor {

	@Override
	public void visit(Book b) {
	}

	@Override
	public void visit(CD c) {
		System.out.println(c.toString());
	}

}