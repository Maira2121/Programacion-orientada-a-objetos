import java.util.ArrayList;

public class Store {
    public  String name;
    private ArrayList <String> products;
    private ArrayList <Person> customers;
    private int numberProducts;
    private int numberCustomers;
    protected ArrayList <String> orders;

    /**
     * Constructor: Crea una instancia de la clase Store.
     * @param name nombre de la tienda.
     * @param products lista de productos ofrecidos en la tienda.
     * @param customers listado de clientes de la tienda.
     * @param numberProducts número de productos de la tienda.
     * @param numberCustomers  número de clientes de la tienda.
     * @param orders lista de pedidos realizados a la tienda.
     */
    public Store(String name, ArrayList<String> products, ArrayList<Person> customers, int numberProducts, int numberCustomers, ArrayList<String> orders) {
        this.name = name;
        this.products = products;
        this.customers = customers;
        this.numberProducts = numberProducts;
        this.numberCustomers = numberCustomers;
        this.orders = orders;
    }

    /**
     * método para obtener el nombre de la tienda.
     * @return devuelve el nombre de la tienda.
     */
    public String getName() {
        return name;
    }

    /**
     * método para asignar o modificar el nombre de la tienda.
     * @param name argumento necesario para crear o modificar el nombre de la tienda.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * método para obtener el listado de productos de la tienda.
     * @return devuelve una lista de productos de la tienda.
     */
    public ArrayList<String> getProducts() {
        return products;
    }

    /**
     * método para asignar o modificar la lista de productos de la tienda.
     * @param products argumento necesario para crear o modificar la lista de productos de la tienda.
     */
    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }

    /**
     * Método para obtener el listado de clientes de la tienda.
     * @return devuelve la lista de clientes
     */
    public ArrayList<Person> getCustomers() {
        return customers;
    }

    /**
     * método para asignar o modificar la lista de clientes de la tienda.
     * @param customers argumento necesario para asignar o modificar la lista de clientes de la tienda.
     */
    public void setCustomers(ArrayList<Person> customers) {
        this.customers = customers;
    }

    /**
     * Método para obtener el número de productos de la tienda.
     * @return retorna o devuelve el número de productos disponibles de la tienda.
     */
    public int getNumberProducts() {
        return numberProducts;
    }

    /**
     * método para asignar o modificar la lista de productos de la tienda.
     * @param numberProducts argumento necesario para asignar o modificar la lista de productos de la tienda.
     */
    public void setNumberProducts(int numberProducts) {
        this.numberProducts = numberProducts;
    }

    /**
     * Método para obtener el número de clientes de la tienda.
     * @return retorna o devuelve el número de clientes de la tienda.
     */
    public int getNumberCustomers() {
        return numberCustomers;
    }

    /**
     * método para asignar o modificar el número de clientes de la tienda.
     * @param numberCustomers argumento necesario para asignar o modificar el número de clientes de la tienda.
     */
    public void setNumberCustomers(int numberCustomers) {
        this.numberCustomers = numberCustomers;
    }

    /**
     * Método para obtener la lista de pedidos realizados a la tienda.
     * @return retorna o devuelve los valores de la lista de pedidos de la tienda.
     */
    public ArrayList<String> getOrders() {
        return orders;
    }

    /**
     * método para asignar o modificar la lista de pedidos realizados a la tienda.
     * @param orders argumento necesario para asignar o modificar el listado de pedidos de la tienda.
     */
    public void setOrders(ArrayList<String> orders) {
        this.orders = orders;
    }

    /**
     * Método para vender productos.
     * @param product el producto a vender.
     * @param customers cliente al que se le va a vender el producto.
     */
    public void toSell(String product, Person customers){
        System.out.println("Product "+ product + " sold to customer "+customers);

    }

    /**
     * Método para abastecer la tienda.
     * @param products recibe como parámetro el listado de productos para llenar la tienda.
     */
    private void fillStore(ArrayList <String> products){
        System.out.println("Shop filled successfully");

    }

}
