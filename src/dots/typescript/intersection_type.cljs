(ns dots.typescript.intersection-type
  (:refer-clojure :exclude [symbol]))

(defn types
  ^js [intersection-type]
  (.-types ^js intersection-type))

(defn set-types!
  ^js [intersection-type value]
  (set! (.-types ^js intersection-type) value))

(defn flags
  ^js [intersection-type]
  (.-flags ^js intersection-type))

(defn set-flags!
  ^js [intersection-type value]
  (set! (.-flags ^js intersection-type) value))

(defn symbol
  ^js [intersection-type]
  (.-symbol ^js intersection-type))

(defn set-symbol!
  ^js [intersection-type value]
  (set! (.-symbol ^js intersection-type) value))

(defn pattern
  ^js [intersection-type]
  (.-pattern ^js intersection-type))

(defn set-pattern!
  ^js [intersection-type value]
  (set! (.-pattern ^js intersection-type) value))

(defn alias-symbol
  ^js [intersection-type]
  (.-aliasSymbol ^js intersection-type))

(defn set-alias-symbol!
  ^js [intersection-type value]
  (set! (.-aliasSymbol ^js intersection-type) value))

(defn alias-type-arguments
  ^js [intersection-type]
  (.-aliasTypeArguments ^js intersection-type))

(defn set-alias-type-arguments!
  ^js [intersection-type value]
  (set! (.-aliasTypeArguments ^js intersection-type) value))

(defn get-flags
  ^js [intersection-type]
  (.getFlags ^js intersection-type))

(defn get-symbol
  ^js [intersection-type]
  (.getSymbol ^js intersection-type))

(defn properties
  ^js [intersection-type]
  (.getProperties ^js intersection-type))

(defn property
  ^js [intersection-type property-name]
  (.getProperty ^js intersection-type property-name))

(defn apparent-properties
  ^js [intersection-type]
  (.getApparentProperties ^js intersection-type))

(defn call-signatures
  ^js [intersection-type]
  (.getCallSignatures ^js intersection-type))

(defn construct-signatures
  ^js [intersection-type]
  (.getConstructSignatures ^js intersection-type))

(defn string-index-type
  ^js [intersection-type]
  (.getStringIndexType ^js intersection-type))

(defn number-index-type
  ^js [intersection-type]
  (.getNumberIndexType ^js intersection-type))

(defn base-types
  ^js [intersection-type]
  (.getBaseTypes ^js intersection-type))

(defn non-nullable-type
  ^js [intersection-type]
  (.getNonNullableType ^js intersection-type))

(defn constraint
  ^js [intersection-type]
  (.getConstraint ^js intersection-type))

(defn default
  ^js [intersection-type]
  (.getDefault ^js intersection-type))

(defn union?
  ^js [intersection-type]
  (.isUnion ^js intersection-type))

(defn intersection?
  ^js [intersection-type]
  (.isIntersection ^js intersection-type))

(defn union-or-intersection?
  ^js [intersection-type]
  (.isUnionOrIntersection ^js intersection-type))

(defn literal?
  ^js [intersection-type]
  (.isLiteral ^js intersection-type))

(defn string-literal?
  ^js [intersection-type]
  (.isStringLiteral ^js intersection-type))

(defn number-literal?
  ^js [intersection-type]
  (.isNumberLiteral ^js intersection-type))

(defn type-parameter?
  ^js [intersection-type]
  (.isTypeParameter ^js intersection-type))

(defn class-or-interface?
  ^js [intersection-type]
  (.isClassOrInterface ^js intersection-type))

(defn class?
  ^js [intersection-type]
  (.isClass ^js intersection-type))

(defn index-type?
  ^js [intersection-type]
  (.isIndexType ^js intersection-type))
