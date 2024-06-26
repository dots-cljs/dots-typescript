(ns dots.typescript.diagnostic)

(defn reports-unnecessary
  "May store more in future. For now, this will simply be `true` to indicate when a diagnostic is an unused-identifier diagnostic.
   
   **Returns:** `{} | undefined`"
  ^js [diagnostic]
  (.-reportsUnnecessary ^js diagnostic))

(defn set-reports-unnecessary!
  "May store more in future. For now, this will simply be `true` to indicate when a diagnostic is an unused-identifier diagnostic."
  ^js [diagnostic value]
  (set! (.-reportsUnnecessary ^js diagnostic) value))

(defn reports-deprecated
  "**Returns:** `{} | undefined`"
  ^js [diagnostic]
  (.-reportsDeprecated ^js diagnostic))

(defn set-reports-deprecated!
  ^js [diagnostic value]
  (set! (.-reportsDeprecated ^js diagnostic) value))

(defn source
  "**Returns:** `string | undefined`"
  ^js [diagnostic]
  (.-source ^js diagnostic))

(defn set-source!
  ^js [diagnostic value]
  (set! (.-source ^js diagnostic) value))

(defn related-information
  "**Returns:** `DiagnosticRelatedInformation[] | undefined`"
  ^js [diagnostic]
  (.-relatedInformation ^js diagnostic))

(defn set-related-information!
  ^js [diagnostic value]
  (set! (.-relatedInformation ^js diagnostic) value))

(defn category
  "**Returns:** `DiagnosticCategory`"
  ^js [diagnostic]
  (.-category ^js diagnostic))

(defn set-category!
  ^js [diagnostic value]
  (set! (.-category ^js diagnostic) value))

(defn code
  "**Returns:** `number`"
  ^js [diagnostic]
  (.-code ^js diagnostic))

(defn set-code!
  ^js [diagnostic value]
  (set! (.-code ^js diagnostic) value))

(defn file
  "**Returns:** `SourceFile | undefined`"
  ^js [diagnostic]
  (.-file ^js diagnostic))

(defn set-file!
  ^js [diagnostic value]
  (set! (.-file ^js diagnostic) value))

(defn start
  "**Returns:** `number | undefined`"
  ^js [diagnostic]
  (.-start ^js diagnostic))

(defn set-start!
  ^js [diagnostic value]
  (set! (.-start ^js diagnostic) value))

(defn length
  "**Returns:** `number | undefined`"
  ^js [diagnostic]
  (.-length ^js diagnostic))

(defn set-length!
  ^js [diagnostic value]
  (set! (.-length ^js diagnostic) value))

(defn message-text
  "**Returns:** `string | DiagnosticMessageChain`"
  ^js [diagnostic]
  (.-messageText ^js diagnostic))

(defn set-message-text!
  ^js [diagnostic value]
  (set! (.-messageText ^js diagnostic) value))
