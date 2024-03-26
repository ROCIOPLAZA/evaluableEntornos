import java.util.Scanner;

/**
 * Creamos una class llamada notas que contiene
 * funciones para ingresar notas, comprobarlas y calculas la media de ellas.
 */
public class Notas {

    // declaramos la variables que nos hacen falta
    double unidad1, unidad2, unidad3;
    double acumulador1, acumulador2, acumulador3, def;
    // utilizames ecaner para poder introducir datos
    Scanner entrada = new Scanner(System.in);

    /**
     * Este metodo sirve para ingresar 3 notas.
     * 
     */
    public void ingresaNotas() {
        // cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
        System.out.println("Ingrese las notas del estudiante");

        System.out.print("Ingrese nota 1: ");
        unidad1 = entrada.nextDouble();

        System.out.print("Ingrese nota 2: ");
        unidad2 = entrada.nextDouble();

        System.out.print("Ingrese nota 3: ");
        unidad3 = entrada.nextDouble();

    }

    /**
     * Este metodo sirve para comprobar que hemos ingresado
     * todas las notas validas, es decir entre el 0 y el 10.
     */

    public void comprobacion() {

        if (unidad1 > 10) {
            System.out.println(" La nota 1 esta mal introducida");

        } else {
            System.out.println(" La nota 1 es correcta");
        }

        if (unidad2 > 10) {
            System.out.println(" La nota 2 esta mal introducida");

        } else {
            System.out.println(" La nota 2 es correcta");
        }

        if (unidad3 > 10) {
            System.out.println(" La nota 3 esta mal introducida");

        }

        else {
            System.out.println(" La nota 3 es correcta");
        }
    }

    /**
     * Con este método conseguimos calcular la nota final a partir
     * de tres unidades formativas.
     * La nota final se calcula como la suma ponderada de las tres notas.
     * 
     * @param uf1 Nota primera unidad formativa.
     * @param uf2 Nota segunda unidad formativa.
     * @param uf3 Nota tercera unidad formativa.
     */
    public void calculoNotas() {
        acumulador1 = unidad1 * 0.35;
        acumulador2 = unidad2 * 0.35;
        acumulador3 = unidad3 * 0.30;

        def = acumulador1 + acumulador2 + acumulador3;

    }

    /**
     * Con este metodo conseguimos mostrar cada nota de cada unidad formativa.
     * 
     * @param uf01 Nota primera unidad formativa.
     * @param uf02 Nota segunda unidad formativa.
     * @param uf03 Nota tercera unidad formativa.
     */

    public void mostrar() {
        // print ln lo que hace es que al terminar el print baja la linea
        System.out.println(" Notas introducidas son:");
        System.out.println(" nota1 = " + unidad1);
        System.out.println(" nota2 = " + unidad2);
        System.out.println(" nota3 = " + unidad3);

        System.out.println(" Acumulado 1 = " + acumulador1);
        System.out.println(" Acumulado 2 = " + acumulador2);
        System.out.println(" Acumulado 3 = " + acumulador3);

        System.out.println(" Nota definitiva es = " + def);

    }

    /**
     * Con este metodo comprobamos si aprueba cada unidad,
     * la suspende o tiene un error en la nota.
     */
    public void aprobado() {

        if (def < 5 && def >= 0) {
            System.out.println("La unidad formativa fue suspendida");
        } else {
            if (def >= 5 && def <= 10) {
                System.out.println("La unidad formativa fue aprobada");
            } else {
                System.out.println(" Error en la notas,ingresela de nuevo por favor");
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // creamos mecanimos para llamar a cualquier metodo fuero de la clase
        Notas fc = new Notas();

        fc.ingresaNotas();

        fc.comprobacion();

        fc.calculoNotas();

        fc.mostrar();

        fc.aprobado();
    }

}
