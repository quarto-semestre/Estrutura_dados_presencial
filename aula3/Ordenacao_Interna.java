package aula3;

import java.util.function.Consumer;

public class Ordenacao_Interna {


    public static void copia(Item[] fonte, Item[] destino, int n){
        System.arraycopy(fonte, 0, destino, 0, n);
    }

    public static void testa(Item[] v, int n){
        for(int i = 1; i < n; i++){
            if (v[i].compara(v[i - 1]) < 0) {
                System.out.print("ERRO: ");
                imprime(v, n);
                return;
            }
        }

        imprime(v,n);
    }

    public static void imprime(Item[]v, int n){
        for(int i = 0; i < n; i++){
            System.out.println(v[i].recuperaChave()+ " ");
        }
        System.out.println();
    }


    private static  void testarOrdenacao(String nomeAlgoritmo, Consumer<MeuItem[]> algoritmoOrdenacao, MeuItem[] original, MeuItem[] paraOrdenar, int tam){
        copia(original, paraOrdenar, tam);
        System.out.println(nomeAlgoritmo);
        algoritmoOrdenacao.accept(paraOrdenar);
        testa(paraOrdenar,tam);
    }
    public static void main(String[] args) {
        int tam = 5;
        MeuItem[] a = new MeuItem[tam];
        MeuItem[] b = new MeuItem[tam];


        for(int i = 0; i < tam; i++){
            a[i] = new MeuItem(i +1);
        }

        PermutacaoRandomica.permut(a, tam);

        System.out.println("Desordenado: ");
        imprime(a, tam);

        testarOrdenacao("BubbleSort", Ordenacao::bubbleSort, a, b, tam);
        testarOrdenacao("SelectionSort",Ordenacao::selectionSort, a, b, tam);
        testarOrdenacao("InsertionSort", Ordenacao::insertSort, a, b, tam);
        testarOrdenacao("QuickSort", Ordenacao::quickSort, a, b, tam);
        testarOrdenacao("ShellSort", Ordenacao::shellSort, a, b, tam);

    }
}
