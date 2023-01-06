import java.text.SimpleDateFormat;
import java.util.Date;

public class ClaseJavaUtilDate {

    public static void main(String[] args) {

        Date fecha = new Date();
        int prueba = 0;
        System.out.println("Fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("EEEE yyyy/MMMM/dd u"); // dd (día) MM(número del mes) MMMM (nombre del mes) yyyy(El año)
        SimpleDateFormat pr = new SimpleDateFormat("u");//Prueba para obtener el número de día del mes y convertirlo a palabra
        prueba = Integer.parseInt(pr.format(fecha));
        //Se puede buscar más información en Google, buscando por SimpleDateFormat java (8,14,16,etc..versión) para este caso java jdk 19
        String fechaStr = df.format(fecha);
        System.out.println("Fecha con formato: " + fechaStr);
        if (prueba == 2){
            System.out.println("Día de la semana: martes");
        } else {
            System.out.println("Día de la semana (lunes = 1, martes = 2): " + prueba); //miercoles 3, jueves 4, viernes 5, sabado 6 y domingo 7
        }

        long j = 0;
        for (int i = 0; i < 10000000; i++) {
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tfinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo final en milisegundos: " + tfinal);


    }
}