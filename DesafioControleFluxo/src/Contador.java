import java.util.Scanner;

public class Contador {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = scanner.nextInt();
            
            try {
                contar(parametroUm, parametroDois);
            }catch (ParametrosInvalidosException exception) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }finally {
                scanner.close(); 
            }
        }
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro");
            }
            
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println(i);
        }
    }
}