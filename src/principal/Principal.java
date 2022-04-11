package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		float v1 = 0, v2 = 0, res = 0;
		int resp, op;
		Scanner sc = new Scanner(System.in);

		Calculadora calc;
		calc = new Calculadora();
	
		do {
			System.out.println("--==[ Calculadora ]==--");
			System.out.println("1 - soma");
			System.out.println("2 - subtração");
			System.out.println("3 - multiplicação");
			System.out.println("4 - divisão");
			System.out.println("5 - potenciação X^Y");
			System.out.println("Opção: ");
			op = sc.nextInt();
			
			switch(op)
			{
				case 1:
					System.out.println("--[ Adição ]--");
					System.out.println("Digite o 1º valor");
					v1 = sc.nextFloat();
					System.out.println("Digite o 2º valor");
					v2 = sc.nextFloat();
					
					calc.soma(v1, v2);
					
					res = calc.getTotal();
					
					System.out.println("Resultado: " + res);		
					break;
				case 2:
					System.out.println("--[ Subtração ]--");
					System.out.println("Digite o 1º valor");
					v1 = sc.nextFloat();
					System.out.println("Digite o 2º valor");
					v2 = sc.nextFloat();
					
					calc.setVal1(v1);
					calc.setVal2(v2);
					
					calc.subtracao();
					
//					res = calc.getTotal();
					res = calc.total;
					
					
					System.out.println("Resultado: " + res);		
					break;
				case 3:
					System.out.println("--[ Multiplicação ]--");
					System.out.println("Digite o 1º valor");
					v1 = sc.nextFloat();
					System.out.println("Digite o 2º valor");
					v2 = sc.nextFloat();
					
					calc.setVal2(v2);
					res = calc.multiplicacao(v1);
					
					System.out.println("Resultado: " + res);		
					break;
				case 4:
					System.out.println("--[ Divisão ]--");
					System.out.println("Digite o 1º valor");
					v1 = sc.nextFloat();
					System.out.println("Digite o 2º valor");
					v2 = sc.nextFloat();
					
					calc.setVal1(v1);
					calc.setVal2(v2);
					res = calc.divisao();
					
					System.out.println("Resultado: " + res);		
					break;
				case 5:
					System.out.println("--[ Potenciação ]--");
					System.out.println("Digite o valor da base");
					v1 = sc.nextFloat();
					System.out.println("Digite o valor expoente");
					v2 = sc.nextFloat();
					
					calc.setVal1(v1);
					calc.setVal2(v2);
					calc.potenciacao();
					res = calc.getTotal();
					
					System.out.println("Resultado: " + res);		
			}
			
			System.out.println("Deseja fazer outro cálculo? (1-sim/2-não)");
			resp = sc.nextInt();
			
		}while(resp == 1);
		
		sc.close();
	}
}
