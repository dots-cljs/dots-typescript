(ns dots.typescript.server.protocol.saveto-request-args
  "Arguments for saveto request.")

(defn tmpfile
  "Name of temporary file into which to save server's view of
   file contents.
   
   **Returns:** `string`"
  ^js [saveto-request-args]
  (.-tmpfile ^js saveto-request-args))

(defn set-tmpfile!
  "Name of temporary file into which to save server's view of
   file contents."
  ^js [saveto-request-args value]
  (set! (.-tmpfile ^js saveto-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [saveto-request-args]
  (.-file ^js saveto-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [saveto-request-args value]
  (set! (.-file ^js saveto-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [saveto-request-args]
  (.-projectFileName ^js saveto-request-args))

(defn set-project-file-name!
  ^js [saveto-request-args value]
  (set! (.-projectFileName ^js saveto-request-args) value))
