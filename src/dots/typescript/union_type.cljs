(ns dots.typescript.union-type
  (:refer-clojure :exclude [symbol]))

(defn types
  ^js [union-type]
  (.-types ^js union-type))

(defn set-types!
  ^js [union-type value]
  (set! (.-types ^js union-type) value))

(defn flags
  ^js [union-type]
  (.-flags ^js union-type))

(defn set-flags!
  ^js [union-type value]
  (set! (.-flags ^js union-type) value))

(defn symbol
  ^js [union-type]
  (.-symbol ^js union-type))

(defn set-symbol!
  ^js [union-type value]
  (set! (.-symbol ^js union-type) value))

(defn pattern
  ^js [union-type]
  (.-pattern ^js union-type))

(defn set-pattern!
  ^js [union-type value]
  (set! (.-pattern ^js union-type) value))

(defn alias-symbol
  ^js [union-type]
  (.-aliasSymbol ^js union-type))

(defn set-alias-symbol!
  ^js [union-type value]
  (set! (.-aliasSymbol ^js union-type) value))

(defn alias-type-arguments
  ^js [union-type]
  (.-aliasTypeArguments ^js union-type))

(defn set-alias-type-arguments!
  ^js [union-type value]
  (set! (.-aliasTypeArguments ^js union-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [union-type]
  (.getFlags ^js union-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [union-type]
  (.getSymbol ^js union-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [union-type]
  (.getProperties ^js union-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [union-type property-name]
  (.getProperty ^js union-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [union-type]
  (.getApparentProperties ^js union-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [union-type]
  (.getCallSignatures ^js union-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [union-type]
  (.getConstructSignatures ^js union-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [union-type]
  (.getStringIndexType ^js union-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [union-type]
  (.getNumberIndexType ^js union-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [union-type]
  (.getBaseTypes ^js union-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [union-type]
  (.getNonNullableType ^js union-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [union-type]
  (.getConstraint ^js union-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [union-type]
  (.getDefault ^js union-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [union-type]
  (.isUnion ^js union-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [union-type]
  (.isIntersection ^js union-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [union-type]
  (.isUnionOrIntersection ^js union-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [union-type]
  (.isLiteral ^js union-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [union-type]
  (.isStringLiteral ^js union-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [union-type]
  (.isNumberLiteral ^js union-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [union-type]
  (.isTypeParameter ^js union-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [union-type]
  (.isClassOrInterface ^js union-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [union-type]
  (.isClass ^js union-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [union-type]
  (.isIndexType ^js union-type))
