(ns dots.typescript.emit-helper-base
  (:refer-clojure :exclude [name]))

(defn name
  "**Returns:** `string`"
  ^js [emit-helper-base]
  (.-name ^js emit-helper-base))

(defn scoped?
  "**Returns:** `boolean`"
  ^js [emit-helper-base]
  (.-scoped ^js emit-helper-base))

(defn text
  "**Returns:** `string | ((node: EmitHelperUniqueNameCallback) => string)`"
  ^js [emit-helper-base]
  (.-text ^js emit-helper-base))

(defn priority
  "**Returns:** `number | undefined`"
  ^js [emit-helper-base]
  (.-priority ^js emit-helper-base))

(defn dependencies
  "**Returns:** `EmitHelper[] | undefined`"
  ^js [emit-helper-base]
  (.-dependencies ^js emit-helper-base))
