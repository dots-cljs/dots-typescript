(ns dots.typescript.instantiable-type
  (:refer-clojure :exclude [symbol]))

(defn flags
  "**Returns:** `TypeFlags`"
  ^js [instantiable-type]
  (.-flags ^js instantiable-type))

(defn set-flags!
  ^js [instantiable-type value]
  (set! (.-flags ^js instantiable-type) value))

(defn symbol
  "**Returns:** `Symbol`"
  ^js [instantiable-type]
  (.-symbol ^js instantiable-type))

(defn set-symbol!
  ^js [instantiable-type value]
  (set! (.-symbol ^js instantiable-type) value))

(defn pattern
  "**Returns:** `DestructuringPattern | undefined`"
  ^js [instantiable-type]
  (.-pattern ^js instantiable-type))

(defn set-pattern!
  ^js [instantiable-type value]
  (set! (.-pattern ^js instantiable-type) value))

(defn alias-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [instantiable-type]
  (.-aliasSymbol ^js instantiable-type))

(defn set-alias-symbol!
  ^js [instantiable-type value]
  (set! (.-aliasSymbol ^js instantiable-type) value))

(defn alias-type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [instantiable-type]
  (.-aliasTypeArguments ^js instantiable-type))

(defn set-alias-type-arguments!
  ^js [instantiable-type value]
  (set! (.-aliasTypeArguments ^js instantiable-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [instantiable-type]
  (.getFlags ^js instantiable-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [instantiable-type]
  (.getSymbol ^js instantiable-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [instantiable-type]
  (.getProperties ^js instantiable-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [instantiable-type property-name]
  (.getProperty ^js instantiable-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [instantiable-type]
  (.getApparentProperties ^js instantiable-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [instantiable-type]
  (.getCallSignatures ^js instantiable-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [instantiable-type]
  (.getConstructSignatures ^js instantiable-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [instantiable-type]
  (.getStringIndexType ^js instantiable-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [instantiable-type]
  (.getNumberIndexType ^js instantiable-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [instantiable-type]
  (.getBaseTypes ^js instantiable-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [instantiable-type]
  (.getNonNullableType ^js instantiable-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [instantiable-type]
  (.getConstraint ^js instantiable-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [instantiable-type]
  (.getDefault ^js instantiable-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [instantiable-type]
  (.isUnion ^js instantiable-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [instantiable-type]
  (.isIntersection ^js instantiable-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [instantiable-type]
  (.isUnionOrIntersection ^js instantiable-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [instantiable-type]
  (.isLiteral ^js instantiable-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [instantiable-type]
  (.isStringLiteral ^js instantiable-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [instantiable-type]
  (.isNumberLiteral ^js instantiable-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [instantiable-type]
  (.isTypeParameter ^js instantiable-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [instantiable-type]
  (.isClassOrInterface ^js instantiable-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [instantiable-type]
  (.isClass ^js instantiable-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [instantiable-type]
  (.isIndexType ^js instantiable-type))
