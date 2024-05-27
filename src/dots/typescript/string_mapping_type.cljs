(ns dots.typescript.string-mapping-type
  (:refer-clojure :exclude [symbol type]))

(defn symbol
  "**Returns:** `Symbol`"
  ^js [string-mapping-type]
  (.-symbol ^js string-mapping-type))

(defn set-symbol!
  ^js [string-mapping-type value]
  (set! (.-symbol ^js string-mapping-type) value))

(defn type
  "**Returns:** `Type`"
  ^js [string-mapping-type]
  (.-type ^js string-mapping-type))

(defn set-type!
  ^js [string-mapping-type value]
  (set! (.-type ^js string-mapping-type) value))

(defn flags
  "**Returns:** `TypeFlags`"
  ^js [string-mapping-type]
  (.-flags ^js string-mapping-type))

(defn set-flags!
  ^js [string-mapping-type value]
  (set! (.-flags ^js string-mapping-type) value))

(defn pattern
  "**Returns:** `DestructuringPattern | undefined`"
  ^js [string-mapping-type]
  (.-pattern ^js string-mapping-type))

(defn set-pattern!
  ^js [string-mapping-type value]
  (set! (.-pattern ^js string-mapping-type) value))

(defn alias-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [string-mapping-type]
  (.-aliasSymbol ^js string-mapping-type))

(defn set-alias-symbol!
  ^js [string-mapping-type value]
  (set! (.-aliasSymbol ^js string-mapping-type) value))

(defn alias-type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [string-mapping-type]
  (.-aliasTypeArguments ^js string-mapping-type))

(defn set-alias-type-arguments!
  ^js [string-mapping-type value]
  (set! (.-aliasTypeArguments ^js string-mapping-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [string-mapping-type]
  (.getFlags ^js string-mapping-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [string-mapping-type]
  (.getSymbol ^js string-mapping-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [string-mapping-type]
  (.getProperties ^js string-mapping-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [string-mapping-type property-name]
  (.getProperty ^js string-mapping-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [string-mapping-type]
  (.getApparentProperties ^js string-mapping-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [string-mapping-type]
  (.getCallSignatures ^js string-mapping-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [string-mapping-type]
  (.getConstructSignatures ^js string-mapping-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [string-mapping-type]
  (.getStringIndexType ^js string-mapping-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [string-mapping-type]
  (.getNumberIndexType ^js string-mapping-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [string-mapping-type]
  (.getBaseTypes ^js string-mapping-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [string-mapping-type]
  (.getNonNullableType ^js string-mapping-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [string-mapping-type]
  (.getConstraint ^js string-mapping-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [string-mapping-type]
  (.getDefault ^js string-mapping-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [string-mapping-type]
  (.isUnion ^js string-mapping-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [string-mapping-type]
  (.isIntersection ^js string-mapping-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [string-mapping-type]
  (.isUnionOrIntersection ^js string-mapping-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [string-mapping-type]
  (.isLiteral ^js string-mapping-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [string-mapping-type]
  (.isStringLiteral ^js string-mapping-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [string-mapping-type]
  (.isNumberLiteral ^js string-mapping-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [string-mapping-type]
  (.isTypeParameter ^js string-mapping-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [string-mapping-type]
  (.isClassOrInterface ^js string-mapping-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [string-mapping-type]
  (.isClass ^js string-mapping-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [string-mapping-type]
  (.isIndexType ^js string-mapping-type))
