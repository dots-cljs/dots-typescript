(ns dots.typescript.number-literal-type
  (:refer-clojure :exclude [symbol]))

(defn value
  ^js [number-literal-type]
  (.-value ^js number-literal-type))

(defn set-value!
  ^js [number-literal-type value]
  (set! (.-value ^js number-literal-type) value))

(defn fresh-type
  ^js [number-literal-type]
  (.-freshType ^js number-literal-type))

(defn set-fresh-type!
  ^js [number-literal-type value]
  (set! (.-freshType ^js number-literal-type) value))

(defn regular-type
  ^js [number-literal-type]
  (.-regularType ^js number-literal-type))

(defn set-regular-type!
  ^js [number-literal-type value]
  (set! (.-regularType ^js number-literal-type) value))

(defn flags
  ^js [number-literal-type]
  (.-flags ^js number-literal-type))

(defn set-flags!
  ^js [number-literal-type value]
  (set! (.-flags ^js number-literal-type) value))

(defn symbol
  ^js [number-literal-type]
  (.-symbol ^js number-literal-type))

(defn set-symbol!
  ^js [number-literal-type value]
  (set! (.-symbol ^js number-literal-type) value))

(defn pattern
  ^js [number-literal-type]
  (.-pattern ^js number-literal-type))

(defn set-pattern!
  ^js [number-literal-type value]
  (set! (.-pattern ^js number-literal-type) value))

(defn alias-symbol
  ^js [number-literal-type]
  (.-aliasSymbol ^js number-literal-type))

(defn set-alias-symbol!
  ^js [number-literal-type value]
  (set! (.-aliasSymbol ^js number-literal-type) value))

(defn alias-type-arguments
  ^js [number-literal-type]
  (.-aliasTypeArguments ^js number-literal-type))

(defn set-alias-type-arguments!
  ^js [number-literal-type value]
  (set! (.-aliasTypeArguments ^js number-literal-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [number-literal-type]
  (.getFlags ^js number-literal-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [number-literal-type]
  (.getSymbol ^js number-literal-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [number-literal-type]
  (.getProperties ^js number-literal-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [number-literal-type property-name]
  (.getProperty ^js number-literal-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [number-literal-type]
  (.getApparentProperties ^js number-literal-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [number-literal-type]
  (.getCallSignatures ^js number-literal-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [number-literal-type]
  (.getConstructSignatures ^js number-literal-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [number-literal-type]
  (.getStringIndexType ^js number-literal-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [number-literal-type]
  (.getNumberIndexType ^js number-literal-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [number-literal-type]
  (.getBaseTypes ^js number-literal-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [number-literal-type]
  (.getNonNullableType ^js number-literal-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [number-literal-type]
  (.getConstraint ^js number-literal-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [number-literal-type]
  (.getDefault ^js number-literal-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [number-literal-type]
  (.isUnion ^js number-literal-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [number-literal-type]
  (.isIntersection ^js number-literal-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [number-literal-type]
  (.isUnionOrIntersection ^js number-literal-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [number-literal-type]
  (.isLiteral ^js number-literal-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [number-literal-type]
  (.isStringLiteral ^js number-literal-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [number-literal-type]
  (.isNumberLiteral ^js number-literal-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [number-literal-type]
  (.isTypeParameter ^js number-literal-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [number-literal-type]
  (.isClassOrInterface ^js number-literal-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [number-literal-type]
  (.isClass ^js number-literal-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [number-literal-type]
  (.isIndexType ^js number-literal-type))
