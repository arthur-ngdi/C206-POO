import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List <Integer> al = new ArrayList<>();
        Set <Integer> hs = new HashSet<>();
        Map <Integer, Integer> hm = new HashMap<>();

        long tempo1_al, tempo2_al;
        long tempo1_hs, tempo2_hs;
        long tempo1_hm, tempo2_hm;
        


        tempo1_al = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            al.add(i);
        }
        tempo2_al = System.currentTimeMillis();

        tempo1_hs = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            hs.add(i);
        }
        tempo2_hs = System.currentTimeMillis();

        tempo1_hm = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            hm.put(i,i);
        }
        tempo2_hm = System.currentTimeMillis();


        System.out.println("Desempenho de escrita ArrayList: " + (tempo2_al - tempo1_al));
        System.out.println("Desempenho de escrita HashSet: " + (tempo2_hs - tempo1_hs));
        System.out.println("Desempenho de escrita HashMap: " + (tempo2_hm - tempo1_hm));

        tempo1_al = System.currentTimeMillis();
        for (Integer o : al) {
            al.contains(o);
        }
        tempo2_al = System.currentTimeMillis();

        tempo1_hs = System.currentTimeMillis();
        for (Integer o : hs) {
            hs.contains(o);
        }
        tempo2_hs = System.currentTimeMillis();

        tempo1_hm = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            hm.containsKey(i);
        }
        tempo2_hm = System.currentTimeMillis();

        System.out.println("Desempenho de leitura ArrayList: " + (tempo2_al - tempo1_al));
        System.out.println("Desempenho de leitura HashSet: " + (tempo2_hs - tempo1_hs));
        System.out.println("Desempenho de leitura HashMap: " + (tempo2_hm - tempo1_hm));
    }
}
