(ns dots.typescript.instantiable-type
  (:refer-clojure :exclude [symbol]))

(defn flags
  ^js [instantiable-type]
  (.-flags ^js instantiable-type))

(defn set-flags!
  ^js [instantiable-type value]
  (set! (.-flags ^js instantiable-type) value))

(defn symbol
  ^js [instantiable-type]
  (.-symbol ^js instantiable-type))

(defn set-symbol!
  ^js [instantiable-type value]
  (set! (.-symbol ^js instantiable-type) value))

(defn pattern
  ^js [instantiable-type]
  (.-pattern ^js instantiable-type))

(defn set-pattern!
  ^js [instantiable-type value]
  (set! (.-pattern ^js instantiable-type) value))

(defn alias-symbol
  ^js [instantiable-type]
  (.-aliasSymbol ^js instantiable-type))

(defn set-alias-symbol!
  ^js [instantiable-type value]
  (set! (.-aliasSymbol ^js instantiable-type) value))

(defn alias-type-arguments
  ^js [instantiable-type]
  (.-aliasTypeArguments ^js instantiable-type))

(defn set-alias-type-arguments!
  ^js [instantiable-type value]
  (set! (.-aliasTypeArguments ^js instantiable-type) value))

(defn get-flags
  ^js [instantiable-type]
  (.getFlags ^js instantiable-type))

(defn get-symbol
  ^js [instantiable-type]
  (.getSymbol ^js instantiable-type))

(defn properties
  ^js [instantiable-type]
  (.getProperties ^js instantiable-type))

(defn property
  ^js [instantiable-type property-name]
  (.getProperty ^js instantiable-type property-name))

(defn apparent-properties
  ^js [instantiable-type]
  (.getApparentProperties ^js instantiable-type))

(defn call-signatures
  ^js [instantiable-type]
  (.getCallSignatures ^js instantiable-type))

(defn construct-signatures
  ^js [instantiable-type]
  (.getConstructSignatures ^js instantiable-type))

(defn string-index-type
  ^js [instantiable-type]
  (.getStringIndexType ^js instantiable-type))

(defn number-index-type
  ^js [instantiable-type]
  (.getNumberIndexType ^js instantiable-type))

(defn base-types
  ^js [instantiable-type]
  (.getBaseTypes ^js instantiable-type))

(defn non-nullable-type
  ^js [instantiable-type]
  (.getNonNullableType ^js instantiable-type))

(defn constraint
  ^js [instantiable-type]
  (.getConstraint ^js instantiable-type))

(defn default
  ^js [instantiable-type]
  (.getDefault ^js instantiable-type))

(defn union?
  ^js [instantiable-type]
  (.isUnion ^js instantiable-type))

(defn intersection?
  ^js [instantiable-type]
  (.isIntersection ^js instantiable-type))

(defn union-or-intersection?
  ^js [instantiable-type]
  (.isUnionOrIntersection ^js instantiable-type))

(defn literal?
  ^js [instantiable-type]
  (.isLiteral ^js instantiable-type))

(defn string-literal?
  ^js [instantiable-type]
  (.isStringLiteral ^js instantiable-type))

(defn number-literal?
  ^js [instantiable-type]
  (.isNumberLiteral ^js instantiable-type))

(defn type-parameter?
  ^js [instantiable-type]
  (.isTypeParameter ^js instantiable-type))

(defn class-or-interface?
  ^js [instantiable-type]
  (.isClassOrInterface ^js instantiable-type))

(defn class?
  ^js [instantiable-type]
  (.isClass ^js instantiable-type))

(defn index-type?
  ^js [instantiable-type]
  (.isIndexType ^js instantiable-type))
