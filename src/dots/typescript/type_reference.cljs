(ns dots.typescript.type-reference
  "Type references (ObjectFlags.Reference). When a class or interface has type parameters or
   a \"this\" type, references to the class or interface are made using type references. The
   typeArguments property specifies the types to substitute for the type parameters of the
   class or interface and optionally includes an extra element that specifies the type to
   substitute for \"this\" in the resulting instantiation. When no extra argument is present,
   the type reference itself is substituted for \"this\". The typeArguments property is undefined
   if the class or interface has no type parameters and the reference isn't specifying an
   explicit \"this\" argument."
  (:refer-clojure :exclude [symbol]))

(defn target
  "**Returns:** `GenericType`"
  ^js [type-reference]
  (.-target ^js type-reference))

(defn set-target!
  ^js [type-reference value]
  (set! (.-target ^js type-reference) value))

(defn node
  "**Returns:** `TypeReferenceNode | ArrayTypeNode | TupleTypeNode | undefined`"
  ^js [type-reference]
  (.-node ^js type-reference))

(defn set-node!
  ^js [type-reference value]
  (set! (.-node ^js type-reference) value))

(defn type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [type-reference]
  (.-typeArguments ^js type-reference))

(defn set-type-arguments!
  ^js [type-reference value]
  (set! (.-typeArguments ^js type-reference) value))

(defn object-flags
  "**Returns:** `ObjectFlags`"
  ^js [type-reference]
  (.-objectFlags ^js type-reference))

(defn set-object-flags!
  ^js [type-reference value]
  (set! (.-objectFlags ^js type-reference) value))

(defn flags
  "**Returns:** `TypeFlags`"
  ^js [type-reference]
  (.-flags ^js type-reference))

(defn set-flags!
  ^js [type-reference value]
  (set! (.-flags ^js type-reference) value))

(defn symbol
  "**Returns:** `Symbol`"
  ^js [type-reference]
  (.-symbol ^js type-reference))

(defn set-symbol!
  ^js [type-reference value]
  (set! (.-symbol ^js type-reference) value))

(defn pattern
  "**Returns:** `DestructuringPattern | undefined`"
  ^js [type-reference]
  (.-pattern ^js type-reference))

(defn set-pattern!
  ^js [type-reference value]
  (set! (.-pattern ^js type-reference) value))

(defn alias-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [type-reference]
  (.-aliasSymbol ^js type-reference))

(defn set-alias-symbol!
  ^js [type-reference value]
  (set! (.-aliasSymbol ^js type-reference) value))

(defn alias-type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [type-reference]
  (.-aliasTypeArguments ^js type-reference))

(defn set-alias-type-arguments!
  ^js [type-reference value]
  (set! (.-aliasTypeArguments ^js type-reference) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [type-reference]
  (.getFlags ^js type-reference))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [type-reference]
  (.getSymbol ^js type-reference))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [type-reference]
  (.getProperties ^js type-reference))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [type-reference property-name]
  (.getProperty ^js type-reference property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [type-reference]
  (.getApparentProperties ^js type-reference))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [type-reference]
  (.getCallSignatures ^js type-reference))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [type-reference]
  (.getConstructSignatures ^js type-reference))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [type-reference]
  (.getStringIndexType ^js type-reference))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [type-reference]
  (.getNumberIndexType ^js type-reference))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [type-reference]
  (.getBaseTypes ^js type-reference))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [type-reference]
  (.getNonNullableType ^js type-reference))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [type-reference]
  (.getConstraint ^js type-reference))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [type-reference]
  (.getDefault ^js type-reference))

(defn union?
  "**Returns:** `boolean`"
  ^js [type-reference]
  (.isUnion ^js type-reference))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [type-reference]
  (.isIntersection ^js type-reference))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [type-reference]
  (.isUnionOrIntersection ^js type-reference))

(defn literal?
  "**Returns:** `boolean`"
  ^js [type-reference]
  (.isLiteral ^js type-reference))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [type-reference]
  (.isStringLiteral ^js type-reference))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [type-reference]
  (.isNumberLiteral ^js type-reference))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [type-reference]
  (.isTypeParameter ^js type-reference))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [type-reference]
  (.isClassOrInterface ^js type-reference))

(defn class?
  "**Returns:** `boolean`"
  ^js [type-reference]
  (.isClass ^js type-reference))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [type-reference]
  (.isIndexType ^js type-reference))
