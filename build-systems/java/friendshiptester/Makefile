compile:
	javac -d ./build *.java
jar:
	cd ./build && jar cvf programma.jar *
run:
	cd ./build && java -cp "programma.jar" App
clean: 
	-rm -R ./build/*