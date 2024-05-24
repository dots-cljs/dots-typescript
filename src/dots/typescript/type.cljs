(ns dots.typescript.type
  (:refer-clojure :exclude [symbol]))

(defn flags
  ^js [type]
  (.-flags ^js type))

(defn set-flags!
  ^js [type value]
  (set! (.-flags ^js type) value))

(defn symbol
  ^js [type]
  (.-symbol ^js type))

(defn set-symbol!
  ^js [type value]
  (set! (.-symbol ^js type) value))

(defn pattern
  ^js [type]
  (.-pattern ^js type))

(defn set-pattern!
  ^js [type value]
  (set! (.-pattern ^js type) value))

(defn alias-symbol
  ^js [type]
  (.-aliasSymbol ^js type))

(defn set-alias-symbol!
  ^js [type value]
  (set! (.-aliasSymbol ^js type) value))

(defn alias-type-arguments
  ^js [type]
  (.-aliasTypeArguments ^js type))

(defn set-alias-type-arguments!
  ^js [type value]
  (set! (.-aliasTypeArguments ^js type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [type]
  (.getFlags ^js type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [type]
  (.getSymbol ^js type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [type]
  (.getProperties ^js type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [type property-name]
  (.getProperty ^js type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [type]
  (.getApparentProperties ^js type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [type]
  (.getCallSignatures ^js type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [type]
  (.getConstructSignatures ^js type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [type]
  (.getStringIndexType ^js type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [type]
  (.getNumberIndexType ^js type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [type]
  (.getBaseTypes ^js type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [type]
  (.getNonNullableType ^js type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [type]
  (.getConstraint ^js type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [type]
  (.getDefault ^js type))

(defn union?
  "**Returns:** `boolean`"
  ^js [type]
  (.isUnion ^js type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [type]
  (.isIntersection ^js type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [type]
  (.isUnionOrIntersection ^js type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [type]
  (.isLiteral ^js type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [type]
  (.isStringLiteral ^js type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [type]
  (.isNumberLiteral ^js type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [type]
  (.isTypeParameter ^js type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [type]
  (.isClassOrInterface ^js type))

(defn class?
  "**Returns:** `boolean`"
  ^js [type]
  (.isClass ^js type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [type]
  (.isIndexType ^js type))
