Simple apache camel standalone example using java

//// standalone
A standalone application is one that can be executed independently and would
execute and produce some output either as a UI or on the JVM console.
Any java class with a main method can be considered a mini standalone java application.

There are three types Java based applications.

1. Stand alone application

2. Web Application

3. Enterpise Application

// Simple camel route in camel everything is a Route has a starting point and an ending point.

Route example
from("file:data/input?noop=true")
.to("file:data/output");

URI:
file:data/input?noop=true
parts of the URI:
part 1:
file -> component
part -> 2
data/input -> comtext path
part -> 3:
? -> options
noop=true -> options

<dependency>
    <groupId>org.apache.camel</groupId>
    <artifactId>camel-core</artifactId>
    <version>2.20.1</version>
</dependency>
