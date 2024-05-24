(ns dots.typescript.server.protocol.signature-help-parameter
  "Signature help information for a single parameter"
  (:refer-clojure :exclude [name]))

(defn name
  "The parameter's name"
  ^js [signature-help-parameter]
  (.-name ^js signature-help-parameter))

(defn set-name!
  "The parameter's name"
  ^js [signature-help-parameter value]
  (set! (.-name ^js signature-help-parameter) value))

(defn documentation
  "Documentation of the parameter."
  ^js [signature-help-parameter]
  (.-documentation ^js signature-help-parameter))

(defn set-documentation!
  "Documentation of the parameter."
  ^js [signature-help-parameter value]
  (set! (.-documentation ^js signature-help-parameter) value))

(defn display-parts
  "Display parts of the parameter."
  ^js [signature-help-parameter]
  (.-displayParts ^js signature-help-parameter))

(defn set-display-parts!
  "Display parts of the parameter."
  ^js [signature-help-parameter value]
  (set! (.-displayParts ^js signature-help-parameter) value))

(defn optional?
  "Whether the parameter is optional or not."
  ^js [signature-help-parameter]
  (.-isOptional ^js signature-help-parameter))

(defn set-is-optional!
  "Whether the parameter is optional or not."
  ^js [signature-help-parameter value]
  (set! (.-isOptional ^js signature-help-parameter) value))
