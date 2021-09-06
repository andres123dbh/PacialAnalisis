import java.util.Scanner;

public class palindroma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        String palabra;
        String palabraInversa = "";
        System.out.println("Escriba la palabra");
        while(continuar != -1){
            palabra = scan.nextLine();
            palabra = palabra.toLowerCase();
            for(int i = palabra.length() - 1; i >= 0 ; i--){
                palabraInversa += palabra.charAt(i);
            }
            if(palabra.equals(palabraInversa)){
                System.out.println("La palabra " + palabra + " es palíndroma");
            }
            else{
                System.out.println("La palabra " + palabra + " no es palíndroma");
            }
            System.out.println("Si desea continuar digite 1, si desea terminar -1");
            continuar = scan.nextInt();
            if(continuar != -1){
                System.out.println("Escriba la palabra");
                palabra = scan.nextLine();
                palabra = palabra.toLowerCase();
            }
        }
    }
}
