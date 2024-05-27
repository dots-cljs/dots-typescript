(ns dots.typescript.server.protocol.span-group
  "A group of text spans, all in 'file'.")

(defn file
  "The file to which the spans apply
   
   **Returns:** `string`"
  ^js [span-group]
  (.-file ^js span-group))

(defn set-file!
  "The file to which the spans apply"
  ^js [span-group value]
  (set! (.-file ^js span-group) value))

(defn locs
  "The text spans in this group
   
   **Returns:** `RenameTextSpan[]`"
  ^js [span-group]
  (.-locs ^js span-group))

(defn set-locs!
  "The text spans in this group"
  ^js [span-group value]
  (set! (.-locs ^js span-group) value))
