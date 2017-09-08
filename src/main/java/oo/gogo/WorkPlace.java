package oo.gogo;

import java.io.File;

public class WorkPlace {

    //--- static section ---
    public static void initialize(String workPlacePath) {
        WorkPlace workPlaceDir = new WorkPlace(workPlacePath);
        workDir = workPlaceDir;
        outDir = new WorkPlace(workPlaceDir.file("out/from_simple_script").getAbsolutePath());
        tmpDir = new WorkPlace(workPlaceDir.file("tmp").getAbsolutePath());
    }

    public static WorkPlace workDir;
    public static WorkPlace outDir;
    public static WorkPlace tmpDir;
    //=== static section ===

    public final String absolutePath;

    private WorkPlace(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public File file(String fileName) {
        return new File(absolutePath, fileName);
    }

}
