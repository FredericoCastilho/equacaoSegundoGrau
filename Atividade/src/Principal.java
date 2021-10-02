import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        AtributosEOperacoes objeto = new AtributosEOperacoes();
        boolean rodando = true;
        String respMenu;

        

        while (rodando) {

            Scanner scan = new Scanner(System.in);

            

            System.out.println("==== EQUAÇÃO DE 2º GRAU ====");
            System.out.println("Digite o Valor de a:");
            try {
                objeto.setA(scan.nextFloat());
                scan.nextLine();
                while (objeto.getA() == 0) {
                    System.out
                            .println("Opção inválida!\nO valor de A tem que ser diferente de zero!\nTente novamente!");
                    System.out.println("Digite o Valor de a:");
                    objeto.setA(scan.nextFloat());
                    scan.nextLine();
                }
                System.out.println("Digite o Valor de b:");
                objeto.setB(scan.nextFloat());
                scan.nextLine();

                System.out.println("Digite o Valor de c:");
                objeto.setC(scan.nextFloat());
                scan.nextLine();

                System.out.println("---------------------------------");
                System.out.println("Valor de a:" + (int) objeto.getA());
                System.out.println("Valor de b:" + (int) objeto.getB());
                System.out.println("Valor de c:" + (int) objeto.getC());

                objeto.AchandoDiscriminante();

                System.out.println("---------------------------------");
                System.out.println("Valor Delta:" + (int) objeto.getDelta());

                objeto.FormulaBhaskara();

                System.out.println("---------------------------------");
                System.out.println("Valor X1:" + (int) objeto.getX1());
                System.out.println("Valor X2:" + (int) objeto.getX2());
                System.out.println("---------------------------------");

                objeto.EstudoRaizes();

                System.out.println("---------------------------------");
                System.out.println("Deseja sair?[S/N]");
                respMenu = scan.nextLine().toUpperCase(Locale.ROOT).strip();
                while (!respMenu.equals("S") && !respMenu.equals("N")) {
                    System.out.println("Opção inválida!\nTente novamente");
                    System.out.println("Deseja sair?[S/N]");
                    respMenu = scan.nextLine().toUpperCase(Locale.ROOT).strip();
                }
                if (respMenu.equals("S")) {
                    rodando = false;
                    System.out.println("Finalizando programa...");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro!\nO valor digitado NÃO foi um número!");
            }
        }
    }
}
