# This is a simple Spark-Scala project scaffold setup using maven archetype.


* After you have cloned the project, run the following command in the projects root.

        mvn clean install

# usage from cli :

* interactive Mode (select spark-scala-simple and response to questions) :

        mvn archetype:generate -DarchetypeCatalog=local

* Maven will list the archetype on the terminal post the command execution.

* Type the number next to the archetype name and follow the onscreen instructions

# non interactive / batch mode:

        mvn archetype:generate -B \
          -DarchetypeGroupId=com.devboost \
          -DarchetypeArtifactId=spark-scala-simple \
          -DarchetypeVersion=0.1-SNAPSHOT \
          -DgroupId=com.company \
          -DartifactId=awesome-artifact-name \
          -Dversion=0.1-SNAPSHOT \
          -Dpackage=com.company

* example compile/run (run 'mvn scala:help' for full command list) :

        mvn scala:compile

        mvn scala:run -DmainClass=com.company.App

* Make note that the project assumes your main to lie in the App.scala file, inside your package. Once your development is complete, rename the file from App.scala to anything of your choice and make appropriate change in the POM.xml, specifically in the section of maven-shade plugin. Once you change the name of the class containing your main method in the Maven-shade plugin section,  run the following command to create an Uber/Executable JAR. If you add Test cases, the command would also generate code coverage files.

        mvn clean install
