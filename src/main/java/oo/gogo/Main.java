package oo.gogo;

public class Main {

    public static void main(String[] args) {
        System.out.println("args=" + java.util.Arrays.toString(args));
        System.out.println("Hello from entry point of \"Simple Script\", from file: src/main/java/oo/gogo/Main.java");

        if (args.length > 0) {
            WorkPlace.initialize(args[0]);
        } else {
            WorkPlace.initialize(".");
        }

        System.out.println("workDir=" + WorkPlace.workDir.absolutePath);
        System.out.println("outDir =" + WorkPlace.outDir.absolutePath);
        System.out.println("tmpDir =" + WorkPlace.tmpDir.absolutePath);

        System.out.println("workDir some file=" + WorkPlace.workDir.file("a.txt"));
        System.out.println("outDir  some file=" + WorkPlace.outDir.file("b.txt"));
        System.out.println("tmpDir  some file=" + WorkPlace.tmpDir.file("c.txt"));
    }

}
