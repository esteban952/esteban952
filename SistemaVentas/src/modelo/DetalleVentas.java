
package modelo;

public class DetalleVentas {
    private int id;
    private int idVentas;
    private int idProducto;
    private int cantidad;
    private double preVenta;
    public DetalleVentas(){
        
    }
    public DetalleVentas(int id, int idVentas, int idProducto, int cantidad, double preVenta){
        this.id = id;
        this.idVentas = idVentas;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.preVenta = preVenta;
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
     * @return the idVentas
     */
    public int getIdVentas() {
        return idVentas;
    }

    /**
     * @param idVentas the idVentas to set
     */
    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the preVenta
     */
    public double getPreVenta() {
        return preVenta;
    }

    /**
     * @param preVenta the preVenta to set
     */
    public void setPreVenta(double preVenta) {
        this.preVenta = preVenta;
    }
}
