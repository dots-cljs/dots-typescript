(ns dots.typescript.server.protocol.inlay-hints-request-args)

(defn start
  "Start position of the span."
  ^js [inlay-hints-request-args]
  (.-start ^js inlay-hints-request-args))

(defn set-start!
  "Start position of the span."
  ^js [inlay-hints-request-args value]
  (set! (.-start ^js inlay-hints-request-args) value))

(defn length
  "Length of the span."
  ^js [inlay-hints-request-args]
  (.-length ^js inlay-hints-request-args))

(defn set-length!
  "Length of the span."
  ^js [inlay-hints-request-args value]
  (set! (.-length ^js inlay-hints-request-args) value))

(defn file
  "The file for the request (absolute pathname required)."
  ^js [inlay-hints-request-args]
  (.-file ^js inlay-hints-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [inlay-hints-request-args value]
  (set! (.-file ^js inlay-hints-request-args) value))

(defn project-file-name
  ^js [inlay-hints-request-args]
  (.-projectFileName ^js inlay-hints-request-args))

(defn set-project-file-name!
  ^js [inlay-hints-request-args value]
  (set! (.-projectFileName ^js inlay-hints-request-args) value))
