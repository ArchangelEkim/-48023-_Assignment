@echo off
cd ..
echo Building...
javac -d bin -sourcepath res;src src\com\michael\assignment\Main.java
echo Build Finished!
cd commands
@echo on