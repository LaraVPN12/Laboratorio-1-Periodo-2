
package Entidades;

public class Vaca extends Mascotas{
    protected String Tipo;
    protected String Peso;
    protected String Uso;
    
    public Vaca(String Especie, String Comida, String Sexo, String Tipo, String Peso, String Uso){
        super(Especie, Comida, Sexo);
        this.Tipo=Tipo;
        this.Peso=Peso;
        this.Uso=Uso;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public String getUso() {
        return Uso;
    }

    public void setUso(String Uso) {
        this.Uso = Uso;
    }
    @Override
    public void DatosPersonales(String Nombre, String FechaNacimiento){
        System.out.println("Datos de la Vaca:");
        System.out.println("Nombre: "+Nombre+"\nFecha de Nacimiento: "+FechaNacimiento);
    }
    @Override
    public void MostrarDatos(){
        System.out.println("Datos Generales");
        System.out.println("Especie:"+this.Especie+"\nComida: "+this.Comida+
                           "\nSexo: "+this.Sexo+"\nTipo: "+this.Tipo+
                           "\nPeso: "+this.Peso+"\nUso: "+this.Uso);
    }
    public void Ordeño(double CantidadLitros){
        System.out.println("Litros de Leche por Ordeño: "+CantidadLitros+" litros");
    }
}
