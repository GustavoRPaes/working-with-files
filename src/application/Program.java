package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath : " + path.getPath());
		
		
		sc.close();
		
// ------------------------------------------------------------		
		
// 	    Create new folders + show files and folders		
		
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.println("Enter a folder path: ");
//		String strPath = sc.nextLine();
//		
//		File path = new File(strPath);
//		
//		File[] folders = path.listFiles(File::isDirectory);
//		System.out.println("FOLDERS: ");
//		for (File folder : folders) {
//			System.out.println(folder);
//		}
//		
//		File[] files = path.listFiles(File::isFile);
//		System.out.println("FILES: ");
//		for (File file : files) {
//			System.out.println(file);
//		}
//		
//		boolean success = new File(strPath + "\\testeAula").mkdir();
//		System.out.println("Directory created sucessfully: " + success);
//		
//		sc.close();
		
//	--------------------------------------------------------------------------------------	
		
//		FileWriter and BufferedWriter
		
//		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night", "Good morning", "Good afternoon", "Good night"};
//		
//		String path = "C:\\Users\\out";
//		
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
//			for (String line : lines) {
//				bw.write(line);
//				bw.newLine();
//			}
//		}
//		
//		catch (IOException e ) {
//			e.printStackTrace();
//		}

//	-----------------------------------------------------------------------------------------------	
		
////		BufferedReader and FileReader
//		
////		String path = "C:\\Users\\java.txt";
////		
////		try (BufferedReader br = new BufferedReader(new FileReader(path))){
////
////			String line = br.readLine();
////
////			while (line != null) {
////				System.out.println(line);
////				line = br.readLine();
////			}
////		} 
////		catch (IOException e) {
////			System.out.println("Error: " + e.getMessage());
////		} 
////		
////		}

// ---------------------------------------------------------------------------		
		
//    	BEGGINER WAY

//		File file = new File("C:\\Users\\java.txt");
//		Scanner sc = null;
//		try {
//			sc = new Scanner(file);
//			while (sc.hasNextLine()) {
//				System.out.println(sc.nextLine());
//			}
//		} catch (IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		} finally {
//			if (sc != null) {
//				sc.close();
//			}
//		}
	}
}
