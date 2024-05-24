(ns dots.typescript.interface-type
  "Class and interface types (ObjectFlags.Class and ObjectFlags.Interface)."
  (:refer-clojure :exclude [symbol]))

(defn type-parameters
  ^js [interface-type]
  (.-typeParameters ^js interface-type))

(defn set-type-parameters!
  ^js [interface-type value]
  (set! (.-typeParameters ^js interface-type) value))

(defn outer-type-parameters
  ^js [interface-type]
  (.-outerTypeParameters ^js interface-type))

(defn set-outer-type-parameters!
  ^js [interface-type value]
  (set! (.-outerTypeParameters ^js interface-type) value))

(defn local-type-parameters
  ^js [interface-type]
  (.-localTypeParameters ^js interface-type))

(defn set-local-type-parameters!
  ^js [interface-type value]
  (set! (.-localTypeParameters ^js interface-type) value))

(defn this-type
  ^js [interface-type]
  (.-thisType ^js interface-type))

(defn set-this-type!
  ^js [interface-type value]
  (set! (.-thisType ^js interface-type) value))

(defn object-flags
  ^js [interface-type]
  (.-objectFlags ^js interface-type))

(defn set-object-flags!
  ^js [interface-type value]
  (set! (.-objectFlags ^js interface-type) value))

(defn flags
  ^js [interface-type]
  (.-flags ^js interface-type))

(defn set-flags!
  ^js [interface-type value]
  (set! (.-flags ^js interface-type) value))

(defn symbol
  ^js [interface-type]
  (.-symbol ^js interface-type))

(defn set-symbol!
  ^js [interface-type value]
  (set! (.-symbol ^js interface-type) value))

(defn pattern
  ^js [interface-type]
  (.-pattern ^js interface-type))

(defn set-pattern!
  ^js [interface-type value]
  (set! (.-pattern ^js interface-type) value))

(defn alias-symbol
  ^js [interface-type]
  (.-aliasSymbol ^js interface-type))

(defn set-alias-symbol!
  ^js [interface-type value]
  (set! (.-aliasSymbol ^js interface-type) value))

(defn alias-type-arguments
  ^js [interface-type]
  (.-aliasTypeArguments ^js interface-type))

(defn set-alias-type-arguments!
  ^js [interface-type value]
  (set! (.-aliasTypeArguments ^js interface-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [interface-type]
  (.getFlags ^js interface-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [interface-type]
  (.getSymbol ^js interface-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [interface-type]
  (.getProperties ^js interface-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [interface-type property-name]
  (.getProperty ^js interface-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [interface-type]
  (.getApparentProperties ^js interface-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [interface-type]
  (.getCallSignatures ^js interface-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [interface-type]
  (.getConstructSignatures ^js interface-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [interface-type]
  (.getStringIndexType ^js interface-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [interface-type]
  (.getNumberIndexType ^js interface-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [interface-type]
  (.getBaseTypes ^js interface-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [interface-type]
  (.getNonNullableType ^js interface-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [interface-type]
  (.getConstraint ^js interface-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [interface-type]
  (.getDefault ^js interface-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [interface-type]
  (.isUnion ^js interface-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [interface-type]
  (.isIntersection ^js interface-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [interface-type]
  (.isUnionOrIntersection ^js interface-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [interface-type]
  (.isLiteral ^js interface-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [interface-type]
  (.isStringLiteral ^js interface-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [interface-type]
  (.isNumberLiteral ^js interface-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [interface-type]
  (.isTypeParameter ^js interface-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [interface-type]
  (.isClassOrInterface ^js interface-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [interface-type]
  (.isClass ^js interface-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [interface-type]
  (.isIndexType ^js interface-type))
