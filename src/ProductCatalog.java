public class ProductCatalog {

    Product[] products;
    int noOfProducts;

    public ProductCatalog() {
        this.products = new Product[100];
    }

    public boolean addProduct(Product product){
        this.products[noOfProducts] = product;
        noOfProducts++;
        return true;
    }

    public void printProducts(){

    }

    public Product getProductByName (String name){
        return null;
    }

    public boolean deleteProduct(String name){
        //prima data gasesc pozitia produsului cu numele name
        int productIndex = getProductIndex(name);
        //apoi il sterg
        for (int i = productIndex; i < noOfProducts; i++) {
            products[i] = products[i+1];
        }
        this.noOfProducts--;
        return true;
    }

    public int getProductIndex(String productName){
        for (int i = 0; i < noOfProducts; i++) {
            if (productName.equals(products[i].name)){
                return i;
            }
        }
        return -1;
    }
}
