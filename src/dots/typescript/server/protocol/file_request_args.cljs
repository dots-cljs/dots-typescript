(ns dots.typescript.server.protocol.file-request-args
  "Arguments for FileRequest messages.")

(defn file
  "The file for the request (absolute pathname required)."
  ^js [file-request-args]
  (.-file ^js file-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [file-request-args value]
  (set! (.-file ^js file-request-args) value))

(defn project-file-name
  ^js [file-request-args]
  (.-projectFileName ^js file-request-args))

(defn set-project-file-name!
  ^js [file-request-args value]
  (set! (.-projectFileName ^js file-request-args) value))
