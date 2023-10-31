(ns dots.typescript.conditional-type
  (:refer-clojure :exclude [symbol]))

(defn root
  ^js [conditional-type]
  (.-root ^js conditional-type))

(defn set-root!
  ^js [conditional-type value]
  (set! (.-root ^js conditional-type) value))

(defn check-type
  ^js [conditional-type]
  (.-checkType ^js conditional-type))

(defn set-check-type!
  ^js [conditional-type value]
  (set! (.-checkType ^js conditional-type) value))

(defn extends-type
  ^js [conditional-type]
  (.-extendsType ^js conditional-type))

(defn set-extends-type!
  ^js [conditional-type value]
  (set! (.-extendsType ^js conditional-type) value))

(defn resolved-true-type
  ^js [conditional-type]
  (.-resolvedTrueType ^js conditional-type))

(defn set-resolved-true-type!
  ^js [conditional-type value]
  (set! (.-resolvedTrueType ^js conditional-type) value))

(defn resolved-false-type
  ^js [conditional-type]
  (.-resolvedFalseType ^js conditional-type))

(defn set-resolved-false-type!
  ^js [conditional-type value]
  (set! (.-resolvedFalseType ^js conditional-type) value))

(defn flags
  ^js [conditional-type]
  (.-flags ^js conditional-type))

(defn set-flags!
  ^js [conditional-type value]
  (set! (.-flags ^js conditional-type) value))

(defn symbol
  ^js [conditional-type]
  (.-symbol ^js conditional-type))

(defn set-symbol!
  ^js [conditional-type value]
  (set! (.-symbol ^js conditional-type) value))

(defn pattern
  ^js [conditional-type]
  (.-pattern ^js conditional-type))

(defn set-pattern!
  ^js [conditional-type value]
  (set! (.-pattern ^js conditional-type) value))

(defn alias-symbol
  ^js [conditional-type]
  (.-aliasSymbol ^js conditional-type))

(defn set-alias-symbol!
  ^js [conditional-type value]
  (set! (.-aliasSymbol ^js conditional-type) value))

(defn alias-type-arguments
  ^js [conditional-type]
  (.-aliasTypeArguments ^js conditional-type))

(defn set-alias-type-arguments!
  ^js [conditional-type value]
  (set! (.-aliasTypeArguments ^js conditional-type) value))

(defn get-flags
  ^js [conditional-type]
  (.getFlags ^js conditional-type))

(defn get-symbol
  ^js [conditional-type]
  (.getSymbol ^js conditional-type))

(defn properties
  ^js [conditional-type]
  (.getProperties ^js conditional-type))

(defn property
  ^js [conditional-type property-name]
  (.getProperty ^js conditional-type property-name))

(defn apparent-properties
  ^js [conditional-type]
  (.getApparentProperties ^js conditional-type))

(defn call-signatures
  ^js [conditional-type]
  (.getCallSignatures ^js conditional-type))

(defn construct-signatures
  ^js [conditional-type]
  (.getConstructSignatures ^js conditional-type))

(defn string-index-type
  ^js [conditional-type]
  (.getStringIndexType ^js conditional-type))

(defn number-index-type
  ^js [conditional-type]
  (.getNumberIndexType ^js conditional-type))

(defn base-types
  ^js [conditional-type]
  (.getBaseTypes ^js conditional-type))

(defn non-nullable-type
  ^js [conditional-type]
  (.getNonNullableType ^js conditional-type))

(defn constraint
  ^js [conditional-type]
  (.getConstraint ^js conditional-type))

(defn default
  ^js [conditional-type]
  (.getDefault ^js conditional-type))

(defn union?
  ^js [conditional-type]
  (.isUnion ^js conditional-type))

(defn intersection?
  ^js [conditional-type]
  (.isIntersection ^js conditional-type))

(defn union-or-intersection?
  ^js [conditional-type]
  (.isUnionOrIntersection ^js conditional-type))

(defn literal?
  ^js [conditional-type]
  (.isLiteral ^js conditional-type))

(defn string-literal?
  ^js [conditional-type]
  (.isStringLiteral ^js conditional-type))

(defn number-literal?
  ^js [conditional-type]
  (.isNumberLiteral ^js conditional-type))

(defn type-parameter?
  ^js [conditional-type]
  (.isTypeParameter ^js conditional-type))

(defn class-or-interface?
  ^js [conditional-type]
  (.isClassOrInterface ^js conditional-type))

(defn class?
  ^js [conditional-type]
  (.isClass ^js conditional-type))

(defn index-type?
  ^js [conditional-type]
  (.isIndexType ^js conditional-type))
