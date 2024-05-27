(ns dots.typescript.server.protocol.indentation-result
  "Indentation result representing where indentation should be placed")

(defn position
  "The base position in the document that the indent should be relative to
   
   **Returns:** `number`"
  ^js [indentation-result]
  (.-position ^js indentation-result))

(defn set-position!
  "The base position in the document that the indent should be relative to"
  ^js [indentation-result value]
  (set! (.-position ^js indentation-result) value))

(defn indentation
  "The number of columns the indent should be at relative to the position's column.
   
   **Returns:** `number`"
  ^js [indentation-result]
  (.-indentation ^js indentation-result))

(defn set-indentation!
  "The number of columns the indent should be at relative to the position's column."
  ^js [indentation-result value]
  (set! (.-indentation ^js indentation-result) value))
