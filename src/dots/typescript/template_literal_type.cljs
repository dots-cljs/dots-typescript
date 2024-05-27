(ns dots.typescript.template-literal-type
  (:refer-clojure :exclude [symbol]))

(defn texts
  "**Returns:** `readonly string[]`"
  ^js [template-literal-type]
  (.-texts ^js template-literal-type))

(defn set-texts!
  ^js [template-literal-type value]
  (set! (.-texts ^js template-literal-type) value))

(defn types
  "**Returns:** `readonly Type[]`"
  ^js [template-literal-type]
  (.-types ^js template-literal-type))

(defn set-types!
  ^js [template-literal-type value]
  (set! (.-types ^js template-literal-type) value))

(defn flags
  "**Returns:** `TypeFlags`"
  ^js [template-literal-type]
  (.-flags ^js template-literal-type))

(defn set-flags!
  ^js [template-literal-type value]
  (set! (.-flags ^js template-literal-type) value))

(defn symbol
  "**Returns:** `Symbol`"
  ^js [template-literal-type]
  (.-symbol ^js template-literal-type))

(defn set-symbol!
  ^js [template-literal-type value]
  (set! (.-symbol ^js template-literal-type) value))

(defn pattern
  "**Returns:** `DestructuringPattern | undefined`"
  ^js [template-literal-type]
  (.-pattern ^js template-literal-type))

(defn set-pattern!
  ^js [template-literal-type value]
  (set! (.-pattern ^js template-literal-type) value))

(defn alias-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [template-literal-type]
  (.-aliasSymbol ^js template-literal-type))

(defn set-alias-symbol!
  ^js [template-literal-type value]
  (set! (.-aliasSymbol ^js template-literal-type) value))

(defn alias-type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [template-literal-type]
  (.-aliasTypeArguments ^js template-literal-type))

(defn set-alias-type-arguments!
  ^js [template-literal-type value]
  (set! (.-aliasTypeArguments ^js template-literal-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [template-literal-type]
  (.getFlags ^js template-literal-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [template-literal-type]
  (.getSymbol ^js template-literal-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [template-literal-type]
  (.getProperties ^js template-literal-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [template-literal-type property-name]
  (.getProperty ^js template-literal-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [template-literal-type]
  (.getApparentProperties ^js template-literal-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [template-literal-type]
  (.getCallSignatures ^js template-literal-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [template-literal-type]
  (.getConstructSignatures ^js template-literal-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [template-literal-type]
  (.getStringIndexType ^js template-literal-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [template-literal-type]
  (.getNumberIndexType ^js template-literal-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [template-literal-type]
  (.getBaseTypes ^js template-literal-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [template-literal-type]
  (.getNonNullableType ^js template-literal-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [template-literal-type]
  (.getConstraint ^js template-literal-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [template-literal-type]
  (.getDefault ^js template-literal-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [template-literal-type]
  (.isUnion ^js template-literal-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [template-literal-type]
  (.isIntersection ^js template-literal-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [template-literal-type]
  (.isUnionOrIntersection ^js template-literal-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [template-literal-type]
  (.isLiteral ^js template-literal-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [template-literal-type]
  (.isStringLiteral ^js template-literal-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [template-literal-type]
  (.isNumberLiteral ^js template-literal-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [template-literal-type]
  (.isTypeParameter ^js template-literal-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [template-literal-type]
  (.isClassOrInterface ^js template-literal-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [template-literal-type]
  (.isClass ^js template-literal-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [template-literal-type]
  (.isIndexType ^js template-literal-type))
