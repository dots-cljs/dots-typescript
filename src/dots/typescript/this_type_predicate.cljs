(ns dots.typescript.this-type-predicate
  (:refer-clojure :exclude [type]))

(defn kind
  "**Returns:** `TypePredicateKind.This`"
  ^js [this-type-predicate]
  (.-kind ^js this-type-predicate))

(defn set-kind!
  ^js [this-type-predicate value]
  (set! (.-kind ^js this-type-predicate) value))

(defn parameter-name
  "**Returns:** `undefined`"
  ^js [this-type-predicate]
  (.-parameterName ^js this-type-predicate))

(defn set-parameter-name!
  ^js [this-type-predicate value]
  (set! (.-parameterName ^js this-type-predicate) value))

(defn parameter-index
  "**Returns:** `undefined`"
  ^js [this-type-predicate]
  (.-parameterIndex ^js this-type-predicate))

(defn set-parameter-index!
  ^js [this-type-predicate value]
  (set! (.-parameterIndex ^js this-type-predicate) value))

(defn type
  "**Returns:** `Type`"
  ^js [this-type-predicate]
  (.-type ^js this-type-predicate))

(defn set-type!
  ^js [this-type-predicate value]
  (set! (.-type ^js this-type-predicate) value))
