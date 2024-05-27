(ns dots.typescript.server.protocol.diagnostic
  "Item of diagnostic information found in a DiagnosticEvent message.")

(defn start
  "Starting file location at which text applies.
   
   **Returns:** `Location`"
  ^js [diagnostic]
  (.-start ^js diagnostic))

(defn set-start!
  "Starting file location at which text applies."
  ^js [diagnostic value]
  (set! (.-start ^js diagnostic) value))

(defn end
  "The last file location at which the text applies.
   
   **Returns:** `Location`"
  ^js [diagnostic]
  (.-end ^js diagnostic))

(defn set-end!
  "The last file location at which the text applies."
  ^js [diagnostic value]
  (set! (.-end ^js diagnostic) value))

(defn text
  "Text of diagnostic message.
   
   **Returns:** `string`"
  ^js [diagnostic]
  (.-text ^js diagnostic))

(defn set-text!
  "Text of diagnostic message."
  ^js [diagnostic value]
  (set! (.-text ^js diagnostic) value))

(defn category
  "The category of the diagnostic message, e.g. \"error\", \"warning\", or \"suggestion\".
   
   **Returns:** `string`"
  ^js [diagnostic]
  (.-category ^js diagnostic))

(defn set-category!
  "The category of the diagnostic message, e.g. \"error\", \"warning\", or \"suggestion\"."
  ^js [diagnostic value]
  (set! (.-category ^js diagnostic) value))

(defn reports-unnecessary
  "**Returns:** `{} | undefined`"
  ^js [diagnostic]
  (.-reportsUnnecessary ^js diagnostic))

(defn set-reports-unnecessary!
  ^js [diagnostic value]
  (set! (.-reportsUnnecessary ^js diagnostic) value))

(defn reports-deprecated
  "**Returns:** `{} | undefined`"
  ^js [diagnostic]
  (.-reportsDeprecated ^js diagnostic))

(defn set-reports-deprecated!
  ^js [diagnostic value]
  (set! (.-reportsDeprecated ^js diagnostic) value))

(defn related-information
  "Any related spans the diagnostic may have, such as other locations relevant to an error, such as declarartion sites
   
   **Returns:** `DiagnosticRelatedInformation[] | undefined`"
  ^js [diagnostic]
  (.-relatedInformation ^js diagnostic))

(defn set-related-information!
  "Any related spans the diagnostic may have, such as other locations relevant to an error, such as declarartion sites"
  ^js [diagnostic value]
  (set! (.-relatedInformation ^js diagnostic) value))

(defn code
  "The error code of the diagnostic message.
   
   **Returns:** `number | undefined`"
  ^js [diagnostic]
  (.-code ^js diagnostic))

(defn set-code!
  "The error code of the diagnostic message."
  ^js [diagnostic value]
  (set! (.-code ^js diagnostic) value))

(defn source
  "The name of the plugin reporting the message.
   
   **Returns:** `string | undefined`"
  ^js [diagnostic]
  (.-source ^js diagnostic))

(defn set-source!
  "The name of the plugin reporting the message."
  ^js [diagnostic value]
  (set! (.-source ^js diagnostic) value))
