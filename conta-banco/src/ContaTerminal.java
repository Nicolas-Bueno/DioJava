import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double deposito = 0.0;
        

        System.out.println("Bem vindo ao cadastro DIO-Bank");
        System.out.println("Por favor, digite o número da Agência !");
        int numeroConta =  scan.nextInt();

        System.out.println("Informe seu nome: ");
        String nome = scan.next();

        System.out.println("Informe sua agencia:");
        String agencia = scan.next();

        System.out.println("Deseja depositar? (s/n)");
        String opc = scan.next();

        if(opc.equals("s")){
            System.out.println("Informe o valor do deposito: ");
            deposito =  scan.nextDouble();
        }

        Conta conta = new Conta(numeroConta, agencia, nome, deposito);

        System.out.println("Olá " + conta.getNomeCliente() + " , obrigado por criar uma conta em nosso banco, sua agência é "
         + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");

        scan.close();

    }
}
