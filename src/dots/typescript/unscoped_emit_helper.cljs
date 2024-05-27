(ns dots.typescript.unscoped-emit-helper
  (:refer-clojure :exclude [name]))

(defn scoped
  "**Returns:** `false`"
  ^js [unscoped-emit-helper]
  (.-scoped ^js unscoped-emit-helper))

(defn text
  "**Returns:** `string`"
  ^js [unscoped-emit-helper]
  (.-text ^js unscoped-emit-helper))

(defn name
  "**Returns:** `string`"
  ^js [unscoped-emit-helper]
  (.-name ^js unscoped-emit-helper))

(defn priority
  "**Returns:** `number | undefined`"
  ^js [unscoped-emit-helper]
  (.-priority ^js unscoped-emit-helper))

(defn dependencies
  "**Returns:** `EmitHelper[] | undefined`"
  ^js [unscoped-emit-helper]
  (.-dependencies ^js unscoped-emit-helper))
