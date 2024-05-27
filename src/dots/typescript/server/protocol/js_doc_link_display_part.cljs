(ns dots.typescript.server.protocol.js-doc-link-display-part
  "A part of a symbol description that links from a jsdoc")

(defn target
  "The location of the declaration that the
   
   **Returns:** `FileSpan`"
  ^js [js-doc-link-display-part]
  (.-target ^js js-doc-link-display-part))

(defn set-target!
  "The location of the declaration that the"
  ^js [js-doc-link-display-part value]
  (set! (.-target ^js js-doc-link-display-part) value))

(defn text
  "Text of an item describing the symbol.
   
   **Returns:** `string`"
  ^js [js-doc-link-display-part]
  (.-text ^js js-doc-link-display-part))

(defn set-text!
  "Text of an item describing the symbol."
  ^js [js-doc-link-display-part value]
  (set! (.-text ^js js-doc-link-display-part) value))

(defn kind
  "The symbol's kind (such as 'className' or 'parameterName' or plain 'text').
   
   **Returns:** `string`"
  ^js [js-doc-link-display-part]
  (.-kind ^js js-doc-link-display-part))

(defn set-kind!
  "The symbol's kind (such as 'className' or 'parameterName' or plain 'text')."
  ^js [js-doc-link-display-part value]
  (set! (.-kind ^js js-doc-link-display-part) value))
