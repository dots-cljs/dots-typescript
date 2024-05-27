(ns dots.typescript.flow-assignment)

(defn node
  "**Returns:** `VariableDeclaration | Expression | BindingElement`"
  ^js [flow-assignment]
  (.-node ^js flow-assignment))

(defn set-node!
  ^js [flow-assignment value]
  (set! (.-node ^js flow-assignment) value))

(defn antecedent
  "**Returns:** `FlowNode`"
  ^js [flow-assignment]
  (.-antecedent ^js flow-assignment))

(defn set-antecedent!
  ^js [flow-assignment value]
  (set! (.-antecedent ^js flow-assignment) value))

(defn flags
  "**Returns:** `FlowFlags`"
  ^js [flow-assignment]
  (.-flags ^js flow-assignment))

(defn set-flags!
  ^js [flow-assignment value]
  (set! (.-flags ^js flow-assignment) value))

(defn id
  "**Returns:** `number | undefined`"
  ^js [flow-assignment]
  (.-id ^js flow-assignment))

(defn set-id!
  ^js [flow-assignment value]
  (set! (.-id ^js flow-assignment) value))
