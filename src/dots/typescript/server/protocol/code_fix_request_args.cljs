(ns dots.typescript.server.protocol.code-fix-request-args
  "Instances of this interface specify errorcodes on a specific location in a sourcefile.")

(defn error-codes
  "Errorcodes we want to get the fixes for.
   
   **Returns:** `readonly number[]`"
  ^js [code-fix-request-args]
  (.-errorCodes ^js code-fix-request-args))

(defn set-error-codes!
  "Errorcodes we want to get the fixes for."
  ^js [code-fix-request-args value]
  (set! (.-errorCodes ^js code-fix-request-args) value))

(defn start-line
  "The line number for the request (1-based).
   
   **Returns:** `number`"
  ^js [code-fix-request-args]
  (.-startLine ^js code-fix-request-args))

(defn set-start-line!
  "The line number for the request (1-based)."
  ^js [code-fix-request-args value]
  (set! (.-startLine ^js code-fix-request-args) value))

(defn start-offset
  "The character offset (on the line) for the request (1-based).
   
   **Returns:** `number`"
  ^js [code-fix-request-args]
  (.-startOffset ^js code-fix-request-args))

(defn set-start-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [code-fix-request-args value]
  (set! (.-startOffset ^js code-fix-request-args) value))

(defn end-line
  "The line number for the request (1-based).
   
   **Returns:** `number`"
  ^js [code-fix-request-args]
  (.-endLine ^js code-fix-request-args))

(defn set-end-line!
  "The line number for the request (1-based)."
  ^js [code-fix-request-args value]
  (set! (.-endLine ^js code-fix-request-args) value))

(defn end-offset
  "The character offset (on the line) for the request (1-based).
   
   **Returns:** `number`"
  ^js [code-fix-request-args]
  (.-endOffset ^js code-fix-request-args))

(defn set-end-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [code-fix-request-args value]
  (set! (.-endOffset ^js code-fix-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [code-fix-request-args]
  (.-file ^js code-fix-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [code-fix-request-args value]
  (set! (.-file ^js code-fix-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [code-fix-request-args]
  (.-projectFileName ^js code-fix-request-args))

(defn set-project-file-name!
  ^js [code-fix-request-args value]
  (set! (.-projectFileName ^js code-fix-request-args) value))
