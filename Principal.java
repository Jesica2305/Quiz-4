import java.time.LocalDate;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Date day = new Date();
        System.out.printf("Fecha Actual: %td/%tm/%tY %n", day, day, day);

        LocalDate fechaNacimientoLaura = LocalDate.of(2005, 5, 23);
        Estudiante Laura = new Estudiante("Laura", fechaNacimientoLaura);
        Laura.setNotaMateria1(4.9);
        Laura.setNotaMateria2(3.1);
        Laura.setNotaMateria3(2.8);

        System.out.println("Nombre: " + Laura.getNombre() + "\n" + "Fecha de nacimiento: " + Laura.getFechaNacimiento());
        System.out.println("Nota 1: " + Laura.getNotaMateria1() + "\n" + "Nota 2: " + Laura.getNotaMateria2() + "\n" + "Nota 3: " + Laura.getNotaMateria3() );
        System.out.println("Promedio: " + Laura.getPromedio());
        System.out.println("Tiene " + Laura.getEdad() + " años. \n" );

        LocalDate fechaNacimientoSara = LocalDate.of(2002, 7, 15);
        Estudiante Sara = new Estudiante("Sara ", fechaNacimientoSara);
        Sara.setNotaMateria1(1.5);
        Sara.setNotaMateria2(4.8);
        Sara.setNotaMateria3(4.2);

        System.out.println("Nombre: " + Sara.getNombre() + "\n" + "Fecha de nacimiento: " + Sara.getFechaNacimiento());
        System.out.println("Nota 1: " + Sara.getNotaMateria1() + "\n" + "Nota 2: " + Sara.getNotaMateria2() + "\n" + "Nota 3: " + Sara.getNotaMateria3() );
        System.out.println("Promedio: " + Sara.getPromedio());
        System.out.println("Tiene " + Sara.getEdad() + " años.");
    }
}
