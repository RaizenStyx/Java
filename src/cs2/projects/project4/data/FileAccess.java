/**
 * -------------------------------------------------
 * File name: FileAccess.java
 * Project name: Monster Lab!
 * -------------------------------------------------
 * Creator's name: Connor Reed & Isaac Cooper
 * Email: c.alexreed@gmail.com
 * Course: CISP 1020
 * Creation date: Apr 26, 2021
 * -------------------------------------------------
 */
package cs2.projects.project4.data;

import cs2.projects.project4.models.Encounter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

import java.io.IOException;

public class FileAccess {
    private String filename;

    public FileAccess(String filename) {
        this.filename = filename;
    }

    public void saveEncounterFile(Encounter encounter) throws IOException {
        File file = new File(this.filename);
        String abs = file.getAbsolutePath();
        FileOutputStream fos = new FileOutputStream(abs);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(encounter);
        System.out.println("\nFile saved to: " + file.getAbsolutePath());
        oos.close();
    }

    public void openEncounterFile(Encounter encounter) throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(this.filename));

        Encounter temp = (Encounter) input.readObject();

        encounter.setMonsters(temp.getMonsters());
        encounter.setMonsters(temp.getMonsters());

        input.close();
    }
}
