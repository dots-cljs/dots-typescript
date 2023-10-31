(ns dots.typescript.indexed-access-type
  (:refer-clojure :exclude [symbol]))

(defn object-type
  ^js [indexed-access-type]
  (.-objectType ^js indexed-access-type))

(defn set-object-type!
  ^js [indexed-access-type value]
  (set! (.-objectType ^js indexed-access-type) value))

(defn index-type
  ^js [indexed-access-type]
  (.-indexType ^js indexed-access-type))

(defn set-index-type!
  ^js [indexed-access-type value]
  (set! (.-indexType ^js indexed-access-type) value))

(defn constraint
  ^js [indexed-access-type]
  (.-constraint ^js indexed-access-type))

(defn set-constraint!
  ^js [indexed-access-type value]
  (set! (.-constraint ^js indexed-access-type) value))

(defn simplified-for-reading
  ^js [indexed-access-type]
  (.-simplifiedForReading ^js indexed-access-type))

(defn set-simplified-for-reading!
  ^js [indexed-access-type value]
  (set! (.-simplifiedForReading ^js indexed-access-type) value))

(defn simplified-for-writing
  ^js [indexed-access-type]
  (.-simplifiedForWriting ^js indexed-access-type))

(defn set-simplified-for-writing!
  ^js [indexed-access-type value]
  (set! (.-simplifiedForWriting ^js indexed-access-type) value))

(defn flags
  ^js [indexed-access-type]
  (.-flags ^js indexed-access-type))

(defn set-flags!
  ^js [indexed-access-type value]
  (set! (.-flags ^js indexed-access-type) value))

(defn symbol
  ^js [indexed-access-type]
  (.-symbol ^js indexed-access-type))

(defn set-symbol!
  ^js [indexed-access-type value]
  (set! (.-symbol ^js indexed-access-type) value))

(defn pattern
  ^js [indexed-access-type]
  (.-pattern ^js indexed-access-type))

(defn set-pattern!
  ^js [indexed-access-type value]
  (set! (.-pattern ^js indexed-access-type) value))

(defn alias-symbol
  ^js [indexed-access-type]
  (.-aliasSymbol ^js indexed-access-type))

(defn set-alias-symbol!
  ^js [indexed-access-type value]
  (set! (.-aliasSymbol ^js indexed-access-type) value))

(defn alias-type-arguments
  ^js [indexed-access-type]
  (.-aliasTypeArguments ^js indexed-access-type))

(defn set-alias-type-arguments!
  ^js [indexed-access-type value]
  (set! (.-aliasTypeArguments ^js indexed-access-type) value))

(defn get-flags
  ^js [indexed-access-type]
  (.getFlags ^js indexed-access-type))

(defn get-symbol
  ^js [indexed-access-type]
  (.getSymbol ^js indexed-access-type))

(defn properties
  ^js [indexed-access-type]
  (.getProperties ^js indexed-access-type))

(defn property
  ^js [indexed-access-type property-name]
  (.getProperty ^js indexed-access-type property-name))

(defn apparent-properties
  ^js [indexed-access-type]
  (.getApparentProperties ^js indexed-access-type))

(defn call-signatures
  ^js [indexed-access-type]
  (.getCallSignatures ^js indexed-access-type))

(defn construct-signatures
  ^js [indexed-access-type]
  (.getConstructSignatures ^js indexed-access-type))

(defn string-index-type
  ^js [indexed-access-type]
  (.getStringIndexType ^js indexed-access-type))

(defn number-index-type
  ^js [indexed-access-type]
  (.getNumberIndexType ^js indexed-access-type))

(defn base-types
  ^js [indexed-access-type]
  (.getBaseTypes ^js indexed-access-type))

(defn non-nullable-type
  ^js [indexed-access-type]
  (.getNonNullableType ^js indexed-access-type))

(defn get-constraint
  ^js [indexed-access-type]
  (.getConstraint ^js indexed-access-type))

(defn default
  ^js [indexed-access-type]
  (.getDefault ^js indexed-access-type))

(defn union?
  ^js [indexed-access-type]
  (.isUnion ^js indexed-access-type))

(defn intersection?
  ^js [indexed-access-type]
  (.isIntersection ^js indexed-access-type))

(defn union-or-intersection?
  ^js [indexed-access-type]
  (.isUnionOrIntersection ^js indexed-access-type))

(defn literal?
  ^js [indexed-access-type]
  (.isLiteral ^js indexed-access-type))

(defn string-literal?
  ^js [indexed-access-type]
  (.isStringLiteral ^js indexed-access-type))

(defn number-literal?
  ^js [indexed-access-type]
  (.isNumberLiteral ^js indexed-access-type))

(defn type-parameter?
  ^js [indexed-access-type]
  (.isTypeParameter ^js indexed-access-type))

(defn class-or-interface?
  ^js [indexed-access-type]
  (.isClassOrInterface ^js indexed-access-type))

(defn class?
  ^js [indexed-access-type]
  (.isClass ^js indexed-access-type))

(defn index-type?
  ^js [indexed-access-type]
  (.isIndexType ^js indexed-access-type))
