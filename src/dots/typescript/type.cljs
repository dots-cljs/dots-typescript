(ns dots.typescript.type
  (:refer-clojure :exclude [symbol]))

(defn flags
  ^js [type]
  (.-flags ^js type))

(defn set-flags!
  ^js [type value]
  (set! (.-flags ^js type) value))

(defn symbol
  ^js [type]
  (.-symbol ^js type))

(defn set-symbol!
  ^js [type value]
  (set! (.-symbol ^js type) value))

(defn pattern
  ^js [type]
  (.-pattern ^js type))

(defn set-pattern!
  ^js [type value]
  (set! (.-pattern ^js type) value))

(defn alias-symbol
  ^js [type]
  (.-aliasSymbol ^js type))

(defn set-alias-symbol!
  ^js [type value]
  (set! (.-aliasSymbol ^js type) value))

(defn alias-type-arguments
  ^js [type]
  (.-aliasTypeArguments ^js type))

(defn set-alias-type-arguments!
  ^js [type value]
  (set! (.-aliasTypeArguments ^js type) value))

(defn get-flags
  ^js [type]
  (.getFlags ^js type))

(defn get-symbol
  ^js [type]
  (.getSymbol ^js type))

(defn properties
  ^js [type]
  (.getProperties ^js type))

(defn property
  ^js [type property-name]
  (.getProperty ^js type property-name))

(defn apparent-properties
  ^js [type]
  (.getApparentProperties ^js type))

(defn call-signatures
  ^js [type]
  (.getCallSignatures ^js type))

(defn construct-signatures
  ^js [type]
  (.getConstructSignatures ^js type))

(defn string-index-type
  ^js [type]
  (.getStringIndexType ^js type))

(defn number-index-type
  ^js [type]
  (.getNumberIndexType ^js type))

(defn base-types
  ^js [type]
  (.getBaseTypes ^js type))

(defn non-nullable-type
  ^js [type]
  (.getNonNullableType ^js type))

(defn constraint
  ^js [type]
  (.getConstraint ^js type))

(defn default
  ^js [type]
  (.getDefault ^js type))

(defn union?
  ^js [type]
  (.isUnion ^js type))

(defn intersection?
  ^js [type]
  (.isIntersection ^js type))

(defn union-or-intersection?
  ^js [type]
  (.isUnionOrIntersection ^js type))

(defn literal?
  ^js [type]
  (.isLiteral ^js type))

(defn string-literal?
  ^js [type]
  (.isStringLiteral ^js type))

(defn number-literal?
  ^js [type]
  (.isNumberLiteral ^js type))

(defn type-parameter?
  ^js [type]
  (.isTypeParameter ^js type))

(defn class-or-interface?
  ^js [type]
  (.isClassOrInterface ^js type))

(defn class?
  ^js [type]
  (.isClass ^js type))

(defn index-type?
  ^js [type]
  (.isIndexType ^js type))
