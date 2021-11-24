package by.epam.http.validator.impl;

import by.epam.http.validator.FileValidatable;

public class FileValidatorImpl implements FileValidatable {
    private final String FILE_LINE_VALID_REGEX = "^-?\\d{1,}.\\d{1,}\\s*-?\\d{1,}.\\d{1,}\\s*-?\\d{1,}.\\d{1,}\\s*$";

    @Override
    public boolean isFileLineValid(String fileLine) {
        boolean isFileLineValid = fileLine.matches(FILE_LINE_VALID_REGEX);
        return isFileLineValid;
    }

}
