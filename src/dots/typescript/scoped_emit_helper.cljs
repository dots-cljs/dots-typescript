(ns dots.typescript.scoped-emit-helper
  (:refer-clojure :exclude [name]))

(defn scoped
  ^js [scoped-emit-helper]
  (.-scoped ^js scoped-emit-helper))

(defn name
  ^js [scoped-emit-helper]
  (.-name ^js scoped-emit-helper))

(defn text
  ^js [scoped-emit-helper]
  (.-text ^js scoped-emit-helper))

(defn priority
  ^js [scoped-emit-helper]
  (.-priority ^js scoped-emit-helper))

(defn dependencies
  ^js [scoped-emit-helper]
  (.-dependencies ^js scoped-emit-helper))
