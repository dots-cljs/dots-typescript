(ns dots.typescript.flow-switch-clause)

(defn switch-statement
  "**Returns:** `SwitchStatement`"
  ^js [flow-switch-clause]
  (.-switchStatement ^js flow-switch-clause))

(defn set-switch-statement!
  ^js [flow-switch-clause value]
  (set! (.-switchStatement ^js flow-switch-clause) value))

(defn clause-start
  "**Returns:** `number`"
  ^js [flow-switch-clause]
  (.-clauseStart ^js flow-switch-clause))

(defn set-clause-start!
  ^js [flow-switch-clause value]
  (set! (.-clauseStart ^js flow-switch-clause) value))

(defn clause-end
  "**Returns:** `number`"
  ^js [flow-switch-clause]
  (.-clauseEnd ^js flow-switch-clause))

(defn set-clause-end!
  ^js [flow-switch-clause value]
  (set! (.-clauseEnd ^js flow-switch-clause) value))

(defn antecedent
  "**Returns:** `FlowNode`"
  ^js [flow-switch-clause]
  (.-antecedent ^js flow-switch-clause))

(defn set-antecedent!
  ^js [flow-switch-clause value]
  (set! (.-antecedent ^js flow-switch-clause) value))

(defn flags
  "**Returns:** `FlowFlags`"
  ^js [flow-switch-clause]
  (.-flags ^js flow-switch-clause))

(defn set-flags!
  ^js [flow-switch-clause value]
  (set! (.-flags ^js flow-switch-clause) value))

(defn id
  "**Returns:** `number | undefined`"
  ^js [flow-switch-clause]
  (.-id ^js flow-switch-clause))

(defn set-id!
  ^js [flow-switch-clause value]
  (set! (.-id ^js flow-switch-clause) value))
