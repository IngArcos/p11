import java.io.*;
public class CopyFileSample{
	public static void copy(File source, File destination)
				throws IOException{
		try(InputStream in = new FileInputStream(source);
		OutputStream out = new FileOutputStream(destination)){
			int b;
			while ((b = in.read()) != -1 ){
				out.write(b);
			}
		}
	}

	public static void main(String[] args) throws IOException{
		File file = new File("/Users/poo02alu21/desktop/Omnitrix/Hola.txt");
		System.out.println(file.exists());
		


		File file2 = new File("/Users/poo02alu21/desktop/Omnitrix/Hola2.txt");
		System.out.println(file2.exists());


	}
}