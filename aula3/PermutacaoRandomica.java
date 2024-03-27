package aula3;
import java.util.Random;

public class PermutacaoRandomica {
    public static void permut(Item[] v, int n){
        Random rand = new Random();
        for(int i = n-1; i >0; i--){
            int j = rand.nextInt(i+1);

            Item temp = v[i];
            v[i] = v[j];
            v[j]= temp;
        }
    }
}
