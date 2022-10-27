package swing04;

public class Principal2 {

    public static void main(String[] args) {
       String cadena = "italiano ni55ño ¿Cómoú?  1111  ===========";
       System.out.println("Cantidad Letras: " + cantidadLetras(cadena));
    }
    
    public static String cantidadLetras(String cadena) {
        //String patron = "[a-zA-ZÑñáéíóú]";
        int cletra = 0;
        int cnletra = 0;
        for(int i=0; i<cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if(Character.isAlphabetic(caracter)) {
                cletra++;
            }else {
                cnletra++;
            }
        }
        System.out.println(cnletra);
        return cletra+","+cnletra;
    }
}
