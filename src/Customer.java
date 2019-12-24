public class Customer {
    protected String Name;
    private int ID;

    Customer(int id) {
        this.ID = id;
    }

    Customer(int id, String name) {
        this.ID = id;
        this.Name = name;
    }

}
