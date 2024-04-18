import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int funcion=pedirFuncion();
		double[] numeros=pedirNumeros();	
		double resultado=calculadura(funcion, numeros[0], numeros[1]);

		
		

	}

	public static double calculadora(int opcion, int num1, int num2){
		
		double resultado = 0;
		switch(opcion){
		
		case 1:
		resultado = num1+num2;
			break;
		case 2:
		resultado = num1-num2;
			break;
		case 3:
		resultado = num1/num2;
			break;
		case 4:
		resultado = num1*num2;
			break;
		}

		return resultado;

	public static int pedirFuncion () {
		
		Scanner teclado=new Scanner(System.in);
		int funcion=0;

		System.out.println("Hola buenos dias, que funcion quieres que haga: 1.Sumar 2.Restar 3.Multiplicar 4.Dividir);
		funcion=teclado.nextInt();
	}

	public static double[] pedirNumeros() {

		Scanner teclado=new Scanner(System.in);
		double num1=0;
		double num2=0;
		double[] numeros=new double[2];
		
		System.out.println("Introduce un numero: ");
		num1=teclado.nextDouble();
		System.out.println("Introduce otro numero: ");
		num2=teclado.nextDouble();

		numeros[0]=num1;
		numeros[1]=num2;

		return numeros;

	}

}
