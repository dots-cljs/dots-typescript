(ns dots.typescript.referenced-symbol)

(defn definition
  "**Returns:** `ReferencedSymbolDefinitionInfo`"
  ^js [referenced-symbol]
  (.-definition ^js referenced-symbol))

(defn set-definition!
  ^js [referenced-symbol value]
  (set! (.-definition ^js referenced-symbol) value))

(defn references
  "**Returns:** `ReferencedSymbolEntry[]`"
  ^js [referenced-symbol]
  (.-references ^js referenced-symbol))

(defn set-references!
  ^js [referenced-symbol value]
  (set! (.-references ^js referenced-symbol) value))
