(ns dots.typescript.server.protocol.get-edits-for-file-rename-request-args
  "Note: Paths may also be directories.")

(defn old-file-path
  "**Returns:** `string`"
  ^js [get-edits-for-file-rename-request-args]
  (.-oldFilePath ^js get-edits-for-file-rename-request-args))

(defn new-file-path
  "**Returns:** `string`"
  ^js [get-edits-for-file-rename-request-args]
  (.-newFilePath ^js get-edits-for-file-rename-request-args))
