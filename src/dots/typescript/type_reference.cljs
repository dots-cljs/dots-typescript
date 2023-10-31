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
  ^js [type-reference]
  (.-target ^js type-reference))

(defn set-target!
  ^js [type-reference value]
  (set! (.-target ^js type-reference) value))

(defn node
  ^js [type-reference]
  (.-node ^js type-reference))

(defn set-node!
  ^js [type-reference value]
  (set! (.-node ^js type-reference) value))

(defn type-arguments
  ^js [type-reference]
  (.-typeArguments ^js type-reference))

(defn set-type-arguments!
  ^js [type-reference value]
  (set! (.-typeArguments ^js type-reference) value))

(defn object-flags
  ^js [type-reference]
  (.-objectFlags ^js type-reference))

(defn set-object-flags!
  ^js [type-reference value]
  (set! (.-objectFlags ^js type-reference) value))

(defn flags
  ^js [type-reference]
  (.-flags ^js type-reference))

(defn set-flags!
  ^js [type-reference value]
  (set! (.-flags ^js type-reference) value))

(defn symbol
  ^js [type-reference]
  (.-symbol ^js type-reference))

(defn set-symbol!
  ^js [type-reference value]
  (set! (.-symbol ^js type-reference) value))

(defn pattern
  ^js [type-reference]
  (.-pattern ^js type-reference))

(defn set-pattern!
  ^js [type-reference value]
  (set! (.-pattern ^js type-reference) value))

(defn alias-symbol
  ^js [type-reference]
  (.-aliasSymbol ^js type-reference))

(defn set-alias-symbol!
  ^js [type-reference value]
  (set! (.-aliasSymbol ^js type-reference) value))

(defn alias-type-arguments
  ^js [type-reference]
  (.-aliasTypeArguments ^js type-reference))

(defn set-alias-type-arguments!
  ^js [type-reference value]
  (set! (.-aliasTypeArguments ^js type-reference) value))

(defn get-flags
  ^js [type-reference]
  (.getFlags ^js type-reference))

(defn get-symbol
  ^js [type-reference]
  (.getSymbol ^js type-reference))

(defn properties
  ^js [type-reference]
  (.getProperties ^js type-reference))

(defn property
  ^js [type-reference property-name]
  (.getProperty ^js type-reference property-name))

(defn apparent-properties
  ^js [type-reference]
  (.getApparentProperties ^js type-reference))

(defn call-signatures
  ^js [type-reference]
  (.getCallSignatures ^js type-reference))

(defn construct-signatures
  ^js [type-reference]
  (.getConstructSignatures ^js type-reference))

(defn string-index-type
  ^js [type-reference]
  (.getStringIndexType ^js type-reference))

(defn number-index-type
  ^js [type-reference]
  (.getNumberIndexType ^js type-reference))

(defn base-types
  ^js [type-reference]
  (.getBaseTypes ^js type-reference))

(defn non-nullable-type
  ^js [type-reference]
  (.getNonNullableType ^js type-reference))

(defn constraint
  ^js [type-reference]
  (.getConstraint ^js type-reference))

(defn default
  ^js [type-reference]
  (.getDefault ^js type-reference))

(defn union?
  ^js [type-reference]
  (.isUnion ^js type-reference))

(defn intersection?
  ^js [type-reference]
  (.isIntersection ^js type-reference))

(defn union-or-intersection?
  ^js [type-reference]
  (.isUnionOrIntersection ^js type-reference))

(defn literal?
  ^js [type-reference]
  (.isLiteral ^js type-reference))

(defn string-literal?
  ^js [type-reference]
  (.isStringLiteral ^js type-reference))

(defn number-literal?
  ^js [type-reference]
  (.isNumberLiteral ^js type-reference))

(defn type-parameter?
  ^js [type-reference]
  (.isTypeParameter ^js type-reference))

(defn class-or-interface?
  ^js [type-reference]
  (.isClassOrInterface ^js type-reference))

(defn class?
  ^js [type-reference]
  (.isClass ^js type-reference))

(defn index-type?
  ^js [type-reference]
  (.isIndexType ^js type-reference))
