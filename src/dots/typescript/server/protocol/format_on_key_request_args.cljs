(ns dots.typescript.server.protocol.format-on-key-request-args
  "Arguments for format on key messages."
  (:refer-clojure :exclude [key]))

(defn key
  "Key pressed (';', '\\n', or '}').
   
   **Returns:** `string`"
  ^js [format-on-key-request-args]
  (.-key ^js format-on-key-request-args))

(defn set-key!
  "Key pressed (';', '\\n', or '}')."
  ^js [format-on-key-request-args value]
  (set! (.-key ^js format-on-key-request-args) value))

(defn options
  "**Returns:** `FormatCodeSettings | undefined`"
  ^js [format-on-key-request-args]
  (.-options ^js format-on-key-request-args))

(defn set-options!
  ^js [format-on-key-request-args value]
  (set! (.-options ^js format-on-key-request-args) value))

(defn line
  "The line number for the request (1-based).
   
   **Returns:** `number`"
  ^js [format-on-key-request-args]
  (.-line ^js format-on-key-request-args))

(defn set-line!
  "The line number for the request (1-based)."
  ^js [format-on-key-request-args value]
  (set! (.-line ^js format-on-key-request-args) value))

(defn offset
  "The character offset (on the line) for the request (1-based).
   
   **Returns:** `number`"
  ^js [format-on-key-request-args]
  (.-offset ^js format-on-key-request-args))

(defn set-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [format-on-key-request-args value]
  (set! (.-offset ^js format-on-key-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [format-on-key-request-args]
  (.-file ^js format-on-key-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [format-on-key-request-args value]
  (set! (.-file ^js format-on-key-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [format-on-key-request-args]
  (.-projectFileName ^js format-on-key-request-args))

(defn set-project-file-name!
  ^js [format-on-key-request-args value]
  (set! (.-projectFileName ^js format-on-key-request-args) value))
