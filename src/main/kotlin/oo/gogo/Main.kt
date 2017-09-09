package oo.gogo

fun main(args: Array<String>) {
    println("args=" + java.util.Arrays.toString(args))
    println("Hello from entry point of \"Simple Script\", from file: src/main/kotlin/oo/gogo/Main.kt")

    println("workDir=" + WorkPlace.workDir.absolutePath)
    println("outDir =" + WorkPlace.outDir.absolutePath)
    println("tmpDir =" + WorkPlace.tmpDir.absolutePath)

    println("workDir some file=" + WorkPlace.workDir.file("a.txt"))
    println("outDir  some file=" + WorkPlace.outDir.file("b.txt"))
    println("tmpDir  some file=" + WorkPlace.tmpDir.file("c.txt"))

}