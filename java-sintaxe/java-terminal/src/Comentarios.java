public class Comentarios{

    public static void main(String[] args) {

        // Olá, eu sou um comentário de uma linha!  (//)

        /*Olá,                                      (/*)
         * eu sou um comentário
         * que posso ser mais detalhado
         * quando necessário (o chamado comentário multiline)
         */


    }
    /**                                             (/**)
     * Essas duas estrelinhas acima
     * é para identificar que você pretende
     * elaborar um comentário
     * a nível de documentação
     * Que incrível!!!
     */

         public void metodo(){




         }

        // IMPORTÂNCIA DOS COMENTÁRIOS

    /*
     * Esse método foi elaboradoas pressas
     * por isso eu abreviei o nome das variáveis
     * mas olha, ele tem a finalidade somar ou multiplicar
     * dois números
     */

         public int somaMultiplica (int n, int x, String m){

            int r = 0;    // r equivale a resultado.

            if (m == "M"){   // Se o valor da string for 'M', então realize a multiplicação.
                r = n * x;
            }

            else

            r = n + x; // caso contrário, faça a soma dos dois números.

            return r;




         }


    }





