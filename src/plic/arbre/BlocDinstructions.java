package plic.arbre;

import plic.arbre.ArbreAbstrait;
import plic.declarations.Declaration;
import plic.declarations.Instruction;

import java.util.ArrayList;

/**
 * Created by simon on 06/03/17.
 */
public class BlocDinstructions extends ArbreAbstrait{

    protected ArrayList<Instruction> instructions;

    public BlocDinstructions(int no) {
        super(no);
        instructions = new ArrayList<Instruction>();
    }


    public void ajouter(Instruction i){
        instructions.add(i);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Instruction i : instructions) {
            sb.append("\n\n");
            sb.append(i);
        }

        return sb.toString();
    }

    @Override
    public void verifier() {
        for (Instruction i : instructions) {
            i.verifier();
        }
    }

    @Override
    public String toMIPS() {
        StringBuilder sb = new StringBuilder();

        for (Instruction i : instructions) {
            sb.append("\n\n");
            sb.append(i.toMIPS());
        }

        return sb.toString();
    }
}
