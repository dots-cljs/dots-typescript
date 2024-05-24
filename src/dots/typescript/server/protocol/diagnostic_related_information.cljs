(ns dots.typescript.server.protocol.diagnostic-related-information
  "Represents additional spans returned with a diagnostic which are relevant to it")

(defn category
  "The category of the related information message, e.g. \"error\", \"warning\", or \"suggestion\"."
  ^js [diagnostic-related-information]
  (.-category ^js diagnostic-related-information))

(defn set-category!
  "The category of the related information message, e.g. \"error\", \"warning\", or \"suggestion\"."
  ^js [diagnostic-related-information value]
  (set! (.-category ^js diagnostic-related-information) value))

(defn code
  "The code used ot identify the related information"
  ^js [diagnostic-related-information]
  (.-code ^js diagnostic-related-information))

(defn set-code!
  "The code used ot identify the related information"
  ^js [diagnostic-related-information value]
  (set! (.-code ^js diagnostic-related-information) value))

(defn message
  "Text of related or additional information."
  ^js [diagnostic-related-information]
  (.-message ^js diagnostic-related-information))

(defn set-message!
  "Text of related or additional information."
  ^js [diagnostic-related-information value]
  (set! (.-message ^js diagnostic-related-information) value))

(defn span
  "Associated location"
  ^js [diagnostic-related-information]
  (.-span ^js diagnostic-related-information))

(defn set-span!
  "Associated location"
  ^js [diagnostic-related-information value]
  (set! (.-span ^js diagnostic-related-information) value))
