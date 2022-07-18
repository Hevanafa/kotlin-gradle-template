# Example Kotlin project with Gradle build system
18-07-2022

It is recommended to do this with IntelliJ IDEA as the build configurations are done automatically.

normal build task (if you have Kotlin classpath fixer):
```
gradlew build
```

to build a Fat Jar / Shaded Jar:
```
gradlew shadowJar
```

to run (make sure to build the Jar first):
```
java -jar build\libs\[press TAB]
```
