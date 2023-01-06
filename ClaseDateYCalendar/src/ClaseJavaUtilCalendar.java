import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClaseJavaUtilCalendar {

    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance(); //Se crea sin objeto, por debajo el getInstance se encarga de crear el new Object(); por ser clase estatica

        //Primer ejemplo

        /*calendario.set(2020,0,25, 24,0,0); //mes empieza en 0 hasta 11, el día si comienza en 1 hasta 28,29,30 o 31 según corresponda, las horas también empiezan en 0 hasta 23, el 24 ya salta al siguiente día
        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);*/

        //Segundo ejemplo
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        //calendario.set(Calendar.HOUR_OF_DAY, 21); formato de 24 horas
        calendario.set(Calendar.HOUR,7); //formato 12 horas
        calendario.set(Calendar.AM, Calendar.AM);
        calendario.set(Calendar.MINUTE, 25);
        calendario.set(Calendar.SECOND, 25);
        //calendario.set(Calendar.MILLISECOND, 25); si se omiten son dinámicos, si se asignan son estáticos.

        Date fecha = calendario.getTime();
        System.out.println("Fecha sin formato: " + fecha);

        //SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS"); // formato 24 horas, se puede poner am pm pero se sobreentiende el formato de 24 horas no es necesario
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a"); //formato 12 horas am, pm
        String fechaConFormato = f.format(fecha);
        System.out.println("Fecha con formato: " + fechaConFormato);

    }

}