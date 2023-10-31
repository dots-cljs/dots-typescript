(ns dots.typescript.string-mapping-type
  (:refer-clojure :exclude [symbol type]))

(defn symbol
  ^js [string-mapping-type]
  (.-symbol ^js string-mapping-type))

(defn set-symbol!
  ^js [string-mapping-type value]
  (set! (.-symbol ^js string-mapping-type) value))

(defn type
  ^js [string-mapping-type]
  (.-type ^js string-mapping-type))

(defn set-type!
  ^js [string-mapping-type value]
  (set! (.-type ^js string-mapping-type) value))

(defn flags
  ^js [string-mapping-type]
  (.-flags ^js string-mapping-type))

(defn set-flags!
  ^js [string-mapping-type value]
  (set! (.-flags ^js string-mapping-type) value))

(defn pattern
  ^js [string-mapping-type]
  (.-pattern ^js string-mapping-type))

(defn set-pattern!
  ^js [string-mapping-type value]
  (set! (.-pattern ^js string-mapping-type) value))

(defn alias-symbol
  ^js [string-mapping-type]
  (.-aliasSymbol ^js string-mapping-type))

(defn set-alias-symbol!
  ^js [string-mapping-type value]
  (set! (.-aliasSymbol ^js string-mapping-type) value))

(defn alias-type-arguments
  ^js [string-mapping-type]
  (.-aliasTypeArguments ^js string-mapping-type))

(defn set-alias-type-arguments!
  ^js [string-mapping-type value]
  (set! (.-aliasTypeArguments ^js string-mapping-type) value))

(defn get-flags
  ^js [string-mapping-type]
  (.getFlags ^js string-mapping-type))

(defn get-symbol
  ^js [string-mapping-type]
  (.getSymbol ^js string-mapping-type))

(defn properties
  ^js [string-mapping-type]
  (.getProperties ^js string-mapping-type))

(defn property
  ^js [string-mapping-type property-name]
  (.getProperty ^js string-mapping-type property-name))

(defn apparent-properties
  ^js [string-mapping-type]
  (.getApparentProperties ^js string-mapping-type))

(defn call-signatures
  ^js [string-mapping-type]
  (.getCallSignatures ^js string-mapping-type))

(defn construct-signatures
  ^js [string-mapping-type]
  (.getConstructSignatures ^js string-mapping-type))

(defn string-index-type
  ^js [string-mapping-type]
  (.getStringIndexType ^js string-mapping-type))

(defn number-index-type
  ^js [string-mapping-type]
  (.getNumberIndexType ^js string-mapping-type))

(defn base-types
  ^js [string-mapping-type]
  (.getBaseTypes ^js string-mapping-type))

(defn non-nullable-type
  ^js [string-mapping-type]
  (.getNonNullableType ^js string-mapping-type))

(defn constraint
  ^js [string-mapping-type]
  (.getConstraint ^js string-mapping-type))

(defn default
  ^js [string-mapping-type]
  (.getDefault ^js string-mapping-type))

(defn union?
  ^js [string-mapping-type]
  (.isUnion ^js string-mapping-type))

(defn intersection?
  ^js [string-mapping-type]
  (.isIntersection ^js string-mapping-type))

(defn union-or-intersection?
  ^js [string-mapping-type]
  (.isUnionOrIntersection ^js string-mapping-type))

(defn literal?
  ^js [string-mapping-type]
  (.isLiteral ^js string-mapping-type))

(defn string-literal?
  ^js [string-mapping-type]
  (.isStringLiteral ^js string-mapping-type))

(defn number-literal?
  ^js [string-mapping-type]
  (.isNumberLiteral ^js string-mapping-type))

(defn type-parameter?
  ^js [string-mapping-type]
  (.isTypeParameter ^js string-mapping-type))

(defn class-or-interface?
  ^js [string-mapping-type]
  (.isClassOrInterface ^js string-mapping-type))

(defn class?
  ^js [string-mapping-type]
  (.isClass ^js string-mapping-type))

(defn index-type?
  ^js [string-mapping-type]
  (.isIndexType ^js string-mapping-type))
