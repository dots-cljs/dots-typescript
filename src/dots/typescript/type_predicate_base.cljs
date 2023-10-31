(ns dots.typescript.type-predicate-base
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [type-predicate-base]
  (.-kind ^js type-predicate-base))

(defn set-kind!
  ^js [type-predicate-base value]
  (set! (.-kind ^js type-predicate-base) value))

(defn type
  ^js [type-predicate-base]
  (.-type ^js type-predicate-base))

(defn set-type!
  ^js [type-predicate-base value]
  (set! (.-type ^js type-predicate-base) value))
