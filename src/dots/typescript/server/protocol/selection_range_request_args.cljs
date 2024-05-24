(ns dots.typescript.server.protocol.selection-range-request-args)

(defn locations
  ^js [selection-range-request-args]
  (.-locations ^js selection-range-request-args))

(defn set-locations!
  ^js [selection-range-request-args value]
  (set! (.-locations ^js selection-range-request-args) value))

(defn file
  "The file for the request (absolute pathname required)."
  ^js [selection-range-request-args]
  (.-file ^js selection-range-request-args))

(defn set-file!
  "The file for the request (absolute pathname required)."
  ^js [selection-range-request-args value]
  (set! (.-file ^js selection-range-request-args) value))

(defn project-file-name
  ^js [selection-range-request-args]
  (.-projectFileName ^js selection-range-request-args))

(defn set-project-file-name!
  ^js [selection-range-request-args value]
  (set! (.-projectFileName ^js selection-range-request-args) value))
