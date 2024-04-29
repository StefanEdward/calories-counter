import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductCatalog productCatalog = new ProductCatalog();
        int selection;
        do{
            printMenu();
            selection = scanner.nextInt();
            performSelectedAction(selection, productCatalog);
        } while (selection !=6);
    }

    public static void printMenu(){
        System.out.println("MENIU: \n" +
                "\"1. Adauga produs in calculator si calculeaza-i caloriile\"\n" +
                "\"2. Calculeaza caloriile pentru un produs fara a fi adaugat in catalog\"\n" +
                "\"3. Afiseaza toate produsele din catalog si caloriile pentru fiecare\"\n" +
                " \"4. Sterge un produs din catalog\"\n" +
                " \"5. Gaseste produs dupa nume\"\n" +
                " \"6. EXIT (Iesi din aplicatie)\"\n" +
                " \"----------------------------------------------------------------”\n" +
                "\"Alege actiunea cu numarul:\" ;");
    }

    public static void performSelectedAction(int selection, ProductCatalog productCatalog){
        if(selection == 1){
            addProduct(productCatalog);
        } else if (selection == 2){
            System.out.println("Ai ales sa calculezi caloriile unui produs");
        } else if (selection == 6){
            System.out.println("Ai ales sa iesi din aplicatie");
        } else{
            System.out.println("Optiunea introdusa este gresita. Introdu un numar de la 1 la 6");
        }
    }

    private static void addProduct(ProductCatalog productCatalog) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ai ales sa adaugi un produs");
        System.out.println("Da-mi numele produsului");
        String name = scanner.nextLine();
        System.out.println("Da-mi grasimi");
        int fats = scanner.nextInt();
        System.out.println("Da-mi carbohidrati");
        int carbohydrates = scanner.nextInt();
        System.out.println("Da-mi proteine");
        int proteins = scanner.nextInt();
        Product product = new Product(name, fats, carbohydrates, proteins);
        productCatalog.addProduct(product);
    }
}














