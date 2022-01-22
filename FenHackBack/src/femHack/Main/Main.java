package femHack.Main;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import femHack.Bullet.Bullet;
import femHack.utils.Teclado;

public class Main {
	static FileWriter fw;

	public static void main(String[] args) throws IOException {
		boolean continueasking = true;
		String toSave = "";

		while (continueasking == true) { 
			// TODO Auto-generated method stub
			
			Bullet myBullet;

			boolean typeDate = Teclado.readJsonManual("How do you want to enter the data? write J for JSON  or M for Manual: ");

			if (typeDate) {
				// you can page this json {'v0' : 50,'alpha' : 50,'save' :true,'typeData' :true } to try

				myBullet = Teclado.readjson("please enter json ejemple:{'v0' : 50,'alpha' : 50,'save' :true,'typeData' :true }: ");

			} else {
				int v0 = Teclado.readInt("please enter bullet speed: ");
				int alpha = Teclado.readAngle("please enter the launch angle: ");
				boolean save = Teclado.readyesNo("Do you want to save the results into a file (Y/N): ");

				myBullet = new Bullet(v0, alpha, save, typeDate);
			}

			// if you want save in file you need create this document in this route or
			// change the route
			if (myBullet.isSave()) { 

				toSave += "\n" + myBullet.toString();
				String route = "c:/prova/femHack.txt";

				fw = new FileWriter(route);

				addFile(toSave);
				fw.close();
				System.out.println("saved data");

			}
			continueasking = Teclado.readyesNo("Do you want to add another bullet (Y/N): ");
		}

		System.out.println("program finish");
	}

	// method to write into the file
	public static void addFile(String st) {

		try {

			fw.append(st + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
