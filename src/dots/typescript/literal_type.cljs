(ns dots.typescript.literal-type
  (:refer-clojure :exclude [symbol]))

(defn value
  ^js [literal-type]
  (.-value ^js literal-type))

(defn set-value!
  ^js [literal-type value]
  (set! (.-value ^js literal-type) value))

(defn fresh-type
  ^js [literal-type]
  (.-freshType ^js literal-type))

(defn set-fresh-type!
  ^js [literal-type value]
  (set! (.-freshType ^js literal-type) value))

(defn regular-type
  ^js [literal-type]
  (.-regularType ^js literal-type))

(defn set-regular-type!
  ^js [literal-type value]
  (set! (.-regularType ^js literal-type) value))

(defn flags
  ^js [literal-type]
  (.-flags ^js literal-type))

(defn set-flags!
  ^js [literal-type value]
  (set! (.-flags ^js literal-type) value))

(defn symbol
  ^js [literal-type]
  (.-symbol ^js literal-type))

(defn set-symbol!
  ^js [literal-type value]
  (set! (.-symbol ^js literal-type) value))

(defn pattern
  ^js [literal-type]
  (.-pattern ^js literal-type))

(defn set-pattern!
  ^js [literal-type value]
  (set! (.-pattern ^js literal-type) value))

(defn alias-symbol
  ^js [literal-type]
  (.-aliasSymbol ^js literal-type))

(defn set-alias-symbol!
  ^js [literal-type value]
  (set! (.-aliasSymbol ^js literal-type) value))

(defn alias-type-arguments
  ^js [literal-type]
  (.-aliasTypeArguments ^js literal-type))

(defn set-alias-type-arguments!
  ^js [literal-type value]
  (set! (.-aliasTypeArguments ^js literal-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [literal-type]
  (.getFlags ^js literal-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [literal-type]
  (.getSymbol ^js literal-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [literal-type]
  (.getProperties ^js literal-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [literal-type property-name]
  (.getProperty ^js literal-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [literal-type]
  (.getApparentProperties ^js literal-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [literal-type]
  (.getCallSignatures ^js literal-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [literal-type]
  (.getConstructSignatures ^js literal-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [literal-type]
  (.getStringIndexType ^js literal-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [literal-type]
  (.getNumberIndexType ^js literal-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [literal-type]
  (.getBaseTypes ^js literal-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [literal-type]
  (.getNonNullableType ^js literal-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [literal-type]
  (.getConstraint ^js literal-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [literal-type]
  (.getDefault ^js literal-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [literal-type]
  (.isUnion ^js literal-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [literal-type]
  (.isIntersection ^js literal-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [literal-type]
  (.isUnionOrIntersection ^js literal-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [literal-type]
  (.isLiteral ^js literal-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [literal-type]
  (.isStringLiteral ^js literal-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [literal-type]
  (.isNumberLiteral ^js literal-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [literal-type]
  (.isTypeParameter ^js literal-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [literal-type]
  (.isClassOrInterface ^js literal-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [literal-type]
  (.isClass ^js literal-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [literal-type]
  (.isIndexType ^js literal-type))
