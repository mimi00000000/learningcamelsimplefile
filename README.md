# Simple apache camel standalone example using java

Simple camel route in camel everything is a Route, A Route has a starting point and an ending point.

Route example:

        from("file:data/input?noop=true")
        .to("file:data/output");

The URI:
    file:data/input?noop=true
    
Parts of the URI:

        part 1: file -> component
        part 2: data/input -> context path
        part 3: ? -> options  Example noop=true 


<dependency>
    <groupId>org.apache.camel</groupId>
    <artifactId>camel-core</artifactId>
    <version>2.20.1</version>
</dependency>
