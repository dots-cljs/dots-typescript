(ns dots.typescript.emit-helper-base
  (:refer-clojure :exclude [name]))

(defn name
  ^js [emit-helper-base]
  (.-name ^js emit-helper-base))

(defn scoped?
  ^js [emit-helper-base]
  (.-scoped ^js emit-helper-base))

(defn text
  ^js [emit-helper-base]
  (.-text ^js emit-helper-base))

(defn priority
  ^js [emit-helper-base]
  (.-priority ^js emit-helper-base))

(defn dependencies
  ^js [emit-helper-base]
  (.-dependencies ^js emit-helper-base))
