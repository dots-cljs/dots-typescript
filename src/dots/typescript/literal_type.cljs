(ns dots.typescript.literal-type
  (:refer-clojure :exclude [symbol]))

(defn value
  ^js [literal-type]
  (.-value ^js literal-type))

(defn set-value!
  ^js [literal-type value]
  (set! (.-value ^js literal-type) value))

(defn fresh-type
  ^js [literal-type]
  (.-freshType ^js literal-type))

(defn set-fresh-type!
  ^js [literal-type value]
  (set! (.-freshType ^js literal-type) value))

(defn regular-type
  ^js [literal-type]
  (.-regularType ^js literal-type))

(defn set-regular-type!
  ^js [literal-type value]
  (set! (.-regularType ^js literal-type) value))

(defn flags
  ^js [literal-type]
  (.-flags ^js literal-type))

(defn set-flags!
  ^js [literal-type value]
  (set! (.-flags ^js literal-type) value))

(defn symbol
  ^js [literal-type]
  (.-symbol ^js literal-type))

(defn set-symbol!
  ^js [literal-type value]
  (set! (.-symbol ^js literal-type) value))

(defn pattern
  ^js [literal-type]
  (.-pattern ^js literal-type))

(defn set-pattern!
  ^js [literal-type value]
  (set! (.-pattern ^js literal-type) value))

(defn alias-symbol
  ^js [literal-type]
  (.-aliasSymbol ^js literal-type))

(defn set-alias-symbol!
  ^js [literal-type value]
  (set! (.-aliasSymbol ^js literal-type) value))

(defn alias-type-arguments
  ^js [literal-type]
  (.-aliasTypeArguments ^js literal-type))

(defn set-alias-type-arguments!
  ^js [literal-type value]
  (set! (.-aliasTypeArguments ^js literal-type) value))

(defn get-flags
  ^js [literal-type]
  (.getFlags ^js literal-type))

(defn get-symbol
  ^js [literal-type]
  (.getSymbol ^js literal-type))

(defn properties
  ^js [literal-type]
  (.getProperties ^js literal-type))

(defn property
  ^js [literal-type property-name]
  (.getProperty ^js literal-type property-name))

(defn apparent-properties
  ^js [literal-type]
  (.getApparentProperties ^js literal-type))

(defn call-signatures
  ^js [literal-type]
  (.getCallSignatures ^js literal-type))

(defn construct-signatures
  ^js [literal-type]
  (.getConstructSignatures ^js literal-type))

(defn string-index-type
  ^js [literal-type]
  (.getStringIndexType ^js literal-type))

(defn number-index-type
  ^js [literal-type]
  (.getNumberIndexType ^js literal-type))

(defn base-types
  ^js [literal-type]
  (.getBaseTypes ^js literal-type))

(defn non-nullable-type
  ^js [literal-type]
  (.getNonNullableType ^js literal-type))

(defn constraint
  ^js [literal-type]
  (.getConstraint ^js literal-type))

(defn default
  ^js [literal-type]
  (.getDefault ^js literal-type))

(defn union?
  ^js [literal-type]
  (.isUnion ^js literal-type))

(defn intersection?
  ^js [literal-type]
  (.isIntersection ^js literal-type))

(defn union-or-intersection?
  ^js [literal-type]
  (.isUnionOrIntersection ^js literal-type))

(defn literal?
  ^js [literal-type]
  (.isLiteral ^js literal-type))

(defn string-literal?
  ^js [literal-type]
  (.isStringLiteral ^js literal-type))

(defn number-literal?
  ^js [literal-type]
  (.isNumberLiteral ^js literal-type))

(defn type-parameter?
  ^js [literal-type]
  (.isTypeParameter ^js literal-type))

(defn class-or-interface?
  ^js [literal-type]
  (.isClassOrInterface ^js literal-type))

(defn class?
  ^js [literal-type]
  (.isClass ^js literal-type))

(defn index-type?
  ^js [literal-type]
  (.isIndexType ^js literal-type))
