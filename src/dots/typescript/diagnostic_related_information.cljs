(ns dots.typescript.diagnostic-related-information)

(defn category
  ^js [diagnostic-related-information]
  (.-category ^js diagnostic-related-information))

(defn set-category!
  ^js [diagnostic-related-information value]
  (set! (.-category ^js diagnostic-related-information) value))

(defn code
  ^js [diagnostic-related-information]
  (.-code ^js diagnostic-related-information))

(defn set-code!
  ^js [diagnostic-related-information value]
  (set! (.-code ^js diagnostic-related-information) value))

(defn file
  ^js [diagnostic-related-information]
  (.-file ^js diagnostic-related-information))

(defn set-file!
  ^js [diagnostic-related-information value]
  (set! (.-file ^js diagnostic-related-information) value))

(defn start
  ^js [diagnostic-related-information]
  (.-start ^js diagnostic-related-information))

(defn set-start!
  ^js [diagnostic-related-information value]
  (set! (.-start ^js diagnostic-related-information) value))

(defn length
  ^js [diagnostic-related-information]
  (.-length ^js diagnostic-related-information))

(defn set-length!
  ^js [diagnostic-related-information value]
  (set! (.-length ^js diagnostic-related-information) value))

(defn message-text
  ^js [diagnostic-related-information]
  (.-messageText ^js diagnostic-related-information))

(defn set-message-text!
  ^js [diagnostic-related-information value]
  (set! (.-messageText ^js diagnostic-related-information) value))
