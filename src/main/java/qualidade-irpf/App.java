package qualidade-irpf;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Trabalho 1 - Priscilla Karolczak e Francine Constante" );
        System.out.println( "https://www.urionlinejudge.com.br/judge/pt/problems/view/105");
    }

    public static double calculaIrpf(double renda){
        if (renda <= 2) {
            desconto = idoso ? 0.03 : 0.02;
        } else if (dependentes <= 5) {
            desconto = idoso ? 0.045 : 0.035;
        } else {
            desconto = idoso ? 0.06 : 0.05;
        }
    }        
}
