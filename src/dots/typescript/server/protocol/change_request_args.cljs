(ns dots.typescript.server.protocol.change-request-args
  "Arguments for change request message.")

(defn insert-string
  "Optional string to insert at location (file, line, offset)."
  ^js [change-request-args]
  (.-insertString ^js change-request-args))

(defn set-insert-string!
  "Optional string to insert at location (file, line, offset)."
  ^js [change-request-args value]
  (set! (.-insertString ^js change-request-args) value))

(defn end-line
  "Last line of range for which to format text in file."
  ^js [change-request-args]
  (.-endLine ^js change-request-args))

(defn set-end-line!
  "Last line of range for which to format text in file."
  ^js [change-request-args value]
  (set! (.-endLine ^js change-request-args) value))

(defn end-offset
  "Character offset on last line of range for which to format text in file."
  ^js [change-request-args]
  (.-endOffset ^js change-request-args))

(defn set-end-offset!
  "Character offset on last line of range for which to format text in file."
  ^js [change-request-args value]
  (set! (.-endOffset ^js change-request-args) value))

(defn options
  "Format options to be used."
  ^js [change-request-args]
  (.-options ^js change-request-args))

(defn set-options!
  "Format options to be used."
  ^js [change-request-args value]
  (set! (.-options ^js change-request-args) value))

(defn line
  "The line number for the request (1-based)."
  ^js [change-request-args]
  (.-line ^js change-request-args))

(defn set-line!
  "The line number for the request (1-based)."
  ^js [change-request-args value]
  (set! (.-line ^js change-request-args) value))

(defn offset
  "The character offset (on the line) for the request (1-based)."
  ^js [change-request-args]
  (.-offset ^js change-request-args))

(defn set-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [change-request-args value]
  (set! (.-offset ^js change-request-args) value))

(defn file
  "The file for the request (absolute pathname required)."
  ^js [change-request-args]
  (.-file ^js change-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [change-request-args value]
  (set! (.-file ^js change-request-args) value))

(defn project-file-name
  ^js [change-request-args]
  (.-projectFileName ^js change-request-args))

(defn set-project-file-name!
  ^js [change-request-args value]
  (set! (.-projectFileName ^js change-request-args) value))
