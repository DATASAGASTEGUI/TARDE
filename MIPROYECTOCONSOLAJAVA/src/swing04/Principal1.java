package swing04;

public class Principal1 {

    public static void main(String[] args) {
        String cadena = "Hola     Mundo     como          estas kkk  niño el    como";
        System.out.println("Cantidad palabras: " + cantidadPalabras(cadena));
       
    }
    
    public static int cantidadPalabras(String cadena) {
        String[] palabra = cadena.split("[\\s]{1,}");
        return palabra.length;
    }

}
