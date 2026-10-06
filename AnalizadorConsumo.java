import java.util.Scanner;

public class AnalizadorConsumo {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

double lunes, martes, miercoles, jueves, viernes;
double promedio, promedioAnterior, porcentaje;
String nivel, resultado;

System.out.print("Consumo lunes: ");
lunes = sc.nextDouble();

System.out.print("Consumo martes: ");
martes = sc.nextDouble();

System.out.print("Consumo miércoles: ");
miercoles = sc.nextDouble();

System.out.print("Consumo jueves: ");
jueves = sc.nextDouble();

System.out.print("Consumo viernes: ");
viernes = sc.nextDouble();

promedio = (lunes + martes + miercoles + jueves + viernes) / 5;

if (promedio < 8) {
nivel = "CONSUMO BAJO";
} else if (promedio <= 12) {
nivel = "CONSUMO NORMAL";
} else if (promedio <= 16) {
nivel = "CONSUMO ALTO";
} else {
nivel = "CONSUMO CRITICO";
}

System.out.print("Ingrese el promedio anterior: ");
promedioAnterior = sc.nextDouble();

porcentaje = ((promedio - promedioAnterior) / promedioAnterior) * 100;

if (porcentaje < 0) {
resultado = "El consumo disminuyo";
} else if (porcentaje <= 10) {
resultado = "El consumo aumento ligeramente";
} else if (porcentaje <= 25) {
resultado = "El consumo aumento considerablemente";
} else {
resultado = "ALERTA: aumento elevado del consumo";
}

System.out.println("\n==============================");
System.out.println("ANALIZADOR DE CONSUMO");
System.out.println("==============================");
System.out.println("Promedio de consumo: " + promedio);
System.out.println("Nivel: " + nivel);
System.out.println("Promedio anterior: " + promedioAnterior);
System.out.println("Promedio actual: " + promedio);
System.out.printf("Variacion: %.2f%%\n", porcentaje);
System.out.println("Resultado: " + resultado);

sc.close();
}
}