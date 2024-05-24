(ns dots.typescript.server.protocol.indentation-request-args
  "Arguments for IndentationRequest request.")

(defn options
  "An optional set of settings to be used when computing indentation.
   If argument is omitted - then it will use settings for file that were previously set via 'configure' request or global settings."
  ^js [indentation-request-args]
  (.-options ^js indentation-request-args))

(defn set-options!
  "An optional set of settings to be used when computing indentation.
   If argument is omitted - then it will use settings for file that were previously set via 'configure' request or global settings."
  ^js [indentation-request-args value]
  (set! (.-options ^js indentation-request-args) value))

(defn line
  "The line number for the request (1-based)."
  ^js [indentation-request-args]
  (.-line ^js indentation-request-args))

(defn set-line!
  "The line number for the request (1-based)."
  ^js [indentation-request-args value]
  (set! (.-line ^js indentation-request-args) value))

(defn offset
  "The character offset (on the line) for the request (1-based)."
  ^js [indentation-request-args]
  (.-offset ^js indentation-request-args))

(defn set-offset!
  "The character offset (on the line) for the request (1-based)."
  ^js [indentation-request-args value]
  (set! (.-offset ^js indentation-request-args) value))

(defn file
  "The file for the request (absolute pathname required)."
  ^js [indentation-request-args]
  (.-file ^js indentation-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [indentation-request-args value]
  (set! (.-file ^js indentation-request-args) value))

(defn project-file-name
  ^js [indentation-request-args]
  (.-projectFileName ^js indentation-request-args))

(defn set-project-file-name!
  ^js [indentation-request-args value]
  (set! (.-projectFileName ^js indentation-request-args) value))
