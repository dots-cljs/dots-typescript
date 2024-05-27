(ns dots.typescript.substitution-type
  (:refer-clojure :exclude [symbol]))

(defn object-flags
  "**Returns:** `ObjectFlags`"
  ^js [substitution-type]
  (.-objectFlags ^js substitution-type))

(defn set-object-flags!
  ^js [substitution-type value]
  (set! (.-objectFlags ^js substitution-type) value))

(defn base-type
  "**Returns:** `Type`"
  ^js [substitution-type]
  (.-baseType ^js substitution-type))

(defn set-base-type!
  ^js [substitution-type value]
  (set! (.-baseType ^js substitution-type) value))

(defn constraint
  "**Returns:** `Type`"
  ^js [substitution-type]
  (.-constraint ^js substitution-type))

(defn set-constraint!
  ^js [substitution-type value]
  (set! (.-constraint ^js substitution-type) value))

(defn flags
  "**Returns:** `TypeFlags`"
  ^js [substitution-type]
  (.-flags ^js substitution-type))

(defn set-flags!
  ^js [substitution-type value]
  (set! (.-flags ^js substitution-type) value))

(defn symbol
  "**Returns:** `Symbol`"
  ^js [substitution-type]
  (.-symbol ^js substitution-type))

(defn set-symbol!
  ^js [substitution-type value]
  (set! (.-symbol ^js substitution-type) value))

(defn pattern
  "**Returns:** `DestructuringPattern | undefined`"
  ^js [substitution-type]
  (.-pattern ^js substitution-type))

(defn set-pattern!
  ^js [substitution-type value]
  (set! (.-pattern ^js substitution-type) value))

(defn alias-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [substitution-type]
  (.-aliasSymbol ^js substitution-type))

(defn set-alias-symbol!
  ^js [substitution-type value]
  (set! (.-aliasSymbol ^js substitution-type) value))

(defn alias-type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [substitution-type]
  (.-aliasTypeArguments ^js substitution-type))

(defn set-alias-type-arguments!
  ^js [substitution-type value]
  (set! (.-aliasTypeArguments ^js substitution-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [substitution-type]
  (.getFlags ^js substitution-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [substitution-type]
  (.getSymbol ^js substitution-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [substitution-type]
  (.getProperties ^js substitution-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [substitution-type property-name]
  (.getProperty ^js substitution-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [substitution-type]
  (.getApparentProperties ^js substitution-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [substitution-type]
  (.getCallSignatures ^js substitution-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [substitution-type]
  (.getConstructSignatures ^js substitution-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [substitution-type]
  (.getStringIndexType ^js substitution-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [substitution-type]
  (.getNumberIndexType ^js substitution-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [substitution-type]
  (.getBaseTypes ^js substitution-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [substitution-type]
  (.getNonNullableType ^js substitution-type))

(defn get-constraint
  "**Returns:** `Type | undefined`"
  ^js [substitution-type]
  (.getConstraint ^js substitution-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [substitution-type]
  (.getDefault ^js substitution-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [substitution-type]
  (.isUnion ^js substitution-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [substitution-type]
  (.isIntersection ^js substitution-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [substitution-type]
  (.isUnionOrIntersection ^js substitution-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [substitution-type]
  (.isLiteral ^js substitution-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [substitution-type]
  (.isStringLiteral ^js substitution-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [substitution-type]
  (.isNumberLiteral ^js substitution-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [substitution-type]
  (.isTypeParameter ^js substitution-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [substitution-type]
  (.isClassOrInterface ^js substitution-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [substitution-type]
  (.isClass ^js substitution-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [substitution-type]
  (.isIndexType ^js substitution-type))
