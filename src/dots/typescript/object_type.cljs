(ns dots.typescript.object-type
  (:refer-clojure :exclude [symbol]))

(defn object-flags
  ^js [object-type]
  (.-objectFlags ^js object-type))

(defn set-object-flags!
  ^js [object-type value]
  (set! (.-objectFlags ^js object-type) value))

(defn flags
  ^js [object-type]
  (.-flags ^js object-type))

(defn set-flags!
  ^js [object-type value]
  (set! (.-flags ^js object-type) value))

(defn symbol
  ^js [object-type]
  (.-symbol ^js object-type))

(defn set-symbol!
  ^js [object-type value]
  (set! (.-symbol ^js object-type) value))

(defn pattern
  ^js [object-type]
  (.-pattern ^js object-type))

(defn set-pattern!
  ^js [object-type value]
  (set! (.-pattern ^js object-type) value))

(defn alias-symbol
  ^js [object-type]
  (.-aliasSymbol ^js object-type))

(defn set-alias-symbol!
  ^js [object-type value]
  (set! (.-aliasSymbol ^js object-type) value))

(defn alias-type-arguments
  ^js [object-type]
  (.-aliasTypeArguments ^js object-type))

(defn set-alias-type-arguments!
  ^js [object-type value]
  (set! (.-aliasTypeArguments ^js object-type) value))

(defn get-flags
  ^js [object-type]
  (.getFlags ^js object-type))

(defn get-symbol
  ^js [object-type]
  (.getSymbol ^js object-type))

(defn properties
  ^js [object-type]
  (.getProperties ^js object-type))

(defn property
  ^js [object-type property-name]
  (.getProperty ^js object-type property-name))

(defn apparent-properties
  ^js [object-type]
  (.getApparentProperties ^js object-type))

(defn call-signatures
  ^js [object-type]
  (.getCallSignatures ^js object-type))

(defn construct-signatures
  ^js [object-type]
  (.getConstructSignatures ^js object-type))

(defn string-index-type
  ^js [object-type]
  (.getStringIndexType ^js object-type))

(defn number-index-type
  ^js [object-type]
  (.getNumberIndexType ^js object-type))

(defn base-types
  ^js [object-type]
  (.getBaseTypes ^js object-type))

(defn non-nullable-type
  ^js [object-type]
  (.getNonNullableType ^js object-type))

(defn constraint
  ^js [object-type]
  (.getConstraint ^js object-type))

(defn default
  ^js [object-type]
  (.getDefault ^js object-type))

(defn union?
  ^js [object-type]
  (.isUnion ^js object-type))

(defn intersection?
  ^js [object-type]
  (.isIntersection ^js object-type))

(defn union-or-intersection?
  ^js [object-type]
  (.isUnionOrIntersection ^js object-type))

(defn literal?
  ^js [object-type]
  (.isLiteral ^js object-type))

(defn string-literal?
  ^js [object-type]
  (.isStringLiteral ^js object-type))

(defn number-literal?
  ^js [object-type]
  (.isNumberLiteral ^js object-type))

(defn type-parameter?
  ^js [object-type]
  (.isTypeParameter ^js object-type))

(defn class-or-interface?
  ^js [object-type]
  (.isClassOrInterface ^js object-type))

(defn class?
  ^js [object-type]
  (.isClass ^js object-type))

(defn index-type?
  ^js [object-type]
  (.isIndexType ^js object-type))
