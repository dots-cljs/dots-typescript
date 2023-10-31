(ns dots.typescript.tuple-type-reference
  (:refer-clojure :exclude [symbol]))

(defn target
  ^js [tuple-type-reference]
  (.-target ^js tuple-type-reference))

(defn set-target!
  ^js [tuple-type-reference value]
  (set! (.-target ^js tuple-type-reference) value))

(defn node
  ^js [tuple-type-reference]
  (.-node ^js tuple-type-reference))

(defn set-node!
  ^js [tuple-type-reference value]
  (set! (.-node ^js tuple-type-reference) value))

(defn type-arguments
  ^js [tuple-type-reference]
  (.-typeArguments ^js tuple-type-reference))

(defn set-type-arguments!
  ^js [tuple-type-reference value]
  (set! (.-typeArguments ^js tuple-type-reference) value))

(defn object-flags
  ^js [tuple-type-reference]
  (.-objectFlags ^js tuple-type-reference))

(defn set-object-flags!
  ^js [tuple-type-reference value]
  (set! (.-objectFlags ^js tuple-type-reference) value))

(defn flags
  ^js [tuple-type-reference]
  (.-flags ^js tuple-type-reference))

(defn set-flags!
  ^js [tuple-type-reference value]
  (set! (.-flags ^js tuple-type-reference) value))

(defn symbol
  ^js [tuple-type-reference]
  (.-symbol ^js tuple-type-reference))

(defn set-symbol!
  ^js [tuple-type-reference value]
  (set! (.-symbol ^js tuple-type-reference) value))

(defn pattern
  ^js [tuple-type-reference]
  (.-pattern ^js tuple-type-reference))

(defn set-pattern!
  ^js [tuple-type-reference value]
  (set! (.-pattern ^js tuple-type-reference) value))

(defn alias-symbol
  ^js [tuple-type-reference]
  (.-aliasSymbol ^js tuple-type-reference))

(defn set-alias-symbol!
  ^js [tuple-type-reference value]
  (set! (.-aliasSymbol ^js tuple-type-reference) value))

(defn alias-type-arguments
  ^js [tuple-type-reference]
  (.-aliasTypeArguments ^js tuple-type-reference))

(defn set-alias-type-arguments!
  ^js [tuple-type-reference value]
  (set! (.-aliasTypeArguments ^js tuple-type-reference) value))

(defn get-flags
  ^js [tuple-type-reference]
  (.getFlags ^js tuple-type-reference))

(defn get-symbol
  ^js [tuple-type-reference]
  (.getSymbol ^js tuple-type-reference))

(defn properties
  ^js [tuple-type-reference]
  (.getProperties ^js tuple-type-reference))

(defn property
  ^js [tuple-type-reference property-name]
  (.getProperty ^js tuple-type-reference property-name))

(defn apparent-properties
  ^js [tuple-type-reference]
  (.getApparentProperties ^js tuple-type-reference))

(defn call-signatures
  ^js [tuple-type-reference]
  (.getCallSignatures ^js tuple-type-reference))

(defn construct-signatures
  ^js [tuple-type-reference]
  (.getConstructSignatures ^js tuple-type-reference))

(defn string-index-type
  ^js [tuple-type-reference]
  (.getStringIndexType ^js tuple-type-reference))

(defn number-index-type
  ^js [tuple-type-reference]
  (.getNumberIndexType ^js tuple-type-reference))

(defn base-types
  ^js [tuple-type-reference]
  (.getBaseTypes ^js tuple-type-reference))

(defn non-nullable-type
  ^js [tuple-type-reference]
  (.getNonNullableType ^js tuple-type-reference))

(defn constraint
  ^js [tuple-type-reference]
  (.getConstraint ^js tuple-type-reference))

(defn default
  ^js [tuple-type-reference]
  (.getDefault ^js tuple-type-reference))

(defn union?
  ^js [tuple-type-reference]
  (.isUnion ^js tuple-type-reference))

(defn intersection?
  ^js [tuple-type-reference]
  (.isIntersection ^js tuple-type-reference))

(defn union-or-intersection?
  ^js [tuple-type-reference]
  (.isUnionOrIntersection ^js tuple-type-reference))

(defn literal?
  ^js [tuple-type-reference]
  (.isLiteral ^js tuple-type-reference))

(defn string-literal?
  ^js [tuple-type-reference]
  (.isStringLiteral ^js tuple-type-reference))

(defn number-literal?
  ^js [tuple-type-reference]
  (.isNumberLiteral ^js tuple-type-reference))

(defn type-parameter?
  ^js [tuple-type-reference]
  (.isTypeParameter ^js tuple-type-reference))

(defn class-or-interface?
  ^js [tuple-type-reference]
  (.isClassOrInterface ^js tuple-type-reference))

(defn class?
  ^js [tuple-type-reference]
  (.isClass ^js tuple-type-reference))

(defn index-type?
  ^js [tuple-type-reference]
  (.isIndexType ^js tuple-type-reference))
