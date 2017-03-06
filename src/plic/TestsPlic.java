package plic;

/**
 * Created by simon on 16/01/17.
 */
public class TestsPlic {

    /**
     * Appel à Plic pour tester tous les plics
     * @param i le plic Numéro tant
     */
    private static void plic(int i){
        System.out.println("======================== PLIC NUMERO : "+i+" ===========================");
        new Plic("res/test"+i+".plic");
        System.out.println("======================== FIN PLIC "+i+" =========================");
    }

    public static void main(String[] args) {
        /*for(int i  = 1; i<11; i++){
            plic(i);
        }*/

        new Plic("res/plic2/testsi.plic");
    }
}
