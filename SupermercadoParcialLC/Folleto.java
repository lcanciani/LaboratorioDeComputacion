
package SupermercadoParcialLC;



public class Folleto {
    private final Oferta [] ofertas;
    private final String fechaInicio;
    
       
    
    public Folleto(String fechaInicio,int cantOfertas) {
        this.fechaInicio = fechaInicio;
        ofertas=new Oferta[cantOfertas];
    }
    
    public void addOferta(Oferta o){
        for (int i = 0; i < ofertas.length; i++) {
            if(ofertas[i]==null){
                ofertas[i]=o;
                break;
            }

        }
    }
    
    public int cantOfertasMasCincoDias(){
        int cantProductos=0;
        for (Oferta oferta : ofertas) {
            if (oferta != null && oferta.getCantDiasVigenciaOferta() > 5) {
                    cantProductos++; 
            }
        }
        return cantProductos;
    }
    
    public int totalStock(){
        int totalUnidades=0;
        for (Oferta oferta : ofertas) {
            if(oferta != null)
                totalUnidades+=oferta.getStock();
        }
        return totalUnidades;
    }
    
    public int cantArtDesc(){
        int cantArt=0;
        double diferencia;
        for (Oferta o : ofertas) {
            if(o!=null){
                diferencia=o.getPrecioRegular()-o.getPrecioOferta();
                if(diferencia>20)
                    cantArt++;
            }                          
        }
        return cantArt;
    }
    
    public double recaudacionArticulo(int id){
        double precioTotal=0;
        for (Oferta o : ofertas) {
            if(o!=null && o.getNProducto()==id){
                precioTotal=o.getPrecioOferta()*o.getStock();
                break;
            }
        }
        return precioTotal;
    }
}
