(ns dots.typescript.server.protocol.large-file-referenced-event-body)

(defn file
  "name of the large file being loaded"
  ^js [large-file-referenced-event-body]
  (.-file ^js large-file-referenced-event-body))

(defn set-file!
  "name of the large file being loaded"
  ^js [large-file-referenced-event-body value]
  (set! (.-file ^js large-file-referenced-event-body) value))

(defn file-size
  "size of the file"
  ^js [large-file-referenced-event-body]
  (.-fileSize ^js large-file-referenced-event-body))

(defn set-file-size!
  "size of the file"
  ^js [large-file-referenced-event-body value]
  (set! (.-fileSize ^js large-file-referenced-event-body) value))

(defn max-file-size
  "max file size allowed on the server"
  ^js [large-file-referenced-event-body]
  (.-maxFileSize ^js large-file-referenced-event-body))

(defn set-max-file-size!
  "max file size allowed on the server"
  ^js [large-file-referenced-event-body value]
  (set! (.-maxFileSize ^js large-file-referenced-event-body) value))
