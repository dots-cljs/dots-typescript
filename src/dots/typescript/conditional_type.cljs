(ns dots.typescript.conditional-type
  (:refer-clojure :exclude [symbol]))

(defn root
  "**Returns:** `ConditionalRoot`"
  ^js [conditional-type]
  (.-root ^js conditional-type))

(defn set-root!
  ^js [conditional-type value]
  (set! (.-root ^js conditional-type) value))

(defn check-type
  "**Returns:** `Type`"
  ^js [conditional-type]
  (.-checkType ^js conditional-type))

(defn set-check-type!
  ^js [conditional-type value]
  (set! (.-checkType ^js conditional-type) value))

(defn extends-type
  "**Returns:** `Type`"
  ^js [conditional-type]
  (.-extendsType ^js conditional-type))

(defn set-extends-type!
  ^js [conditional-type value]
  (set! (.-extendsType ^js conditional-type) value))

(defn resolved-true-type
  "**Returns:** `Type | undefined`"
  ^js [conditional-type]
  (.-resolvedTrueType ^js conditional-type))

(defn set-resolved-true-type!
  ^js [conditional-type value]
  (set! (.-resolvedTrueType ^js conditional-type) value))

(defn resolved-false-type
  "**Returns:** `Type | undefined`"
  ^js [conditional-type]
  (.-resolvedFalseType ^js conditional-type))

(defn set-resolved-false-type!
  ^js [conditional-type value]
  (set! (.-resolvedFalseType ^js conditional-type) value))

(defn flags
  "**Returns:** `TypeFlags`"
  ^js [conditional-type]
  (.-flags ^js conditional-type))

(defn set-flags!
  ^js [conditional-type value]
  (set! (.-flags ^js conditional-type) value))

(defn symbol
  "**Returns:** `Symbol`"
  ^js [conditional-type]
  (.-symbol ^js conditional-type))

(defn set-symbol!
  ^js [conditional-type value]
  (set! (.-symbol ^js conditional-type) value))

(defn pattern
  "**Returns:** `DestructuringPattern | undefined`"
  ^js [conditional-type]
  (.-pattern ^js conditional-type))

(defn set-pattern!
  ^js [conditional-type value]
  (set! (.-pattern ^js conditional-type) value))

(defn alias-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [conditional-type]
  (.-aliasSymbol ^js conditional-type))

(defn set-alias-symbol!
  ^js [conditional-type value]
  (set! (.-aliasSymbol ^js conditional-type) value))

(defn alias-type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [conditional-type]
  (.-aliasTypeArguments ^js conditional-type))

(defn set-alias-type-arguments!
  ^js [conditional-type value]
  (set! (.-aliasTypeArguments ^js conditional-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [conditional-type]
  (.getFlags ^js conditional-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [conditional-type]
  (.getSymbol ^js conditional-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [conditional-type]
  (.getProperties ^js conditional-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [conditional-type property-name]
  (.getProperty ^js conditional-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [conditional-type]
  (.getApparentProperties ^js conditional-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [conditional-type]
  (.getCallSignatures ^js conditional-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [conditional-type]
  (.getConstructSignatures ^js conditional-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [conditional-type]
  (.getStringIndexType ^js conditional-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [conditional-type]
  (.getNumberIndexType ^js conditional-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [conditional-type]
  (.getBaseTypes ^js conditional-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [conditional-type]
  (.getNonNullableType ^js conditional-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [conditional-type]
  (.getConstraint ^js conditional-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [conditional-type]
  (.getDefault ^js conditional-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [conditional-type]
  (.isUnion ^js conditional-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [conditional-type]
  (.isIntersection ^js conditional-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [conditional-type]
  (.isUnionOrIntersection ^js conditional-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [conditional-type]
  (.isLiteral ^js conditional-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [conditional-type]
  (.isStringLiteral ^js conditional-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [conditional-type]
  (.isNumberLiteral ^js conditional-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [conditional-type]
  (.isTypeParameter ^js conditional-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [conditional-type]
  (.isClassOrInterface ^js conditional-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [conditional-type]
  (.isClass ^js conditional-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [conditional-type]
  (.isIndexType ^js conditional-type))
