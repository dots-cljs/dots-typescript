(ns dots.typescript.server.discover-typings)

(defn file-names
  ^js [discover-typings]
  (.-fileNames ^js discover-typings))

(defn project-root-path
  ^js [discover-typings]
  (.-projectRootPath ^js discover-typings))

(defn compiler-options
  ^js [discover-typings]
  (.-compilerOptions ^js discover-typings))

(defn watch-options
  ^js [discover-typings]
  (.-watchOptions ^js discover-typings))

(defn type-acquisition
  ^js [discover-typings]
  (.-typeAcquisition ^js discover-typings))

(defn unresolved-imports
  ^js [discover-typings]
  (.-unresolvedImports ^js discover-typings))

(defn cache-path
  ^js [discover-typings]
  (.-cachePath ^js discover-typings))

(defn kind
  ^js [discover-typings]
  (.-kind ^js discover-typings))

(defn project-name
  ^js [discover-typings]
  (.-projectName ^js discover-typings))
