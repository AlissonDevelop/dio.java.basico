import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		
		double media, nota1, nota2, nota3;
		
		System.out.print("Digite a primeira nota do aluno: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota do aluno: ");
		nota2 = sc.nextDouble();	
		System.out.print("Digite a terceira  nota do aluno: ");
		nota3 = sc.nextDouble();	

		
		media = (nota1 + nota2 + nota3)/ 3;
		

		System.out.println("A nota final do aluno �: " + media );
		sc.close();
    }
}
