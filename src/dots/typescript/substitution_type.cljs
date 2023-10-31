(ns dots.typescript.substitution-type
  (:refer-clojure :exclude [symbol]))

(defn object-flags
  ^js [substitution-type]
  (.-objectFlags ^js substitution-type))

(defn set-object-flags!
  ^js [substitution-type value]
  (set! (.-objectFlags ^js substitution-type) value))

(defn base-type
  ^js [substitution-type]
  (.-baseType ^js substitution-type))

(defn set-base-type!
  ^js [substitution-type value]
  (set! (.-baseType ^js substitution-type) value))

(defn substitute
  ^js [substitution-type]
  (.-substitute ^js substitution-type))

(defn set-substitute!
  ^js [substitution-type value]
  (set! (.-substitute ^js substitution-type) value))

(defn flags
  ^js [substitution-type]
  (.-flags ^js substitution-type))

(defn set-flags!
  ^js [substitution-type value]
  (set! (.-flags ^js substitution-type) value))

(defn symbol
  ^js [substitution-type]
  (.-symbol ^js substitution-type))

(defn set-symbol!
  ^js [substitution-type value]
  (set! (.-symbol ^js substitution-type) value))

(defn pattern
  ^js [substitution-type]
  (.-pattern ^js substitution-type))

(defn set-pattern!
  ^js [substitution-type value]
  (set! (.-pattern ^js substitution-type) value))

(defn alias-symbol
  ^js [substitution-type]
  (.-aliasSymbol ^js substitution-type))

(defn set-alias-symbol!
  ^js [substitution-type value]
  (set! (.-aliasSymbol ^js substitution-type) value))

(defn alias-type-arguments
  ^js [substitution-type]
  (.-aliasTypeArguments ^js substitution-type))

(defn set-alias-type-arguments!
  ^js [substitution-type value]
  (set! (.-aliasTypeArguments ^js substitution-type) value))

(defn get-flags
  ^js [substitution-type]
  (.getFlags ^js substitution-type))

(defn get-symbol
  ^js [substitution-type]
  (.getSymbol ^js substitution-type))

(defn properties
  ^js [substitution-type]
  (.getProperties ^js substitution-type))

(defn property
  ^js [substitution-type property-name]
  (.getProperty ^js substitution-type property-name))

(defn apparent-properties
  ^js [substitution-type]
  (.getApparentProperties ^js substitution-type))

(defn call-signatures
  ^js [substitution-type]
  (.getCallSignatures ^js substitution-type))

(defn construct-signatures
  ^js [substitution-type]
  (.getConstructSignatures ^js substitution-type))

(defn string-index-type
  ^js [substitution-type]
  (.getStringIndexType ^js substitution-type))

(defn number-index-type
  ^js [substitution-type]
  (.getNumberIndexType ^js substitution-type))

(defn base-types
  ^js [substitution-type]
  (.getBaseTypes ^js substitution-type))

(defn non-nullable-type
  ^js [substitution-type]
  (.getNonNullableType ^js substitution-type))

(defn constraint
  ^js [substitution-type]
  (.getConstraint ^js substitution-type))

(defn default
  ^js [substitution-type]
  (.getDefault ^js substitution-type))

(defn union?
  ^js [substitution-type]
  (.isUnion ^js substitution-type))

(defn intersection?
  ^js [substitution-type]
  (.isIntersection ^js substitution-type))

(defn union-or-intersection?
  ^js [substitution-type]
  (.isUnionOrIntersection ^js substitution-type))

(defn literal?
  ^js [substitution-type]
  (.isLiteral ^js substitution-type))

(defn string-literal?
  ^js [substitution-type]
  (.isStringLiteral ^js substitution-type))

(defn number-literal?
  ^js [substitution-type]
  (.isNumberLiteral ^js substitution-type))

(defn type-parameter?
  ^js [substitution-type]
  (.isTypeParameter ^js substitution-type))

(defn class-or-interface?
  ^js [substitution-type]
  (.isClassOrInterface ^js substitution-type))

(defn class?
  ^js [substitution-type]
  (.isClass ^js substitution-type))

(defn index-type?
  ^js [substitution-type]
  (.isIndexType ^js substitution-type))
