/**
 * Clase Analista para examen de ED 2022
 * @author gustavojuan 44753664B
 * @version 10.0
 */

public class AnalistaED_44753664B {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;

    /**
     * Constructor de Clase Analista
     * @param nombreCompleto string con el nombre completo
     * @param dni string con el dni
     */
    public AnalistaED_44753664B(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }
    
    /**
     * Devuelve Salario del mes actual
     * @param horasExtra Entero con las horas de mas
     * @return Salario final con horas extras incluidas
     */

    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora
                * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    // Este método no lo comentaremos con JavaDoc
    public static void main(String[] args) {
        AnalistaED_44753664B emp = new AnalistaED_44753664B("Gustavo Juan","44753664B");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra) + " euros, al hacer " + horasExtra + " horas extra."
        );
    }
}
