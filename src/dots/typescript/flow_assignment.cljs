(ns dots.typescript.flow-assignment)

(defn node
  ^js [flow-assignment]
  (.-node ^js flow-assignment))

(defn set-node!
  ^js [flow-assignment value]
  (set! (.-node ^js flow-assignment) value))

(defn antecedent
  ^js [flow-assignment]
  (.-antecedent ^js flow-assignment))

(defn set-antecedent!
  ^js [flow-assignment value]
  (set! (.-antecedent ^js flow-assignment) value))

(defn flags
  ^js [flow-assignment]
  (.-flags ^js flow-assignment))

(defn set-flags!
  ^js [flow-assignment value]
  (set! (.-flags ^js flow-assignment) value))

(defn id
  ^js [flow-assignment]
  (.-id ^js flow-assignment))

(defn set-id!
  ^js [flow-assignment value]
  (set! (.-id ^js flow-assignment) value))
