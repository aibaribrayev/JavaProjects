
package word_occurrences;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


final class FileWalker {

    private final Occurrences occ;
    private final File rootDir;

    FileWalker(String rootDirPath, Occurrences occ) throws FileNotFoundException {
        this.occ = occ;
        this.rootDir = new File(rootDirPath);

        if (!this.rootDir.isDirectory()) {
            throw new FileNotFoundException(rootDirPath + " does not exist, " +
                    "or is not a directory.");
        }
    }

    void populateOccurrenceMap() {
        try {
            populateOccurrenceMap(rootDir);
        } catch (IOException ex) {
            // We should never really get to this point, but just in case...
            System.out.println(ex);
        }
    }

    private void populateOccurrenceMap(File fileOrDir) throws IOException {

        // TODO: Implement me!!!
        if(!fileOrDir.exists())
            throw new IOException();

        if(fileOrDir.isDirectory()){
            for(File file: fileOrDir.listFiles()) {
                try {
                    populateOccurrenceMap(file);
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }
        } else {
            BufferedReader reader = new BufferedReader(new FileReader(fileOrDir));
            int ch, currColumn = 1, currRow = 1, wordColumn = 1;
            String word = "";

            do {
                ch = reader.read();
                if(!Syntax.isInWord((char) ch)){
                    if (word.length() > 0){
                        FilePosition pos = new FilePosition(currRow, wordColumn);
                        occ.put(word, fileOrDir.getPath(), pos);
                        word = "";
                    }

                    if (Syntax.isNewLine((char) ch)) {
                        currRow += 1;
                        currColumn = 1;
                    }
                    else {
                        currColumn += 1;
                    }
                    wordColumn = currColumn;
                } else {
                    word = word + (char) ch;
                    currColumn += 1;
                }
            } while (ch != -1);
        }

    }
}


