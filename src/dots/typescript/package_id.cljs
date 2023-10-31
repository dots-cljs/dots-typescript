(ns dots.typescript.package-id
  "Unique identifier with a package name and version.
   If changing this, remember to change `packageIdIsEqual`."
  (:refer-clojure :exclude [name]))

(defn name
  "Name of the package.
   Should not include `@types`.
   If accessing a non-index file, this should include its name e.g. \"foo/bar\"."
  ^js [package-id]
  (.-name ^js package-id))

(defn set-name!
  "Name of the package.
   Should not include `@types`.
   If accessing a non-index file, this should include its name e.g. \"foo/bar\"."
  ^js [package-id value]
  (set! (.-name ^js package-id) value))

(defn sub-module-name
  "Name of a submodule within this package.
   May be \"\"."
  ^js [package-id]
  (.-subModuleName ^js package-id))

(defn set-sub-module-name!
  "Name of a submodule within this package.
   May be \"\"."
  ^js [package-id value]
  (set! (.-subModuleName ^js package-id) value))

(defn version
  "Version of the package, e.g. \"1.2.3\""
  ^js [package-id]
  (.-version ^js package-id))

(defn set-version!
  "Version of the package, e.g. \"1.2.3\""
  ^js [package-id value]
  (set! (.-version ^js package-id) value))
