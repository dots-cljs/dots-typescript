(ns dots.typescript.generic-type
  (:refer-clojure :exclude [symbol]))

(defn type-parameters
  ^js [generic-type]
  (.-typeParameters ^js generic-type))

(defn set-type-parameters!
  ^js [generic-type value]
  (set! (.-typeParameters ^js generic-type) value))

(defn outer-type-parameters
  ^js [generic-type]
  (.-outerTypeParameters ^js generic-type))

(defn set-outer-type-parameters!
  ^js [generic-type value]
  (set! (.-outerTypeParameters ^js generic-type) value))

(defn local-type-parameters
  ^js [generic-type]
  (.-localTypeParameters ^js generic-type))

(defn set-local-type-parameters!
  ^js [generic-type value]
  (set! (.-localTypeParameters ^js generic-type) value))

(defn this-type
  ^js [generic-type]
  (.-thisType ^js generic-type))

(defn set-this-type!
  ^js [generic-type value]
  (set! (.-thisType ^js generic-type) value))

(defn object-flags
  ^js [generic-type]
  (.-objectFlags ^js generic-type))

(defn set-object-flags!
  ^js [generic-type value]
  (set! (.-objectFlags ^js generic-type) value))

(defn flags
  ^js [generic-type]
  (.-flags ^js generic-type))

(defn set-flags!
  ^js [generic-type value]
  (set! (.-flags ^js generic-type) value))

(defn symbol
  ^js [generic-type]
  (.-symbol ^js generic-type))

(defn set-symbol!
  ^js [generic-type value]
  (set! (.-symbol ^js generic-type) value))

(defn pattern
  ^js [generic-type]
  (.-pattern ^js generic-type))

(defn set-pattern!
  ^js [generic-type value]
  (set! (.-pattern ^js generic-type) value))

(defn alias-symbol
  ^js [generic-type]
  (.-aliasSymbol ^js generic-type))

(defn set-alias-symbol!
  ^js [generic-type value]
  (set! (.-aliasSymbol ^js generic-type) value))

(defn alias-type-arguments
  ^js [generic-type]
  (.-aliasTypeArguments ^js generic-type))

(defn set-alias-type-arguments!
  ^js [generic-type value]
  (set! (.-aliasTypeArguments ^js generic-type) value))

(defn get-flags
  ^js [generic-type]
  (.getFlags ^js generic-type))

(defn get-symbol
  ^js [generic-type]
  (.getSymbol ^js generic-type))

(defn properties
  ^js [generic-type]
  (.getProperties ^js generic-type))

(defn property
  ^js [generic-type property-name]
  (.getProperty ^js generic-type property-name))

(defn apparent-properties
  ^js [generic-type]
  (.getApparentProperties ^js generic-type))

(defn call-signatures
  ^js [generic-type]
  (.getCallSignatures ^js generic-type))

(defn construct-signatures
  ^js [generic-type]
  (.getConstructSignatures ^js generic-type))

(defn string-index-type
  ^js [generic-type]
  (.getStringIndexType ^js generic-type))

(defn number-index-type
  ^js [generic-type]
  (.getNumberIndexType ^js generic-type))

(defn base-types
  ^js [generic-type]
  (.getBaseTypes ^js generic-type))

(defn non-nullable-type
  ^js [generic-type]
  (.getNonNullableType ^js generic-type))

(defn constraint
  ^js [generic-type]
  (.getConstraint ^js generic-type))

(defn default
  ^js [generic-type]
  (.getDefault ^js generic-type))

(defn union?
  ^js [generic-type]
  (.isUnion ^js generic-type))

(defn intersection?
  ^js [generic-type]
  (.isIntersection ^js generic-type))

(defn union-or-intersection?
  ^js [generic-type]
  (.isUnionOrIntersection ^js generic-type))

(defn literal?
  ^js [generic-type]
  (.isLiteral ^js generic-type))

(defn string-literal?
  ^js [generic-type]
  (.isStringLiteral ^js generic-type))

(defn number-literal?
  ^js [generic-type]
  (.isNumberLiteral ^js generic-type))

(defn type-parameter?
  ^js [generic-type]
  (.isTypeParameter ^js generic-type))

(defn class-or-interface?
  ^js [generic-type]
  (.isClassOrInterface ^js generic-type))

(defn class?
  ^js [generic-type]
  (.isClass ^js generic-type))

(defn index-type?
  ^js [generic-type]
  (.isIndexType ^js generic-type))

(defn target
  ^js [generic-type]
  (.-target ^js generic-type))

(defn set-target!
  ^js [generic-type value]
  (set! (.-target ^js generic-type) value))

(defn node
  ^js [generic-type]
  (.-node ^js generic-type))

(defn set-node!
  ^js [generic-type value]
  (set! (.-node ^js generic-type) value))

(defn type-arguments
  ^js [generic-type]
  (.-typeArguments ^js generic-type))

(defn set-type-arguments!
  ^js [generic-type value]
  (set! (.-typeArguments ^js generic-type) value))
