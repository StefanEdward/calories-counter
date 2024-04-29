public class ProductCatalog {

    Product[] products;
    int noOfProducts;

    public ProductCatalog() {
        this.products = new Product[100];
    }

    public boolean addProduct(Product product){
        return true;
    }

    public void printProducts(){

    }

    public Product getProductByName (String name){
        return null;
    }

    public boolean deleteProduct(String name){
        //prima data gasesc produsul cu numele name
        //apoi il sterg
        return true;
    }
}
