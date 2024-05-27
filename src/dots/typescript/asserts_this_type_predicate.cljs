(ns dots.typescript.asserts-this-type-predicate
  (:refer-clojure :exclude [type]))

(defn kind
  "**Returns:** `TypePredicateKind.AssertsThis`"
  ^js [asserts-this-type-predicate]
  (.-kind ^js asserts-this-type-predicate))

(defn set-kind!
  ^js [asserts-this-type-predicate value]
  (set! (.-kind ^js asserts-this-type-predicate) value))

(defn parameter-name
  "**Returns:** `undefined`"
  ^js [asserts-this-type-predicate]
  (.-parameterName ^js asserts-this-type-predicate))

(defn set-parameter-name!
  ^js [asserts-this-type-predicate value]
  (set! (.-parameterName ^js asserts-this-type-predicate) value))

(defn parameter-index
  "**Returns:** `undefined`"
  ^js [asserts-this-type-predicate]
  (.-parameterIndex ^js asserts-this-type-predicate))

(defn set-parameter-index!
  ^js [asserts-this-type-predicate value]
  (set! (.-parameterIndex ^js asserts-this-type-predicate) value))

(defn type
  "**Returns:** `Type | undefined`"
  ^js [asserts-this-type-predicate]
  (.-type ^js asserts-this-type-predicate))

(defn set-type!
  ^js [asserts-this-type-predicate value]
  (set! (.-type ^js asserts-this-type-predicate) value))
