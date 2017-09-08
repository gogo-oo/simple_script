package oo.gogo

println("args=" + Arrays.toString(args))
println("Hello from entry point of \"Simple Script\", from file: src/main/groovy/oo/gogo/MainGr.groovy")

println("workDir=" + WorkPlace.workDir.absolutePath)
println("outDir =" + WorkPlace.outDir.absolutePath)
println("tmpDir =" + WorkPlace.tmpDir.absolutePath)

println("workDir some file=" + WorkPlace.workDir.file("a.txt"))
println("outDir  some file=" + WorkPlace.outDir.file("b.txt"))
println("tmpDir  some file=" + WorkPlace.tmpDir.file("c.txt"))