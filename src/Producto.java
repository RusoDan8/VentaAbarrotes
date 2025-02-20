import java.util.ArrayList;
import java.util.List;

public class Producto
{
    private int Pid;
    private String name;
    private double precio;
    public static List<Producto>ListProducts=new ArrayList<>();

    public Producto(int Pid, String name, double precio)
    {
        this.Pid=Pid;
        this.name=name;
        this.precio=precio;
    }

    public int GetPid()
    {
        return Pid;
    }
    public String GetName()
    {
        return name;
    }
    public double precio()
    {
        return precio;
    }

    public static List<Producto> GetListadeProductos()
    {
        return ListProducts;
    }

    static void ListaProductos()
    {
        ListProducts.add(new Producto(ListProducts.size()+1, "Tacos", 15.0));
        ListProducts.add(new Producto(ListProducts.size()+1, "Refresco", 10.0));
        ListProducts.add(new Producto(ListProducts.size()+1, "Hamburguesas", 40.0));
    }

    static void ImprimirProducto()
    {
        System.out.println(ListProducts.size());
        for(int i = 0; i<ListProducts.size(); i++)
        {
            System.out.println(ListProducts.get(i).name + " " + ListProducts.get(i).precio);
        }
    }
}

