
package SupermercadoParcialLC;

import java.util.Scanner;

public class programa {
    
    public static void main(String[] args) {
        
        String fechaInicio, nombreProducto;
        int cantidadOfertas, stock, cantDiasOferta,idProd;
        double precioOferta, precioRegular;
        
        
        Scanner sc= new Scanner(System.in);
        
        
        
        System.out.println("Ingrese fecha de inicio de oferta DD/MM/AAAA");
        fechaInicio=sc.nextLine();    
        System.out.println("Ingrese la cantidad de ofertas:");
        cantidadOfertas=sc.nextInt();
        sc.nextLine();
        Folleto f=new Folleto(fechaInicio,cantidadOfertas);
        
        
        System.out.println("Ingrese Id del producto:");
        idProd=sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese nombre del producto:");
        nombreProducto=sc.nextLine();
        System.out.println("Ingrese precio regular: ");
        precioRegular=sc.nextDouble();
        System.out.println("Ingrese precio en oferta:");
        precioOferta=sc.nextDouble();
        System.out.println("Ingrese la cantidad de dias que va a estar en vigencia la oferta:");
        cantDiasOferta=sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la el stock del producto:");
        stock=sc.nextInt();
        Oferta o=new Oferta(idProd,nombreProducto,precioRegular,precioOferta,cantDiasOferta,stock);
        f.addOferta(o);
        
        
        System.out.println("CARGA TERMINADA"); 
        System.out.println("A continuacion se muestran los datos:");
        System.out.println("");
        System.out.println("Cantidad articulos ofertados por mas de cinco dias: "
                +f.cantOfertasMasCincoDias()+" articulos.");
        System.out.println("Cantidad total de unidades a la venta: "+f.totalStock());
        System.out.println("Cantidad de articulos ofertados con un descuento superior a $20: "
                +f.cantArtDesc());
        System.out.println("");
        System.out.println("Ingrese el id del articulo a consultar el precio total");
        idProd=sc.nextInt();
        System.out.println("");
        System.out.println("Total a recaudar por articulo numero "+idProd+": "
                +f.recaudacionArticulo(idProd));
        
    }
}
