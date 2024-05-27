(ns dots.typescript.freshable-type
  (:refer-clojure :exclude [symbol]))

(defn fresh-type
  "**Returns:** `FreshableType`"
  ^js [freshable-type]
  (.-freshType ^js freshable-type))

(defn set-fresh-type!
  ^js [freshable-type value]
  (set! (.-freshType ^js freshable-type) value))

(defn regular-type
  "**Returns:** `FreshableType`"
  ^js [freshable-type]
  (.-regularType ^js freshable-type))

(defn set-regular-type!
  ^js [freshable-type value]
  (set! (.-regularType ^js freshable-type) value))

(defn flags
  "**Returns:** `TypeFlags`"
  ^js [freshable-type]
  (.-flags ^js freshable-type))

(defn set-flags!
  ^js [freshable-type value]
  (set! (.-flags ^js freshable-type) value))

(defn symbol
  "**Returns:** `Symbol`"
  ^js [freshable-type]
  (.-symbol ^js freshable-type))

(defn set-symbol!
  ^js [freshable-type value]
  (set! (.-symbol ^js freshable-type) value))

(defn pattern
  "**Returns:** `DestructuringPattern | undefined`"
  ^js [freshable-type]
  (.-pattern ^js freshable-type))

(defn set-pattern!
  ^js [freshable-type value]
  (set! (.-pattern ^js freshable-type) value))

(defn alias-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [freshable-type]
  (.-aliasSymbol ^js freshable-type))

(defn set-alias-symbol!
  ^js [freshable-type value]
  (set! (.-aliasSymbol ^js freshable-type) value))

(defn alias-type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [freshable-type]
  (.-aliasTypeArguments ^js freshable-type))

(defn set-alias-type-arguments!
  ^js [freshable-type value]
  (set! (.-aliasTypeArguments ^js freshable-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [freshable-type]
  (.getFlags ^js freshable-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [freshable-type]
  (.getSymbol ^js freshable-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [freshable-type]
  (.getProperties ^js freshable-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [freshable-type property-name]
  (.getProperty ^js freshable-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [freshable-type]
  (.getApparentProperties ^js freshable-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [freshable-type]
  (.getCallSignatures ^js freshable-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [freshable-type]
  (.getConstructSignatures ^js freshable-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [freshable-type]
  (.getStringIndexType ^js freshable-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [freshable-type]
  (.getNumberIndexType ^js freshable-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [freshable-type]
  (.getBaseTypes ^js freshable-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [freshable-type]
  (.getNonNullableType ^js freshable-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [freshable-type]
  (.getConstraint ^js freshable-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [freshable-type]
  (.getDefault ^js freshable-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [freshable-type]
  (.isUnion ^js freshable-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [freshable-type]
  (.isIntersection ^js freshable-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [freshable-type]
  (.isUnionOrIntersection ^js freshable-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [freshable-type]
  (.isLiteral ^js freshable-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [freshable-type]
  (.isStringLiteral ^js freshable-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [freshable-type]
  (.isNumberLiteral ^js freshable-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [freshable-type]
  (.isTypeParameter ^js freshable-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [freshable-type]
  (.isClassOrInterface ^js freshable-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [freshable-type]
  (.isClass ^js freshable-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [freshable-type]
  (.isIndexType ^js freshable-type))
