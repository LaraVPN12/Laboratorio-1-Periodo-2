
package Entidades;

public class Tigre extends Mascotas{
    protected String Peso;
    protected String PaisOriginal;
    protected double Precio;
    
    public Tigre(String Especie, String Comida, String Sexo, String Peso, String Pais, double Precio){
        super(Especie, Comida, Sexo);
        this.Peso=Peso;
        this.PaisOriginal=Pais;
        this.Precio=Precio;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public String getPaisOriginal() {
        return PaisOriginal;
    }

    public void setPaisOriginal(String PaisOriginal) {
        this.PaisOriginal = PaisOriginal;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    @Override
    public void DatosPersonales(String Nombre, String FechaNacimiento){
        System.out.println("Datos del Tigre:");
        System.out.println("Nombre: "+Nombre+"\nFecha de Nacimiento: "+FechaNacimiento);
    }
    @Override
    public void MostrarDatos(){
        System.out.println("Datos Generales");
        System.out.println("Especie:"+this.Especie+"\nComida: "+this.Comida+
                           "\nSexo: "+this.Sexo+"\nPeso: "+this.Peso+
                           "\nPaís de Orígen: "+this.PaisOriginal+"\nPrecio: $"+this.Precio);
    }
    public void Alimentacion(int TiemposComida, double Cantidad){
        System.out.println("Tiempos de Comida: "+TiemposComida+" tiempos"+"\nCantidad de Comida por Tiempo: "+Cantidad+" lbs.");
    }
}
