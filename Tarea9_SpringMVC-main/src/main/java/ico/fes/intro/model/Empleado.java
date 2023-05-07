package ico.fes.intro.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor //constructor con todos los argumentos
@NoArgsConstructor //constructor sin argumentos
@Setter //Metodos sets
@Getter //Metodos gets
@ToString
public class Empleado {
    private String nombre;
    private int id;
    private double sueldo;
    private String departamento;
    private String fechaNacimiento;

}
