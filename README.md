# dots-typescript

[![cljdoc](https://cljdoc.org/badge/io.github.dots-cljs/dots-typescript)][cljdoc]
[![Clojars](https://img.shields.io/clojars/v/io.github.dots-cljs/dots-typescript.svg)][clojars]

ClojureScript wrapper for the TypeScript API.  Built with [dots].

[dots]: https://github.com/ferdinand-beyer/dots
[clojars]: https://clojars.org/io.github.dots-cljs/dots-typescript
[cljdoc]: https://cljdoc.org/jump/release/io.github.dots-cljs/dots-typescript

## Installation

Distributed via [Clojars][clojars].

Add this to your `deps.edn`:

```clojure
io.github.dots-cljs/dots-typescript {:mvn/version "5.4.5-10"}
```

Or this to your `shadow-cljs.edn`:

```clojure
[io.github.dots-cljs/dots-typescript "5.4.5-10"]
```

We use the versioning scheme `UPSTREAM-COMMITS`:
- `UPSTREAM` is the version of the JavaScript API we wrap (see [`package.json`](package.json)).
- `COMMITS` is the number of commits in this repository at the time of release.

## API

See [cljdoc].

## License

Distributed under the [MIT License].  
Copyright &copy; 2022 [Ferdinand Beyer]

[Ferdinand Beyer]: https://fbeyer.com
[MIT License]: https://opensource.org/licenses/MIT
