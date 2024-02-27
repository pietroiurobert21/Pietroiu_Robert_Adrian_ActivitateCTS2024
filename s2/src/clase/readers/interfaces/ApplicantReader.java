package clase.readers.interfaces;

import clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface ApplicantReader {
    List<Aplicant> read(String fileName) throws FileNotFoundException;
}
