(ns dots.typescript.flow-reduce-label)

(defn target
  "**Returns:** `FlowLabel`"
  ^js [flow-reduce-label]
  (.-target ^js flow-reduce-label))

(defn set-target!
  ^js [flow-reduce-label value]
  (set! (.-target ^js flow-reduce-label) value))

(defn antecedents
  "**Returns:** `FlowNode[]`"
  ^js [flow-reduce-label]
  (.-antecedents ^js flow-reduce-label))

(defn set-antecedents!
  ^js [flow-reduce-label value]
  (set! (.-antecedents ^js flow-reduce-label) value))

(defn antecedent
  "**Returns:** `FlowNode`"
  ^js [flow-reduce-label]
  (.-antecedent ^js flow-reduce-label))

(defn set-antecedent!
  ^js [flow-reduce-label value]
  (set! (.-antecedent ^js flow-reduce-label) value))

(defn flags
  "**Returns:** `FlowFlags`"
  ^js [flow-reduce-label]
  (.-flags ^js flow-reduce-label))

(defn set-flags!
  ^js [flow-reduce-label value]
  (set! (.-flags ^js flow-reduce-label) value))

(defn id
  "**Returns:** `number | undefined`"
  ^js [flow-reduce-label]
  (.-id ^js flow-reduce-label))

(defn set-id!
  ^js [flow-reduce-label value]
  (set! (.-id ^js flow-reduce-label) value))
