(ns dots.typescript.report-file-in-error)

(defn file-name
  "**Returns:** `string`"
  ^js [report-file-in-error]
  (.-fileName ^js report-file-in-error))

(defn set-file-name!
  ^js [report-file-in-error value]
  (set! (.-fileName ^js report-file-in-error) value))

(defn line
  "**Returns:** `number`"
  ^js [report-file-in-error]
  (.-line ^js report-file-in-error))

(defn set-line!
  ^js [report-file-in-error value]
  (set! (.-line ^js report-file-in-error) value))
