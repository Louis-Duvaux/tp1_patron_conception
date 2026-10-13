package mediatheque;

public class PrintOnlyBooks implements Visitor {

	@Override
	public void visit(Book b) {
		System.out.println(b.toString());
	}

	@Override
	public void visit(CD c) {
	}

}