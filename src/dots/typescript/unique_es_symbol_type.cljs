(ns dots.typescript.unique-es-symbol-type
  (:refer-clojure :exclude [symbol]))

(defn symbol
  ^js [unique-es-symbol-type]
  (.-symbol ^js unique-es-symbol-type))

(defn set-symbol!
  ^js [unique-es-symbol-type value]
  (set! (.-symbol ^js unique-es-symbol-type) value))

(defn escaped-name
  ^js [unique-es-symbol-type]
  (.-escapedName ^js unique-es-symbol-type))

(defn set-escaped-name!
  ^js [unique-es-symbol-type value]
  (set! (.-escapedName ^js unique-es-symbol-type) value))

(defn flags
  ^js [unique-es-symbol-type]
  (.-flags ^js unique-es-symbol-type))

(defn set-flags!
  ^js [unique-es-symbol-type value]
  (set! (.-flags ^js unique-es-symbol-type) value))

(defn pattern
  ^js [unique-es-symbol-type]
  (.-pattern ^js unique-es-symbol-type))

(defn set-pattern!
  ^js [unique-es-symbol-type value]
  (set! (.-pattern ^js unique-es-symbol-type) value))

(defn alias-symbol
  ^js [unique-es-symbol-type]
  (.-aliasSymbol ^js unique-es-symbol-type))

(defn set-alias-symbol!
  ^js [unique-es-symbol-type value]
  (set! (.-aliasSymbol ^js unique-es-symbol-type) value))

(defn alias-type-arguments
  ^js [unique-es-symbol-type]
  (.-aliasTypeArguments ^js unique-es-symbol-type))

(defn set-alias-type-arguments!
  ^js [unique-es-symbol-type value]
  (set! (.-aliasTypeArguments ^js unique-es-symbol-type) value))

(defn get-flags
  ^js [unique-es-symbol-type]
  (.getFlags ^js unique-es-symbol-type))

(defn get-symbol
  ^js [unique-es-symbol-type]
  (.getSymbol ^js unique-es-symbol-type))

(defn properties
  ^js [unique-es-symbol-type]
  (.getProperties ^js unique-es-symbol-type))

(defn property
  ^js [unique-es-symbol-type property-name]
  (.getProperty ^js unique-es-symbol-type property-name))

(defn apparent-properties
  ^js [unique-es-symbol-type]
  (.getApparentProperties ^js unique-es-symbol-type))

(defn call-signatures
  ^js [unique-es-symbol-type]
  (.getCallSignatures ^js unique-es-symbol-type))

(defn construct-signatures
  ^js [unique-es-symbol-type]
  (.getConstructSignatures ^js unique-es-symbol-type))

(defn string-index-type
  ^js [unique-es-symbol-type]
  (.getStringIndexType ^js unique-es-symbol-type))

(defn number-index-type
  ^js [unique-es-symbol-type]
  (.getNumberIndexType ^js unique-es-symbol-type))

(defn base-types
  ^js [unique-es-symbol-type]
  (.getBaseTypes ^js unique-es-symbol-type))

(defn non-nullable-type
  ^js [unique-es-symbol-type]
  (.getNonNullableType ^js unique-es-symbol-type))

(defn constraint
  ^js [unique-es-symbol-type]
  (.getConstraint ^js unique-es-symbol-type))

(defn default
  ^js [unique-es-symbol-type]
  (.getDefault ^js unique-es-symbol-type))

(defn union?
  ^js [unique-es-symbol-type]
  (.isUnion ^js unique-es-symbol-type))

(defn intersection?
  ^js [unique-es-symbol-type]
  (.isIntersection ^js unique-es-symbol-type))

(defn union-or-intersection?
  ^js [unique-es-symbol-type]
  (.isUnionOrIntersection ^js unique-es-symbol-type))

(defn literal?
  ^js [unique-es-symbol-type]
  (.isLiteral ^js unique-es-symbol-type))

(defn string-literal?
  ^js [unique-es-symbol-type]
  (.isStringLiteral ^js unique-es-symbol-type))

(defn number-literal?
  ^js [unique-es-symbol-type]
  (.isNumberLiteral ^js unique-es-symbol-type))

(defn type-parameter?
  ^js [unique-es-symbol-type]
  (.isTypeParameter ^js unique-es-symbol-type))

(defn class-or-interface?
  ^js [unique-es-symbol-type]
  (.isClassOrInterface ^js unique-es-symbol-type))

(defn class?
  ^js [unique-es-symbol-type]
  (.isClass ^js unique-es-symbol-type))

(defn index-type?
  ^js [unique-es-symbol-type]
  (.isIndexType ^js unique-es-symbol-type))
