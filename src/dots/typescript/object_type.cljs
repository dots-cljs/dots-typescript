(ns dots.typescript.object-type
  (:refer-clojure :exclude [symbol]))

(defn object-flags
  "**Returns:** `ObjectFlags`"
  ^js [object-type]
  (.-objectFlags ^js object-type))

(defn set-object-flags!
  ^js [object-type value]
  (set! (.-objectFlags ^js object-type) value))

(defn flags
  "**Returns:** `TypeFlags`"
  ^js [object-type]
  (.-flags ^js object-type))

(defn set-flags!
  ^js [object-type value]
  (set! (.-flags ^js object-type) value))

(defn symbol
  "**Returns:** `Symbol`"
  ^js [object-type]
  (.-symbol ^js object-type))

(defn set-symbol!
  ^js [object-type value]
  (set! (.-symbol ^js object-type) value))

(defn pattern
  "**Returns:** `DestructuringPattern | undefined`"
  ^js [object-type]
  (.-pattern ^js object-type))

(defn set-pattern!
  ^js [object-type value]
  (set! (.-pattern ^js object-type) value))

(defn alias-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [object-type]
  (.-aliasSymbol ^js object-type))

(defn set-alias-symbol!
  ^js [object-type value]
  (set! (.-aliasSymbol ^js object-type) value))

(defn alias-type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [object-type]
  (.-aliasTypeArguments ^js object-type))

(defn set-alias-type-arguments!
  ^js [object-type value]
  (set! (.-aliasTypeArguments ^js object-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [object-type]
  (.getFlags ^js object-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [object-type]
  (.getSymbol ^js object-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [object-type]
  (.getProperties ^js object-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [object-type property-name]
  (.getProperty ^js object-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [object-type]
  (.getApparentProperties ^js object-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [object-type]
  (.getCallSignatures ^js object-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [object-type]
  (.getConstructSignatures ^js object-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [object-type]
  (.getStringIndexType ^js object-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [object-type]
  (.getNumberIndexType ^js object-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [object-type]
  (.getBaseTypes ^js object-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [object-type]
  (.getNonNullableType ^js object-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [object-type]
  (.getConstraint ^js object-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [object-type]
  (.getDefault ^js object-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [object-type]
  (.isUnion ^js object-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [object-type]
  (.isIntersection ^js object-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [object-type]
  (.isUnionOrIntersection ^js object-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [object-type]
  (.isLiteral ^js object-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [object-type]
  (.isStringLiteral ^js object-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [object-type]
  (.isNumberLiteral ^js object-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [object-type]
  (.isTypeParameter ^js object-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [object-type]
  (.isClassOrInterface ^js object-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [object-type]
  (.isClass ^js object-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [object-type]
  (.isIndexType ^js object-type))
