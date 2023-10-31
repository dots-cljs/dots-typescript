(ns dots.typescript.resolved-type-reference-directive)

(defn primary?
  ^js [resolved-type-reference-directive]
  (.-primary ^js resolved-type-reference-directive))

(defn set-primary!
  ^js [resolved-type-reference-directive value]
  (set! (.-primary ^js resolved-type-reference-directive) value))

(defn resolved-file-name
  ^js [resolved-type-reference-directive]
  (.-resolvedFileName ^js resolved-type-reference-directive))

(defn set-resolved-file-name!
  ^js [resolved-type-reference-directive value]
  (set! (.-resolvedFileName ^js resolved-type-reference-directive) value))

(defn package-id
  ^js [resolved-type-reference-directive]
  (.-packageId ^js resolved-type-reference-directive))

(defn set-package-id!
  ^js [resolved-type-reference-directive value]
  (set! (.-packageId ^js resolved-type-reference-directive) value))

(defn external-library-import?
  "True if `resolvedFileName` comes from `node_modules`."
  ^js [resolved-type-reference-directive]
  (.-isExternalLibraryImport ^js resolved-type-reference-directive))

(defn set-is-external-library-import!
  "True if `resolvedFileName` comes from `node_modules`."
  ^js [resolved-type-reference-directive value]
  (set! (.-isExternalLibraryImport ^js resolved-type-reference-directive) value))
