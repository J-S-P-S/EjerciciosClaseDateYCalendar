import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ClaseJavaUtilDateParse {

    public static void main(String[] args) {

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una fecha con formato yyyy-MM-dd");

        try {
            Date fecha = f.parse(leer.next());
            System.out.println("Fecha = " + fecha);
            System.out.println("Fecha con formato = " + f.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if (fecha.after(fecha2)) {
                System.out.println("Fecha del usuario es después de la fecha actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha del usuario es anterior de la fecha actual");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha de usuario es igual a la fecha actual");
            }

            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("2Fecha del usuario es después de la fecha actual");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("2Fecha del usuario es anterior de la fecha actual");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("2Fecha de usuario es igual a la fecha actual");
            }

        } catch (ParseException e) {
            System.out.println("Error!, verifique los datos ingresados y vuelva a intentar.");
        }
    }
}

    /*public class ProgramaCalculoEdad { // ejemplo del profe

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = scanner.next();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaNacimiento = df.parse(fechaStr);
        Date actual = new Date();

        // creamos un patron de fecha numérico con el año mes y día
        df = new SimpleDateFormat("yyyyMMdd");

        // luego convertimos ambas fechas la actual y la fecha de nacimiento
        // en enteros que contiene el año mes y día
        int desde = Integer.parseInt(df.format(fechaNacimiento));
        int hasta = Integer.parseInt(df.format(actual));

        // luego restamos ambas fechas y dividimos en 10000 para quitar decimales y
        // dejar la fecha en decenas o centenas
        int edad = (hasta - desde) / 10000;
        System.out.println("La edad es: " + edad);
    }*/