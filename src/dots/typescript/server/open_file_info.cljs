(ns dots.typescript.server.open-file-info)

(defn check-js?
  "**Returns:** `boolean`"
  ^js [open-file-info]
  (.-checkJs ^js open-file-info))
