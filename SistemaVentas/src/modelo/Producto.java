package modelo;

public class Producto {

    private int id;
    private int stock;
    private String nom;
    private String es;
    private double precio;

    public Producto() {

    }

    public Producto(int id, int stock, String nom, String es, double precio) {
        this.id = id;
        this.stock = stock;
        this.nom = nom;
        this.es = es;
        this.precio = precio;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the es
     */
    public String getEs() {
        return es;
    }

    /**
     * @param es the es to set
     */
    public void setEs(String es) {
        this.es = es;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
