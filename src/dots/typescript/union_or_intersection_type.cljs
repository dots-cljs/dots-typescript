(ns dots.typescript.union-or-intersection-type
  (:refer-clojure :exclude [symbol]))

(defn types
  "**Returns:** `Type[]`"
  ^js [union-or-intersection-type]
  (.-types ^js union-or-intersection-type))

(defn set-types!
  ^js [union-or-intersection-type value]
  (set! (.-types ^js union-or-intersection-type) value))

(defn flags
  "**Returns:** `TypeFlags`"
  ^js [union-or-intersection-type]
  (.-flags ^js union-or-intersection-type))

(defn set-flags!
  ^js [union-or-intersection-type value]
  (set! (.-flags ^js union-or-intersection-type) value))

(defn symbol
  "**Returns:** `Symbol`"
  ^js [union-or-intersection-type]
  (.-symbol ^js union-or-intersection-type))

(defn set-symbol!
  ^js [union-or-intersection-type value]
  (set! (.-symbol ^js union-or-intersection-type) value))

(defn pattern
  "**Returns:** `DestructuringPattern | undefined`"
  ^js [union-or-intersection-type]
  (.-pattern ^js union-or-intersection-type))

(defn set-pattern!
  ^js [union-or-intersection-type value]
  (set! (.-pattern ^js union-or-intersection-type) value))

(defn alias-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [union-or-intersection-type]
  (.-aliasSymbol ^js union-or-intersection-type))

(defn set-alias-symbol!
  ^js [union-or-intersection-type value]
  (set! (.-aliasSymbol ^js union-or-intersection-type) value))

(defn alias-type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [union-or-intersection-type]
  (.-aliasTypeArguments ^js union-or-intersection-type))

(defn set-alias-type-arguments!
  ^js [union-or-intersection-type value]
  (set! (.-aliasTypeArguments ^js union-or-intersection-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [union-or-intersection-type]
  (.getFlags ^js union-or-intersection-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [union-or-intersection-type]
  (.getSymbol ^js union-or-intersection-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [union-or-intersection-type]
  (.getProperties ^js union-or-intersection-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [union-or-intersection-type property-name]
  (.getProperty ^js union-or-intersection-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [union-or-intersection-type]
  (.getApparentProperties ^js union-or-intersection-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [union-or-intersection-type]
  (.getCallSignatures ^js union-or-intersection-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [union-or-intersection-type]
  (.getConstructSignatures ^js union-or-intersection-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [union-or-intersection-type]
  (.getStringIndexType ^js union-or-intersection-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [union-or-intersection-type]
  (.getNumberIndexType ^js union-or-intersection-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [union-or-intersection-type]
  (.getBaseTypes ^js union-or-intersection-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [union-or-intersection-type]
  (.getNonNullableType ^js union-or-intersection-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [union-or-intersection-type]
  (.getConstraint ^js union-or-intersection-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [union-or-intersection-type]
  (.getDefault ^js union-or-intersection-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [union-or-intersection-type]
  (.isUnion ^js union-or-intersection-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [union-or-intersection-type]
  (.isIntersection ^js union-or-intersection-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [union-or-intersection-type]
  (.isUnionOrIntersection ^js union-or-intersection-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [union-or-intersection-type]
  (.isLiteral ^js union-or-intersection-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [union-or-intersection-type]
  (.isStringLiteral ^js union-or-intersection-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [union-or-intersection-type]
  (.isNumberLiteral ^js union-or-intersection-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [union-or-intersection-type]
  (.isTypeParameter ^js union-or-intersection-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [union-or-intersection-type]
  (.isClassOrInterface ^js union-or-intersection-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [union-or-intersection-type]
  (.isClass ^js union-or-intersection-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [union-or-intersection-type]
  (.isIndexType ^js union-or-intersection-type))
