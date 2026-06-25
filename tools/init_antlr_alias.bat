@echo off
set "ANTLR_JAR=C:\Users\ElectoMall\OneDrive\Desktop\projects\MiniProjects\compilers\Arabic_Compiler\tools\antlr-4.13.2-complete.jar"
doskey antlr4=java -jar "%ANTLR_JAR%" $*
doskey grun=java -cp ".;%ANTLR_JAR%" org.antlr.v4.gui.TestRig $*

