import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try(var scanner = new Scanner(System.in)){
            System.out.println("Olá, Bem-Vindo ao BancoTk!");

            System.out.println("Por Favor, me imforme o seu nome:");
            var name = scanner.next();

            int accountNumber = -1;
            System.out.printf("Maravilha Sr(a) %s! Agora me informe o número da sua conta:\n", name);
            while (true) {
                System.out.print("Número da conta: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Erro! Por favor, insira um número.");
                    scanner.next();
                    continue;
                }
                accountNumber = scanner.nextInt();
                if (accountNumber < 0) {
                    System.out.println("Erro! O número da conta não pode ser negativo.");
                    System.out.println("Tente Novamente.");
                    continue;
                }
                break;
            }

            System.out.println("Perfeito! Agora me informe o número da agência:");
            var agencyNumber = scanner.next();

            System.out.printf("Muito bem %s! Agora me informe quantos o(a) Sr(a) deseja depositar \n", name);
            var depositAmount = scanner.nextDouble();
            while (true) {
                System.out.print("Valor do depósito: ");
                if (!scanner.hasNextDouble()) {
                    System.out.println("Erro! Por favor, insira um valor numérico.");
                    System.out.println("Tente Novamente.");
                    scanner.next();
                    continue;
                }
                if (depositAmount < 0) {
                    System.out.println("Erro! O valor do depósito não pode ser negativo.");
                    System.out.println("Tente Novamente.");
                    depositAmount = scanner.nextDouble();
                    continue;
                }
                break;
                
            }

            System.out.printf("Perfeito! Sr(a) %s, o depósito de R$ %.2f foi realizado com sucesso na conta %d, agência %s.\n", 
                            name, depositAmount, accountNumber, agencyNumber);
        }
        
    }
    
}
