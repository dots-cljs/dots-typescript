(ns dots.typescript.asserts-identifier-type-predicate
  (:refer-clojure :exclude [type]))

(defn kind
  "**Returns:** `TypePredicateKind.AssertsIdentifier`"
  ^js [asserts-identifier-type-predicate]
  (.-kind ^js asserts-identifier-type-predicate))

(defn set-kind!
  ^js [asserts-identifier-type-predicate value]
  (set! (.-kind ^js asserts-identifier-type-predicate) value))

(defn parameter-name
  "**Returns:** `string`"
  ^js [asserts-identifier-type-predicate]
  (.-parameterName ^js asserts-identifier-type-predicate))

(defn set-parameter-name!
  ^js [asserts-identifier-type-predicate value]
  (set! (.-parameterName ^js asserts-identifier-type-predicate) value))

(defn parameter-index
  "**Returns:** `number`"
  ^js [asserts-identifier-type-predicate]
  (.-parameterIndex ^js asserts-identifier-type-predicate))

(defn set-parameter-index!
  ^js [asserts-identifier-type-predicate value]
  (set! (.-parameterIndex ^js asserts-identifier-type-predicate) value))

(defn type
  "**Returns:** `Type | undefined`"
  ^js [asserts-identifier-type-predicate]
  (.-type ^js asserts-identifier-type-predicate))

(defn set-type!
  ^js [asserts-identifier-type-predicate value]
  (set! (.-type ^js asserts-identifier-type-predicate) value))
