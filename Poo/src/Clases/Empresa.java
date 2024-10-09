package Clases;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<Empleado>();
    }

    // Método que agrega empleados a la empresa
    public void contratarEmpleado(Empleado e) {
        empleados.add(e);
    }

    // Método que obtiene el total de empleados
    public int getTotalEmpleados() {
        return empleados.size();
    }

    // Método que muestra los nombres y salarios de todos los empleados
    public void nombreSalario() {
        for (Empleado e : empleados) {
            System.out.println("Nombre: " + e.getNombre() + " Salario: " + e.getSalario());
        }
    }

    // Método que retorna el total del dinero pagado a todos los empleados
    public double getTotalSalarios() {
        double total = 0;
        for (Empleado e : empleados) {
            total = total + e.getSalario();
        }
        return total;
    }

    // Método que muestra el nombre, cargo y salario del empleado que más dinero gana
    public void empleadoMayorSalario() {
        Empleado empMayorSalario = empleados.get(0);
        double maxSalario = empleados.get(0).getSalario();
        for (Empleado e : empleados) {
            if (e.getSalario() > maxSalario) {
                maxSalario = e.getSalario();
                empMayorSalario = e;
            }
        }
        System.out.println("El empleado que más dinero gana es:");
        System.out.print("Nombre: " + empMayorSalario.getNombre());
        System.out.print(" Cargo: " + empMayorSalario.getCargo());
        System.out.println(" Salario: " + empMayorSalario.getSalario());
    }

    // Método que muestra el nombre, cargo y salario del empleado que menos dinero gana
    public void empleadoMenorSalario() {
        Empleado empMenorSalario = empleados.get(0);
        double menSalario = empleados.get(0).getSalario();

        for (Empleado e : empleados) {
            if (e.getSalario() < menSalario) {
                menSalario = e.getSalario();
                empMenorSalario = e;
            }
        }
        System.out.println("El empleado que menos dinero gana es:");
        System.out.print("Nombre: " + empMenorSalario.getNombre());
        System.out.print(" Cargo: " + empMenorSalario.getCargo());
        System.out.println(" Salario: " + empMenorSalario.getSalario());
    }
}
