package plic.arbre;

/**
 * 3 déc. 2015
 *
 * @author brigitte wrobel-dautcourt
 */

public class BlocDInstructions extends ArbreAbstrait {
    
    protected ArbreAbstrait expr ;
    
    public BlocDInstructions(int n) {
        super(n) ;
    }

    @Override
    public void verifier() {
    	expr.verifier();
    }

    @Override
    public String toMIPS() {
        StringBuilder strb = new StringBuilder();
        strb.append(this.header());
        strb.append(expr.toMIPS()+"\n");
        strb.append(this.footer());
        return strb.toString();
    }

    private String header(){
        StringBuilder strb = new StringBuilder();
        strb.append(".text\n");
        strb.append("main :\n");
        strb.append("move $s7,$sp\n");
        return strb.toString();
    }

    private String footer(){
        StringBuilder strb = new StringBuilder();
        strb.append("end :\n");
        strb.append("move $v1, $v0\n");
        strb.append("li $v0, 10\n");
        strb.append("syscall");
        return strb.toString();
    }

    public void ajouter(ArbreAbstrait a) {
        expr = a ;
    }
    
    @Override
    public String toString() {
        return expr.toString() ;
    }

}
