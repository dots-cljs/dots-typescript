(ns dots.typescript.server.protocol.diagnostic-with-file-name)

(defn file-name
  "Name of the file the diagnostic is in"
  ^js [diagnostic-with-file-name]
  (.-fileName ^js diagnostic-with-file-name))

(defn set-file-name!
  "Name of the file the diagnostic is in"
  ^js [diagnostic-with-file-name value]
  (set! (.-fileName ^js diagnostic-with-file-name) value))

(defn start
  "Starting file location at which text applies."
  ^js [diagnostic-with-file-name]
  (.-start ^js diagnostic-with-file-name))

(defn set-start!
  "Starting file location at which text applies."
  ^js [diagnostic-with-file-name value]
  (set! (.-start ^js diagnostic-with-file-name) value))

(defn end
  "The last file location at which the text applies."
  ^js [diagnostic-with-file-name]
  (.-end ^js diagnostic-with-file-name))

(defn set-end!
  "The last file location at which the text applies."
  ^js [diagnostic-with-file-name value]
  (set! (.-end ^js diagnostic-with-file-name) value))

(defn text
  "Text of diagnostic message."
  ^js [diagnostic-with-file-name]
  (.-text ^js diagnostic-with-file-name))

(defn set-text!
  "Text of diagnostic message."
  ^js [diagnostic-with-file-name value]
  (set! (.-text ^js diagnostic-with-file-name) value))

(defn category
  "The category of the diagnostic message, e.g. \"error\", \"warning\", or \"suggestion\"."
  ^js [diagnostic-with-file-name]
  (.-category ^js diagnostic-with-file-name))

(defn set-category!
  "The category of the diagnostic message, e.g. \"error\", \"warning\", or \"suggestion\"."
  ^js [diagnostic-with-file-name value]
  (set! (.-category ^js diagnostic-with-file-name) value))

(defn reports-unnecessary
  ^js [diagnostic-with-file-name]
  (.-reportsUnnecessary ^js diagnostic-with-file-name))

(defn set-reports-unnecessary!
  ^js [diagnostic-with-file-name value]
  (set! (.-reportsUnnecessary ^js diagnostic-with-file-name) value))

(defn reports-deprecated
  ^js [diagnostic-with-file-name]
  (.-reportsDeprecated ^js diagnostic-with-file-name))

(defn set-reports-deprecated!
  ^js [diagnostic-with-file-name value]
  (set! (.-reportsDeprecated ^js diagnostic-with-file-name) value))

(defn related-information
  "Any related spans the diagnostic may have, such as other locations relevant to an error, such as declarartion sites"
  ^js [diagnostic-with-file-name]
  (.-relatedInformation ^js diagnostic-with-file-name))

(defn set-related-information!
  "Any related spans the diagnostic may have, such as other locations relevant to an error, such as declarartion sites"
  ^js [diagnostic-with-file-name value]
  (set! (.-relatedInformation ^js diagnostic-with-file-name) value))

(defn code
  "The error code of the diagnostic message."
  ^js [diagnostic-with-file-name]
  (.-code ^js diagnostic-with-file-name))

(defn set-code!
  "The error code of the diagnostic message."
  ^js [diagnostic-with-file-name value]
  (set! (.-code ^js diagnostic-with-file-name) value))

(defn source
  "The name of the plugin reporting the message."
  ^js [diagnostic-with-file-name]
  (.-source ^js diagnostic-with-file-name))

(defn set-source!
  "The name of the plugin reporting the message."
  ^js [diagnostic-with-file-name value]
  (set! (.-source ^js diagnostic-with-file-name) value))
