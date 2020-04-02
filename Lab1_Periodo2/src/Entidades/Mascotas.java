
package Entidades;

public abstract class Mascotas {
    protected String Especie;
    protected String Comida;
    protected String Sexo;

    public Mascotas(String Especie, String Comida, String Sexo) {
        this.Especie = Especie;
        this.Comida = Comida;
        this.Sexo = Sexo;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getComida() {
        return Comida;
    }

    public void setComida(String Comida) {
        this.Comida = Comida;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    abstract void DatosPersonales(String Nombre, String FechaNacimiento);
    abstract void MostrarDatos();
}
