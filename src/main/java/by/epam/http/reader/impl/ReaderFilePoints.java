package by.epam.http.reader.impl;

import by.epam.http.reader.Readable;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReaderFilePoints implements Readable {

    @Override
    public List<String> readFile(String pathFile) {
        List<String> linesFromFiles = new ArrayList<>();
        Path path = Paths.get(pathFile);

        try {
            linesFromFiles = Files.lines(path, StandardCharsets.UTF_8).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return linesFromFiles;
    }
}
