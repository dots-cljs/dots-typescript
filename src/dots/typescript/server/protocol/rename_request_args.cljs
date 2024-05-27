(ns dots.typescript.server.protocol.rename-request-args
  "Argument for RenameRequest request.")

(defn find-in-comments?
  "Should text at specified location be found/changed in comments?
   
   **Returns:** `boolean | undefined`"
  ^js [rename-request-args]
  (.-findInComments ^js rename-request-args))

(defn set-find-in-comments!
  "Should text at specified location be found/changed in comments?"
  ^js [rename-request-args value]
  (set! (.-findInComments ^js rename-request-args) value))

(defn find-in-strings?
  "Should text at specified location be found/changed in strings?
   
   **Returns:** `boolean | undefined`"
  ^js [rename-request-args]
  (.-findInStrings ^js rename-request-args))

(defn set-find-in-strings!
  "Should text at specified location be found/changed in strings?"
  ^js [rename-request-args value]
  (set! (.-findInStrings ^js rename-request-args) value))

(defn line
  "The line number for the request (1-based).
   
   **Returns:** `number`"
  ^js [rename-request-args]
  (.-line ^js rename-request-args))

(defn set-line!
  "The line number for the request (1-based)."
  ^js [rename-request-args value]
  (set! (.-line ^js rename-request-args) value))

(defn offset
  "The character offset (on the line) for the request (1-based).
   
   **Returns:** `number`"
  ^js [rename-request-args]
  (.-offset ^js rename-request-args))

(defn set-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [rename-request-args value]
  (set! (.-offset ^js rename-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [rename-request-args]
  (.-file ^js rename-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [rename-request-args value]
  (set! (.-file ^js rename-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [rename-request-args]
  (.-projectFileName ^js rename-request-args))

(defn set-project-file-name!
  ^js [rename-request-args value]
  (set! (.-projectFileName ^js rename-request-args) value))
