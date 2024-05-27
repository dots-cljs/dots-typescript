(ns dots.typescript.document-highlights)

(defn file-name
  "**Returns:** `string`"
  ^js [document-highlights]
  (.-fileName ^js document-highlights))

(defn set-file-name!
  ^js [document-highlights value]
  (set! (.-fileName ^js document-highlights) value))

(defn highlight-spans
  "**Returns:** `HighlightSpan[]`"
  ^js [document-highlights]
  (.-highlightSpans ^js document-highlights))

(defn set-highlight-spans!
  ^js [document-highlights value]
  (set! (.-highlightSpans ^js document-highlights) value))
