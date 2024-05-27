(ns dots.typescript.deferred-type-reference
  (:refer-clojure :exclude [symbol]))

(defn target
  "**Returns:** `GenericType`"
  ^js [deferred-type-reference]
  (.-target ^js deferred-type-reference))

(defn set-target!
  ^js [deferred-type-reference value]
  (set! (.-target ^js deferred-type-reference) value))

(defn node
  "**Returns:** `TypeReferenceNode | ArrayTypeNode | TupleTypeNode | undefined`"
  ^js [deferred-type-reference]
  (.-node ^js deferred-type-reference))

(defn set-node!
  ^js [deferred-type-reference value]
  (set! (.-node ^js deferred-type-reference) value))

(defn type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [deferred-type-reference]
  (.-typeArguments ^js deferred-type-reference))

(defn set-type-arguments!
  ^js [deferred-type-reference value]
  (set! (.-typeArguments ^js deferred-type-reference) value))

(defn object-flags
  "**Returns:** `ObjectFlags`"
  ^js [deferred-type-reference]
  (.-objectFlags ^js deferred-type-reference))

(defn set-object-flags!
  ^js [deferred-type-reference value]
  (set! (.-objectFlags ^js deferred-type-reference) value))

(defn flags
  "**Returns:** `TypeFlags`"
  ^js [deferred-type-reference]
  (.-flags ^js deferred-type-reference))

(defn set-flags!
  ^js [deferred-type-reference value]
  (set! (.-flags ^js deferred-type-reference) value))

(defn symbol
  "**Returns:** `Symbol`"
  ^js [deferred-type-reference]
  (.-symbol ^js deferred-type-reference))

(defn set-symbol!
  ^js [deferred-type-reference value]
  (set! (.-symbol ^js deferred-type-reference) value))

(defn pattern
  "**Returns:** `DestructuringPattern | undefined`"
  ^js [deferred-type-reference]
  (.-pattern ^js deferred-type-reference))

(defn set-pattern!
  ^js [deferred-type-reference value]
  (set! (.-pattern ^js deferred-type-reference) value))

(defn alias-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [deferred-type-reference]
  (.-aliasSymbol ^js deferred-type-reference))

(defn set-alias-symbol!
  ^js [deferred-type-reference value]
  (set! (.-aliasSymbol ^js deferred-type-reference) value))

(defn alias-type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [deferred-type-reference]
  (.-aliasTypeArguments ^js deferred-type-reference))

(defn set-alias-type-arguments!
  ^js [deferred-type-reference value]
  (set! (.-aliasTypeArguments ^js deferred-type-reference) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [deferred-type-reference]
  (.getFlags ^js deferred-type-reference))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [deferred-type-reference]
  (.getSymbol ^js deferred-type-reference))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [deferred-type-reference]
  (.getProperties ^js deferred-type-reference))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [deferred-type-reference property-name]
  (.getProperty ^js deferred-type-reference property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [deferred-type-reference]
  (.getApparentProperties ^js deferred-type-reference))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [deferred-type-reference]
  (.getCallSignatures ^js deferred-type-reference))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [deferred-type-reference]
  (.getConstructSignatures ^js deferred-type-reference))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [deferred-type-reference]
  (.getStringIndexType ^js deferred-type-reference))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [deferred-type-reference]
  (.getNumberIndexType ^js deferred-type-reference))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [deferred-type-reference]
  (.getBaseTypes ^js deferred-type-reference))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [deferred-type-reference]
  (.getNonNullableType ^js deferred-type-reference))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [deferred-type-reference]
  (.getConstraint ^js deferred-type-reference))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [deferred-type-reference]
  (.getDefault ^js deferred-type-reference))

(defn union?
  "**Returns:** `boolean`"
  ^js [deferred-type-reference]
  (.isUnion ^js deferred-type-reference))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [deferred-type-reference]
  (.isIntersection ^js deferred-type-reference))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [deferred-type-reference]
  (.isUnionOrIntersection ^js deferred-type-reference))

(defn literal?
  "**Returns:** `boolean`"
  ^js [deferred-type-reference]
  (.isLiteral ^js deferred-type-reference))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [deferred-type-reference]
  (.isStringLiteral ^js deferred-type-reference))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [deferred-type-reference]
  (.isNumberLiteral ^js deferred-type-reference))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [deferred-type-reference]
  (.isTypeParameter ^js deferred-type-reference))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [deferred-type-reference]
  (.isClassOrInterface ^js deferred-type-reference))

(defn class?
  "**Returns:** `boolean`"
  ^js [deferred-type-reference]
  (.isClass ^js deferred-type-reference))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [deferred-type-reference]
  (.isIndexType ^js deferred-type-reference))
