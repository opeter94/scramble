javac src/scramble/Scramble.java -d ./bin/
javac -cp .;junit-4.12.jar;hamcrest-core-1.3.jar;bin/ src/scramble/ScrambleTest.java -d ./bin/
java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar;bin/ org.junit.runner.JUnitCore scramble.ScrambleTest