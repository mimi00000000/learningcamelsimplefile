package com.learningcamel.file;

import org.apache.camel.builder.RouteBuilder;

public class CopyFilesRoute extends RouteBuilder {

    public void configure() throws  Exception {
        from("file:data/input?noop=true")
                // logging is enabled by adding one more destination with the log component
                .to("log:?level=INFO&showBody=true&showHeaders=true")
                .to("file:data/output");
    }
}
