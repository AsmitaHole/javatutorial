package example;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class io {
	
void inputoutput(){
	FileInputStream inp=null;
	FileOutputStream out=null;

try {
	inp = new FileInputStream ("C:\\Users\\Asmita\\eclipse-workspace\\javaproject\\src\\example\\in.java");
	out = new FileOutputStream ("C:\\Users\\Asmita\\eclipse-workspace\\javaproject\\src\\example\\out.java");
	int c ;
	while((c=inp.read())!=-1) {
		out.write(c);
	}
}
catch(Exception e) {
	}
finally {
	try {
	inp.close();
	out.close();
   }
	catch(Exception e) {
	}
	}
	
  }
public static void main (String []args) {
	io obj = new io();
	obj.inputoutput();
}
}
