(ns dots.typescript.diagnostic)

(defn reports-unnecessary
  "May store more in future. For now, this will simply be `true` to indicate when a diagnostic is an unused-identifier diagnostic."
  ^js [diagnostic]
  (.-reportsUnnecessary ^js diagnostic))

(defn set-reports-unnecessary!
  "May store more in future. For now, this will simply be `true` to indicate when a diagnostic is an unused-identifier diagnostic."
  ^js [diagnostic value]
  (set! (.-reportsUnnecessary ^js diagnostic) value))

(defn reports-deprecated
  ^js [diagnostic]
  (.-reportsDeprecated ^js diagnostic))

(defn set-reports-deprecated!
  ^js [diagnostic value]
  (set! (.-reportsDeprecated ^js diagnostic) value))

(defn source
  ^js [diagnostic]
  (.-source ^js diagnostic))

(defn set-source!
  ^js [diagnostic value]
  (set! (.-source ^js diagnostic) value))

(defn related-information
  ^js [diagnostic]
  (.-relatedInformation ^js diagnostic))

(defn set-related-information!
  ^js [diagnostic value]
  (set! (.-relatedInformation ^js diagnostic) value))

(defn category
  ^js [diagnostic]
  (.-category ^js diagnostic))

(defn set-category!
  ^js [diagnostic value]
  (set! (.-category ^js diagnostic) value))

(defn code
  ^js [diagnostic]
  (.-code ^js diagnostic))

(defn set-code!
  ^js [diagnostic value]
  (set! (.-code ^js diagnostic) value))

(defn file
  ^js [diagnostic]
  (.-file ^js diagnostic))

(defn set-file!
  ^js [diagnostic value]
  (set! (.-file ^js diagnostic) value))

(defn start
  ^js [diagnostic]
  (.-start ^js diagnostic))

(defn set-start!
  ^js [diagnostic value]
  (set! (.-start ^js diagnostic) value))

(defn length
  ^js [diagnostic]
  (.-length ^js diagnostic))

(defn set-length!
  ^js [diagnostic value]
  (set! (.-length ^js diagnostic) value))

(defn message-text
  ^js [diagnostic]
  (.-messageText ^js diagnostic))

(defn set-message-text!
  ^js [diagnostic value]
  (set! (.-messageText ^js diagnostic) value))
