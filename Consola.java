import java.util.Scanner;

class Consola
{
    public static void main(String args[])
    {

        Scanner EntradaConsola = new Scanner(System.in);
        String Nombre;
        String Apellido;
        String Hobbie;
        String Editor;
        String Sistema_operativo;
        int Edad;

        System.out.println("Hola, por favor escribe tu nombre:");
        Nombre = EntradaConsola.nextLine();

        System.out.println("ahora, por favor ingresa tu apellido:");
        Apellido = EntradaConsola.nextLine();

        System.out.println("por favor ind�canos tu edad:");
        Edad = EntradaConsola.nextInt();
        Hobbie = EntradaConsola.nextLine();

        System.out.println("�cu�l es tu hobbie?:");
        Hobbie = EntradaConsola.nextLine();

        System.out.println("�cu�l es tu editor favorito?:");
        Editor = EntradaConsola.nextLine();

        System.out.println("finalmente, �cu� es tu sistema operativo?:");
        Sistema_operativo = EntradaConsola.nextLine();

        System.out.println("Muy bien, tu nombre es "+Nombre+", tu apellido es "+Apellido+", tu edad es "+Edad+" a�os, tu hobbie es "+
            Hobbie+", tu editor favorito es "+Editor+", y tu sistema operativo es "+Sistema_operativo);
    }
}