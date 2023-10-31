(ns dots.typescript.big-int-literal-type
  (:refer-clojure :exclude [symbol]))

(defn value
  ^js [big-int-literal-type]
  (.-value ^js big-int-literal-type))

(defn set-value!
  ^js [big-int-literal-type value]
  (set! (.-value ^js big-int-literal-type) value))

(defn fresh-type
  ^js [big-int-literal-type]
  (.-freshType ^js big-int-literal-type))

(defn set-fresh-type!
  ^js [big-int-literal-type value]
  (set! (.-freshType ^js big-int-literal-type) value))

(defn regular-type
  ^js [big-int-literal-type]
  (.-regularType ^js big-int-literal-type))

(defn set-regular-type!
  ^js [big-int-literal-type value]
  (set! (.-regularType ^js big-int-literal-type) value))

(defn flags
  ^js [big-int-literal-type]
  (.-flags ^js big-int-literal-type))

(defn set-flags!
  ^js [big-int-literal-type value]
  (set! (.-flags ^js big-int-literal-type) value))

(defn symbol
  ^js [big-int-literal-type]
  (.-symbol ^js big-int-literal-type))

(defn set-symbol!
  ^js [big-int-literal-type value]
  (set! (.-symbol ^js big-int-literal-type) value))

(defn pattern
  ^js [big-int-literal-type]
  (.-pattern ^js big-int-literal-type))

(defn set-pattern!
  ^js [big-int-literal-type value]
  (set! (.-pattern ^js big-int-literal-type) value))

(defn alias-symbol
  ^js [big-int-literal-type]
  (.-aliasSymbol ^js big-int-literal-type))

(defn set-alias-symbol!
  ^js [big-int-literal-type value]
  (set! (.-aliasSymbol ^js big-int-literal-type) value))

(defn alias-type-arguments
  ^js [big-int-literal-type]
  (.-aliasTypeArguments ^js big-int-literal-type))

(defn set-alias-type-arguments!
  ^js [big-int-literal-type value]
  (set! (.-aliasTypeArguments ^js big-int-literal-type) value))

(defn get-flags
  ^js [big-int-literal-type]
  (.getFlags ^js big-int-literal-type))

(defn get-symbol
  ^js [big-int-literal-type]
  (.getSymbol ^js big-int-literal-type))

(defn properties
  ^js [big-int-literal-type]
  (.getProperties ^js big-int-literal-type))

(defn property
  ^js [big-int-literal-type property-name]
  (.getProperty ^js big-int-literal-type property-name))

(defn apparent-properties
  ^js [big-int-literal-type]
  (.getApparentProperties ^js big-int-literal-type))

(defn call-signatures
  ^js [big-int-literal-type]
  (.getCallSignatures ^js big-int-literal-type))

(defn construct-signatures
  ^js [big-int-literal-type]
  (.getConstructSignatures ^js big-int-literal-type))

(defn string-index-type
  ^js [big-int-literal-type]
  (.getStringIndexType ^js big-int-literal-type))

(defn number-index-type
  ^js [big-int-literal-type]
  (.getNumberIndexType ^js big-int-literal-type))

(defn base-types
  ^js [big-int-literal-type]
  (.getBaseTypes ^js big-int-literal-type))

(defn non-nullable-type
  ^js [big-int-literal-type]
  (.getNonNullableType ^js big-int-literal-type))

(defn constraint
  ^js [big-int-literal-type]
  (.getConstraint ^js big-int-literal-type))

(defn default
  ^js [big-int-literal-type]
  (.getDefault ^js big-int-literal-type))

(defn union?
  ^js [big-int-literal-type]
  (.isUnion ^js big-int-literal-type))

(defn intersection?
  ^js [big-int-literal-type]
  (.isIntersection ^js big-int-literal-type))

(defn union-or-intersection?
  ^js [big-int-literal-type]
  (.isUnionOrIntersection ^js big-int-literal-type))

(defn literal?
  ^js [big-int-literal-type]
  (.isLiteral ^js big-int-literal-type))

(defn string-literal?
  ^js [big-int-literal-type]
  (.isStringLiteral ^js big-int-literal-type))

(defn number-literal?
  ^js [big-int-literal-type]
  (.isNumberLiteral ^js big-int-literal-type))

(defn type-parameter?
  ^js [big-int-literal-type]
  (.isTypeParameter ^js big-int-literal-type))

(defn class-or-interface?
  ^js [big-int-literal-type]
  (.isClassOrInterface ^js big-int-literal-type))

(defn class?
  ^js [big-int-literal-type]
  (.isClass ^js big-int-literal-type))

(defn index-type?
  ^js [big-int-literal-type]
  (.isIndexType ^js big-int-literal-type))
