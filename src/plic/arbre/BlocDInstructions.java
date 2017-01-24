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
        strb.append(this.error_div_0());
        return strb.toString();
    }

    private String header(){
        StringBuilder strb = new StringBuilder();
        strb.append(".data\n");
        strb.append("str_div_by_0:\t.asciiz \"Exception : Division par zero interdite\" \n");
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
        strb.append("syscall\n");
        return strb.toString();
    }
    private String error_div_0(){
        StringBuilder strb = new StringBuilder();

        strb.append("print_exception_div_zero:\n");
        strb.append("li $v0, 4\n");
        strb.append("la $a0, str_div_by_0\n");
        strb.append("syscall\n");
        strb.append("b end\n");
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
