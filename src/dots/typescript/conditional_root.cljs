(ns dots.typescript.conditional-root)

(defn node
  "**Returns:** `ConditionalTypeNode`"
  ^js [conditional-root]
  (.-node ^js conditional-root))

(defn set-node!
  ^js [conditional-root value]
  (set! (.-node ^js conditional-root) value))

(defn check-type
  "**Returns:** `Type`"
  ^js [conditional-root]
  (.-checkType ^js conditional-root))

(defn set-check-type!
  ^js [conditional-root value]
  (set! (.-checkType ^js conditional-root) value))

(defn extends-type
  "**Returns:** `Type`"
  ^js [conditional-root]
  (.-extendsType ^js conditional-root))

(defn set-extends-type!
  ^js [conditional-root value]
  (set! (.-extendsType ^js conditional-root) value))

(defn distributive?
  "**Returns:** `boolean`"
  ^js [conditional-root]
  (.-isDistributive ^js conditional-root))

(defn set-is-distributive!
  ^js [conditional-root value]
  (set! (.-isDistributive ^js conditional-root) value))

(defn infer-type-parameters
  "**Returns:** `TypeParameter[] | undefined`"
  ^js [conditional-root]
  (.-inferTypeParameters ^js conditional-root))

(defn set-infer-type-parameters!
  ^js [conditional-root value]
  (set! (.-inferTypeParameters ^js conditional-root) value))

(defn outer-type-parameters
  "**Returns:** `TypeParameter[] | undefined`"
  ^js [conditional-root]
  (.-outerTypeParameters ^js conditional-root))

(defn set-outer-type-parameters!
  ^js [conditional-root value]
  (set! (.-outerTypeParameters ^js conditional-root) value))

(defn instantiations
  "**Returns:** `any`"
  ^js [conditional-root]
  (.-instantiations ^js conditional-root))

(defn set-instantiations!
  ^js [conditional-root value]
  (set! (.-instantiations ^js conditional-root) value))

(defn alias-symbol
  "**Returns:** `Symbol | undefined`"
  ^js [conditional-root]
  (.-aliasSymbol ^js conditional-root))

(defn set-alias-symbol!
  ^js [conditional-root value]
  (set! (.-aliasSymbol ^js conditional-root) value))

(defn alias-type-arguments
  "**Returns:** `Type[] | undefined`"
  ^js [conditional-root]
  (.-aliasTypeArguments ^js conditional-root))

(defn set-alias-type-arguments!
  ^js [conditional-root value]
  (set! (.-aliasTypeArguments ^js conditional-root) value))
