(ns dots.typescript.flow-condition)

(defn node
  ^js [flow-condition]
  (.-node ^js flow-condition))

(defn set-node!
  ^js [flow-condition value]
  (set! (.-node ^js flow-condition) value))

(defn antecedent
  ^js [flow-condition]
  (.-antecedent ^js flow-condition))

(defn set-antecedent!
  ^js [flow-condition value]
  (set! (.-antecedent ^js flow-condition) value))

(defn flags
  ^js [flow-condition]
  (.-flags ^js flow-condition))

(defn set-flags!
  ^js [flow-condition value]
  (set! (.-flags ^js flow-condition) value))

(defn id
  ^js [flow-condition]
  (.-id ^js flow-condition))

(defn set-id!
  ^js [flow-condition value]
  (set! (.-id ^js flow-condition) value))
