(ns dots.typescript.flow-condition)

(defn node
  "**Returns:** `Expression`"
  ^js [flow-condition]
  (.-node ^js flow-condition))

(defn set-node!
  ^js [flow-condition value]
  (set! (.-node ^js flow-condition) value))

(defn antecedent
  "**Returns:** `FlowNode`"
  ^js [flow-condition]
  (.-antecedent ^js flow-condition))

(defn set-antecedent!
  ^js [flow-condition value]
  (set! (.-antecedent ^js flow-condition) value))

(defn flags
  "**Returns:** `FlowFlags`"
  ^js [flow-condition]
  (.-flags ^js flow-condition))

(defn set-flags!
  ^js [flow-condition value]
  (set! (.-flags ^js flow-condition) value))

(defn id
  "**Returns:** `number | undefined`"
  ^js [flow-condition]
  (.-id ^js flow-condition))

(defn set-id!
  ^js [flow-condition value]
  (set! (.-id ^js flow-condition) value))
