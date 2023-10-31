(ns dots.typescript.index-type
  (:refer-clojure :exclude [symbol type]))

(defn type
  ^js [index-type]
  (.-type ^js index-type))

(defn set-type!
  ^js [index-type value]
  (set! (.-type ^js index-type) value))

(defn flags
  ^js [index-type]
  (.-flags ^js index-type))

(defn set-flags!
  ^js [index-type value]
  (set! (.-flags ^js index-type) value))

(defn symbol
  ^js [index-type]
  (.-symbol ^js index-type))

(defn set-symbol!
  ^js [index-type value]
  (set! (.-symbol ^js index-type) value))

(defn pattern
  ^js [index-type]
  (.-pattern ^js index-type))

(defn set-pattern!
  ^js [index-type value]
  (set! (.-pattern ^js index-type) value))

(defn alias-symbol
  ^js [index-type]
  (.-aliasSymbol ^js index-type))

(defn set-alias-symbol!
  ^js [index-type value]
  (set! (.-aliasSymbol ^js index-type) value))

(defn alias-type-arguments
  ^js [index-type]
  (.-aliasTypeArguments ^js index-type))

(defn set-alias-type-arguments!
  ^js [index-type value]
  (set! (.-aliasTypeArguments ^js index-type) value))

(defn get-flags
  ^js [index-type]
  (.getFlags ^js index-type))

(defn get-symbol
  ^js [index-type]
  (.getSymbol ^js index-type))

(defn properties
  ^js [index-type]
  (.getProperties ^js index-type))

(defn property
  ^js [index-type property-name]
  (.getProperty ^js index-type property-name))

(defn apparent-properties
  ^js [index-type]
  (.getApparentProperties ^js index-type))

(defn call-signatures
  ^js [index-type]
  (.getCallSignatures ^js index-type))

(defn construct-signatures
  ^js [index-type]
  (.getConstructSignatures ^js index-type))

(defn string-index-type
  ^js [index-type]
  (.getStringIndexType ^js index-type))

(defn number-index-type
  ^js [index-type]
  (.getNumberIndexType ^js index-type))

(defn base-types
  ^js [index-type]
  (.getBaseTypes ^js index-type))

(defn non-nullable-type
  ^js [index-type]
  (.getNonNullableType ^js index-type))

(defn constraint
  ^js [index-type]
  (.getConstraint ^js index-type))

(defn default
  ^js [index-type]
  (.getDefault ^js index-type))

(defn union?
  ^js [index-type]
  (.isUnion ^js index-type))

(defn intersection?
  ^js [index-type]
  (.isIntersection ^js index-type))

(defn union-or-intersection?
  ^js [index-type]
  (.isUnionOrIntersection ^js index-type))

(defn literal?
  ^js [index-type]
  (.isLiteral ^js index-type))

(defn string-literal?
  ^js [index-type]
  (.isStringLiteral ^js index-type))

(defn number-literal?
  ^js [index-type]
  (.isNumberLiteral ^js index-type))

(defn type-parameter?
  ^js [index-type]
  (.isTypeParameter ^js index-type))

(defn class-or-interface?
  ^js [index-type]
  (.isClassOrInterface ^js index-type))

(defn class?
  ^js [index-type]
  (.isClass ^js index-type))

(defn index-type?
  ^js [index-type]
  (.isIndexType ^js index-type))
