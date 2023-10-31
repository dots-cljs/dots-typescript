(ns dots.typescript.signature-help-items
  "Represents a set of signature help items, and the preferred item that should be selected.")

(defn items
  ^js [signature-help-items]
  (.-items ^js signature-help-items))

(defn set-items!
  ^js [signature-help-items value]
  (set! (.-items ^js signature-help-items) value))

(defn applicable-span
  ^js [signature-help-items]
  (.-applicableSpan ^js signature-help-items))

(defn set-applicable-span!
  ^js [signature-help-items value]
  (set! (.-applicableSpan ^js signature-help-items) value))

(defn selected-item-index
  ^js [signature-help-items]
  (.-selectedItemIndex ^js signature-help-items))

(defn set-selected-item-index!
  ^js [signature-help-items value]
  (set! (.-selectedItemIndex ^js signature-help-items) value))

(defn argument-index
  ^js [signature-help-items]
  (.-argumentIndex ^js signature-help-items))

(defn set-argument-index!
  ^js [signature-help-items value]
  (set! (.-argumentIndex ^js signature-help-items) value))

(defn argument-count
  ^js [signature-help-items]
  (.-argumentCount ^js signature-help-items))

(defn set-argument-count!
  ^js [signature-help-items value]
  (set! (.-argumentCount ^js signature-help-items) value))
