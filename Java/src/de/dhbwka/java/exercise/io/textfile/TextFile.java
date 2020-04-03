package de.dhbwka.java.exercise.io.textfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Schreiben Sie eine Klasse TextFile. Diese soll folgende Methoden haben:

• Konstruktor TextFile(File f)
zum Erzeugen eines neuen TextFile-Objektes. Der Konstruktor soll die entsprechende
Datei sofort einlesen. (Die zugehörige Datei muss bereits existieren.)

• Konstruktor TextFile(String pathname)
zum Erzeugen eines neuen TextFile-Objektes. Der Konstruktor soll die entsprechende
Datei sofort einlesen. (Die zugehörige Datei muss bereits existieren.)

• void read()
zum (ggf. erneuten) Einlesen aller Zeilen der Datei in eine passende Datenstruktur (Puffer)
im Speicher.

• void write()
zum Schreiben der gepufferten Inhalte zurück in die Datei.

• int availableLines()
liefert die Anzahl der Zeilen im Puffer.

• String[] getLines()
liefert alle Zeilen des Puffers als String-Array.

• String getLine(int i)
liefert Zeile i des Puffers als String (Zählung beginnend bei Zeile 1). Die Methode soll eine
eigene Exception LineNumberOutOfBoundsException werfen, wenn die
Zeilenummer kleiner als 1 oder größer als die Anzahl der Zeilen im Puffer ist.

• void setLine(int i, String s)
Setzt Zeile i des Puffers auf den String s (Zählung beginnend bei Zeile 1). Die Methode soll
ebenfalls eine eigene Exception LineNumberOutOfBoundsException werfen, wenn
die Zeilenummer kleiner als 1 oder größer als die Anzahl der Zeilen im Puffer ist.

• void replaceAll(String regexp, String ersatz)
zum Ersetzen aller Vorkommen von regexp (darf ein regulärer Ausdruck sein!) gegen
ersatz (in allen Zeilen des Puffers).

• void close()
zum Schließen der Textdatei und Freigabe der internen Ressourcen (Puffer, File-Objekt).
Testen Sie die Klasse aus einer zweiten Klasse TextFileTest!
Fangen Sie dabei LineNumberOutOfBoundsExceptions ab!

 */
public class TextFile {

    private List<String> Lines = new ArrayList<String>();
    private int LinesCount;
    private File file;
    private String filesPath;
    private String filesName;
    public TextFile(File f) throws Exception {
        try {
            file = new File(f.getAbsolutePath());
            ReadTextFile();
            filesPath = file.getAbsolutePath();
            filesName = file.getName();

        } catch (Exception e) {
            throw new Exception("f is not a file");
        }
    }

    public TextFile(String path) throws Exception {
        try {
            file = new File(path);

            ReadTextFile();
            filesPath = file.getAbsolutePath();
            filesName = file.getName();
        } catch (Exception e) {
            throw new Exception("f is not a file");
        }
    }

    public static void main(String[] args) throws Exception {
        TextFile t = new TextFile(new File("C:\\Test\\Text.txt"));
        System.out.println(t.toString());
        t.RemoveAllLines();
        System.out.println(t.toString());

    }

    public void setLines(String[] lines) {
        Lines = new ArrayList<String>();
        for (int i = 0; i < lines.length; i++) {
            Lines.add(lines[i]);
        }
    }

    public int getLinesCount() {
        return LinesCount;
    }

    public String getFilesPath() {
        return filesPath;
    }

    public String getFilesName() {
        return filesName;
    }

    private void Write(String path) throws IOException {
        File f = new File(path);
        if (!f.exists()) {
            f.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream(f);
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos))) {
            for (String line :
                    Lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (Exception e) {

        }
    }

    public void Rename(String newName) {
    }

    public TextFile copyTo(String path) throws Exception {
        Write(path);
        return new TextFile(path);
    }

    public void MoveTo(String path) throws Exception {
        Write(path);

        file.delete();
        file = new File(path);
        filesPath = path;
        filesName = file.getName();
    }

    public void delete() {
        File f = new File(filesPath);
        f.delete();

        Lines = new ArrayList<String>();
        filesPath = "";
        filesName = "";
    }

    public void save() throws IOException {
        Write(filesPath);
    }

    public void setLine(int Index, String line) {
        Lines.set(Index, line);
    }

    public void addLine(String line) {
        Lines.add(line);
        LinesCount = Lines.size();

    }

    public void addLine(int Index, String line) {
        Lines.add(Index - 1, line);
        LinesCount = Lines.size();
    }

    public String GetLine(int Index) {
        return Lines.get(Index - 1);
    }

    public String[] GetLines() {
        return Lines.toArray(new String[Lines.size() - 1]);
    }


    public String GetFirstLine() {
        return Lines.get(0);
    }

    public void RemoveAllLines() {
        Lines = new ArrayList<String>();
        LinesCount = Lines.size();

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TextFile) {
            if (((TextFile) obj).filesName.equals(filesName) &&
                    ((TextFile) obj).filesPath.equals(filesPath) &&
                    ((TextFile) obj).LinesCount == LinesCount) {
                String[] objLines = ((TextFile) obj).GetLines();
                for (int i = 0; i < Lines.size(); i++) {
                    if (!Lines.get(i).equals(objLines[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    @Override
    public String toString() {
        String text = GetText();
        return "File Name = " + filesName + System.lineSeparator() + "File Path = " + filesPath + System.lineSeparator() + "Line Count = " + Lines.size() + System.lineSeparator() + "Content = " + System.lineSeparator() + text;
    }

    public String GetLastLine() {
        return Lines.get(Lines.size() - 1);
    }

    public String GetText() {
        String text = "";
        for (String line :
                Lines) {
            text += line + System.lineSeparator();
        }
        return text;
    }

    public boolean ReplaceAll() {
        return true;
    }

    public boolean replaceOne() {
        return true;
    }

    public void read() throws Exception {
        ReadTextFile();
    }

    private void ReadTextFile() throws Exception {
        if (!file.isFile()) {
            throw new Exception("f is not a file");
        }
        if (!file.exists()) {
            throw new Exception("f does not exist");
        }
        Scanner scanner = new Scanner(file);
        Lines = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            Lines.add(scanner.nextLine());
        }
        scanner.close();
    }
}
