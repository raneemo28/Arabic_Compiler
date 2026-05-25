@echo off
set "ANTLR_JAR=E:\compiler's project\Arabic_Compiler\Arabic_Compiler\tools\antlr-4.13.2-complete.jar"
doskey antlr4=java -jar "%ANTLR_JAR%" $*
doskey grun=java -cp ".;%ANTLR_JAR%" org.antlr.v4.gui.TestRig $*
doskey javac=javac -cp ".;%ANTLR_JAR%" $*
