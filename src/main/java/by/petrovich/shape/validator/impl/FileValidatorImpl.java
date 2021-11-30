package by.petrovich.shape.validator.impl;

import by.petrovich.shape.validator.FileValidatable;

import java.io.File;

public class FileValidatorImpl implements FileValidatable {
    static final String FILE_LINE_VALID_REGEX = "^-?\\d+\\.\\d+\\s*-?\\d+\\.\\d+\\s*-?\\d+\\.\\d+\\s*$";

    public FileValidatorImpl() {
    }

    @Override
    public boolean isFileLineValid(String fileLine) {
        boolean isFileLineValid = fileLine.matches(FILE_LINE_VALID_REGEX);
        return isFileLineValid;
    }

    @Override
    public boolean isFileValid(String pathFile) {
        if (pathFile == null){
            return false;
        }
        File file = new File(pathFile);
        return file.exists() && (file.length() != 0);
    }

}
