# hello-world

A Clojure library designed to ... well, that part is up to you.

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
2014-01-20 18:13:11.968:INFO:oejs.Server:jetty-7.6.8.v20121106
2014-01-20 18:13:12.005:INFO:oejs.AbstractConnector:Started SelectChannelConnector@0.0.0.0:33333
#'hello-world.core/server
```

## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
