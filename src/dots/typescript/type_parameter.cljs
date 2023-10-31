(ns dots.typescript.type-parameter
  (:refer-clojure :exclude [symbol]))

(defn flags
  ^js [type-parameter]
  (.-flags ^js type-parameter))

(defn set-flags!
  ^js [type-parameter value]
  (set! (.-flags ^js type-parameter) value))

(defn symbol
  ^js [type-parameter]
  (.-symbol ^js type-parameter))

(defn set-symbol!
  ^js [type-parameter value]
  (set! (.-symbol ^js type-parameter) value))

(defn pattern
  ^js [type-parameter]
  (.-pattern ^js type-parameter))

(defn set-pattern!
  ^js [type-parameter value]
  (set! (.-pattern ^js type-parameter) value))

(defn alias-symbol
  ^js [type-parameter]
  (.-aliasSymbol ^js type-parameter))

(defn set-alias-symbol!
  ^js [type-parameter value]
  (set! (.-aliasSymbol ^js type-parameter) value))

(defn alias-type-arguments
  ^js [type-parameter]
  (.-aliasTypeArguments ^js type-parameter))

(defn set-alias-type-arguments!
  ^js [type-parameter value]
  (set! (.-aliasTypeArguments ^js type-parameter) value))

(defn get-flags
  ^js [type-parameter]
  (.getFlags ^js type-parameter))

(defn get-symbol
  ^js [type-parameter]
  (.getSymbol ^js type-parameter))

(defn properties
  ^js [type-parameter]
  (.getProperties ^js type-parameter))

(defn property
  ^js [type-parameter property-name]
  (.getProperty ^js type-parameter property-name))

(defn apparent-properties
  ^js [type-parameter]
  (.getApparentProperties ^js type-parameter))

(defn call-signatures
  ^js [type-parameter]
  (.getCallSignatures ^js type-parameter))

(defn construct-signatures
  ^js [type-parameter]
  (.getConstructSignatures ^js type-parameter))

(defn string-index-type
  ^js [type-parameter]
  (.getStringIndexType ^js type-parameter))

(defn number-index-type
  ^js [type-parameter]
  (.getNumberIndexType ^js type-parameter))

(defn base-types
  ^js [type-parameter]
  (.getBaseTypes ^js type-parameter))

(defn non-nullable-type
  ^js [type-parameter]
  (.getNonNullableType ^js type-parameter))

(defn constraint
  ^js [type-parameter]
  (.getConstraint ^js type-parameter))

(defn default
  ^js [type-parameter]
  (.getDefault ^js type-parameter))

(defn union?
  ^js [type-parameter]
  (.isUnion ^js type-parameter))

(defn intersection?
  ^js [type-parameter]
  (.isIntersection ^js type-parameter))

(defn union-or-intersection?
  ^js [type-parameter]
  (.isUnionOrIntersection ^js type-parameter))

(defn literal?
  ^js [type-parameter]
  (.isLiteral ^js type-parameter))

(defn string-literal?
  ^js [type-parameter]
  (.isStringLiteral ^js type-parameter))

(defn number-literal?
  ^js [type-parameter]
  (.isNumberLiteral ^js type-parameter))

(defn type-parameter?
  ^js [type-parameter]
  (.isTypeParameter ^js type-parameter))

(defn class-or-interface?
  ^js [type-parameter]
  (.isClassOrInterface ^js type-parameter))

(defn class?
  ^js [type-parameter]
  (.isClass ^js type-parameter))

(defn index-type?
  ^js [type-parameter]
  (.isIndexType ^js type-parameter))
