import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.FileHandler;
import java.io.IOException;

public class Database {

    private String filename;
    private int rowWidth;

    public Database(String filename, int rowWidth) {
        this.filename = filename;
        this.rowWidth = rowWidth;
    }

    // add a new record to the end of the database
    public void appendRecord(String data) {
        // TODO: Pad the data to the correct record width
        // TODO: Report an error if the data is too long for the record
        FileHandler.appendLine(filename, data);
    }

    // delete the record at the specified row
    public void deleteRecord(int rowNumber) {
        // TODO: replace this placeholder code
    }

    // return the record at the specified row
    public String getRecord(int rowNumber) {
        return ""; // TODO: replace this placeholder code
    }

    // return the number of records in the database
    public int getRecordCount() {

        try {
        BufferedReader br = new BufferedReader(new FileReader("text.txt") != null));
        int count = 0;
        while (br.readLine() != null) {
            count++;
        }
            return count;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return 0; // TODO: replace this placeholder code
    }

    // search for a record matching data
    // return true if found
    public boolean findRecord(String data) {
        return false; // TODO: replace this placeholder code
    }
}
