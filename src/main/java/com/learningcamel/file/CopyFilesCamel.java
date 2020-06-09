package com.learningcamel.file;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CopyFilesCamel {

    // psvm
    public static void main(String[] args) {

        CamelContext context = new DefaultCamelContext();

        // In camel everything is a route
        try {
            context.addRoutes(new RouteBuilder() {
                @Override
                public void configure() throws Exception {
                    // files are going to move from the input directory to the output directory
                    from("file:data/input?noop=true")
                            // logging is enabled by adding one more destination with the log component
                            .to("log:?level=INFO&showBody=true&showHeaders=true")
                            .to("file:data/output");
                }
            });

            // start the context, it dynamically starts the route
            context.start();

            Thread.sleep(5000);

            // stop the router
            context.stop();

        } catch (Exception e) {
            // sout
            System.out.println("Exception :" + e);
            e.printStackTrace();
        }
    }
}
