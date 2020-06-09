Simple apache camel standalone example using java


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
data/input -> context path
part -> 3:
? -> options
noop=true -> options

<dependency>
    <groupId>org.apache.camel</groupId>
    <artifactId>camel-core</artifactId>
    <version>2.20.1</version>
</dependency>
