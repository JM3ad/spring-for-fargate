cmd /V /C "set JAVA_HOME=C:\Program^ Files\Java\jdk-11&& mvnw package"
mkdir target & cd target && mkdir dependency & cd dependency && "C:\Program Files\Java\jdk-11\bin\jar.exe" -xf ../*.jar
cd ../..