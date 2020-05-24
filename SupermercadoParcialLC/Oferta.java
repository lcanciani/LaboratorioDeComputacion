
package SupermercadoParcialLC;


public class Oferta {
    private int nProducto;
    private String nombreProducto;
    private double precioRegular;
    private double precioOferta;
    private int cantDiasVigenciaOferta;
    private int stock;

    public Oferta(int nProducto, String nombreProducto, double precioRegular, 
            double precioOferta, int cantDiasVigenciaOferta, int stock) {
        this.nProducto = nProducto;
        this.nombreProducto = nombreProducto;
        this.precioRegular = precioRegular;
        this.precioOferta = precioOferta;
        this.cantDiasVigenciaOferta = cantDiasVigenciaOferta;
        this.stock = stock;
    }

    public int getNProducto() {
        return nProducto;
    }

    public void setnProducto(int nProducto) {
        this.nProducto = nProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioRegular() {
        return precioRegular;
    }

    public void setPrecioRegular(double precioRegular) {
        this.precioRegular = precioRegular;
    }

    public double getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(double precioOferta) {
        this.precioOferta = precioOferta;
    }

    public int getCantDiasVigenciaOferta() {
        return cantDiasVigenciaOferta;
    }

    public void setCantDiasVigenciaOferta(int cantDiasVigenciaOferta) {
        this.cantDiasVigenciaOferta = cantDiasVigenciaOferta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
