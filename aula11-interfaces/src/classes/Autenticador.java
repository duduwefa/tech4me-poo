package classes;

import interfaces.Autenticavel;

public class Autenticador {
    private String[] autorizados = {"ABC1234", "54282087", "0178863", "123-321"};

    public boolean autenticar(Autenticavel autenticavel) {
        String token = autenticavel.obterCredenciais();
        boolean achou = false;

        for(int i = 0; i < autorizados.length && !achou; i++) {
            //primeira vez - ABC1234
            //i = 0
            //autorizados[0] = ABC1234
            //token = ABC1234
            achou = autorizados[i].equals(token); //true

            //segunda vez - ABC1234
            //i = 1
            //
        }

        return achou;

    }

}
