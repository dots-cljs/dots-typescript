(ns dots.typescript.diagnostic-with-location)

(defn file
  "**Returns:** `SourceFile`"
  ^js [diagnostic-with-location]
  (.-file ^js diagnostic-with-location))

(defn set-file!
  ^js [diagnostic-with-location value]
  (set! (.-file ^js diagnostic-with-location) value))

(defn start
  "**Returns:** `number`"
  ^js [diagnostic-with-location]
  (.-start ^js diagnostic-with-location))

(defn set-start!
  ^js [diagnostic-with-location value]
  (set! (.-start ^js diagnostic-with-location) value))

(defn length
  "**Returns:** `number`"
  ^js [diagnostic-with-location]
  (.-length ^js diagnostic-with-location))

(defn set-length!
  ^js [diagnostic-with-location value]
  (set! (.-length ^js diagnostic-with-location) value))

(defn reports-unnecessary
  "May store more in future. For now, this will simply be `true` to indicate when a diagnostic is an unused-identifier diagnostic.
   
   **Returns:** `{} | undefined`"
  ^js [diagnostic-with-location]
  (.-reportsUnnecessary ^js diagnostic-with-location))

(defn set-reports-unnecessary!
  "May store more in future. For now, this will simply be `true` to indicate when a diagnostic is an unused-identifier diagnostic."
  ^js [diagnostic-with-location value]
  (set! (.-reportsUnnecessary ^js diagnostic-with-location) value))

(defn reports-deprecated
  "**Returns:** `{} | undefined`"
  ^js [diagnostic-with-location]
  (.-reportsDeprecated ^js diagnostic-with-location))

(defn set-reports-deprecated!
  ^js [diagnostic-with-location value]
  (set! (.-reportsDeprecated ^js diagnostic-with-location) value))

(defn source
  "**Returns:** `string | undefined`"
  ^js [diagnostic-with-location]
  (.-source ^js diagnostic-with-location))

(defn set-source!
  ^js [diagnostic-with-location value]
  (set! (.-source ^js diagnostic-with-location) value))

(defn related-information
  "**Returns:** `DiagnosticRelatedInformation[] | undefined`"
  ^js [diagnostic-with-location]
  (.-relatedInformation ^js diagnostic-with-location))

(defn set-related-information!
  ^js [diagnostic-with-location value]
  (set! (.-relatedInformation ^js diagnostic-with-location) value))

(defn category
  "**Returns:** `DiagnosticCategory`"
  ^js [diagnostic-with-location]
  (.-category ^js diagnostic-with-location))

(defn set-category!
  ^js [diagnostic-with-location value]
  (set! (.-category ^js diagnostic-with-location) value))

(defn code
  "**Returns:** `number`"
  ^js [diagnostic-with-location]
  (.-code ^js diagnostic-with-location))

(defn set-code!
  ^js [diagnostic-with-location value]
  (set! (.-code ^js diagnostic-with-location) value))

(defn message-text
  "**Returns:** `string | DiagnosticMessageChain`"
  ^js [diagnostic-with-location]
  (.-messageText ^js diagnostic-with-location))

(defn set-message-text!
  ^js [diagnostic-with-location value]
  (set! (.-messageText ^js diagnostic-with-location) value))
