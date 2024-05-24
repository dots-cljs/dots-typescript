(ns dots.typescript.server.protocol.format-request-args
  "Arguments for format messages.")

(defn end-line
  "Last line of range for which to format text in file."
  ^js [format-request-args]
  (.-endLine ^js format-request-args))

(defn set-end-line!
  "Last line of range for which to format text in file."
  ^js [format-request-args value]
  (set! (.-endLine ^js format-request-args) value))

(defn end-offset
  "Character offset on last line of range for which to format text in file."
  ^js [format-request-args]
  (.-endOffset ^js format-request-args))

(defn set-end-offset!
  "Character offset on last line of range for which to format text in file."
  ^js [format-request-args value]
  (set! (.-endOffset ^js format-request-args) value))

(defn options
  "Format options to be used."
  ^js [format-request-args]
  (.-options ^js format-request-args))

(defn set-options!
  "Format options to be used."
  ^js [format-request-args value]
  (set! (.-options ^js format-request-args) value))

(defn line
  "The line number for the request (1-based)."
  ^js [format-request-args]
  (.-line ^js format-request-args))

(defn set-line!
  "The line number for the request (1-based)."
  ^js [format-request-args value]
  (set! (.-line ^js format-request-args) value))

(defn offset
  "The character offset (on the line) for the request (1-based)."
  ^js [format-request-args]
  (.-offset ^js format-request-args))

(defn set-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [format-request-args value]
  (set! (.-offset ^js format-request-args) value))

(defn file
  "The file for the request (absolute pathname required)."
  ^js [format-request-args]
  (.-file ^js format-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [format-request-args value]
  (set! (.-file ^js format-request-args) value))

(defn project-file-name
  ^js [format-request-args]
  (.-projectFileName ^js format-request-args))

(defn set-project-file-name!
  ^js [format-request-args value]
  (set! (.-projectFileName ^js format-request-args) value))
