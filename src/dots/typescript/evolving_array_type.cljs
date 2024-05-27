(ns dots.typescript.evolving-array-type
  (:refer-clojure :exclude [symbol]))

(defn element-type
  "**Returns:** `Type`"
  ^js [evolving-array-type]
  (.-elementType ^js evolving-array-type))

(defn set-element-type!
  ^js [evolving-array-type value]
  (set! (.-elementType ^js evolving-array-type) value))

(defn final-array-type
  "**Returns:** `Type | undefined`"
  ^js [evolving-array-type]
  (.-finalArrayType ^js evolving-array-type))

(defn set-final-array-type!
  ^js [evolving-array-type value]
  (set! (.-finalArrayType ^js evolving-array-type) value))

(defn object-flags
  "**Returns:** `ObjectFlags`"
  ^js [evolving-array-type]
  (.-objectFlags ^js evolving-array-type))

(defn set-object-flags!
  ^js [evolving-array-type value]
  (set! (.-objectFlags ^js evolving-array-type) value))

(defn flags
  "**Returns:** `TypeFlags`"
  ^js [evolving-array-type]
  (.-flags ^js evolving-array-type))

(defn set-flags!
  ^js [evolving-array-type value]
  (set! (.-flags ^js evolving-array-type) value))

(defn symbol
  "**Returns:** `Symbol`"
  ^js [evolving-array-type]
  (.-symbol ^js evolving-array-type))

(defn set-symbol!
  ^js [evolving-array-type value]
  (set! (.-symbol ^js evolving-array-type) value))

(defn pattern
  "**Returns:** `DestructuringPattern | undefined`"
  ^js [evolving-array-type]
  (.-pattern ^js evolving-array-type))

(defn set-pattern!
  ^js [evolving-array-type value]
  (set! (.-pattern ^js evolving-array-type) value))

(defn alias-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [evolving-array-type]
  (.-aliasSymbol ^js evolving-array-type))

(defn set-alias-symbol!
  ^js [evolving-array-type value]
  (set! (.-aliasSymbol ^js evolving-array-type) value))

(defn alias-type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [evolving-array-type]
  (.-aliasTypeArguments ^js evolving-array-type))

(defn set-alias-type-arguments!
  ^js [evolving-array-type value]
  (set! (.-aliasTypeArguments ^js evolving-array-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [evolving-array-type]
  (.getFlags ^js evolving-array-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [evolving-array-type]
  (.getSymbol ^js evolving-array-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [evolving-array-type]
  (.getProperties ^js evolving-array-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [evolving-array-type property-name]
  (.getProperty ^js evolving-array-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [evolving-array-type]
  (.getApparentProperties ^js evolving-array-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [evolving-array-type]
  (.getCallSignatures ^js evolving-array-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [evolving-array-type]
  (.getConstructSignatures ^js evolving-array-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [evolving-array-type]
  (.getStringIndexType ^js evolving-array-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [evolving-array-type]
  (.getNumberIndexType ^js evolving-array-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [evolving-array-type]
  (.getBaseTypes ^js evolving-array-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [evolving-array-type]
  (.getNonNullableType ^js evolving-array-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [evolving-array-type]
  (.getConstraint ^js evolving-array-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [evolving-array-type]
  (.getDefault ^js evolving-array-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [evolving-array-type]
  (.isUnion ^js evolving-array-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [evolving-array-type]
  (.isIntersection ^js evolving-array-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [evolving-array-type]
  (.isUnionOrIntersection ^js evolving-array-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [evolving-array-type]
  (.isLiteral ^js evolving-array-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [evolving-array-type]
  (.isStringLiteral ^js evolving-array-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [evolving-array-type]
  (.isNumberLiteral ^js evolving-array-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [evolving-array-type]
  (.isTypeParameter ^js evolving-array-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [evolving-array-type]
  (.isClassOrInterface ^js evolving-array-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [evolving-array-type]
  (.isClass ^js evolving-array-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [evolving-array-type]
  (.isIndexType ^js evolving-array-type))
