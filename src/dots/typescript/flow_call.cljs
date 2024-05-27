(ns dots.typescript.flow-call)

(defn node
  "**Returns:** `CallExpression`"
  ^js [flow-call]
  (.-node ^js flow-call))

(defn set-node!
  ^js [flow-call value]
  (set! (.-node ^js flow-call) value))

(defn antecedent
  "**Returns:** `FlowNode`"
  ^js [flow-call]
  (.-antecedent ^js flow-call))

(defn set-antecedent!
  ^js [flow-call value]
  (set! (.-antecedent ^js flow-call) value))

(defn flags
  "**Returns:** `FlowFlags`"
  ^js [flow-call]
  (.-flags ^js flow-call))

(defn set-flags!
  ^js [flow-call value]
  (set! (.-flags ^js flow-call) value))

(defn id
  "**Returns:** `number | undefined`"
  ^js [flow-call]
  (.-id ^js flow-call))

(defn set-id!
  ^js [flow-call value]
  (set! (.-id ^js flow-call) value))
