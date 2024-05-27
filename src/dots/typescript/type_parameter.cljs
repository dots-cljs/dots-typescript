(ns dots.typescript.type-parameter
  (:refer-clojure :exclude [symbol]))

(defn flags
  "**Returns:** `TypeFlags`"
  ^js [type-parameter]
  (.-flags ^js type-parameter))

(defn set-flags!
  ^js [type-parameter value]
  (set! (.-flags ^js type-parameter) value))

(defn symbol
  "**Returns:** `Symbol`"
  ^js [type-parameter]
  (.-symbol ^js type-parameter))

(defn set-symbol!
  ^js [type-parameter value]
  (set! (.-symbol ^js type-parameter) value))

(defn pattern
  "**Returns:** `DestructuringPattern | undefined`"
  ^js [type-parameter]
  (.-pattern ^js type-parameter))

(defn set-pattern!
  ^js [type-parameter value]
  (set! (.-pattern ^js type-parameter) value))

(defn alias-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [type-parameter]
  (.-aliasSymbol ^js type-parameter))

(defn set-alias-symbol!
  ^js [type-parameter value]
  (set! (.-aliasSymbol ^js type-parameter) value))

(defn alias-type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [type-parameter]
  (.-aliasTypeArguments ^js type-parameter))

(defn set-alias-type-arguments!
  ^js [type-parameter value]
  (set! (.-aliasTypeArguments ^js type-parameter) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [type-parameter]
  (.getFlags ^js type-parameter))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [type-parameter]
  (.getSymbol ^js type-parameter))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [type-parameter]
  (.getProperties ^js type-parameter))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [type-parameter property-name]
  (.getProperty ^js type-parameter property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [type-parameter]
  (.getApparentProperties ^js type-parameter))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [type-parameter]
  (.getCallSignatures ^js type-parameter))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [type-parameter]
  (.getConstructSignatures ^js type-parameter))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [type-parameter]
  (.getStringIndexType ^js type-parameter))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [type-parameter]
  (.getNumberIndexType ^js type-parameter))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [type-parameter]
  (.getBaseTypes ^js type-parameter))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [type-parameter]
  (.getNonNullableType ^js type-parameter))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [type-parameter]
  (.getConstraint ^js type-parameter))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [type-parameter]
  (.getDefault ^js type-parameter))

(defn union?
  "**Returns:** `boolean`"
  ^js [type-parameter]
  (.isUnion ^js type-parameter))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [type-parameter]
  (.isIntersection ^js type-parameter))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [type-parameter]
  (.isUnionOrIntersection ^js type-parameter))

(defn literal?
  "**Returns:** `boolean`"
  ^js [type-parameter]
  (.isLiteral ^js type-parameter))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [type-parameter]
  (.isStringLiteral ^js type-parameter))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [type-parameter]
  (.isNumberLiteral ^js type-parameter))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [type-parameter]
  (.isTypeParameter ^js type-parameter))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [type-parameter]
  (.isClassOrInterface ^js type-parameter))

(defn class?
  "**Returns:** `boolean`"
  ^js [type-parameter]
  (.isClass ^js type-parameter))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [type-parameter]
  (.isIndexType ^js type-parameter))
