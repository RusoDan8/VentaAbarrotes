public class Frutas extends Producto
{
    private double peso;


        public Frutas(int Pid, String name, double precio, double peso)
        {
            super(Pid, name, precio);
            this.peso=peso;

        }
    public double getPeso()
    {
        return peso;
    }

    static void FrutasInventario()
    {
        ListProducts.add(new Frutas(ListProducts.size()+1,"Manzana", 10.0 , 0.5));
    }
}
