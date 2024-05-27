(ns dots.typescript.unique-es-symbol-type
  (:refer-clojure :exclude [symbol]))

(defn symbol
  "**Returns:** `Symbol`"
  ^js [unique-es-symbol-type]
  (.-symbol ^js unique-es-symbol-type))

(defn set-symbol!
  ^js [unique-es-symbol-type value]
  (set! (.-symbol ^js unique-es-symbol-type) value))

(defn escaped-name
  "**Returns:** `__String`"
  ^js [unique-es-symbol-type]
  (.-escapedName ^js unique-es-symbol-type))

(defn set-escaped-name!
  ^js [unique-es-symbol-type value]
  (set! (.-escapedName ^js unique-es-symbol-type) value))

(defn flags
  "**Returns:** `TypeFlags`"
  ^js [unique-es-symbol-type]
  (.-flags ^js unique-es-symbol-type))

(defn set-flags!
  ^js [unique-es-symbol-type value]
  (set! (.-flags ^js unique-es-symbol-type) value))

(defn pattern
  "**Returns:** `DestructuringPattern | undefined`"
  ^js [unique-es-symbol-type]
  (.-pattern ^js unique-es-symbol-type))

(defn set-pattern!
  ^js [unique-es-symbol-type value]
  (set! (.-pattern ^js unique-es-symbol-type) value))

(defn alias-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [unique-es-symbol-type]
  (.-aliasSymbol ^js unique-es-symbol-type))

(defn set-alias-symbol!
  ^js [unique-es-symbol-type value]
  (set! (.-aliasSymbol ^js unique-es-symbol-type) value))

(defn alias-type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [unique-es-symbol-type]
  (.-aliasTypeArguments ^js unique-es-symbol-type))

(defn set-alias-type-arguments!
  ^js [unique-es-symbol-type value]
  (set! (.-aliasTypeArguments ^js unique-es-symbol-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [unique-es-symbol-type]
  (.getFlags ^js unique-es-symbol-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [unique-es-symbol-type]
  (.getSymbol ^js unique-es-symbol-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [unique-es-symbol-type]
  (.getProperties ^js unique-es-symbol-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [unique-es-symbol-type property-name]
  (.getProperty ^js unique-es-symbol-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [unique-es-symbol-type]
  (.getApparentProperties ^js unique-es-symbol-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [unique-es-symbol-type]
  (.getCallSignatures ^js unique-es-symbol-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [unique-es-symbol-type]
  (.getConstructSignatures ^js unique-es-symbol-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [unique-es-symbol-type]
  (.getStringIndexType ^js unique-es-symbol-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [unique-es-symbol-type]
  (.getNumberIndexType ^js unique-es-symbol-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [unique-es-symbol-type]
  (.getBaseTypes ^js unique-es-symbol-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [unique-es-symbol-type]
  (.getNonNullableType ^js unique-es-symbol-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [unique-es-symbol-type]
  (.getConstraint ^js unique-es-symbol-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [unique-es-symbol-type]
  (.getDefault ^js unique-es-symbol-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [unique-es-symbol-type]
  (.isUnion ^js unique-es-symbol-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [unique-es-symbol-type]
  (.isIntersection ^js unique-es-symbol-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [unique-es-symbol-type]
  (.isUnionOrIntersection ^js unique-es-symbol-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [unique-es-symbol-type]
  (.isLiteral ^js unique-es-symbol-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [unique-es-symbol-type]
  (.isStringLiteral ^js unique-es-symbol-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [unique-es-symbol-type]
  (.isNumberLiteral ^js unique-es-symbol-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [unique-es-symbol-type]
  (.isTypeParameter ^js unique-es-symbol-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [unique-es-symbol-type]
  (.isClassOrInterface ^js unique-es-symbol-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [unique-es-symbol-type]
  (.isClass ^js unique-es-symbol-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [unique-es-symbol-type]
  (.isIndexType ^js unique-es-symbol-type))
