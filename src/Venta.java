import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venta
{
    private int Vid;
    private double Cantidad;
    private double PrecioTotal;
    List<Venta> RegistroVentas = new ArrayList<>();

        public Venta(int Vid, double Cantidad, double PrecioTotal)
        {
            this.Vid=Vid;
            this.Cantidad=Cantidad;
            this.PrecioTotal=PrecioTotal;
        }
    int getVid()
    {
        return Vid;
    }
    double getCantidad()
    {
        return Cantidad;
    }
    double getPrecioTotal()
    {
        return PrecioTotal;
    }

    static void GenerarVenta()
    {
        Scanner ScanProducto = new Scanner(System.in);
        System.out.println("Ingrese nombre del objeto");
        String nombreProducto = ScanProducto.nextLine();
        List<Producto> productos = Producto.GetListadeProductos();
        boolean findit = false;
            for(Producto producto : productos)
            {
                if(producto.GetName().equalsIgnoreCase(nombreProducto))
                {
                    System.out.println("Encontrado");
                    findit = true;
                    System.out.println(producto.GetName());

                    break;

                }
            }
            if (findit)
            {

            }
            if(!findit)
            {
                System.out.println("Error");
            }
    }
}
