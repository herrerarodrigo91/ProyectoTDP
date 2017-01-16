/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Serializer {
    
    public static BancoEntidades read(String filename) {
		File file = new File( filename );
		BancoEntidades be = null;
		if(file.exists()) {
			try {
				FileInputStream fileIn = new FileInputStream(file);
				ObjectInputStream objIn = new ObjectInputStream(fileIn);
				be = (BancoEntidades) objIn.readObject();
				objIn.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return be;
	}
    
    public static void write(BancoEntidades be, String filename) {		
		ObjectOutputStream objOut;
		try {
			File file = new File(filename);
			FileOutputStream fileOut = new FileOutputStream(file);
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(be);
			objOut.flush();
			objOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
    
    
    
    
}
