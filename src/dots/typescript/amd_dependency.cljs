(ns dots.typescript.amd-dependency
  (:refer-clojure :exclude [name]))

(defn path
  "**Returns:** `string`"
  ^js [amd-dependency]
  (.-path ^js amd-dependency))

(defn set-path!
  ^js [amd-dependency value]
  (set! (.-path ^js amd-dependency) value))

(defn name
  "**Returns:** `string | undefined`"
  ^js [amd-dependency]
  (.-name ^js amd-dependency))

(defn set-name!
  ^js [amd-dependency value]
  (set! (.-name ^js amd-dependency) value))
