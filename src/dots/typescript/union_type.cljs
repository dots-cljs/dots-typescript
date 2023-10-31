(ns dots.typescript.union-type
  (:refer-clojure :exclude [symbol]))

(defn types
  ^js [union-type]
  (.-types ^js union-type))

(defn set-types!
  ^js [union-type value]
  (set! (.-types ^js union-type) value))

(defn flags
  ^js [union-type]
  (.-flags ^js union-type))

(defn set-flags!
  ^js [union-type value]
  (set! (.-flags ^js union-type) value))

(defn symbol
  ^js [union-type]
  (.-symbol ^js union-type))

(defn set-symbol!
  ^js [union-type value]
  (set! (.-symbol ^js union-type) value))

(defn pattern
  ^js [union-type]
  (.-pattern ^js union-type))

(defn set-pattern!
  ^js [union-type value]
  (set! (.-pattern ^js union-type) value))

(defn alias-symbol
  ^js [union-type]
  (.-aliasSymbol ^js union-type))

(defn set-alias-symbol!
  ^js [union-type value]
  (set! (.-aliasSymbol ^js union-type) value))

(defn alias-type-arguments
  ^js [union-type]
  (.-aliasTypeArguments ^js union-type))

(defn set-alias-type-arguments!
  ^js [union-type value]
  (set! (.-aliasTypeArguments ^js union-type) value))

(defn get-flags
  ^js [union-type]
  (.getFlags ^js union-type))

(defn get-symbol
  ^js [union-type]
  (.getSymbol ^js union-type))

(defn properties
  ^js [union-type]
  (.getProperties ^js union-type))

(defn property
  ^js [union-type property-name]
  (.getProperty ^js union-type property-name))

(defn apparent-properties
  ^js [union-type]
  (.getApparentProperties ^js union-type))

(defn call-signatures
  ^js [union-type]
  (.getCallSignatures ^js union-type))

(defn construct-signatures
  ^js [union-type]
  (.getConstructSignatures ^js union-type))

(defn string-index-type
  ^js [union-type]
  (.getStringIndexType ^js union-type))

(defn number-index-type
  ^js [union-type]
  (.getNumberIndexType ^js union-type))

(defn base-types
  ^js [union-type]
  (.getBaseTypes ^js union-type))

(defn non-nullable-type
  ^js [union-type]
  (.getNonNullableType ^js union-type))

(defn constraint
  ^js [union-type]
  (.getConstraint ^js union-type))

(defn default
  ^js [union-type]
  (.getDefault ^js union-type))

(defn union?
  ^js [union-type]
  (.isUnion ^js union-type))

(defn intersection?
  ^js [union-type]
  (.isIntersection ^js union-type))

(defn union-or-intersection?
  ^js [union-type]
  (.isUnionOrIntersection ^js union-type))

(defn literal?
  ^js [union-type]
  (.isLiteral ^js union-type))

(defn string-literal?
  ^js [union-type]
  (.isStringLiteral ^js union-type))

(defn number-literal?
  ^js [union-type]
  (.isNumberLiteral ^js union-type))

(defn type-parameter?
  ^js [union-type]
  (.isTypeParameter ^js union-type))

(defn class-or-interface?
  ^js [union-type]
  (.isClassOrInterface ^js union-type))

(defn class?
  ^js [union-type]
  (.isClass ^js union-type))

(defn index-type?
  ^js [union-type]
  (.isIndexType ^js union-type))
