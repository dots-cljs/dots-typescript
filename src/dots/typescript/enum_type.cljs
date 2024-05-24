(ns dots.typescript.enum-type
  (:refer-clojure :exclude [symbol]))

(defn fresh-type
  ^js [enum-type]
  (.-freshType ^js enum-type))

(defn set-fresh-type!
  ^js [enum-type value]
  (set! (.-freshType ^js enum-type) value))

(defn regular-type
  ^js [enum-type]
  (.-regularType ^js enum-type))

(defn set-regular-type!
  ^js [enum-type value]
  (set! (.-regularType ^js enum-type) value))

(defn flags
  ^js [enum-type]
  (.-flags ^js enum-type))

(defn set-flags!
  ^js [enum-type value]
  (set! (.-flags ^js enum-type) value))

(defn symbol
  ^js [enum-type]
  (.-symbol ^js enum-type))

(defn set-symbol!
  ^js [enum-type value]
  (set! (.-symbol ^js enum-type) value))

(defn pattern
  ^js [enum-type]
  (.-pattern ^js enum-type))

(defn set-pattern!
  ^js [enum-type value]
  (set! (.-pattern ^js enum-type) value))

(defn alias-symbol
  ^js [enum-type]
  (.-aliasSymbol ^js enum-type))

(defn set-alias-symbol!
  ^js [enum-type value]
  (set! (.-aliasSymbol ^js enum-type) value))

(defn alias-type-arguments
  ^js [enum-type]
  (.-aliasTypeArguments ^js enum-type))

(defn set-alias-type-arguments!
  ^js [enum-type value]
  (set! (.-aliasTypeArguments ^js enum-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [enum-type]
  (.getFlags ^js enum-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [enum-type]
  (.getSymbol ^js enum-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [enum-type]
  (.getProperties ^js enum-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [enum-type property-name]
  (.getProperty ^js enum-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [enum-type]
  (.getApparentProperties ^js enum-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [enum-type]
  (.getCallSignatures ^js enum-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [enum-type]
  (.getConstructSignatures ^js enum-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [enum-type]
  (.getStringIndexType ^js enum-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [enum-type]
  (.getNumberIndexType ^js enum-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [enum-type]
  (.getBaseTypes ^js enum-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [enum-type]
  (.getNonNullableType ^js enum-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [enum-type]
  (.getConstraint ^js enum-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [enum-type]
  (.getDefault ^js enum-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [enum-type]
  (.isUnion ^js enum-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [enum-type]
  (.isIntersection ^js enum-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [enum-type]
  (.isUnionOrIntersection ^js enum-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [enum-type]
  (.isLiteral ^js enum-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [enum-type]
  (.isStringLiteral ^js enum-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [enum-type]
  (.isNumberLiteral ^js enum-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [enum-type]
  (.isTypeParameter ^js enum-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [enum-type]
  (.isClassOrInterface ^js enum-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [enum-type]
  (.isClass ^js enum-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [enum-type]
  (.isIndexType ^js enum-type))
