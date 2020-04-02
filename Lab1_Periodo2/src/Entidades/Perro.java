
package Entidades;

public class Perro extends Mascotas{
    protected String Raza;
    protected String Color;
    protected boolean Pedigree;
    
    public Perro(String Especie, String Comida, String Sexo, String Raza, String color, boolean Pedigree){
        super(Especie, Comida, Sexo);
        this.Raza=Raza;
        this.Color=color;
        this.Pedigree=Pedigree;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public boolean isPedigree() {
        return Pedigree;
    }

    public void setPedigree(boolean Pedigree) {
        this.Pedigree = Pedigree;
    }
    @Override
    public void DatosPersonales(String Nombre, String FechaNacimiento){
        System.out.println("Datos del Perro:");
        System.out.println("Nombre: "+Nombre+"\nFecha de Nacimiento: "+FechaNacimiento);
    }
    @Override
    public void MostrarDatos(){
        System.out.println("Datos Generales");
        System.out.println("Especie:"+this.Especie+"\nComida: "+this.Comida+
                           "\nSexo: "+this.Sexo+"\nRaza: "+this.Raza+
                           "\nColor: "+this.Color);
        if (this.Pedigree==true) {
            System.out.println("Pedigree: Sí");
            
        }
        else System.out.println("Pedigree: No");
        
    }
    public void DatosPropietario(String Nombre){
        System.out.println("Nombre del Propietario: "+Nombre);
    }
    
}
