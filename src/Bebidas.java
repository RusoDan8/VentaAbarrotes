public class Bebidas extends Producto
{
    private double Litros;
    private boolean Alchohol;

        public Bebidas(int Pid, String name, double precio , double Litros, boolean Alchohol)
        {
            super(Pid,name,precio);
            this.Litros=Litros;
            this.Alchohol=Alchohol;
        }
    public double getLitros()
    {
        return Litros;
    }
    public boolean getAlcohol()
    {
        return Alchohol;
    }
    static void BebidasInventario()
    {
        ListProducts.add(new Bebidas(ListProducts.size()+1,"Cerveza", 20.0, 0.5, true));
        ListProducts.add(new Bebidas(ListProducts.size()+1,"Coca Cola", 25.0, 0.5, false));

    }
}
