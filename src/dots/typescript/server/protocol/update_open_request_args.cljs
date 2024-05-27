(ns dots.typescript.server.protocol.update-open-request-args
  "Arguments to UpdateOpenRequest")

(defn open-files
  "List of newly open files
   
   **Returns:** `OpenRequestArgs[] | undefined`"
  ^js [update-open-request-args]
  (.-openFiles ^js update-open-request-args))

(defn set-open-files!
  "List of newly open files"
  ^js [update-open-request-args value]
  (set! (.-openFiles ^js update-open-request-args) value))

(defn changed-files
  "List of open files files that were changes
   
   **Returns:** `FileCodeEdits[] | undefined`"
  ^js [update-open-request-args]
  (.-changedFiles ^js update-open-request-args))

(defn set-changed-files!
  "List of open files files that were changes"
  ^js [update-open-request-args value]
  (set! (.-changedFiles ^js update-open-request-args) value))

(defn closed-files
  "List of files that were closed
   
   **Returns:** `string[] | undefined`"
  ^js [update-open-request-args]
  (.-closedFiles ^js update-open-request-args))

(defn set-closed-files!
  "List of files that were closed"
  ^js [update-open-request-args value]
  (set! (.-closedFiles ^js update-open-request-args) value))
