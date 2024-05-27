(ns dots.typescript.identifier-type-predicate
  (:refer-clojure :exclude [type]))

(defn kind
  "**Returns:** `TypePredicateKind.Identifier`"
  ^js [identifier-type-predicate]
  (.-kind ^js identifier-type-predicate))

(defn set-kind!
  ^js [identifier-type-predicate value]
  (set! (.-kind ^js identifier-type-predicate) value))

(defn parameter-name
  "**Returns:** `string`"
  ^js [identifier-type-predicate]
  (.-parameterName ^js identifier-type-predicate))

(defn set-parameter-name!
  ^js [identifier-type-predicate value]
  (set! (.-parameterName ^js identifier-type-predicate) value))

(defn parameter-index
  "**Returns:** `number`"
  ^js [identifier-type-predicate]
  (.-parameterIndex ^js identifier-type-predicate))

(defn set-parameter-index!
  ^js [identifier-type-predicate value]
  (set! (.-parameterIndex ^js identifier-type-predicate) value))

(defn type
  "**Returns:** `Type`"
  ^js [identifier-type-predicate]
  (.-type ^js identifier-type-predicate))

(defn set-type!
  ^js [identifier-type-predicate value]
  (set! (.-type ^js identifier-type-predicate) value))
