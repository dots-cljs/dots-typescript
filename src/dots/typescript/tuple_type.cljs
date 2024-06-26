(ns dots.typescript.tuple-type
  (:refer-clojure :exclude [symbol]))

(defn element-flags
  "**Returns:** `readonly ElementFlags[]`"
  ^js [tuple-type]
  (.-elementFlags ^js tuple-type))

(defn set-element-flags!
  ^js [tuple-type value]
  (set! (.-elementFlags ^js tuple-type) value))

(defn min-length
  "Number of required or variadic elements
   
   **Returns:** `number`"
  ^js [tuple-type]
  (.-minLength ^js tuple-type))

(defn set-min-length!
  "Number of required or variadic elements"
  ^js [tuple-type value]
  (set! (.-minLength ^js tuple-type) value))

(defn fixed-length
  "Number of initial required or optional elements
   
   **Returns:** `number`"
  ^js [tuple-type]
  (.-fixedLength ^js tuple-type))

(defn set-fixed-length!
  "Number of initial required or optional elements"
  ^js [tuple-type value]
  (set! (.-fixedLength ^js tuple-type) value))

(defn has-rest-element?
  "True if tuple has any rest or variadic elements
   
   **Returns:** `boolean`"
  ^js [tuple-type]
  (.-hasRestElement ^js tuple-type))

(defn set-has-rest-element!
  "True if tuple has any rest or variadic elements"
  ^js [tuple-type value]
  (set! (.-hasRestElement ^js tuple-type) value))

(defn combined-flags
  "**Returns:** `ElementFlags`"
  ^js [tuple-type]
  (.-combinedFlags ^js tuple-type))

(defn set-combined-flags!
  ^js [tuple-type value]
  (set! (.-combinedFlags ^js tuple-type) value))

(defn readonly?
  "**Returns:** `boolean`"
  ^js [tuple-type]
  (.-readonly ^js tuple-type))

(defn set-readonly!
  ^js [tuple-type value]
  (set! (.-readonly ^js tuple-type) value))

(defn labeled-element-declarations
  "**Returns:** `readonly (ParameterDeclaration | NamedTupleMember | undefined)[] | undefined`"
  ^js [tuple-type]
  (.-labeledElementDeclarations ^js tuple-type))

(defn set-labeled-element-declarations!
  ^js [tuple-type value]
  (set! (.-labeledElementDeclarations ^js tuple-type) value))

(defn type-parameters
  "**Returns:** `TypeParameter[] | undefined`"
  ^js [tuple-type]
  (.-typeParameters ^js tuple-type))

(defn set-type-parameters!
  ^js [tuple-type value]
  (set! (.-typeParameters ^js tuple-type) value))

(defn outer-type-parameters
  "**Returns:** `TypeParameter[] | undefined`"
  ^js [tuple-type]
  (.-outerTypeParameters ^js tuple-type))

(defn set-outer-type-parameters!
  ^js [tuple-type value]
  (set! (.-outerTypeParameters ^js tuple-type) value))

(defn local-type-parameters
  "**Returns:** `TypeParameter[] | undefined`"
  ^js [tuple-type]
  (.-localTypeParameters ^js tuple-type))

(defn set-local-type-parameters!
  ^js [tuple-type value]
  (set! (.-localTypeParameters ^js tuple-type) value))

(defn this-type
  "**Returns:** `TypeParameter | undefined`"
  ^js [tuple-type]
  (.-thisType ^js tuple-type))

(defn set-this-type!
  ^js [tuple-type value]
  (set! (.-thisType ^js tuple-type) value))

(defn object-flags
  "**Returns:** `ObjectFlags`"
  ^js [tuple-type]
  (.-objectFlags ^js tuple-type))

(defn set-object-flags!
  ^js [tuple-type value]
  (set! (.-objectFlags ^js tuple-type) value))

(defn flags
  "**Returns:** `TypeFlags`"
  ^js [tuple-type]
  (.-flags ^js tuple-type))

(defn set-flags!
  ^js [tuple-type value]
  (set! (.-flags ^js tuple-type) value))

(defn symbol
  "**Returns:** `Symbol`"
  ^js [tuple-type]
  (.-symbol ^js tuple-type))

(defn set-symbol!
  ^js [tuple-type value]
  (set! (.-symbol ^js tuple-type) value))

(defn pattern
  "**Returns:** `DestructuringPattern | undefined`"
  ^js [tuple-type]
  (.-pattern ^js tuple-type))

(defn set-pattern!
  ^js [tuple-type value]
  (set! (.-pattern ^js tuple-type) value))

(defn alias-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [tuple-type]
  (.-aliasSymbol ^js tuple-type))

(defn set-alias-symbol!
  ^js [tuple-type value]
  (set! (.-aliasSymbol ^js tuple-type) value))

(defn alias-type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [tuple-type]
  (.-aliasTypeArguments ^js tuple-type))

(defn set-alias-type-arguments!
  ^js [tuple-type value]
  (set! (.-aliasTypeArguments ^js tuple-type) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [tuple-type]
  (.getFlags ^js tuple-type))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [tuple-type]
  (.getSymbol ^js tuple-type))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [tuple-type]
  (.getProperties ^js tuple-type))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [tuple-type property-name]
  (.getProperty ^js tuple-type property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [tuple-type]
  (.getApparentProperties ^js tuple-type))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [tuple-type]
  (.getCallSignatures ^js tuple-type))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [tuple-type]
  (.getConstructSignatures ^js tuple-type))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [tuple-type]
  (.getStringIndexType ^js tuple-type))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [tuple-type]
  (.getNumberIndexType ^js tuple-type))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [tuple-type]
  (.getBaseTypes ^js tuple-type))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [tuple-type]
  (.getNonNullableType ^js tuple-type))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [tuple-type]
  (.getConstraint ^js tuple-type))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [tuple-type]
  (.getDefault ^js tuple-type))

(defn union?
  "**Returns:** `boolean`"
  ^js [tuple-type]
  (.isUnion ^js tuple-type))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [tuple-type]
  (.isIntersection ^js tuple-type))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [tuple-type]
  (.isUnionOrIntersection ^js tuple-type))

(defn literal?
  "**Returns:** `boolean`"
  ^js [tuple-type]
  (.isLiteral ^js tuple-type))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [tuple-type]
  (.isStringLiteral ^js tuple-type))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [tuple-type]
  (.isNumberLiteral ^js tuple-type))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [tuple-type]
  (.isTypeParameter ^js tuple-type))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [tuple-type]
  (.isClassOrInterface ^js tuple-type))

(defn class?
  "**Returns:** `boolean`"
  ^js [tuple-type]
  (.isClass ^js tuple-type))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [tuple-type]
  (.isIndexType ^js tuple-type))

(defn target
  "**Returns:** `GenericType`"
  ^js [tuple-type]
  (.-target ^js tuple-type))

(defn set-target!
  ^js [tuple-type value]
  (set! (.-target ^js tuple-type) value))

(defn node
  "**Returns:** `TypeReferenceNode | ArrayTypeNode | TupleTypeNode | undefined`"
  ^js [tuple-type]
  (.-node ^js tuple-type))

(defn set-node!
  ^js [tuple-type value]
  (set! (.-node ^js tuple-type) value))

(defn type-arguments
  "**Returns:** `readonly Type[] | undefined`"
  ^js [tuple-type]
  (.-typeArguments ^js tuple-type))

(defn set-type-arguments!
  ^js [tuple-type value]
  (set! (.-typeArguments ^js tuple-type) value))
