import javax.swing.*;
import java.io.*;

public class ProjetoTXT {
    public static void main(String[] args) throws IOException {

        String nomeDapasta = "c:/teste";
        String nomeDoArquivo = "tabuada.txt";
        String caminhoParaPasta = nomeDapasta + "/" + nomeDoArquivo;
        int numeroDacalculadora = 2;
        int contador = 0;
        int linhaQueDesejaSerImpressa =8;
        String linha;
        int numeroDeLinha = 0 ;

        try {
        File arquivo = new File(nomeDapasta);
        boolean exists = arquivo.exists();
        System.out.println(exists);
        arquivo.mkdir();
        boolean exists2 = arquivo.exists();
        System.out.println(exists2);



            File arquivo1 = new File(caminhoParaPasta);
            FileWriter escritor = new FileWriter(arquivo1);
            BufferedWriter bufferedWriter = new BufferedWriter(escritor);


            for (int i = 0; i <= 10; i++) {
                int resultado = numeroDacalculadora * contador;
                bufferedWriter.write(numeroDacalculadora + " x " + contador + " = " + resultado);
                bufferedWriter.newLine();

               contador++;
            }
            bufferedWriter.close();

            FileReader leitor = new FileReader(arquivo1);
            BufferedReader bufferLeitura = new BufferedReader(leitor);

            while ((linha = bufferLeitura.readLine()) != null)  {
                if(numeroDeLinha == linhaQueDesejaSerImpressa){
                    JOptionPane.showMessageDialog(null,linha);
                    break;
                }
                numeroDeLinha++;

            }
            bufferLeitura.close();


            System.out.println("Arquivo criado com sucesso" + caminhoParaPasta);
        } catch (IOException e) {
            System.err.println("erro ao criar arquivo" + " " + e.getMessage());
        }


    }
}
