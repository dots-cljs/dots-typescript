(ns dots.typescript.unscoped-emit-helper
  (:refer-clojure :exclude [name]))

(defn scoped
  ^js [unscoped-emit-helper]
  (.-scoped ^js unscoped-emit-helper))

(defn text
  ^js [unscoped-emit-helper]
  (.-text ^js unscoped-emit-helper))

(defn name
  ^js [unscoped-emit-helper]
  (.-name ^js unscoped-emit-helper))

(defn priority
  ^js [unscoped-emit-helper]
  (.-priority ^js unscoped-emit-helper))

(defn dependencies
  ^js [unscoped-emit-helper]
  (.-dependencies ^js unscoped-emit-helper))
