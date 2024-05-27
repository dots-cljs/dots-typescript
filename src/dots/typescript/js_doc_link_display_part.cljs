(ns dots.typescript.js-doc-link-display-part)

(defn target
  "**Returns:** `DocumentSpan`"
  ^js [js-doc-link-display-part]
  (.-target ^js js-doc-link-display-part))

(defn set-target!
  ^js [js-doc-link-display-part value]
  (set! (.-target ^js js-doc-link-display-part) value))

(defn text
  "**Returns:** `string`"
  ^js [js-doc-link-display-part]
  (.-text ^js js-doc-link-display-part))

(defn set-text!
  ^js [js-doc-link-display-part value]
  (set! (.-text ^js js-doc-link-display-part) value))

(defn kind
  "**Returns:** `string`"
  ^js [js-doc-link-display-part]
  (.-kind ^js js-doc-link-display-part))

(defn set-kind!
  ^js [js-doc-link-display-part value]
  (set! (.-kind ^js js-doc-link-display-part) value))
