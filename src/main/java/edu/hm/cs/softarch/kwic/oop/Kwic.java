package edu.hm.cs.softarch.kwic.oop;

/**
 * Klasse zum Einlesen, Erstellen und Ausgeben einer Liste von Schlüsselwörtern
 * im Kontext. Verbindet die Verarbeitungsschritte.
 * 
 * @author katz.bastian
 */
public class Kwic {

	private SimpleFileInput reader;
	private Shifter shifter;
	private Sorter sorter;
	private ConsoleOutput printer;

	/**
	 * Konstruktor.
	 * 
	 * @param phraseFileName
	 *            Dateiname mit Phrasen oder Titeln (zeilenweise).
	 */
	public Kwic(String phraseFileName) {
		reader = new SimpleFileInput(phraseFileName);
		shifter = new Shifter();
		sorter = new Sorter();
		printer = new ConsoleOutput();
	}

	/**
	 * Stößt die Verarbeitung an.
	 */
	public void print() {
		reader.read(shifter);
		sorter.init(shifter);
		printer.print(sorter);
	}

}
