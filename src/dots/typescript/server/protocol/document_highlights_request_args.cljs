(ns dots.typescript.server.protocol.document-highlights-request-args
  "Arguments in document highlight request; include: filesToSearch, file,
   line, offset.")

(defn files-to-search
  "List of files to search for document highlights.
   
   **Returns:** `string[]`"
  ^js [document-highlights-request-args]
  (.-filesToSearch ^js document-highlights-request-args))

(defn set-files-to-search!
  "List of files to search for document highlights."
  ^js [document-highlights-request-args value]
  (set! (.-filesToSearch ^js document-highlights-request-args) value))

(defn line
  "The line number for the request (1-based).
   
   **Returns:** `number`"
  ^js [document-highlights-request-args]
  (.-line ^js document-highlights-request-args))

(defn set-line!
  "The line number for the request (1-based)."
  ^js [document-highlights-request-args value]
  (set! (.-line ^js document-highlights-request-args) value))

(defn offset
  "The character offset (on the line) for the request (1-based).
   
   **Returns:** `number`"
  ^js [document-highlights-request-args]
  (.-offset ^js document-highlights-request-args))

(defn set-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [document-highlights-request-args value]
  (set! (.-offset ^js document-highlights-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [document-highlights-request-args]
  (.-file ^js document-highlights-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [document-highlights-request-args value]
  (set! (.-file ^js document-highlights-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [document-highlights-request-args]
  (.-projectFileName ^js document-highlights-request-args))

(defn set-project-file-name!
  ^js [document-highlights-request-args value]
  (set! (.-projectFileName ^js document-highlights-request-args) value))
