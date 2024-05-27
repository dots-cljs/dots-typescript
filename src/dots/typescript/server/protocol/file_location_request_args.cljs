(ns dots.typescript.server.protocol.file-location-request-args
  "Instances of this interface specify a location in a source file:
   (file, line, character offset), where line and character offset are 1-based.")

(defn line
  "The line number for the request (1-based).
   
   **Returns:** `number`"
  ^js [file-location-request-args]
  (.-line ^js file-location-request-args))

(defn set-line!
  "The line number for the request (1-based)."
  ^js [file-location-request-args value]
  (set! (.-line ^js file-location-request-args) value))

(defn offset
  "The character offset (on the line) for the request (1-based).
   
   **Returns:** `number`"
  ^js [file-location-request-args]
  (.-offset ^js file-location-request-args))

(defn set-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [file-location-request-args value]
  (set! (.-offset ^js file-location-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [file-location-request-args]
  (.-file ^js file-location-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [file-location-request-args value]
  (set! (.-file ^js file-location-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [file-location-request-args]
  (.-projectFileName ^js file-location-request-args))

(defn set-project-file-name!
  ^js [file-location-request-args value]
  (set! (.-projectFileName ^js file-location-request-args) value))
