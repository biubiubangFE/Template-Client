package com.mhdss.dc.storage;

import java.io.File;

public class DefaultFilePathPolicy extends FilePathPolicy {

    @Override
    public String generateFilePath(FileType type, File file) throws Exception {
        return generateFilePath(type);
    }
}
