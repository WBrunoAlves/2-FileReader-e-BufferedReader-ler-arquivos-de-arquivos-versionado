import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String path = "/home/wds/java-u/atividades/9-trabalhando-arquivos-java/2-FileReader-e-BufferedReader-ler-arquivos-de-arquivos-versionado/in.txt";
	
		/*melhoria tira o finally e coloca as instanciaçoes no bloco try*/
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		

	}

}
