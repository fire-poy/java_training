#Makefile that compiles every file in the current directory with javac and then launches the program with java

#Variables
JAVAC = javac
JAVA = java
JFLAGS = -g
SOURCES = $(wildcard *.java)
CLASSES = $(SOURCES:.java=.class)
MAIN = Main

#Targets
all: $(CLASSES)

%.class: %.java
	$(JAVAC) $(JFLAGS) $<

run: $(CLASSES)
	$(JAVA) $(MAIN)

clean:
	rm -f *.class
	
.PHONY: all run clean
