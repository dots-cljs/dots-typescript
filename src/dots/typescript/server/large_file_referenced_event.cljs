(ns dots.typescript.server.large-file-referenced-event)

(defn event-name
  "**Returns:** `\"largeFileReferenced\"`"
  ^js [large-file-referenced-event]
  (.-eventName ^js large-file-referenced-event))

(defn set-event-name!
  ^js [large-file-referenced-event value]
  (set! (.-eventName ^js large-file-referenced-event) value))

(defn data
  "**Returns:** `{ file: string; fileSize: number; maxFileSize: number; }`"
  ^js [large-file-referenced-event]
  (.-data ^js large-file-referenced-event))

(defn set-data!
  ^js [large-file-referenced-event value]
  (set! (.-data ^js large-file-referenced-event) value))
