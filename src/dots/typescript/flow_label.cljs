(ns dots.typescript.flow-label)

(defn antecedents
  "**Returns:** `FlowNode[] | undefined`"
  ^js [flow-label]
  (.-antecedents ^js flow-label))

(defn set-antecedents!
  ^js [flow-label value]
  (set! (.-antecedents ^js flow-label) value))

(defn flags
  "**Returns:** `FlowFlags`"
  ^js [flow-label]
  (.-flags ^js flow-label))

(defn set-flags!
  ^js [flow-label value]
  (set! (.-flags ^js flow-label) value))

(defn id
  "**Returns:** `number | undefined`"
  ^js [flow-label]
  (.-id ^js flow-label))

(defn set-id!
  ^js [flow-label value]
  (set! (.-id ^js flow-label) value))
