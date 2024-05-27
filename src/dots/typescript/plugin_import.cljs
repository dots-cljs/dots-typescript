(ns dots.typescript.plugin-import
  (:refer-clojure :exclude [name]))

(defn name
  "**Returns:** `string`"
  ^js [plugin-import]
  (.-name ^js plugin-import))

(defn set-name!
  ^js [plugin-import value]
  (set! (.-name ^js plugin-import) value))
