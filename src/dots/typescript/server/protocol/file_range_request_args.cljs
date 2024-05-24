(ns dots.typescript.server.protocol.file-range-request-args)

(defn start-line
  "The line number for the request (1-based)."
  ^js [file-range-request-args]
  (.-startLine ^js file-range-request-args))

(defn set-start-line!
  "The line number for the request (1-based)."
  ^js [file-range-request-args value]
  (set! (.-startLine ^js file-range-request-args) value))

(defn start-offset
  "The character offset (on the line) for the request (1-based)."
  ^js [file-range-request-args]
  (.-startOffset ^js file-range-request-args))

(defn set-start-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [file-range-request-args value]
  (set! (.-startOffset ^js file-range-request-args) value))

(defn end-line
  "The line number for the request (1-based)."
  ^js [file-range-request-args]
  (.-endLine ^js file-range-request-args))

(defn set-end-line!
  "The line number for the request (1-based)."
  ^js [file-range-request-args value]
  (set! (.-endLine ^js file-range-request-args) value))

(defn end-offset
  "The character offset (on the line) for the request (1-based)."
  ^js [file-range-request-args]
  (.-endOffset ^js file-range-request-args))

(defn set-end-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [file-range-request-args value]
  (set! (.-endOffset ^js file-range-request-args) value))

(defn file
  "The file for the request (absolute pathname required)."
  ^js [file-range-request-args]
  (.-file ^js file-range-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [file-range-request-args value]
  (set! (.-file ^js file-range-request-args) value))

(defn project-file-name
  ^js [file-range-request-args]
  (.-projectFileName ^js file-range-request-args))

(defn set-project-file-name!
  ^js [file-range-request-args value]
  (set! (.-projectFileName ^js file-range-request-args) value))
