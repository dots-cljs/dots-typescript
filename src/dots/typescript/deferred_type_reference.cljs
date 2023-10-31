(ns dots.typescript.deferred-type-reference
  (:refer-clojure :exclude [symbol]))

(defn target
  ^js [deferred-type-reference]
  (.-target ^js deferred-type-reference))

(defn set-target!
  ^js [deferred-type-reference value]
  (set! (.-target ^js deferred-type-reference) value))

(defn node
  ^js [deferred-type-reference]
  (.-node ^js deferred-type-reference))

(defn set-node!
  ^js [deferred-type-reference value]
  (set! (.-node ^js deferred-type-reference) value))

(defn type-arguments
  ^js [deferred-type-reference]
  (.-typeArguments ^js deferred-type-reference))

(defn set-type-arguments!
  ^js [deferred-type-reference value]
  (set! (.-typeArguments ^js deferred-type-reference) value))

(defn object-flags
  ^js [deferred-type-reference]
  (.-objectFlags ^js deferred-type-reference))

(defn set-object-flags!
  ^js [deferred-type-reference value]
  (set! (.-objectFlags ^js deferred-type-reference) value))

(defn flags
  ^js [deferred-type-reference]
  (.-flags ^js deferred-type-reference))

(defn set-flags!
  ^js [deferred-type-reference value]
  (set! (.-flags ^js deferred-type-reference) value))

(defn symbol
  ^js [deferred-type-reference]
  (.-symbol ^js deferred-type-reference))

(defn set-symbol!
  ^js [deferred-type-reference value]
  (set! (.-symbol ^js deferred-type-reference) value))

(defn pattern
  ^js [deferred-type-reference]
  (.-pattern ^js deferred-type-reference))

(defn set-pattern!
  ^js [deferred-type-reference value]
  (set! (.-pattern ^js deferred-type-reference) value))

(defn alias-symbol
  ^js [deferred-type-reference]
  (.-aliasSymbol ^js deferred-type-reference))

(defn set-alias-symbol!
  ^js [deferred-type-reference value]
  (set! (.-aliasSymbol ^js deferred-type-reference) value))

(defn alias-type-arguments
  ^js [deferred-type-reference]
  (.-aliasTypeArguments ^js deferred-type-reference))

(defn set-alias-type-arguments!
  ^js [deferred-type-reference value]
  (set! (.-aliasTypeArguments ^js deferred-type-reference) value))

(defn get-flags
  ^js [deferred-type-reference]
  (.getFlags ^js deferred-type-reference))

(defn get-symbol
  ^js [deferred-type-reference]
  (.getSymbol ^js deferred-type-reference))

(defn properties
  ^js [deferred-type-reference]
  (.getProperties ^js deferred-type-reference))

(defn property
  ^js [deferred-type-reference property-name]
  (.getProperty ^js deferred-type-reference property-name))

(defn apparent-properties
  ^js [deferred-type-reference]
  (.getApparentProperties ^js deferred-type-reference))

(defn call-signatures
  ^js [deferred-type-reference]
  (.getCallSignatures ^js deferred-type-reference))

(defn construct-signatures
  ^js [deferred-type-reference]
  (.getConstructSignatures ^js deferred-type-reference))

(defn string-index-type
  ^js [deferred-type-reference]
  (.getStringIndexType ^js deferred-type-reference))

(defn number-index-type
  ^js [deferred-type-reference]
  (.getNumberIndexType ^js deferred-type-reference))

(defn base-types
  ^js [deferred-type-reference]
  (.getBaseTypes ^js deferred-type-reference))

(defn non-nullable-type
  ^js [deferred-type-reference]
  (.getNonNullableType ^js deferred-type-reference))

(defn constraint
  ^js [deferred-type-reference]
  (.getConstraint ^js deferred-type-reference))

(defn default
  ^js [deferred-type-reference]
  (.getDefault ^js deferred-type-reference))

(defn union?
  ^js [deferred-type-reference]
  (.isUnion ^js deferred-type-reference))

(defn intersection?
  ^js [deferred-type-reference]
  (.isIntersection ^js deferred-type-reference))

(defn union-or-intersection?
  ^js [deferred-type-reference]
  (.isUnionOrIntersection ^js deferred-type-reference))

(defn literal?
  ^js [deferred-type-reference]
  (.isLiteral ^js deferred-type-reference))

(defn string-literal?
  ^js [deferred-type-reference]
  (.isStringLiteral ^js deferred-type-reference))

(defn number-literal?
  ^js [deferred-type-reference]
  (.isNumberLiteral ^js deferred-type-reference))

(defn type-parameter?
  ^js [deferred-type-reference]
  (.isTypeParameter ^js deferred-type-reference))

(defn class-or-interface?
  ^js [deferred-type-reference]
  (.isClassOrInterface ^js deferred-type-reference))

(defn class?
  ^js [deferred-type-reference]
  (.isClass ^js deferred-type-reference))

(defn index-type?
  ^js [deferred-type-reference]
  (.isIndexType ^js deferred-type-reference))
