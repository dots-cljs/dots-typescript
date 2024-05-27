(ns dots.typescript.diagnostic-message
  (:refer-clojure :exclude [key]))

(defn key
  "**Returns:** `string`"
  ^js [diagnostic-message]
  (.-key ^js diagnostic-message))

(defn set-key!
  ^js [diagnostic-message value]
  (set! (.-key ^js diagnostic-message) value))

(defn category
  "**Returns:** `DiagnosticCategory`"
  ^js [diagnostic-message]
  (.-category ^js diagnostic-message))

(defn set-category!
  ^js [diagnostic-message value]
  (set! (.-category ^js diagnostic-message) value))

(defn code
  "**Returns:** `number`"
  ^js [diagnostic-message]
  (.-code ^js diagnostic-message))

(defn set-code!
  ^js [diagnostic-message value]
  (set! (.-code ^js diagnostic-message) value))

(defn message
  "**Returns:** `string`"
  ^js [diagnostic-message]
  (.-message ^js diagnostic-message))

(defn set-message!
  ^js [diagnostic-message value]
  (set! (.-message ^js diagnostic-message) value))

(defn reports-unnecessary
  "**Returns:** `{} | undefined`"
  ^js [diagnostic-message]
  (.-reportsUnnecessary ^js diagnostic-message))

(defn set-reports-unnecessary!
  ^js [diagnostic-message value]
  (set! (.-reportsUnnecessary ^js diagnostic-message) value))

(defn reports-deprecated
  "**Returns:** `{} | undefined`"
  ^js [diagnostic-message]
  (.-reportsDeprecated ^js diagnostic-message))

(defn set-reports-deprecated!
  ^js [diagnostic-message value]
  (set! (.-reportsDeprecated ^js diagnostic-message) value))
