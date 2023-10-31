(ns dots.typescript.flow-array-mutation)

(defn node
  ^js [flow-array-mutation]
  (.-node ^js flow-array-mutation))

(defn set-node!
  ^js [flow-array-mutation value]
  (set! (.-node ^js flow-array-mutation) value))

(defn antecedent
  ^js [flow-array-mutation]
  (.-antecedent ^js flow-array-mutation))

(defn set-antecedent!
  ^js [flow-array-mutation value]
  (set! (.-antecedent ^js flow-array-mutation) value))

(defn flags
  ^js [flow-array-mutation]
  (.-flags ^js flow-array-mutation))

(defn set-flags!
  ^js [flow-array-mutation value]
  (set! (.-flags ^js flow-array-mutation) value))

(defn id
  ^js [flow-array-mutation]
  (.-id ^js flow-array-mutation))

(defn set-id!
  ^js [flow-array-mutation value]
  (set! (.-id ^js flow-array-mutation) value))
