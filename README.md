This is a minimal implementation of a Java delegate for the Cantaloupe image
server (version 5.0).

The idea is to use Gradle to build a JAR file that declares an implementation
of Cantaloupe's `e.i.l.c.delegate.JavaDelegate`
[service](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ServiceLoader.html).
So you must have Gradle installed, but that is the only dependency. Of course,
you could also use Maven, or some other tool, or no tool--this is just an
example.

1. Edit `build.gradle` and change the paths in the `dependencies` section as
   commented.
2. `./gradlew build`

Your JAR file is now ready and waiting in the `build/libs` directory. Copy it
somewhere and add it to the classpath of your Cantaloupe invocation:

```sh
java -cp cantaloupe-5.0.jar:/path/to/MyJavaDelegate.jar \
    -Dcantaloupe.config=/path/to/cantaloupe.properties \
    edu.illinois.library.cantaloupe.StandaloneEntry
```

There is no need for any configuration. Cantaloupe will check for it
automatically and only fall back to the Ruby delegate script if necessary.

When developing a Java delegate, keep in mind that almost all of Cantaloupe's
Java API (everything outside of the `e.i.l.c.delegate` package, and even most
of the classes within it) is considered private.
