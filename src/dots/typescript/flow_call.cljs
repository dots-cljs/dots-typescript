(ns dots.typescript.flow-call)

(defn node
  ^js [flow-call]
  (.-node ^js flow-call))

(defn set-node!
  ^js [flow-call value]
  (set! (.-node ^js flow-call) value))

(defn antecedent
  ^js [flow-call]
  (.-antecedent ^js flow-call))

(defn set-antecedent!
  ^js [flow-call value]
  (set! (.-antecedent ^js flow-call) value))

(defn flags
  ^js [flow-call]
  (.-flags ^js flow-call))

(defn set-flags!
  ^js [flow-call value]
  (set! (.-flags ^js flow-call) value))

(defn id
  ^js [flow-call]
  (.-id ^js flow-call))

(defn set-id!
  ^js [flow-call value]
  (set! (.-id ^js flow-call) value))
