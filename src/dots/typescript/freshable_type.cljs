(ns dots.typescript.freshable-type
  (:refer-clojure :exclude [symbol]))

(defn fresh-type
  ^js [freshable-type]
  (.-freshType ^js freshable-type))

(defn set-fresh-type!
  ^js [freshable-type value]
  (set! (.-freshType ^js freshable-type) value))

(defn regular-type
  ^js [freshable-type]
  (.-regularType ^js freshable-type))

(defn set-regular-type!
  ^js [freshable-type value]
  (set! (.-regularType ^js freshable-type) value))

(defn flags
  ^js [freshable-type]
  (.-flags ^js freshable-type))

(defn set-flags!
  ^js [freshable-type value]
  (set! (.-flags ^js freshable-type) value))

(defn symbol
  ^js [freshable-type]
  (.-symbol ^js freshable-type))

(defn set-symbol!
  ^js [freshable-type value]
  (set! (.-symbol ^js freshable-type) value))

(defn pattern
  ^js [freshable-type]
  (.-pattern ^js freshable-type))

(defn set-pattern!
  ^js [freshable-type value]
  (set! (.-pattern ^js freshable-type) value))

(defn alias-symbol
  ^js [freshable-type]
  (.-aliasSymbol ^js freshable-type))

(defn set-alias-symbol!
  ^js [freshable-type value]
  (set! (.-aliasSymbol ^js freshable-type) value))

(defn alias-type-arguments
  ^js [freshable-type]
  (.-aliasTypeArguments ^js freshable-type))

(defn set-alias-type-arguments!
  ^js [freshable-type value]
  (set! (.-aliasTypeArguments ^js freshable-type) value))

(defn get-flags
  ^js [freshable-type]
  (.getFlags ^js freshable-type))

(defn get-symbol
  ^js [freshable-type]
  (.getSymbol ^js freshable-type))

(defn properties
  ^js [freshable-type]
  (.getProperties ^js freshable-type))

(defn property
  ^js [freshable-type property-name]
  (.getProperty ^js freshable-type property-name))

(defn apparent-properties
  ^js [freshable-type]
  (.getApparentProperties ^js freshable-type))

(defn call-signatures
  ^js [freshable-type]
  (.getCallSignatures ^js freshable-type))

(defn construct-signatures
  ^js [freshable-type]
  (.getConstructSignatures ^js freshable-type))

(defn string-index-type
  ^js [freshable-type]
  (.getStringIndexType ^js freshable-type))

(defn number-index-type
  ^js [freshable-type]
  (.getNumberIndexType ^js freshable-type))

(defn base-types
  ^js [freshable-type]
  (.getBaseTypes ^js freshable-type))

(defn non-nullable-type
  ^js [freshable-type]
  (.getNonNullableType ^js freshable-type))

(defn constraint
  ^js [freshable-type]
  (.getConstraint ^js freshable-type))

(defn default
  ^js [freshable-type]
  (.getDefault ^js freshable-type))

(defn union?
  ^js [freshable-type]
  (.isUnion ^js freshable-type))

(defn intersection?
  ^js [freshable-type]
  (.isIntersection ^js freshable-type))

(defn union-or-intersection?
  ^js [freshable-type]
  (.isUnionOrIntersection ^js freshable-type))

(defn literal?
  ^js [freshable-type]
  (.isLiteral ^js freshable-type))

(defn string-literal?
  ^js [freshable-type]
  (.isStringLiteral ^js freshable-type))

(defn number-literal?
  ^js [freshable-type]
  (.isNumberLiteral ^js freshable-type))

(defn type-parameter?
  ^js [freshable-type]
  (.isTypeParameter ^js freshable-type))

(defn class-or-interface?
  ^js [freshable-type]
  (.isClassOrInterface ^js freshable-type))

(defn class?
  ^js [freshable-type]
  (.isClass ^js freshable-type))

(defn index-type?
  ^js [freshable-type]
  (.isIndexType ^js freshable-type))
