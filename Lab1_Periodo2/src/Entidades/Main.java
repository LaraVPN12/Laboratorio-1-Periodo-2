
package Entidades;

public class Main {
    public static void main(String[] args){
        Perro perro = new Perro("Perro", "Consentrado", "Masculino", "Husky", "Blaco/Negro", true);
        Pez pez = new Pez("Pez", "Partículas del Mar", "Femenino", "Asia", "21 cms.", 2);
        Caballo caballo = new Caballo("Caballo", "Heno", "Masculino", "Árabe", "435 Kg", "2.3 Mtrs.");
        Tigre tigre = new Tigre("Tigre", "Carne", "Masculino", "280 Kg.", "Asia", 13400);
        Vaca vaca = new Vaca("Vaca", "Heno", "Femenino", "Holstein", "580 Kg.", "Lechera");
        //Perro
        perro.MostrarDatos();
        perro.DatosPersonales("Bailey", "29/09/2019");
        perro.DatosPropietario("Kevin Lara");
        System.out.println("*********************************************");
        //Pez
        pez.MostrarDatos();
        pez.DatosPersonales("Nemo", "23/06/2018");
        pez.DatosHabitat(5, "Salada");
        System.out.println("*********************************************");
        //Caballo
        caballo.MostrarDatos();
        caballo.DatosPersonales("Jack Daniel's", "26/03/200");
        caballo.Habilidad("Carrera de Cinta");
        System.out.println("*********************************************");
        //Tigre
        tigre.MostrarDatos();
        tigre.DatosPersonales("Tiguer", "28/03/2020");
        tigre.Alimentacion(5, 40);
        System.out.println("*********************************************");
        //Vaca
        vaca.MostrarDatos();
        vaca.DatosPersonales("Cowie", "12/08/2003");
        vaca.Ordeño(18.75);
    }
}
