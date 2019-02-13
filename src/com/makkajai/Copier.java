
package com.makkajai;

import static com.makkajai.Constants.FILE_NAME_WITH_H_OR_M;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.RegexFileFilter;

public class Copier {
    
    
    public static void main (String args[]){

        String inputDirectory = args[0];
        String outputDirectory = args[1];

        final List<File> files = new ArrayList<File>(FileUtils.listFiles(
            new File(inputDirectory),
            new RegexFileFilter(FILE_NAME_WITH_H_OR_M),
            null
        ));
    }
}
