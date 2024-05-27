(ns dots.typescript.classification-result)

(defn final-lex-state
  "**Returns:** `EndOfLineState`"
  ^js [classification-result]
  (.-finalLexState ^js classification-result))

(defn set-final-lex-state!
  ^js [classification-result value]
  (set! (.-finalLexState ^js classification-result) value))

(defn entries
  "**Returns:** `ClassificationInfo[]`"
  ^js [classification-result]
  (.-entries ^js classification-result))

(defn set-entries!
  ^js [classification-result value]
  (set! (.-entries ^js classification-result) value))
