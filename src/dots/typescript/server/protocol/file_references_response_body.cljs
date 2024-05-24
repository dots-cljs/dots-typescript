(ns dots.typescript.server.protocol.file-references-response-body)

(defn refs
  "The file locations referencing the symbol."
  ^js [file-references-response-body]
  (.-refs ^js file-references-response-body))

(defn set-refs!
  "The file locations referencing the symbol."
  ^js [file-references-response-body value]
  (set! (.-refs ^js file-references-response-body) value))

(defn symbol-name
  "The name of the symbol."
  ^js [file-references-response-body]
  (.-symbolName ^js file-references-response-body))

(defn set-symbol-name!
  "The name of the symbol."
  ^js [file-references-response-body value]
  (set! (.-symbolName ^js file-references-response-body) value))
