package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        
        // Ajout des éléments de départ
        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        
        // Ajout de vos éléments préférés (remplacez par les vôtres)[cite: 2]
        mediatheque.addItem( new Book("Victor Hugo", "Les Misérables"));
        mediatheque.addItem( new CD(9, "Abbey Road"));

        // Utilisation du Visitor pour imprimer tout le catalogue
        System.out.println("--- Catalogue Complet ---");
        mediatheque.accept(new PrintCatalog());

        // Utilisation du Visitor pour n'imprimer que les livres
        System.out.println("\n--- Livres uniquement ---");
        mediatheque.accept(new PrintOnlyBooks());

        // Utilisation du Visitor pour n'imprimer que les CDs
        System.out.println("\n--- CDs uniquement ---");
        mediatheque.accept(new PrintOnlyCDs());
    }
}