(ns dots.typescript.server.protocol.references-response-body
  "The body of a \"references\" response message.")

(defn refs
  "The file locations referencing the symbol."
  ^js [references-response-body]
  (.-refs ^js references-response-body))

(defn set-refs!
  "The file locations referencing the symbol."
  ^js [references-response-body value]
  (set! (.-refs ^js references-response-body) value))

(defn symbol-name
  "The name of the symbol."
  ^js [references-response-body]
  (.-symbolName ^js references-response-body))

(defn set-symbol-name!
  "The name of the symbol."
  ^js [references-response-body value]
  (set! (.-symbolName ^js references-response-body) value))

(defn symbol-start-offset
  "The start character offset of the symbol (on the line provided by the references request)."
  ^js [references-response-body]
  (.-symbolStartOffset ^js references-response-body))

(defn set-symbol-start-offset!
  "The start character offset of the symbol (on the line provided by the references request)."
  ^js [references-response-body value]
  (set! (.-symbolStartOffset ^js references-response-body) value))

(defn symbol-display-string
  "The full display name of the symbol."
  ^js [references-response-body]
  (.-symbolDisplayString ^js references-response-body))

(defn set-symbol-display-string!
  "The full display name of the symbol."
  ^js [references-response-body value]
  (set! (.-symbolDisplayString ^js references-response-body) value))
