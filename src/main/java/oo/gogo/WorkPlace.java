package oo.gogo;

import simple_script_constants.SimpleScriptConstants;

import java.io.File;

public class WorkPlace {

    //--- static section ---
    static {
        WorkPlace workPlaceDir = new WorkPlace(SimpleScriptConstants.WORK_PLACE_PATH);
        workDir = workPlaceDir;
        outDir = new WorkPlace(workPlaceDir.file("out/from_simple_script").getAbsolutePath());
        tmpDir = new WorkPlace(workPlaceDir.file("tmp").getAbsolutePath());
    }

    public static final WorkPlace workDir;
    public static final WorkPlace outDir;
    public static final WorkPlace tmpDir;
    //=== static section ===

    public final String absolutePath;

    private WorkPlace(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public File file(String fileName) {
        return new File(absolutePath, fileName);
    }

}
