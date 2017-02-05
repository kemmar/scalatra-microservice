## Simple in Scalatra building with Gradle

Of note is that we're using the `gretty` plugin to run our webapp, since the
default `jetty` plugin uses a too old version of the servlet API.

In addition the most basic of dependencies are included, but if you wanted
support for more features (say templating), then you'd have to import these in
the `dependencies` section as normal.

### Running the webapp

1. Clone the project
2. `gradle appRun`
3. Go to `http://localhost:8080`

### build

built with seed
https://github.com/hermansc/scalatra-gradle-helloworld.git

