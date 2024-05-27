(ns dots.typescript.server.protocol.reload-request-args
  "Arguments for reload request.")

(defn tmpfile
  "Name of temporary file from which to reload file
   contents. May be same as file.
   
   **Returns:** `string`"
  ^js [reload-request-args]
  (.-tmpfile ^js reload-request-args))

(defn set-tmpfile!
  "Name of temporary file from which to reload file
   contents. May be same as file."
  ^js [reload-request-args value]
  (set! (.-tmpfile ^js reload-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [reload-request-args]
  (.-file ^js reload-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [reload-request-args value]
  (set! (.-file ^js reload-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [reload-request-args]
  (.-projectFileName ^js reload-request-args))

(defn set-project-file-name!
  ^js [reload-request-args value]
  (set! (.-projectFileName ^js reload-request-args) value))
