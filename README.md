# jar
How to create jar file as library

1.Create and compile your file in package(package must be)
  javac *.java
  
2.Create MANIFEST.MF and write ther.
  Main-Class: CCC.Main
  
3.Create a jar file and add Manifest and class file to this file.
  jar cfm CCC.jar CCC/MANIFEST.MF CCC/*.class

4.Copy jar file to your project.
5.Compile linking jar file
javac -cp .:CCC.jar Main.java Calculator.java 
6.run
java -cp .:CCC,jar Main 
