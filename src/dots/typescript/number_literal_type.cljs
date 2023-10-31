(ns dots.typescript.number-literal-type
  (:refer-clojure :exclude [symbol]))

(defn value
  ^js [number-literal-type]
  (.-value ^js number-literal-type))

(defn set-value!
  ^js [number-literal-type value]
  (set! (.-value ^js number-literal-type) value))

(defn fresh-type
  ^js [number-literal-type]
  (.-freshType ^js number-literal-type))

(defn set-fresh-type!
  ^js [number-literal-type value]
  (set! (.-freshType ^js number-literal-type) value))

(defn regular-type
  ^js [number-literal-type]
  (.-regularType ^js number-literal-type))

(defn set-regular-type!
  ^js [number-literal-type value]
  (set! (.-regularType ^js number-literal-type) value))

(defn flags
  ^js [number-literal-type]
  (.-flags ^js number-literal-type))

(defn set-flags!
  ^js [number-literal-type value]
  (set! (.-flags ^js number-literal-type) value))

(defn symbol
  ^js [number-literal-type]
  (.-symbol ^js number-literal-type))

(defn set-symbol!
  ^js [number-literal-type value]
  (set! (.-symbol ^js number-literal-type) value))

(defn pattern
  ^js [number-literal-type]
  (.-pattern ^js number-literal-type))

(defn set-pattern!
  ^js [number-literal-type value]
  (set! (.-pattern ^js number-literal-type) value))

(defn alias-symbol
  ^js [number-literal-type]
  (.-aliasSymbol ^js number-literal-type))

(defn set-alias-symbol!
  ^js [number-literal-type value]
  (set! (.-aliasSymbol ^js number-literal-type) value))

(defn alias-type-arguments
  ^js [number-literal-type]
  (.-aliasTypeArguments ^js number-literal-type))

(defn set-alias-type-arguments!
  ^js [number-literal-type value]
  (set! (.-aliasTypeArguments ^js number-literal-type) value))

(defn get-flags
  ^js [number-literal-type]
  (.getFlags ^js number-literal-type))

(defn get-symbol
  ^js [number-literal-type]
  (.getSymbol ^js number-literal-type))

(defn properties
  ^js [number-literal-type]
  (.getProperties ^js number-literal-type))

(defn property
  ^js [number-literal-type property-name]
  (.getProperty ^js number-literal-type property-name))

(defn apparent-properties
  ^js [number-literal-type]
  (.getApparentProperties ^js number-literal-type))

(defn call-signatures
  ^js [number-literal-type]
  (.getCallSignatures ^js number-literal-type))

(defn construct-signatures
  ^js [number-literal-type]
  (.getConstructSignatures ^js number-literal-type))

(defn string-index-type
  ^js [number-literal-type]
  (.getStringIndexType ^js number-literal-type))

(defn number-index-type
  ^js [number-literal-type]
  (.getNumberIndexType ^js number-literal-type))

(defn base-types
  ^js [number-literal-type]
  (.getBaseTypes ^js number-literal-type))

(defn non-nullable-type
  ^js [number-literal-type]
  (.getNonNullableType ^js number-literal-type))

(defn constraint
  ^js [number-literal-type]
  (.getConstraint ^js number-literal-type))

(defn default
  ^js [number-literal-type]
  (.getDefault ^js number-literal-type))

(defn union?
  ^js [number-literal-type]
  (.isUnion ^js number-literal-type))

(defn intersection?
  ^js [number-literal-type]
  (.isIntersection ^js number-literal-type))

(defn union-or-intersection?
  ^js [number-literal-type]
  (.isUnionOrIntersection ^js number-literal-type))

(defn literal?
  ^js [number-literal-type]
  (.isLiteral ^js number-literal-type))

(defn string-literal?
  ^js [number-literal-type]
  (.isStringLiteral ^js number-literal-type))

(defn number-literal?
  ^js [number-literal-type]
  (.isNumberLiteral ^js number-literal-type))

(defn type-parameter?
  ^js [number-literal-type]
  (.isTypeParameter ^js number-literal-type))

(defn class-or-interface?
  ^js [number-literal-type]
  (.isClassOrInterface ^js number-literal-type))

(defn class?
  ^js [number-literal-type]
  (.isClass ^js number-literal-type))

(defn index-type?
  ^js [number-literal-type]
  (.isIndexType ^js number-literal-type))
