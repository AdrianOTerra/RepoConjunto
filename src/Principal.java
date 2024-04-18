
public class Principal {

	public static void main(String[] args) {
		

		calculadura(funcion, numeros[0], numeros[1]);

		
		

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
	}

}
