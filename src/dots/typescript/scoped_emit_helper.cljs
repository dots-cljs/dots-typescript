(ns dots.typescript.scoped-emit-helper
  (:refer-clojure :exclude [name]))

(defn scoped
  "**Returns:** `true`"
  ^js [scoped-emit-helper]
  (.-scoped ^js scoped-emit-helper))

(defn name
  "**Returns:** `string`"
  ^js [scoped-emit-helper]
  (.-name ^js scoped-emit-helper))

(defn text
  "**Returns:** `string | ((node: EmitHelperUniqueNameCallback) => string)`"
  ^js [scoped-emit-helper]
  (.-text ^js scoped-emit-helper))

(defn priority
  "**Returns:** `number | undefined`"
  ^js [scoped-emit-helper]
  (.-priority ^js scoped-emit-helper))

(defn dependencies
  "**Returns:** `EmitHelper[] | undefined`"
  ^js [scoped-emit-helper]
  (.-dependencies ^js scoped-emit-helper))
