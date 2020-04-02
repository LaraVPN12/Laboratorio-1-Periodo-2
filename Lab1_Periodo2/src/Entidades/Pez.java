
package Entidades;

public class Pez extends Mascotas{
    protected String PaisOriginal;
    protected String Tamaño;
    protected int TiempoVida;
    
    public Pez(String Especie, String Comida, String Sexo,String pais, String tamaño, int vida){
        super(Especie, Comida, Sexo);
        this.PaisOriginal=pais;
        this.Tamaño=tamaño;
        this.TiempoVida=vida;
    }

    public String getPaisOriginal() {
        return PaisOriginal;
    }

    public void setPaisOriginal(String PaisOriginal) {
        this.PaisOriginal = PaisOriginal;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public int getTiempoVida() {
        return TiempoVida;
    }

    public void setTiempoVida(int TiempoVida) {
        this.TiempoVida = TiempoVida;
    }
    @Override
    public void DatosPersonales(String Nombre, String FechaNacimiento){
        System.out.println("Datos del Pez:");
        System.out.println("Nombre: "+Nombre+"\nFecha de Nacimiento: "+FechaNacimiento);
    }
    @Override
    public void MostrarDatos(){
        System.out.println("Datos Generales");
        System.out.println("Especie:"+this.Especie+"\nComida: "+this.Comida+
                           "\nSexo: "+this.Sexo+"\nPais de Origen: "+this.PaisOriginal+
                           "\nTamaño del Pez: "+this.Tamaño+"\nAños de Vida: "+this.TiempoVida+" Años");
    }
    public void DatosHabitat(double Temperatura, String TipoAgua){
        System.out.println("Datos del Hábitat:");
        System.out.println("Temperatura del agua: "+Temperatura+" °C"+"\nTipo de Agua: "+TipoAgua);
    }
}
