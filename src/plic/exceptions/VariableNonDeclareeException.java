package plic.exceptions;

/**
 * Created by antoine on 16/02/17.
 */

public class VariableNonDeclareeException extends AnalyseException {

    public VariableNonDeclareeException(String m, int ligne) {
        super("VARIABLE NON DECLAREE : " + m + "\n\tLigne : " + ligne);
    }
}