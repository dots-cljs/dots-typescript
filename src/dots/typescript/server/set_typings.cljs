(ns dots.typescript.server.set-typings)

(defn type-acquisition
  ^js [set-typings]
  (.-typeAcquisition ^js set-typings))

(defn compiler-options
  ^js [set-typings]
  (.-compilerOptions ^js set-typings))

(defn typings
  ^js [set-typings]
  (.-typings ^js set-typings))

(defn unresolved-imports
  ^js [set-typings]
  (.-unresolvedImports ^js set-typings))

(defn kind
  ^js [set-typings]
  (.-kind ^js set-typings))

(defn project-name
  ^js [set-typings]
  (.-projectName ^js set-typings))
