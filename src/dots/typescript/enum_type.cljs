(ns dots.typescript.enum-type
  (:refer-clojure :exclude [symbol]))

(defn flags
  ^js [enum-type]
  (.-flags ^js enum-type))

(defn set-flags!
  ^js [enum-type value]
  (set! (.-flags ^js enum-type) value))

(defn symbol
  ^js [enum-type]
  (.-symbol ^js enum-type))

(defn set-symbol!
  ^js [enum-type value]
  (set! (.-symbol ^js enum-type) value))

(defn pattern
  ^js [enum-type]
  (.-pattern ^js enum-type))

(defn set-pattern!
  ^js [enum-type value]
  (set! (.-pattern ^js enum-type) value))

(defn alias-symbol
  ^js [enum-type]
  (.-aliasSymbol ^js enum-type))

(defn set-alias-symbol!
  ^js [enum-type value]
  (set! (.-aliasSymbol ^js enum-type) value))

(defn alias-type-arguments
  ^js [enum-type]
  (.-aliasTypeArguments ^js enum-type))

(defn set-alias-type-arguments!
  ^js [enum-type value]
  (set! (.-aliasTypeArguments ^js enum-type) value))

(defn get-flags
  ^js [enum-type]
  (.getFlags ^js enum-type))

(defn get-symbol
  ^js [enum-type]
  (.getSymbol ^js enum-type))

(defn properties
  ^js [enum-type]
  (.getProperties ^js enum-type))

(defn property
  ^js [enum-type property-name]
  (.getProperty ^js enum-type property-name))

(defn apparent-properties
  ^js [enum-type]
  (.getApparentProperties ^js enum-type))

(defn call-signatures
  ^js [enum-type]
  (.getCallSignatures ^js enum-type))

(defn construct-signatures
  ^js [enum-type]
  (.getConstructSignatures ^js enum-type))

(defn string-index-type
  ^js [enum-type]
  (.getStringIndexType ^js enum-type))

(defn number-index-type
  ^js [enum-type]
  (.getNumberIndexType ^js enum-type))

(defn base-types
  ^js [enum-type]
  (.getBaseTypes ^js enum-type))

(defn non-nullable-type
  ^js [enum-type]
  (.getNonNullableType ^js enum-type))

(defn constraint
  ^js [enum-type]
  (.getConstraint ^js enum-type))

(defn default
  ^js [enum-type]
  (.getDefault ^js enum-type))

(defn union?
  ^js [enum-type]
  (.isUnion ^js enum-type))

(defn intersection?
  ^js [enum-type]
  (.isIntersection ^js enum-type))

(defn union-or-intersection?
  ^js [enum-type]
  (.isUnionOrIntersection ^js enum-type))

(defn literal?
  ^js [enum-type]
  (.isLiteral ^js enum-type))

(defn string-literal?
  ^js [enum-type]
  (.isStringLiteral ^js enum-type))

(defn number-literal?
  ^js [enum-type]
  (.isNumberLiteral ^js enum-type))

(defn type-parameter?
  ^js [enum-type]
  (.isTypeParameter ^js enum-type))

(defn class-or-interface?
  ^js [enum-type]
  (.isClassOrInterface ^js enum-type))

(defn class?
  ^js [enum-type]
  (.isClass ^js enum-type))

(defn index-type?
  ^js [enum-type]
  (.isIndexType ^js enum-type))
