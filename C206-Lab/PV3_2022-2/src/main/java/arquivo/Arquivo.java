package arquivo;

import carrinho.Carrinho;
import exceptions.InfoInvalidaException;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void escrever(Carrinho lilCar){

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try{

            os = new FileOutputStream("Arquivo.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Carrinhos");
            bw.newLine();
            bw.write(lilCar.getNomeJogador() + "\n");
            bw.write(lilCar.getVelocidade() + "\n");
            bw.write(lilCar.getChassi() + "\n");

        }catch(Exception e){

            System.out.println(e);

        }finally {

            try {
                bw.close();
            }catch (Exception e){
                System.out.println(e);
            }

        }

    }

    public ArrayList<Carrinho> ler(){

        ArrayList<Carrinho> lilCars = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;

        try{

            is = new FileInputStream("Arquivo.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null){
                if(linhaLer.contains("Carrinhos")){
                    Carrinho lc = new Carrinho();
                    lc.setNomeJogador(br.readLine());

                    try {
                        lc.setVelocidade(Integer.parseInt(br.readLine()));
                    }catch (Exception e){}

                    try {
                        lc.setChassi(br.readLine());
                    }catch (Exception e){}


                    lilCars.add(lc);
                }
                linhaLer = br.readLine();
            }

        }catch (Exception e){
            System.out.println(e);
        } finally {
            try{
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }


        return lilCars;
    }

}

