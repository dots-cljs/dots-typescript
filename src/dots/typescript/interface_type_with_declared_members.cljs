(ns dots.typescript.interface-type-with-declared-members
  (:refer-clojure :exclude [symbol]))

(defn declared-properties
  ^js [interface-type-with-declared-members]
  (.-declaredProperties ^js interface-type-with-declared-members))

(defn set-declared-properties!
  ^js [interface-type-with-declared-members value]
  (set! (.-declaredProperties ^js interface-type-with-declared-members) value))

(defn declared-call-signatures
  ^js [interface-type-with-declared-members]
  (.-declaredCallSignatures ^js interface-type-with-declared-members))

(defn set-declared-call-signatures!
  ^js [interface-type-with-declared-members value]
  (set! (.-declaredCallSignatures ^js interface-type-with-declared-members) value))

(defn declared-construct-signatures
  ^js [interface-type-with-declared-members]
  (.-declaredConstructSignatures ^js interface-type-with-declared-members))

(defn set-declared-construct-signatures!
  ^js [interface-type-with-declared-members value]
  (set! (.-declaredConstructSignatures ^js interface-type-with-declared-members) value))

(defn declared-index-infos
  ^js [interface-type-with-declared-members]
  (.-declaredIndexInfos ^js interface-type-with-declared-members))

(defn set-declared-index-infos!
  ^js [interface-type-with-declared-members value]
  (set! (.-declaredIndexInfos ^js interface-type-with-declared-members) value))

(defn type-parameters
  ^js [interface-type-with-declared-members]
  (.-typeParameters ^js interface-type-with-declared-members))

(defn set-type-parameters!
  ^js [interface-type-with-declared-members value]
  (set! (.-typeParameters ^js interface-type-with-declared-members) value))

(defn outer-type-parameters
  ^js [interface-type-with-declared-members]
  (.-outerTypeParameters ^js interface-type-with-declared-members))

(defn set-outer-type-parameters!
  ^js [interface-type-with-declared-members value]
  (set! (.-outerTypeParameters ^js interface-type-with-declared-members) value))

(defn local-type-parameters
  ^js [interface-type-with-declared-members]
  (.-localTypeParameters ^js interface-type-with-declared-members))

(defn set-local-type-parameters!
  ^js [interface-type-with-declared-members value]
  (set! (.-localTypeParameters ^js interface-type-with-declared-members) value))

(defn this-type
  ^js [interface-type-with-declared-members]
  (.-thisType ^js interface-type-with-declared-members))

(defn set-this-type!
  ^js [interface-type-with-declared-members value]
  (set! (.-thisType ^js interface-type-with-declared-members) value))

(defn object-flags
  ^js [interface-type-with-declared-members]
  (.-objectFlags ^js interface-type-with-declared-members))

(defn set-object-flags!
  ^js [interface-type-with-declared-members value]
  (set! (.-objectFlags ^js interface-type-with-declared-members) value))

(defn flags
  ^js [interface-type-with-declared-members]
  (.-flags ^js interface-type-with-declared-members))

(defn set-flags!
  ^js [interface-type-with-declared-members value]
  (set! (.-flags ^js interface-type-with-declared-members) value))

(defn symbol
  ^js [interface-type-with-declared-members]
  (.-symbol ^js interface-type-with-declared-members))

(defn set-symbol!
  ^js [interface-type-with-declared-members value]
  (set! (.-symbol ^js interface-type-with-declared-members) value))

(defn pattern
  ^js [interface-type-with-declared-members]
  (.-pattern ^js interface-type-with-declared-members))

(defn set-pattern!
  ^js [interface-type-with-declared-members value]
  (set! (.-pattern ^js interface-type-with-declared-members) value))

(defn alias-symbol
  ^js [interface-type-with-declared-members]
  (.-aliasSymbol ^js interface-type-with-declared-members))

(defn set-alias-symbol!
  ^js [interface-type-with-declared-members value]
  (set! (.-aliasSymbol ^js interface-type-with-declared-members) value))

(defn alias-type-arguments
  ^js [interface-type-with-declared-members]
  (.-aliasTypeArguments ^js interface-type-with-declared-members))

(defn set-alias-type-arguments!
  ^js [interface-type-with-declared-members value]
  (set! (.-aliasTypeArguments ^js interface-type-with-declared-members) value))

(defn get-flags
  "**Returns:** `TypeFlags`"
  ^js [interface-type-with-declared-members]
  (.getFlags ^js interface-type-with-declared-members))

(defn get-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [interface-type-with-declared-members]
  (.getSymbol ^js interface-type-with-declared-members))

(defn properties
  "**Returns:** `Symbol[]`"
  ^js [interface-type-with-declared-members]
  (.getProperties ^js interface-type-with-declared-members))

(defn property
  "**Parameters:**
   - `property-name`: `string`
   
   **Returns:** `Symbol | undefined`"
  ^js [interface-type-with-declared-members property-name]
  (.getProperty ^js interface-type-with-declared-members property-name))

(defn apparent-properties
  "**Returns:** `Symbol[]`"
  ^js [interface-type-with-declared-members]
  (.getApparentProperties ^js interface-type-with-declared-members))

(defn call-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [interface-type-with-declared-members]
  (.getCallSignatures ^js interface-type-with-declared-members))

(defn construct-signatures
  "**Returns:** `readonly Signature[]`"
  ^js [interface-type-with-declared-members]
  (.getConstructSignatures ^js interface-type-with-declared-members))

(defn string-index-type
  "**Returns:** `Type | undefined`"
  ^js [interface-type-with-declared-members]
  (.getStringIndexType ^js interface-type-with-declared-members))

(defn number-index-type
  "**Returns:** `Type | undefined`"
  ^js [interface-type-with-declared-members]
  (.getNumberIndexType ^js interface-type-with-declared-members))

(defn base-types
  "**Returns:** `BaseType[] | undefined`"
  ^js [interface-type-with-declared-members]
  (.getBaseTypes ^js interface-type-with-declared-members))

(defn non-nullable-type
  "**Returns:** `Type`"
  ^js [interface-type-with-declared-members]
  (.getNonNullableType ^js interface-type-with-declared-members))

(defn constraint
  "**Returns:** `Type | undefined`"
  ^js [interface-type-with-declared-members]
  (.getConstraint ^js interface-type-with-declared-members))

(defn default
  "**Returns:** `Type | undefined`"
  ^js [interface-type-with-declared-members]
  (.getDefault ^js interface-type-with-declared-members))

(defn union?
  "**Returns:** `boolean`"
  ^js [interface-type-with-declared-members]
  (.isUnion ^js interface-type-with-declared-members))

(defn intersection?
  "**Returns:** `boolean`"
  ^js [interface-type-with-declared-members]
  (.isIntersection ^js interface-type-with-declared-members))

(defn union-or-intersection?
  "**Returns:** `boolean`"
  ^js [interface-type-with-declared-members]
  (.isUnionOrIntersection ^js interface-type-with-declared-members))

(defn literal?
  "**Returns:** `boolean`"
  ^js [interface-type-with-declared-members]
  (.isLiteral ^js interface-type-with-declared-members))

(defn string-literal?
  "**Returns:** `boolean`"
  ^js [interface-type-with-declared-members]
  (.isStringLiteral ^js interface-type-with-declared-members))

(defn number-literal?
  "**Returns:** `boolean`"
  ^js [interface-type-with-declared-members]
  (.isNumberLiteral ^js interface-type-with-declared-members))

(defn type-parameter?
  "**Returns:** `boolean`"
  ^js [interface-type-with-declared-members]
  (.isTypeParameter ^js interface-type-with-declared-members))

(defn class-or-interface?
  "**Returns:** `boolean`"
  ^js [interface-type-with-declared-members]
  (.isClassOrInterface ^js interface-type-with-declared-members))

(defn class?
  "**Returns:** `boolean`"
  ^js [interface-type-with-declared-members]
  (.isClass ^js interface-type-with-declared-members))

(defn index-type?
  "**Returns:** `boolean`"
  ^js [interface-type-with-declared-members]
  (.isIndexType ^js interface-type-with-declared-members))
