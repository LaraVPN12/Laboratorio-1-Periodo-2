
package Entidades;

public class Caballo extends Mascotas{
    protected String Raza;
    protected String Peso;
    protected String Altura;
    
    public Caballo(String Especie, String Comida, String Sexo, String Raza, String Peso, String Altura){
        super(Especie, Comida, Sexo);
        this.Raza=Raza;
        this.Peso=Peso;
        this.Altura=Altura;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }
    @Override
    public void DatosPersonales(String Nombre, String FechaNacimiento){
        System.out.println("Datos del Caballo:");
        System.out.println("Nombre: "+Nombre+"\nFecha de Nacimiento: "+FechaNacimiento);
    }
    @Override
    public void MostrarDatos(){
        System.out.println("Datos Generales");
        System.out.println("Especie:"+this.Especie+"\nComida: "+this.Comida+
                           "\nSexo: "+this.Sexo+"\nRaza: "+this.Raza+
                           "\nPeso: "+this.Peso+"\nAltura: "+this.Altura);
        
    }
    public void Habilidad(String hability){
        System.out.println("Habilidad Desarrollada: "+hability);
    }
}
