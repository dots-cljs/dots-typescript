(ns dots.typescript.string-literal-type
  (:refer-clojure :exclude [symbol]))

(defn value
  ^js [string-literal-type]
  (.-value ^js string-literal-type))

(defn set-value!
  ^js [string-literal-type value]
  (set! (.-value ^js string-literal-type) value))

(defn fresh-type
  ^js [string-literal-type]
  (.-freshType ^js string-literal-type))

(defn set-fresh-type!
  ^js [string-literal-type value]
  (set! (.-freshType ^js string-literal-type) value))

(defn regular-type
  ^js [string-literal-type]
  (.-regularType ^js string-literal-type))

(defn set-regular-type!
  ^js [string-literal-type value]
  (set! (.-regularType ^js string-literal-type) value))

(defn flags
  ^js [string-literal-type]
  (.-flags ^js string-literal-type))

(defn set-flags!
  ^js [string-literal-type value]
  (set! (.-flags ^js string-literal-type) value))

(defn symbol
  ^js [string-literal-type]
  (.-symbol ^js string-literal-type))

(defn set-symbol!
  ^js [string-literal-type value]
  (set! (.-symbol ^js string-literal-type) value))

(defn pattern
  ^js [string-literal-type]
  (.-pattern ^js string-literal-type))

(defn set-pattern!
  ^js [string-literal-type value]
  (set! (.-pattern ^js string-literal-type) value))

(defn alias-symbol
  ^js [string-literal-type]
  (.-aliasSymbol ^js string-literal-type))

(defn set-alias-symbol!
  ^js [string-literal-type value]
  (set! (.-aliasSymbol ^js string-literal-type) value))

(defn alias-type-arguments
  ^js [string-literal-type]
  (.-aliasTypeArguments ^js string-literal-type))

(defn set-alias-type-arguments!
  ^js [string-literal-type value]
  (set! (.-aliasTypeArguments ^js string-literal-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [string-literal-type]
  (.getFlags ^js string-literal-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [string-literal-type]
  (.getSymbol ^js string-literal-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [string-literal-type]
  (.getProperties ^js string-literal-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [string-literal-type property-name]
  (.getProperty ^js string-literal-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [string-literal-type]
  (.getApparentProperties ^js string-literal-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [string-literal-type]
  (.getCallSignatures ^js string-literal-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [string-literal-type]
  (.getConstructSignatures ^js string-literal-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [string-literal-type]
  (.getStringIndexType ^js string-literal-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [string-literal-type]
  (.getNumberIndexType ^js string-literal-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [string-literal-type]
  (.getBaseTypes ^js string-literal-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [string-literal-type]
  (.getNonNullableType ^js string-literal-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [string-literal-type]
  (.getConstraint ^js string-literal-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [string-literal-type]
  (.getDefault ^js string-literal-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [string-literal-type]
  (.isUnion ^js string-literal-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [string-literal-type]
  (.isIntersection ^js string-literal-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [string-literal-type]
  (.isUnionOrIntersection ^js string-literal-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [string-literal-type]
  (.isLiteral ^js string-literal-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [string-literal-type]
  (.isStringLiteral ^js string-literal-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [string-literal-type]
  (.isNumberLiteral ^js string-literal-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [string-literal-type]
  (.isTypeParameter ^js string-literal-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [string-literal-type]
  (.isClassOrInterface ^js string-literal-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [string-literal-type]
  (.isClass ^js string-literal-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [string-literal-type]
  (.isIndexType ^js string-literal-type))
