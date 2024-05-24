(ns dots.typescript.server.protocol.diagnostic-with-line-position
  "Represents diagnostic info that includes location of diagnostic in two forms
   - start position and length of the error span
   - startLocation and endLocation - a pair of Location objects that store start/end line and offset of the error span.")

(defn message
  ^js [diagnostic-with-line-position]
  (.-message ^js diagnostic-with-line-position))

(defn set-message!
  ^js [diagnostic-with-line-position value]
  (set! (.-message ^js diagnostic-with-line-position) value))

(defn start
  ^js [diagnostic-with-line-position]
  (.-start ^js diagnostic-with-line-position))

(defn set-start!
  ^js [diagnostic-with-line-position value]
  (set! (.-start ^js diagnostic-with-line-position) value))

(defn length
  ^js [diagnostic-with-line-position]
  (.-length ^js diagnostic-with-line-position))

(defn set-length!
  ^js [diagnostic-with-line-position value]
  (set! (.-length ^js diagnostic-with-line-position) value))

(defn start-location
  ^js [diagnostic-with-line-position]
  (.-startLocation ^js diagnostic-with-line-position))

(defn set-start-location!
  ^js [diagnostic-with-line-position value]
  (set! (.-startLocation ^js diagnostic-with-line-position) value))

(defn end-location
  ^js [diagnostic-with-line-position]
  (.-endLocation ^js diagnostic-with-line-position))

(defn set-end-location!
  ^js [diagnostic-with-line-position value]
  (set! (.-endLocation ^js diagnostic-with-line-position) value))

(defn category
  ^js [diagnostic-with-line-position]
  (.-category ^js diagnostic-with-line-position))

(defn set-category!
  ^js [diagnostic-with-line-position value]
  (set! (.-category ^js diagnostic-with-line-position) value))

(defn code
  ^js [diagnostic-with-line-position]
  (.-code ^js diagnostic-with-line-position))

(defn set-code!
  ^js [diagnostic-with-line-position value]
  (set! (.-code ^js diagnostic-with-line-position) value))

(defn reports-unnecessary
  "May store more in future. For now, this will simply be `true` to indicate when a diagnostic is an unused-identifier diagnostic."
  ^js [diagnostic-with-line-position]
  (.-reportsUnnecessary ^js diagnostic-with-line-position))

(defn set-reports-unnecessary!
  "May store more in future. For now, this will simply be `true` to indicate when a diagnostic is an unused-identifier diagnostic."
  ^js [diagnostic-with-line-position value]
  (set! (.-reportsUnnecessary ^js diagnostic-with-line-position) value))

(defn reports-deprecated
  ^js [diagnostic-with-line-position]
  (.-reportsDeprecated ^js diagnostic-with-line-position))

(defn set-reports-deprecated!
  ^js [diagnostic-with-line-position value]
  (set! (.-reportsDeprecated ^js diagnostic-with-line-position) value))

(defn related-information
  ^js [diagnostic-with-line-position]
  (.-relatedInformation ^js diagnostic-with-line-position))

(defn set-related-information!
  ^js [diagnostic-with-line-position value]
  (set! (.-relatedInformation ^js diagnostic-with-line-position) value))
