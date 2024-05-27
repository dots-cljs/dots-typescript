(ns dots.typescript.server.protocol.jsx-closing-tag-request-args)

(defn line
  "The line number for the request (1-based).
   
   **Returns:** `number`"
  ^js [jsx-closing-tag-request-args]
  (.-line ^js jsx-closing-tag-request-args))

(defn set-line!
  "The line number for the request (1-based)."
  ^js [jsx-closing-tag-request-args value]
  (set! (.-line ^js jsx-closing-tag-request-args) value))

(defn offset
  "The character offset (on the line) for the request (1-based).
   
   **Returns:** `number`"
  ^js [jsx-closing-tag-request-args]
  (.-offset ^js jsx-closing-tag-request-args))

(defn set-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [jsx-closing-tag-request-args value]
  (set! (.-offset ^js jsx-closing-tag-request-args) value))

(defn file
  "The file for the request (absolute pathname required).
   
   **Returns:** `string`"
  ^js [jsx-closing-tag-request-args]
  (.-file ^js jsx-closing-tag-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [jsx-closing-tag-request-args value]
  (set! (.-file ^js jsx-closing-tag-request-args) value))

(defn project-file-name
  "**Returns:** `string | undefined`"
  ^js [jsx-closing-tag-request-args]
  (.-projectFileName ^js jsx-closing-tag-request-args))

(defn set-project-file-name!
  ^js [jsx-closing-tag-request-args value]
  (set! (.-projectFileName ^js jsx-closing-tag-request-args) value))
