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

        double imposto; 

        if (renda <= 2000) {
            imposto = 0; 
            
        } else if (renda <= 3000) {
            imposto = (renda - 2000) * 0.08;

        } else if (renda <= 4500){
            imposto = (1000 * 0.08) + (renda - 3000 * 0.18);
        } else{ 
            imposto = (1000 * 0.08) + (1500.00 * 0.18) + (renda - 4500 * 0.28);
        } 
        return imposto;
    }        
}
