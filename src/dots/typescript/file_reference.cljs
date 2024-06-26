(ns dots.typescript.file-reference)

(defn file-name
  "**Returns:** `string`"
  ^js [file-reference]
  (.-fileName ^js file-reference))

(defn set-file-name!
  ^js [file-reference value]
  (set! (.-fileName ^js file-reference) value))

(defn resolution-mode
  "**Returns:** `ResolutionMode`"
  ^js [file-reference]
  (.-resolutionMode ^js file-reference))

(defn set-resolution-mode!
  ^js [file-reference value]
  (set! (.-resolutionMode ^js file-reference) value))

(defn pos
  "**Returns:** `number`"
  ^js [file-reference]
  (.-pos ^js file-reference))

(defn set-pos!
  ^js [file-reference value]
  (set! (.-pos ^js file-reference) value))

(defn end
  "**Returns:** `number`"
  ^js [file-reference]
  (.-end ^js file-reference))

(defn set-end!
  ^js [file-reference value]
  (set! (.-end ^js file-reference) value))
