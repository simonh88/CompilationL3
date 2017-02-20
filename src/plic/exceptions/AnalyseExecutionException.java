package plic.exceptions;

/**
 * Created by simon on 20/02/17.
 */
public class AnalyseExecutionException extends AnalyseException {

    public AnalyseExecutionException(String m) {
        super("ERREUR EXECUTION : "+m);
    }

}
