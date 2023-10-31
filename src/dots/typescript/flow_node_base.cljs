(ns dots.typescript.flow-node-base)

(defn flags
  ^js [flow-node-base]
  (.-flags ^js flow-node-base))

(defn set-flags!
  ^js [flow-node-base value]
  (set! (.-flags ^js flow-node-base) value))

(defn id
  ^js [flow-node-base]
  (.-id ^js flow-node-base))

(defn set-id!
  ^js [flow-node-base value]
  (set! (.-id ^js flow-node-base) value))
