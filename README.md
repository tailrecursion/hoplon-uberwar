# Hoplon Uberwar Example

An example project that uses Hoplon and Castra, with tasks to help you package
it up as an uberwar file or work locally during development.

## Usage

Build uberwar for production:

```
$ boot war
```

Build Hoplon for development (needs 2 terminals):

```
# in one shell
$ boot watch hoplon

# in the other shell
$ boot dev
```

The `dev` task will pop a REPL in the `hello-world.core` namespace. From there
you can start a local Jetty server:

```clojure
hello-world.core=> (def server (dev-server))
```

Then open [http://localhost:33333](http://localhost:33333) in your browser. Have
fun!

## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
