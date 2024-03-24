# Setup of basic gradle using CLI
````agsl
gradle init --use-defaults --type java-application
````

The above command will setup a basic gradle project

````agsl
./gradlew build
````

The above command can build your project

````agsl
./gradlew jar
````

The above command creates a jar file in build/libs folder

````agsl
jar{
    manifest{
        attributes(
                'Main-class': 'org.example.Main'
        )
    }
}
````

To prepare a jar which is executable you need to setup manifest property in `build.gradle`

````agsl
java -jar build/libs/filename.jar
````

The above command will execute your code