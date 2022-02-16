package predicados;

import java.util.function.Predicate;

import classes.Pessoa;

public class Contem3Predicado implements Predicate<Pessoa> {

    @Override
    public boolean test(Pessoa p) {
        return p.getNome().contains("3");
    }
    
}
