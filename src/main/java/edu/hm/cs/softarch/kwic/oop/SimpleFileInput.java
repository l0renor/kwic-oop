package edu.hm.cs.softarch.kwic.oop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Klasse zum Einlesen einer Datei mit Phrasen. Die Zeilen werden einem
 * {@link Shifter}-Objekt übergeben, das daraus die Einträge erstellt.
 * 
 * @author katz.bastian
 */
public class SimpleFileInput {
	private static Logger LOG = LoggerFactory.getLogger(SimpleFileInput.class);

	private String fileName;

	public SimpleFileInput(String fileName) {
		this.fileName = fileName;
	}

	public List<String> read(Shifter shifter) {
		Path inFile = Paths.get(fileName);
		List<String> result = Collections.emptyList();
		try {
			for (String line : Files.readAllLines(inFile)) {
				shifter.addPhrase(line);
			}
		} catch (IOException e) {
			LOG.error("Fehler beim Einlesen: " + e);
			System.exit(1);
		}
		return result;
	}
}
