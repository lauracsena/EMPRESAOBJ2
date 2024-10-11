import javax.swing.JOptionPane;
import Clases.*;

public class AppEmpresa{
    public static void main(String[] args) throws Exception {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de empleados: "));
        Empresa empresa = new Empresa();
        for(int emp = 0; emp < cantidad; emp++) {
            String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del empleado");
            String cargo = JOptionPane.showInputDialog(null,"Ingrese el cargo del empleado");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado"));
            //adicion de cada empleado a la empresa
            empresa.contratarEmpleado(new Empleado(nombre,cargo,salario));
        }

        System.out.println("El numero total de empleados es: " + empresa.getTotalEmpleados());

        System.out.println("Los nombres y los salarios de los empleados son: ");
        empresa.nombreSalario();
        
        System.out.println("Total de dinero pagado a todos los empleados: " + empresa.getTotalSalarios() );

        empresa.empleadoMayorSalario();

        empresa.empleadoMenorSalario();
    }
}
