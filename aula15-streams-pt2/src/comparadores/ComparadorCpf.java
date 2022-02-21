package comparadores;

import java.util.Comparator;

import classes.Pessoa;

public class ComparadorCpf implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return p1.getCpf().compareTo(p2.getCpf());
    }
    
}
