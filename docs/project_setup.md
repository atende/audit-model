To use the model in your project, you can setup gradle, maven, sbt or other build systems with a dependency on the library

If you use some framework dependency like **audit-appclient-spring** it already depends on this project.

Gradle

    compile("info.atende.audition:audit-model:$auditModelVersion")
    
Maven

    <dependency>
      <groupId>info.atende.audition</groupId>
      <artifactId>audit-model</artifactId>
      <version>${auditModelVersion}</version>
    </dependency>
    
SBT

    libraryDependencies += "info.atende.audition" % "audit-model" % "$auditModelVersion"
