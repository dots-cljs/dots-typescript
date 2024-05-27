(ns dots.typescript.server.protocol.completion-details-request-args
  "Arguments for completion details request.")

(defn entry-names
  "Names of one or more entries for which to obtain details.
   
   **Returns:** `(string | CompletionEntryIdentifier)[]`"
  ^js [completion-details-request-args]
  (.-entryNames ^js completion-details-request-args))

(defn set-entry-names!
  "Names of one or more entries for which to obtain details."
  ^js [completion-details-request-args value]
  (set! (.-entryNames ^js completion-details-request-args) value))

(defn line
  "The line number for the request (1-based).
   
   **Returns:** `number`"
  ^js [completion-details-request-args]
  (.-line ^js completion-details-request-args))

(defn set-line!
  "The line number for the request (1-based)."
  ^js [completion-details-request-args value]
  (set! (.-line ^js completion-details-request-args) value))

(defn offset
  "The character offset (on the line) for the request (1-based).
   
   **Returns:** `number`"
  ^js [completion-details-request-args]
  (.-offset ^js completion-details-request-args))

(defn set-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [completion-details-request-args value]
  (set! (.-offset ^js completion-details-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [completion-details-request-args]
  (.-file ^js completion-details-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [completion-details-request-args value]
  (set! (.-file ^js completion-details-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [completion-details-request-args]
  (.-projectFileName ^js completion-details-request-args))

(defn set-project-file-name!
  ^js [completion-details-request-args value]
  (set! (.-projectFileName ^js completion-details-request-args) value))
